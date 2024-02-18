import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;

public class TestDemoJUnitTest {
	private TestDemo testDemo;

	@BeforeEach
	public void setUp() {
		testDemo = new TestDemo();
	}

	@ParameterizedTest
	@MethodSource("com.promineotech.TestDemoJUnitTest#argumentsForAddPositive")
	public void assertThatTwoPositiveNumbersAreAddedCorrectly(int a, int b, int expected, boolean expectException) {
		if (!expectException) {
			assertThat(testDemo.addPositive(a, b)).isEqualTo(expected);
		} else {
			assertThatThrownBy(() -> testDemo.addPositive(a, b)).isInstanceOf(IllegalArgumentException.class);
		}
	}

	// Parameter source method
	static Stream<Arguments> argumentsForAddPositive() {
		return Stream.of(arguments(1, 2, 3, false), arguments(3, 4, 7, false), arguments(-1, 2, 0, true),
				arguments(0, 5, 0, true));
	}

	@Test
    void assertThatPairsOfPositiveNumbersAreAddedCorrectly() {
    	assertThat(testDemo.addPositive(4, 5)).isEqualTo(9);
        assertThat(testDemo.addPositive(40, 50)).isEqualTo(90);
	}
	
	@Test
    void assertThatNumberSquaredIsCorrect() {
        TestDemo mockDemo = spy(testDemo);
        
        doReturn(5).when(mockDemo).getRandomInt();
        
        int fiveSquared = mockDemo.randomNumberSquared();
        
        assertThat(fiveSquared).isEqualTo(25);
    }
}


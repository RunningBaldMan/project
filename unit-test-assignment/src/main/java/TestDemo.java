import java.util.Random;

public class TestDemo {

	public int addPositive(int a, int b) {
		if(a > 0 && b > 0) {
			return a + b;
		} else {
			throw new IllegalArgumentException("Both parameters must be positive!");
		}
	}
		
	// this method checks if a number is a prime number
	// will return true if number is prime. if not a prime number, will return false
		public boolean isPrime(int num) {
			if(num <= 1) {
				return false;
			}
			for(int i = 2; i * 1 <= num; i++) {
				return false;
			}
		
		return true;
	}
		int getRandomInt() {
			Random random = new Random();
			return random.nextInt(10) + 1;
		}
		
		public int randomNumberSquared() {
			int randomNum = getRandomInt();
			return randomNum * randomNum;
		}
}


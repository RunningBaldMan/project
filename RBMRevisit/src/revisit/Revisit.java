package revisit;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Revisit {

	public static void main(String[] args) {
		List<String> artist = new ArrayList<>();
		
		artist.add("Anahita $ Apoorva");
		artist.add("Angelina Jordan");
		artist.add("Aurora");
		artist.add("Beyonce");
		artist.add("Cardi B.");
		artist.add("Chevelle");
		artist.add("Chloe x Halle");
		//artist.add("Chris Stapelton");
		artist.add("Ciara");
		artist.add("Dimash");
		artist.add("DJ Khaled");
		artist.add("DNCE");
		artist.add("Doja Cat");
		artist.add("Grandmaster Flash & the Furious Five");
		artist.add("Heilung");
		artist.add("J Cole");
		artist.add("Kalandra");
		artist.add("Kanye West");
		//artist.add("Kendrick Lamar");
		artist.add("Kesha");
		artist.add("Kind Ink");
		artist.add("Lana Del Rey");
		artist.add("Melanie Martinez");
		artist.add("Migos");
		artist.add("Nicki Minaj");
		artist.add("Outcast");
		artist.add("Paramore");
		artist.add("Red Hot Chili Peppers");
		artist.add("Sam Fender");
		artist.add("Sodagreen");
		artist.add("The Doors");
		artist.add("The Weekend");
		artist.add("UKG (Underground Kingz");
		artist.add("Warduna");
		artist.add("Wu Tang Clan");
		artist.add("YG");
		
		
		String randomArtist = getRandomArtist(artist);
		
		System.out.println("Randomly selected artist: " + randomArtist);
	}
	
	private static String getRandomArtist(List<String> artist) {
		if (artist.isEmpty()) {
			System.out.println("The list is empty.");
			return null;
		}
		
		Random random = new Random();
		int randomIndex = random.nextInt(artist.size());
				
				return artist.get(randomIndex);
	}

}

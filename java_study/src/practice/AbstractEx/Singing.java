package practice.AbstractEx;

public class Singing {

	public static void main(String[] args) {
		HowCryAnimal[] cry = { new Cow(), new Fox(), new Goat(), new Frog() };

		for (int i = 0; i < cry.length; i++) {
			cry[i].cry();
		}
	}

}

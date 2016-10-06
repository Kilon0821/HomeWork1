package hello;

public class hello {
	public static void main(String[] args) {
		int i;
		String[] lyrics = "Let it go ! Let it go ! Cannot hold it back anymore".split("\\s");

		for (i = 0; i < lyrics.length; i++) {
			// System.out.println(lyrics[i]);
			if (lyrics[i].equals("it") == true) {
				lyrics[i] = lyrics[i].replace(lyrics[i], "her");
			}
			if (lyrics[i].equals("Cannot") == true) {
				lyrics[i] = lyrics[i].replace(lyrics[i], "Can't");
			} else {
			}
		}

		for (i = 0; i < lyrics.length; i++)
			System.out.print(lyrics[i] + " ");
	}
}

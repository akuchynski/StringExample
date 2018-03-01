package by.htp.str.runner;

public class Task28 {

	public static void main(String[] args) {

		String st = " what  a Beautiful. day? what a beautiful day!";
		String end = ".!?";
		int lastWord = 0;

		StringBuilder stb = new StringBuilder();
		stb.append(st.toLowerCase().trim());

		stb.trimToSize();

		for (int i = 0; i < stb.length(); i++) {
			if (i == 0) {
				stb.setCharAt(i, Character.toUpperCase(stb.charAt(i)));
			} else if (lastWord == 1 && stb.charAt(i) != ' ') {
				stb.setCharAt(i, Character.toUpperCase(stb.charAt(i)));
				lastWord = 0;
			}
			if (end.indexOf(stb.charAt(i)) != -1) {
				lastWord = 1;
			}
		}
		System.out.println(stb);
	}

}

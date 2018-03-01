package by.htp.str.runner;

public class Task7 {

	public static void main(String[] args) {

		String st = " What a 123 -- beautiful6, day!";
		StringBuilder stbChar = new StringBuilder();
		String st1 = st.trim();

		for (int i = 0; i < st1.length(); i++) {
			if (Character.isLetter(st1.charAt(i))) {
				stbChar.append(st1.charAt(i));
				stbChar.append(' ');
			}
		}
		System.out.println(stbChar);
	}
}

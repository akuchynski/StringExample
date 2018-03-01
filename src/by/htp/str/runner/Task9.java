package by.htp.str.runner;

public class Task9 {

	public static void main(String[] args) {

		String st = "What what, day a beautiful day dAy!!!";
		StringBuilder stb = new StringBuilder();
		int countWord = 0;

		for (int i = 0; i < st.length(); i++) {
			if (Character.isLetter(st.charAt(i)) || Character.isWhitespace(st.charAt(i))) {
				stb.append(st.charAt(i));
			}
		}

		String[] arrSt = stb.toString().split(" ");

		for (int i = 0; i < arrSt.length; i++) {
			for (int k = 0; k < arrSt.length; k++) {
				if (arrSt[i].equalsIgnoreCase(arrSt[k])) {
					countWord++;
				}
			}
			System.out.println(arrSt[i] + " – " + countWord);
			countWord = 0;
		}
	}

}

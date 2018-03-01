package by.htp.str.runner;

public class Task1 {

	public static void main(String[] args) {

		int k = 3;
		char c = 'X';
		char[] arrChar;
		String st = "What a beautiful  day!";

		StringBuilder stb = new StringBuilder();

		System.out.println(st);

		String arrSt[] = st.split(" ");

		for (int i = 0; i < arrSt.length; i++) {
			arrChar = arrSt[i].toCharArray();
			if (k < arrChar.length) {
				arrChar[k - 1] = c;
			}

			stb.append(arrChar);
			if (i < arrSt.length - 1) {
				stb.append(" ");
			}
		}
		stb.trimToSize();

		st = stb.toString();

		System.out.println(st);

	}
}

package by.htp.str.runner;

public class Task2 {

	public static void main(String[] args) {

		String st = "what a beautiful day!";
		String abcSt = "abcdefghijklmnopqrstuvwxyz";
		int numChar;
		int[] arrNum;

		StringBuilder stbChar = new StringBuilder();
		stbChar.append(st.toLowerCase());

		System.out.println(stbChar);

		for (int i = 1; i < stbChar.length(); i++) {
			if (stbChar.charAt(i) == ' ') {
				stbChar.deleteCharAt(i);
				i--;
			}
		}

		for (int i = 1; i < stbChar.length(); i = i + 3) {
			stbChar.insert(i, "  ");
		}

		System.out.println(stbChar);

		arrNum = new int[stbChar.length()];

		for (int i = 0; i < arrNum.length; i++) {
			numChar = abcSt.indexOf(stbChar.charAt(i));
			if (numChar == 0) {
				continue;
			}
			arrNum[i] = numChar;
		}

		for (int i = 0; i < arrNum.length; i++) {
			if (arrNum[i] == -1) {
				System.out.print(" ");
				continue;
			}
			System.out.print(arrNum[i] + 1);
		}
	}
}

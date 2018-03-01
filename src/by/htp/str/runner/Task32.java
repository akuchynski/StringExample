package by.htp.str.runner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task32 {

	public static void main(String[] args) {

		String st = "What what, day a beautiful day dAy!!!";
		StringBuilder stb = new StringBuilder();
		int countWord = 0;
		String stR = "";

		System.out.println(st);
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter word:");
		
		try {
			stR = reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (int i = 0; i < st.length(); i++) {
			if (Character.isLetter(st.charAt(i)) || Character.isWhitespace(st.charAt(i))) {
				stb.append(st.charAt(i));
			}
		}

		String[] arrSt = stb.toString().split(" ");

		for (int i = 0; i < arrSt.length; i++) {

			if (arrSt[i].equalsIgnoreCase(stR)) {
				countWord++;
			}
		}
		
		System.out.println(stR + " – " + countWord);

	}
}

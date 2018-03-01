package by.htp.str.runner;

public class Task24 {

	public static void main(String[] args) {

		String st = "What a 12 beautiful 25 day 5 !!";
		int sum = 0;

		String[] arrSt = st.split(" ");

		for (int i = 0; i < arrSt.length; i++) {
			try {
				sum += Integer.parseInt(arrSt[i]);
			} catch (NumberFormatException e) {
				continue;
			}

			System.out.println(Integer.parseInt(arrSt[i]));
		}
		System.out.println("Sum: " + sum);
	}
}

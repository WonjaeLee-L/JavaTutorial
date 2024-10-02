package testpm;

public class test0812_0 {

	public static void main(String[] args) {
		// 0번 문제(선택받은너)
		// 0 int[] letter={8,12,4,13,2,14,4,5}
		// 짝수만 출력하시오.

		int[] letter = { 8, 12, 4, 13, 2, 14, 4, 5 };
		for (int i = 0; i < letter.length; i++) {
			if (letter[i] % 2 == 0) {
				System.out.println(letter[i]);
			}
		}

	}

}

package testpm;

public class test0812_2 {

	public static void main(String[] args) {
		// 2번 문제(현상수배)
		// int[] letter={8,12,4,13,25,14,4,5}
		// 범인을찾으시오
		// 범인은 짝수이면서 가장큰 값이다.
		// 범인은 14입니다.
		int[] letter1 = { 8, 12, 4, 13, 25, 14, 4, 5 };
		int maxEven = 0;
		for (int i = 0; i < letter1.length; i++) {
			if (letter1[i] % 2 == 0 && maxEven < letter1[i]) {
				maxEven = letter1[i];
			}
		}
		System.out.println(maxEven);

	}

}

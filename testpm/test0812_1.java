package testpm;

public class test0812_1 {

	public static void main(String[] args) {
		// 1번 문제(큰놈)
		// int[] letter={8,12,4,13,2,14,4,5}
		// 배열의 가장 큰수가 있는 인덱스를 출력하시오.
		int[] letter = { 8, 12, 4, 13, 2, 14, 4, 5 };
		int maxValue = 0;
		int maxIndex = -1;
		for (int i = 0; i < letter.length; i++) {
			if (maxValue < letter[i]) {
				maxValue = letter[i];
				maxIndex = i;
			}
		}
		System.out.println(maxIndex);

	}

}

package _03for;

public class _00_Q1_for출력 {

	public static void main(String[] args) {
		int[] a = { 30, 40, 50, 55, 65 };
		// 뒤에서부터 출력하기 위해서, 초기값, 조건, 증감식을 수정
		for (int i = 4; i >= 0; i--) {
			System.out.println(a[i]);
		}

	}

}

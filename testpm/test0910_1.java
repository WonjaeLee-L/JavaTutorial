package testpm;

public class test0910_1 {

	public static void main(String[] args) {
		int[][] a = {{1,2,3,4,5},
					 {6,7,8,9,10},
					 {11,12,13,14,15},
					 {16,17,18,19,20},
					 {21,22,23,24,25}};
		
		// 2차원 배열 a의 2번째 행의 모든 값을 출력하시오
		for (int i=0; i<5; i++) {
			System.out.print(a[1][i] + " ");
		}

		// 2차원 배열이므로 배열을 나타내는 a[][]를 사용
		// 2번째 행의 모든 열을 표현하기 위해서
		// 열의 숫자를 바꾸며 출력하면 되므로
		// for문을 사용하여 표현 함
	}

}
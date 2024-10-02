package testpm;

public class test0911_2 {

	public static void main(String[] args) {
		int[][] a = new int[4][5];
		int num = 1;
		// 배열 값 입력부

		int row = a.length;
		int col = a[0].length;

		// 행과 열 모두 역순

		// **** 이런 과정에 시간을 쏟아서 문제를 분석해야 어려운 문제도 해결 가능 ****
		// 3,4 3,3 3,2 3,1 3,0 행은 고정 3 열 4,3,2,1,0
		// 2,4 2,3 2,2 2,1 2,0 행은 고정 2 열 4,3,2,1,0
		// 1,4 1,3 1,2 1,1 1,0 행은 고정 1 열 4,3,2,1,0
		// 0,4 0,3 0,2 0,1 0,0 행은 고정 0 열 4,3,2,1,0
		// 요일은 일이 반복되고 다시 시간이 반복된다.
		// 일은 행이 되고, 시간은 열이 된다.
		// 즉 행은 i, 열은 j

		for (int i = row - 1; i >= 0; i--) {
			for (int j = col - 1; j >= 0; j--) {
				a[i][j] = num;
				num++;
			}
		}

		// 배열 값 출력부
		// 현재 배열 값
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}

	}

}

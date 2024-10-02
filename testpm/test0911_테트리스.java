package testpm;

public class test0911_테트리스 {

	public static void main(String[] args) {
		int[][] tempArr = { { 3, 2, 1 }, { 0, 1, 0 }, { 0, 1, 1 } };
		// ex) 오른쪽 회전
		// {{0,0,1},
		// {1,1,1},
		// {1,0,0}}

		// 문제 1. 오른쪽 회전

		// 2차원 배열의 현재 상태 출력이므로 이중 for문을 이용하여 출력한다.
		// 배열의 길이 변수 선언
		int row = tempArr.length;
		int col = tempArr[0].length;

		// 현재 배열 출력
		System.out.println("temArr의 현재 배열은");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(tempArr[i][j] + " ");
			}
			System.out.println();
		}

		// 오른쪽으로 회전
		// 첫번째 행이 마지막 열이 되고
		// 두번째 행이 두번째 열이 되며
		// 세번째 행이 첫번째 열이 되는 것을 알 수 있다.
		// 인덱스로는 0이 2, 1이 1, 2가 0 이므로,
		// 2-i의 형태로 생각 할 수 있다.
		System.out.println("temArr을 오른쪽으로 회전시킨 배열은");

		for (int i = 0; i < col; i++) {
			for (int j = 0; j < row; j++) {
				System.out.print(tempArr[col - j - 1][i] + "\t");
			}
			System.out.println();
		}

		// 문제 2. 왼쪽 회전

		// 현재 배열 출력
		System.out.println("temArr의 현재 배열은");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(tempArr[i][j] + " ");
			}
			System.out.println();
		}

		// 왼쪽으로 회전
		/*
		 * 0 0 1 1 1 1 1 0 0
		 */

		// 첫번째 행이 첫번째 열이 되고
		// 두번째 행이 두번째 열이 되고
		// 세번째 행이 세번쌔 열이 되는데
		// 첫번째 행의 첫번째 값은 첫번째 열의 마지막 값이 되는 형식이다
		System.out.println("temArr을 왼쪽으로 회전시킨 배열은");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(tempArr[j][row - 1 - i] + " ");
			}
			System.out.println();
		}

	}

}

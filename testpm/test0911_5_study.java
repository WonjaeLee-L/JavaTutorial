package testpm;

public class test0911_5_study {

	public static void main(String[] args) {
		int[][] a = new int[4][5];
		int num = 1;
		// 배열 값 입력부

		int row = a.length;
		int col = a[0].length;

		// step 1.

//		1	2	3	4	5		좌표 0,0	0,1	0,2	0,3	0,4(1~5)	행고정 열0~4	
//		14	15	16	17	6			1,4	2,4	3,4(6~8)			열고정 행1~3
//		13	20	19	18	7			3,3	3,2	3,1	3,0(9~12)		행고정 열3~0
//		12	11	10	9	8			2,0	1,0(1314)				열고정 행2~1
//								겉은 사각형을 한 바퀴 돌고, 그 코드로 안쪽도 돌게 하자
//								0,0	0,1	0,2	0,3	0,4(1~5)	행고정 열0~4
//								1,1 1,2 1,3					행고정 열1~3
//								행이 고정이고 열이 증가 하는 것은 공통,
//								고정된 행의 번호가 다르고, 열이 증가되는 번호가 다르다
//								for문을 그대로 쓰려면 ? -> 변수!
//								고정된 행의 번호를 변수에 저장하고
//								열의 번호도 변수에 저장하여, 변수의 값을 달리해본다.

		// step 2.
		// 변수를 사용해보자

//		int 행최소=0;
//		int 행최대=3;
//		int 열최소=0;
//		int 열최대=4;

//		0,0	0,1	0,2	0,3	0,4(1~5)	행 0고정 열0~4
//		행은 고정이니 반복문 필요 없다. 열은 반복
//		for(int 열=0;열<=4;열++) {
//			a[0][열]=num++;
//		}
//		행 1일 때 까지 포함
//		for(int 열=minCol;열<=maxCol;열++) {
//			a[minRow][열]=num++;
//		}

		// step 3.
		// 코드 작성

		int minRow = 0;
		int maxRow = 3;
		int minCol = 0;
		int maxCol = 4;

		// 한 바퀴가 가장 겉에, 그걸 두 번 반복 한다.
		for (int j = 0; j < 2; j++) {
			// 행이 0일 때, 1, 2, 3, 4 채우기(행 최소 0, 열 최소 0, 열 최대 4)
			// 행이 1일 떄, 숫자 채우기(행 최소 1, 열 최소 1, 열 최대 3)
			for (int i = minRow; i <= maxCol; i++) {
				a[minRow][i] = num++;
			}

			// 열이 4일 때, 6, 7, 8 넣기

			// 위 반복문이 완료되었다면 0번 행은 채울 필요 없다.
			// minRow를 증가시킨다.
			minRow++;
			for (int i = minRow; i <= maxRow; i++) {
				a[i][maxCol] = num++;
			}
			// 위 반복문이 완료되었다면 4번 열은 채울 필요 없다.
			maxCol--;

			for (int i = maxCol; i >= minCol; i--) {
				a[maxRow][i] = num++;
			}
			// 위 반복문이 완료되었다면 3번 행은 채울 필요 없다.
			maxRow--;

			// 이 쯤의 행은 1, 2 열은 0, 1, 2, 3이 남아있다.

			for (int i = maxRow; i >= minRow; i--) {
				a[i][minCol] = num++;
			}
			minCol++;
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

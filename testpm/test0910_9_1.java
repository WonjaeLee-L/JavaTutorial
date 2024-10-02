package testpm;

import java.util.Random;
import java.util.Scanner;

public class test0910_9_1 {

	// 임의의 좌표를 입력받아 좌, 우를 고려하여 연속된 숫자가 있는지를 판별
	// 2차 배열의 값을 판별하므로 for문을 이용하였고
	// 열의 index값에 따라서 조건식을 나눠야 한다고 판단하였음
	// 따라서 j값에 따라서 조건을 나누었음
	// 키보드로 좌표를 입력 받아서 판별하므로 scanner 객체를 이용
	// 숫자를 입력받아 i, j와 비교하므로
	// nextInt를 사용하였고, 버퍼를 지우기 위해 nextLine을 사용함
	// 맨위의 배열을 랜덤수로 채우기 위해서 random 객체를 이용
	// j가 0인 경우, 가장 왼쪽에 있으므로
	// 오른쪽의 값들과 비교하였음
	// 4개가 겹치는 경우와 3개가 겹치는 경우로 나누었고
	// 겹치는 경우 위의 값으로 대체되기 때문에
	// i의 값이 1줄어든 값으로 대체되도록 함
	// 여러번 반복해야 하므로 새로운 for문(변수k)를 이용하여
	// 만족할 경우 위의 값으로 대체되는 것을 반복하게 함
	// 맨 위의 좌표(i=0)의 경우 랜덤수로 배정함

	/*
	 * *** 문제점 *** 중복을 발견한 for문에서, 위에 값 배정, 랜덤 배정 등 여러 처리를 다 하려고 하다보니, 조건에 따라 for문이
	 * 길어지기도 하였고, i, j의 변수 활용이 고정적으로 되어 다양하게 생각하지 못하였음. 3개 중복, 4개 중복을 나누어 반복문을 짰는데
	 * 반복되는 것을 편하게 하려고 for문을 이용했으나, 사실상 너무 복잡하게 이용함 for문에서 index값으로 i, j를 사용하는 것에
	 * 집중하다보니, for문 밖에서도 숫자로 그냥 표현하면 되는 것을 거의 배제하여 문제 푸는데에 스스로 제약을 걸었음. 이중 for문을 열어서
	 * 변경, 출력 등의 모든일을 그 안에서 전부 처리하려고 하여 다양하게 생각하지 못하였음 for문 하나에 한 역할을 하는게 좋다(최소한)
	 */
	public static void main(String[] args) {
		// 1 1 0 2
		// 3 2 1 2
		// 0 0 3 2
		// 4 4 4 4
		// 2 4 3 1
		// 2 4 1 3
		int[][] a = { { 1, 1, 0, 2 }, { 3, 2, 1, 2 }, { 0, 0, 3, 2 }, { 4, 4, 4, 4 }, { 2, 4, 3, 1 }, { 2, 4, 1, 3 } };
		// 키보드로 좌표를 입력하면, 좌표 기준으로 왼쪽 또는 오른쪽으로 3개 이상의 연속된 숫자가 있으면 제거 가능
		// 제거 가능이면 제거를 하고, 위에 있는 숫자가 아래로 내려온다.
		// 맨위에 배열은 랜덤수로 채워진다.

		Random r = new Random();
		Scanner in = new Scanner(System.in);

		System.out.println("좌표를 입력하세요, 숫자+엔터 두 번");

		int co1 = in.nextInt();
		in.nextLine();
		int co2 = in.nextInt();
		in.nextLine();
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a[0].length; j++) {
				if (co1 == i && co2 == j) {
					// j = 0
					if (j == 0) {

						if (a[i][j] == a[i][j + 1] && a[i][j] == a[i][j + 2]) {

							if (a[i][j] == a[i][j + 3]) {
								// 4개 중복
								// 위에 있는 숫자가 아래로 내려온다
								for (int k = 0; k < i; k++) {
									a[i - k][j] = a[i - k - 1][j];
									a[i - k][j + 1] = a[i - k - 1][j + 1];
									a[i - k][j + 2] = a[i - k - 1][j + 2];
									a[i - k][j + 3] = a[i - k - 1][j + 3];
								}
								// 맨 위 좌표 랜덤 수 배정
								a[0][j] = r.nextInt(10);
								a[0][j + 1] = r.nextInt(10);
								a[0][j + 2] = r.nextInt(10);
								a[0][j + 3] = r.nextInt(10);
							} else {
								// 3개 중복
								// 위에 있는 숫자가 아래로 내려온다
								for (int k = 0; k < i; k++) {
									a[i - k][j] = a[i - k - 1][j];
									a[i - k][j + 1] = a[i - k - 1][j + 1];
									a[i - k][j + 2] = a[i - k - 1][j + 2];
								}
								// 맨 위 좌표 랜덤 수 배정
								a[0][j] = r.nextInt(10);
								a[0][j + 1] = r.nextInt(10);
								a[0][j + 2] = r.nextInt(10);
							}

						}

					}

				}

			}

		}

		// 중간 test (3,0) 좌표 일 때
		System.out.println(a[0][0] + "," + a[0][1] + "," + a[0][2] + "," + a[0][3] + "<-1102가 랜덤으로...." + a[3][0] + ","
				+ a[3][1] + "," + a[3][2] + "," + a[3][3] + "...<-4444가 0032로");
		System.out.println(a[2][0] + "," + a[2][1] + "," + a[2][2] + "," + a[2][3] + "<-0032가 3212로...." + a[1][0] + ","
				+ a[1][1] + "," + a[1][2] + "," + a[1][3] + "...<-3212가 1102로");

	}

}

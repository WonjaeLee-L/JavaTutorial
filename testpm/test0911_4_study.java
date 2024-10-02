package testpm;

public class test0911_4_study {

	public static void main(String[] args) {
		int[][] a = new int[4][5];
		int num = 1;
//			0	1	2	3	4  -> i로
//		0|	1	2	4	7	11
//		1|	3	5	8	12	15
//		2|	6	9	13	16	18
//		3|	10	14	17	19	20
//		
//		i를 8번 반복하면서 숫자를 채운다 0~7번까지 반복 (ex 5번째는 15,16,17)
//		i값을 0,1,2,3,4 ? ? ? 모르겠다
//		일단 5,6,7로 늘린다고 생각(증감식 일정하도록)
//		
//			0	1	2	3	4  	5	6	7
//		0|	1	2	4	7	11	x	x	x		-> x는 불필요한 좌표
//		1|	3	5	8	12	15	x	x			   숫자를 채우지 않는다.
//		2|	6	9	13	16	18	x				-> 열 > 4면 안채우도록
//		3|	10	14	17	19	20

//		i가 0인 경우 ->  0,0
//		j는 0
//		i가 1인 경우 ->  0,1   1,0
//		j는 0, 1
//		i가 2인 경우 ->  0,2   1,1   2,0
//		j는 0, 1, 2
//		i가 3인 경우 ->  0,3   1,2   2,1  3,0
//		j는 0, 1, 2, 3
//		i가 4인 경우 ->  0,4   1,3   2,2  3,1
//		j는 1, 2, 3, 4
//		i가 5인 경우 -> (0,5)  1,4   2,3  3,2			-> 괄호는 조건으로 배제
//		j는 1, 2, 3, 4, 5
//		i가 6인 경우 -> (0,6) (1,5)  2,4  3,3
//		i가 7인 경우 -> (0,7) (1,6) (2,5) 3,4
//											---- 이 뒤의 값은 continue로 해결,,		
//		지금 i는 행, 열 모두 아니다. 반복을 위한 count
//		
//		i에 따른 행의 좌표 뽑아내기
//		위에서 j를 행의 값으로 분석 함

//		괄호 부분을 j로 해결할 수 없다면, 수식으로,, i-j,j-i,절대값,곱하고 빼고 등
//		i값과 j값으로 수식을 사용하여 열을 표현한다고 생각
//		열은 i가 시작값이라고 볼 수 있고,
//		열은 반복하면서 하나씩 마이너스 된다.

		for (int i = 0; i < 8; i++) {
			System.out.println(i + "번째 채우기를 합니다.");
//			    step 2_1. 열의 시작값을 i로 만들기
			int newCol = i;

			for (int j = 0; j <= i; j++) {
//				 step 3. 괄호부분 제거 위해서 추가 방법 2
//				if(newCol>4) {
//					newCol--;
//					continue;
//				}
//				 step 1. 행의 문제를 해결
//				if(j>3) continue;
				if (j > 3)
					break; // if절에서 한 줄이면 괄호 없어도 된다.
				if (newCol < 5) { // step 3. 괄호 제거 위해 추가
//					System.out.println("j<행>" + j + "/newCol열" + newCol);
					a[j][newCol] = num++;
				}
//				 step 2_2. 감소시킴
				newCol--;
			}
		}

		// 2차원 배열 a의 값을 0번 행으로부터 모두 출력
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}

	}

}

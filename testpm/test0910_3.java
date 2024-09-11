package testpm;

public class test0910_3 {

	public static void main(String[] args) {
		int[][] a = {{1,2,3,4,5},
				     {6,7,8,9,10},
			         {11,12,13,14,15},
				     {16,17,18,19,20},
				     {21,22,23,24,25}};
		// 2차원 배열의 2열의 모든 값을 행의 순서대로 출력하시오
		for(int i=0; i<5; i++) {
			System.out.print(a[i][2] + " ");
		}
		// 열은 정해져 있으므로, 행의 index를 바꾸어가며
		// 모두 출력하되, 순서대로 출력하므로
		// for문을 이용하여 a[i][2]로 표현하되,
		// i를 0부터 시작하여 순서대로 출력되게 함
	}

}

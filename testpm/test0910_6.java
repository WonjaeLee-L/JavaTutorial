package testpm;

public class test0910_6 {

	public static void main(String[] args) {
		int[][] a = {{1,2,3,4,5},
		             {6,7,8,9,10},
	                 {11,12,13,14,15},
		             {16,17,18,19,20},
		             {21,22,23,24,25}};
		// 2차원 배열의 모든 값을 출력하시오
		// 출력할 때는 행, 열의 번호를 내림차순으로 출력하시오
		for(int i=4; i>=0; i--) {
			for(int j=4; j>=0; j--) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
		// 2차원 배열의 값을 출력하므로
		// 2중 for문을 이용하여 for문의 변수를
		// 2차 배열의 index로 이용하였음
		// 다만, 행과 열의 번호를 내림차순으로 출력하므로
		// 변수의 초기값을 마지막 index 번호인 4부터
		// 시작하여, 0까지 값이 1씩 증가하는 증감식을 사용 함
	}

}

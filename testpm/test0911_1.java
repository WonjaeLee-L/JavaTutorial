package testpm;

public class test0911_1 {

	public static void main(String[] args) {

		// if, for등 작성할 때, 한 가지 기능만 정의하고 작성한다.
		// 한 가지 기능만 정의하고 작성하는 것은 개발자의 센스다.
		// 나중에 수정, 삭제등 코드를 건드릴 때 다른 부분을 건드리지 않고
		// 원하는 부분만 건드리기 용이하다.
		
		
		int[][] a = new int[4][5];
		int num=1;
		//배열 값 입력부
		
		int row = a.length;
		int col = a[0].length;
		
		// 열은 index 4부터 0으로 줄어드는 순
		// 행은 index 0부터 3까지 늘어나는 순으로
		// **** 이런 과정에 시간을 쏟아서 문제를 분석해야 어려운 문제도 해결 가능 ****
		// 행이 0, 1, 2, 3 변하고 열이 고정 4
		// 행이 0, 1, 2, 3 변하고 열이 고정 3
		// 행이 0, 1, 2, 3 변하고 열이 고정 2
		// 행이 0, 1, 2, 3 변하고 열이 고정 1
		// 행이 0, 1, 2, 3 변하고 열이 고정 0
		// 요일에서 일이 먼저 반복되고 일은 다시 시간으로 반복된다.
		// 일을 열로보고, 시간을 행으로
		// 열이 i, 행이 j
		// for(int 열=4;열>=0;열--) {
		//	 for(int 행=0;행<4;행++) {
		//		
		//  	}
		// }
		
		// 2차원 배열의 값을 저장하는 코드
		for (int i=row; i>=0; i--) {
			for (int j=0; j<row; j++) {
				// i와 j값으로 배열을 순회하는 순서를 결정
				// 순회하면서 num의 값을 저장한 것.
				a[j][i]=num;
				// 저장한 후, num값을 증가시킨 것.
				num++;
			}
		}
				
		
		// 배열 값 출력부
		// 현재 배열 값
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}

		
		// 공부할때
		// b에 대한 값을 표로 생각해보고
		// 행에 따른 열의 값을 생각해본다
		int[][] b = new int[4][5];
		// 2차원 배열 b의 값을 0번행부터 모두 출력
		for(int i=0; i<4; i++) {
//			System.out.println(">행"+행);		// 디버깅용
			for(int j=0; j<5; j++) {
				System.out.print(b[i][j]+"\t");		// 개행문자.. t는 tab의미
			}
			System.out.println();
		}
		
		
		
		
		
	}

}

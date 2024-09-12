package testpm;

public class test0911_6 {

	public static void main(String[] args) {
		int[][] a = {{1,  2, 3, 4 ,5},
					 {6,  7 ,8 ,9,10},
					 {11,12,13,14,15},
					 {16,17,18,19,20},
					 {21,22,23,24,25}};

		int row = a.length;
		int col = a[0].length;
		// 원하는 결과
		//  6  1  2  3  4
		// 11 12  7  8  5
		// 16 17 13  9 10
		// 21 18 19 14 15
		// 22 23 24 25 20
		
		// 0, 1 행은 올라가고
		// 3, 4 행은 거꾸로
		// 0, 1 열은 거꾸로
		// 3, 4 열은 순차
		
		// 행의 마지막 열의 숫자는 아래 행으로 내려가고
		// 행의 첫번째 열의 숫자는 위의 행으로 올라간다
		
		// i와 j값이 같을 때 기준으로 돌아간다.
		
		// 1,0/ 0,0/ 0,1/ 0,2/ 0,3
		// 2,0/ 2,1/ 1,1/ 1,2/ 0,4
		
		
//		 코드 1. 
//		 0행에서 1,2,3,4,5 이동 --> 끊기는 부분인 10 사라짐
//		for(int i=0; i<1; i++) {
//			for(int j=4; j>=1; j--) {
//				if(j>=4) {
//					a[i+1][j]=a[i][j];
//				}
//				a[i][j+i]=a[i][j+i-1];
//			}
//		}
		
//		 코드 2.
//		 1 행에서 7,8,9 이동 --> 끊기는 부분인 14 사라짐
//		for(int i=1; i<2; i++) {
//			for(int j=3; j>=2; j--) {
//				if(j>=3) {
//					a[i+1][j]=a[i][j];
//				}
//				a[i][j]=a[i][j-1];
//			}
//		}
				
//		 코드 3. 4열 아래로 내리기
//		for(int i=row-1; i>0; i--) {
//			for(int j=col-1; j>col-2; j--) {
//				a[i][j]=a[i-1][j];
//			}
//		}

//		 코드 4. 3열 아래로 내리기
//		for(int i=row-2; i>1; i--) {
//			for(int j=col-2; j>col-3; j--) {
//				a[i][j]=a[i-1][j];
//			}
//		}
		
		
		
		
//		 코드 1. + 코드 2.
//		 0 행과 1행 오른쪽으로 이동 후, 마지막 숫자 한 행 아래로 가는 것 합침
		for(int k=0; k<2; k++) {
			
			for(int i=k; i<1+k; i++) {
				for(int j=col-1-k; j>=1+k; j--) {
					if(j>=col-1-k) {
						a[i+1][j]=a[i][j];
					}
					a[i][j]=a[i][j-1];
				}
			}
			
		}
		
		
//		 코드 3. + 코드 4.
//		 3열 아래로 내리기 (9, 14)
		for(int k=1; k<3; k++) {
			for(int i=row-k; i>k-1; i--) {
				for(int j=col-k; j>col-k-1; j--) {
					a[i][j]=a[i-1][j];
				}
			}
		}
		
	
		
		
		// 출력
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		
		

	}

}

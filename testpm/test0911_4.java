package testpm;

public class test0911_4 {

	public static void main(String[] args) {
		int[][] a = new int[4][5];
		int num=1;
		//배열 값 입력부
		
		int row = a.length;
		int col = a[0].length;
		// 왼쪽 상단부터
		// 열이 하나 증가한 후에, 행이하나늘고 열이하나 줄어든 값으로
		
/*
 * 
 * 		0	1	2	3	4
 * 0 	1	2	4	7	11
 * 1	3	5	8	12
 * 2	6	9	13
 * 3	10	14
 * 
 *  i1 일때 0,0 i2일때 0,1 1,0 i3일때 0,2 1,1 2,0
 */
		

		
		// step 1. 대각선 줄 별로 코드 작성
		
//		for(int i=0; i<=0; i++) {
//			for(int j=0; j>=0; j--) {
//				a[i][j-i]=num;
//				num++;
//				break;
//			}
//		}		
//		for(int i=0; i<=1; i++) {
//			for(int j=1; j>=0; j--) {
//				a[i][j-i]=num;
//				num++;
//				break;
//			}
//		}		
//		for(int i=0; i<=2; i++) {
//			for(int j=2; j>=0; j--) {
//				a[i][j-i]=num;
//				num++;
//				break;
//			}
//		}		
//		for(int i=0; i<row; i++) {
//			for(int j=3; j>=0; j--) {
//				a[i][j-i]=num;
//				num++;
//				break;
//			}
//		}		
//		for(int i=0; i<row; i++) {
//			for(int j=4; j>=1; j--) {
//				a[i][j-i]=num;
//				num++;
//				break;
//			}
//		}
//		for(int i=1; i<row; i++) {
//			for(int j=5; j>=2; j--) {
//				a[i][j-i]=num;
//				num++;
//				break;
//			}
//		}
//		for(int i=2; i<row; i++) {
//			for(int j=6; j>=3; j--) {
//				a[i][j-i]=num;
//				num++;
//				break;
//			}
//		}
//		for(int i=3; i<row; i++) {
//			for(int j=7; j>=4; j--) {
//				a[i][j-i]=num;
//				num++;
//				break;
//			}
//		}
		
		

		// step 2. 중복된 부분 통합
//		for(int k=0; k<=3; k++) {
//			for(int i=0; i<=k; i++) {
//				for(int j=k; j>=0; j--) {
//					a[i][j-i]=num;
//					num++;
//					break;
//				}
//			}	
//		}
//		
//		for(int k=0; k<4; k++) {
//			for(int i=k; i<row; i++) {
//				for(int j=k+4; j>=k+1; j--) {
//					a[i][j-i]=num;
//					num++;
//					break;
//				}
//			}	
//		}
		
		// step 3. 변수 k인 조건문을 통합하고, if문으로 분리
		for(int k=0; k<=7; k++) {
			if(k<=3) {
				for(int i=0; i<=k; i++) {
					for(int j=k; j>=0; j--) {
						a[i][j-i]=num;
						num++;
						break;
					}
				}	
			} else {
				for(int i=k-4; i<row; i++) {
					for(int j=k; j>=k-3; j--) {
						a[i][j-i]=num;
						num++;
						break;
					}
				}	
			}
		}
		
		
		
		
		
		

		

		// 2,0 1,1 0,2
		
		// 배열 값 출력부
		// 현재 배열 값
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}

	}

}

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
 * 0 	1	2	7	7	11
 * 1	2	5	8	12
 * 2	6	9	13
 * 3	10	14
 * 
 *  i1 일때 0,0 i2일때 0,1 1,0 i3일때 0,2 1,1 2,0
 */
		
		
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				
				if(j>i) {
					for(int k=0; k<j; k++) {
						
						a[i-k][j-k]=num;
					}
				}else {
					a[i][j]=num;
					num++;
					
				}
				
				if(j==0) {
					j=i-1;
				}
				
				
				
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

	}

}

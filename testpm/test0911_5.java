package testpm;

public class test0911_5 {

	public static void main(String[] args) {
		int[][] a = new int[4][5];
		int num=1;
		//배열 값 입력부
		
		int row = a.length;
		int col = a[0].length;
		
		

		
		
		for(int i=0; i<row; i++) {		
			
			for(int j=0; j<col; j++) {
				
				
				if(a[i][j]==0) {
					
					if(i==0) {
						a[i][j]=num;
						num++;
					}
					
					if(j==4 && i>=1) {
						
						a[i][4]=num;
						num++;
					}
//					
//					if(j==4 && i==3) {
//						
//						a[3][j-1]=num;
//						num++;
//					}
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

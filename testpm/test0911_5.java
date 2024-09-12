package testpm;

public class test0911_5 {

	public static void main(String[] args) {
		int[][] a = new int[4][5];
		int num=1;
		//배열 값 입력부
		
		int row = a.length;
		int col = a[0].length;
		
		// 첫번째 행부터 시작.
		// 마지막 열에서 마지막 행까지 이동
		// 마지막열, 마지막행에서 첫번째 열까지 이동
		// 첫번째열, 마지막행에서 첫번째행 +1 까지이동
		// 마지막열-1까지 이동...
		
			for(int k=0; k<=6; k++) {
				
				if(k==1) {
					for(int i=0; i<1; i++) {
						for(int j=0; j<5; j++) {
							a[i][j]=num;
							num++;						
						}
					}
				}
				if(k==2) {
					for(int i=1; i<4; i++) {
						for(int j=4; j>3; j--) {
							a[i][j]=num;
							num++;
						}
					}
				}
				
				if(k==3) {
					for(int i=3; i>2; i--) {
						for(int j=3; j>=0; j--) {
							a[i][j]=num;
							num++;
						}
					}
				}	
				if(k==4) {
					for(int i=2; i>0; i--) {
						for(int j=0; j<1; j++) {
							a[i][j]=num;
							num++;
						}
					}
				}
				if(k==5) {
					for(int i=1; i<2; i++) {
						for(int j=1; j<4; j++) {
							a[i][j]=num;
							num++;						
						}
					}
				}
				if(k==6) {
					for(int i=2; i>1; i--) {
						for(int j=3; j>=1; j--) {
							a[i][j]=num;
							num++;
						}
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

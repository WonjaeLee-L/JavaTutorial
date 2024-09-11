package testpm;

public class test0911_3 {

	public static void main(String[] args) {
		int[][] a = new int[4][5];
		int num=1;
		//배열 값 입력부
		
		int row = a.length;
		int col = a[0].length;
		
		// 행 - index가 짝수인경우 열이 순차적으로 
		//    - index가 홀수인경우 열이 역순으로
		//    - 행은 순차적으로 증가
		
		for(int i=0; i<row; i++) {
			
			if(i%2==0) {
				for(int j=0; j<col; j++) {
					a[i][j]=num;
					num++;
				}
			}else {
				for(int j=col-1; j>=0; j--) {
					a[i][j]=num;
					num++;
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

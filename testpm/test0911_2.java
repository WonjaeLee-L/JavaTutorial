package testpm;

public class test0911_2 {

	public static void main(String[] args) {
		int[][] a = new int[4][5];
		int num=1;
		//배열 값 입력부
		
		int row = a.length;
		int col = a[0].length;
		
		// 행과 열 모두 역순
		
		for(int i=row-1; i>=0; i--) {
			for(int j=col-1; j>=0; j--) {
				a[i][j]=num;
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

	}

}

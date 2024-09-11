package testpm;

public class test0911_1 {

	public static void main(String[] args) {
		int[][] a = new int[4][5];
		int num=1;
		//배열 값 입력부
		
		int row = a.length;
		int col = a[0].length;
		
		// 열은 index 4부터 0으로 줄어드는 순
		// 행은 index 0부터 3까지 늘어나는 순으로

		for (int i=row; i>=0; i--) {
			for (int j=0; j<row; j++) {
				a[j][i]=num;
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

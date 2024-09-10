package testpm;

public class test0910_7 {

	public static void main(String[] args) {
		// 1 1 0 2
		// 3 2 1 2
		// 0 0 3 2
		// 4 4 4 4
		// 2 4 3 1
		// 2 4 1 3
		int[][] a = {{1,1,0,2},
				     {3,2,1,2},
				     {0,0,3,2},
			       	 {4,4,4,4},
				     {2,4,3,1},
				     {2,4,1,3}};
		
		// 위와 같은 게임 배열에서 같은 번호가 세로로 연속 3개 이상이면 제거가 가능하다.
		// 제거가 가능한 블록의 좌표를 출력하시오
		for (int i=0; i<4; i++) {
			for (int j=0; j<4; j++) {
				if(a[i][j]==a[i+1][j]) {
					if(a[i+1][j]==a[i+2][j]) {
						System.out.println("{"+i+", "+j+"}"+"{"+(i+1)+", "+j+"}"+"{"+(i+2)+", "+j+"}");
						i=i+2;
						if(i>=4) {
							break;
						}
					} else {
						i++;
					}
						

				}
			}
		}
		

		
	}

}

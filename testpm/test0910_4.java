package testpm;

public class test0910_4 {

	public static void main(String[] args) {
		int[][] a = {{1,2,3,4,5},
			         {6,7,8,9,10},
		             {11,12,13,14,15},
			         {16,17,18,19,20},
			         {21,22,23,24,25}};
		// 전체 배열의 값 중 짝수는 모두 몇 개인가?
		int cnt=0;
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(a[i][j]%2==0) {
					cnt++;
				}
			}
		}
		System.out.println(cnt+"개");
		// 전체 배열의 값을 판별해야하므로
		// a[0~4][0~4]의 값을 모두 판별
		// 각각을 for문의 변수로 지정해야하므로
		// 2중 for문을 이용하였고,
		// 그 내부에 짝수를 판별하는 if문을 넣어
		// 짝수일 경우에 변수(cnt)의 값을 1증가시켜
		// 짝수의 갯수를 세도록 함
		// for문 종료 후에 해당 변수(cnt)를 출력 함
	}

}

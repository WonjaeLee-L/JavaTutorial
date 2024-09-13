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
		//
		//	step 1.
		// 0,0 0,1 0,2 0,3 0,4		행은 고정 열은 변화
		// 1,4 1,3 1,2 1,1 1,0		행은 고정 열은 변화
		// 2,0 2,1 2,2 2,3 2,4		행은 고정 열은 변화
		// 3,4 3,3 3,2 3,1 3,0		행은 고정 열은 변화
		//
		//							행이 먼저 반복되고 다시 열이 반복
		//							행은 i로 결정
		//
		// 							for(int 행=0;행<4;행++) {
		//
		//
		//							}
		// step 2.
		// 열이 0,1,2,3,4 패턴 1
		// 열이 4,3,2,1,0 패턴 2
		// -> 행이 짝수이면 패턴 1, 홀수이면 패턴 2.
		// -> if문으로 분류
		//
		// for(int 행=0;행<4;행++) {
		//  	if(행%2==0) {
		//  		for(int 열=0;열<5;열++) {
		//   			a[행][열]=num++;
		//  		}
		//  	}else {
		//  		for(int 열=4;열>=0;열--) {
		//  			a[행][열]=num++;
		//  		}
		//  	}
		// }
		
		
		for(int i=0; i<row; i++) {
			if(i%2==0) {
				for(int j=0; j<col; j++) {
					a[i][j]=num++;
					// 위 코드는 대입연산자가 일어난 후
					// 단일 연산자인 ++이 실행된다.
					// a[행][열]=++num; 의 경우는
					// 단일 연산자가 먼저 실행되고
					// 대입 연산자가 실행된다.
					// 첫번째 case는 후위 단일 연산자(java에서는 후위로 많이 쓴다),
					// 두번째 case는 전위 단일 연산자라 한다.
				}
			}else {
				for(int j=col-1; j>=0; j--) {
					a[i][j]=num++;
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

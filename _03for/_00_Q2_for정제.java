package _03for;

public class _00_Q2_for정제 {

	public static void main(String[] args) {
		int[] a = {30,40,50,55,65};
//		for(int i=1; i<=5; i++) {
//			System.out.println(a[i%5]);
//		}

		for(int i=0; i<=4; i++) {
			System.out.println(a[(i+1)%5]);
		}
//	되도록 i = 0으로 문제풀기
		
		
		System.out.println("-----------");
		
		
		// 데이터 정제
		// 50미만은 출력하지 않음
		// 배열 순회를 반복하면서 값의 조건 판단 후 출력 **
		// 0번 index값 버려 안버려? 1번 index값 버려 안버려? ~ 반복
		// 눈으롤 보고 하나하나 판단하는 것처럼 생각
		for(int i=0; i<5; i++) {
			if(a[i]>=50) {
				System.out.println(a[i]);
			}
		}
		
		
		// 50이상 점수는 몇개?
		// count 하려면 기억. 프로그램에서 변수 설정
		int cnt=0;
		for(int i=0; i<5; i++) {
			if(a[i]>=50) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
		
		System.out.println("------------");
		
		// for문부터 쓰고보지말고 문제 분석부터 하고
		// 어떤게 조건인지 생각하고 시작
		
		// 50이상 점수를 모두 합하시오
		int sum=0;
		for(int i=0; i<5; i++) {
			if(a[i]>=50) {
				sum += a[i];
			}
		}
		System.out.println(sum);
		
		
		// 평균을 구하시오. 단, 50점 이상만
		int sum1=0;
		int cnt1=0;
		for(int i=0; i<5; i++) {
			if(a[i]>=50) {
				cnt1++;
				sum1 += a[i];
			}
		}
		// 결과 앞에만 double 표시하면 실수로 적용
		System.out.println((double)sum1/cnt1);
		
		
		// 평균을 구하시오. 단, 최저 점수는 포함하지 마시오
		int minValue = 101;
		int sum2 = 0;
		double cnt2 = 0;
		// 최저값 찾기
		for(int i=0; i<5; i++) {
			if(minValue>a[i]) {
				minValue = a[i];
			}
			sum2 += a[i];
			cnt2++;
		}
		// 평균 값 구하기
		System.out.println((sum2-minValue)/(cnt2-1));
		
		
		// 누적 합 구하기
		//		for(int i=0; i<5; i++) {
		//		if(minValue != a[i]) {
		//			sum2 += a[i];
		//			cnt2++;
		//		}
		//			
		//	}		
	}

}

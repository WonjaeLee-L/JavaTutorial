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
//	i = 0으로 문제풀기
		System.out.println("-----------");
		// 데이터 정제
		// 50미만은 출력하지 않음
		// 배열 순회를 반복하면서 값의 조건 판단 후 출력
		// 0번 index값 버려 안버려? 1번 index값 버려 안버려? ~
		for(int i=0; i<5; i++) {
			if(a[i]>=50) {
				System.out.println(a[i]);
			}
		}
	}

}

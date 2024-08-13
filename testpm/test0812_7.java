package testpm;

public class test0812_7 {

	public static void main(String[] args) {
		// 7번 문제
		//최대값을 구하는 문제에서

		int[] a1 = {34,2,35,8,31,45};
		// 철수는 배열의 0번 인덱스부터 순회한다.
		// 0번 인덱스에서는 0번인덱스와 그 다음 인덱스를 비교하여 큰 수를 뒤로 배치한다.
		// 이러한 방식으로 배열의 뒤까지 반복하면 맨 뒤에 가장 큰 수가 배치 될 것이다.
		// 위와 같은 방식으로 가장큰 수를 구하시오.
		for(int i=0; i<a1.length-1; i++) {
			if(a1[i+1]<a1[i]) {
				a1[i+1] = a1[i];
			}
			if(a1[i+1]>a1[5]) {
				a1[5] = a1[i+1];
			}	
				
		}
		System.out.println(a1[5]);

	}

}

package testpm;

public class test0812_8 {

	public static void main(String[] args) {
		// 8번 문제
		//철수는 배열의 0번 인덱스에 가장 큰 값을 저장하면 될 것이라고 생각한다.
		//0번 인덱스가 가장 큰 값이라고 정의하고 1번부터 마지막까지 순회하면서
		//가장 큰 값이 나오면 가장 큰 값을 갱신한다.
		//위와 같은 방식으로 가장 큰 수를 구하시오.
		int[] a2 = {34,2,35,8,31,45};
		for(int i=0; i<a2.length; i++) {
			if(a2[0]<a2[i] && i!=0) {
				a2[0] = a2[i];
			}
		}System.out.println(a2[0]);

	}

}

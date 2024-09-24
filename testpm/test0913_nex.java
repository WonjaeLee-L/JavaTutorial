package testpm;

public class test0913_nex {

	public static void main(String[] args) {
//		어떤 자연수 n이 있을 때, d(n)을 n의 각 자릿수 숫자들과 n 자신을 더한 숫자라고 정의하자.
//		예를 들어 d(91) = 9 + 1 + 91 = 101
//		이 떄, n을 d(n)의 제네레이터(generator)라고 한다. 위의 예에서 91은 101의 제네레이터이
//		다. 어떤 숫자들은 하나 이상의 제네레이터를 가지고 있는데, 101의 제네레이터는 91 뿐 아니라
//		100도 있다. 그런데 반대로, 제네레이터가 없는 숫자들도 있으며, 이런 숫자를 인도의 수학자
//		Karprekar가 셀프 넘버(self-number)라 이름 붙였다. 예를 들어 1,3,5,7,9,20,31은
//		셀프 넘버 들이다.
//		
//		1 이상이고 5000 보다 작은 모든 셀프 넘버들의 합을 구하라.
//		1234

		// 풀이
		// 101의 제네레이터는 91 -> 91을 각 자리 숫자를 나누고 91을 더하면 101
		// 101의 제네레이터는 100
		// 셀프넘버 - 각 자리 숫자의 합과 자체 숫자를 더했을 때 만들 수 없는 숫자
		// 123 = 1 + 2 + 3 + 123 => 129
		// 129의 제네레이터는 123
		// i = g + (g/1000+(g/100)%10+(g%100)/10+g%10)
		// 각 자리 숫자를 나누는 것은, %와 /를 이용하면 가능하다.
		// 
		
		// 공식 확인
//		int g = 1234;
//		int i = 0;
//		i=g + (g/1000)+((g/100)%10)+((g%100)/10)+(g%10);
//		System.out.println(i);
		
		int cnt = 0;
		int sum =  0;
		for(int j=0; j<5000; j++) {
			for(int k=0; k<6000; k++) {
				int sumK = (k + (k/1000)+((k/100)%10)+((k%100)/10)+(k%10));
				if(j == sumK) {
					cnt=1;
				}
			}
			if(cnt==0) {
				sum += j;
			}
			cnt=0;	
		}
		System.out.println(sum);
	}

}
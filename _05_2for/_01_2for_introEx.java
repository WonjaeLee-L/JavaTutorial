package _05_2for;

public class _01_2for_introEx {

	public static void main(String[] args) {
		// 1단을 모두 출력
		// 앞에 1은 고정 * 뒤에 숫자가 반복
		System.out.println("(1) 1단을 모두 출력");
		for(int i=0; i<5; i++) {
			System.out.println("1*"+i+"="+(1*i));
		}
		
		// 1단부터 4단까지 출력
		// 1X1= 1, 1X2=2 ...
		// 2X1= 2, 2X2=4 ...
		// dan은 단/ i는 뒤에 숫자
		// dan이 1일때 i가 0,1,2,3,4 dan이 2일때 i가 ...
		System.out.println("(2) 1단부터 4단까지 출력");
		for(int dan=1; dan<5; dan++) {
			System.out.println(dan);
			for(int i=0; i<5; i++) {
				System.out.println(dan+"*"+i+"="+(dan*i));
			}
		}
		
		// ***를 네 줄을 출력하라
		// 1. 줄에서 *이 3개가 반복된다.
		// 2. 줄이 네 개 반복된다.
		System.out.println("(3) ***를 네 줄을 출력");
		for(int i=0; i<4; i++) {
			for(int j=0; j<3; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 문제를 분석 후 i를 무엇으로 볼 것인가?
		//		      j를 무엇으로 볼 것인가?
		// 를 생각.
		// i의 변화에 따라 j가 반복된다.
		
		
		// (4)
		// *이 줄이 늘어가면서 하나씩 증가
		// 1. 줄을 출력
		// 2. 줄에서 열의 순서대로 * 출력
		// 더 큰범위인 줄이 i, 열이 j
		System.out.println("(4) *이 줄이 늘어가면서 하나씩 증가");
		for(int i=0; i<4; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// (5)
		String id = "abc*"; // id
		String sign = "*^$"; // 특수문자를 정의(*나 ^나 $ 등)
		// 특수문자가 있는가?
		
		
		System.out.println("특수문자 판별");
		for(int i=0; i<4; i++) {
			for(int j=0; j<3; j++) {
				if(id.charAt(i)==sign.charAt(j)) {
					System.out.println(sign.charAt(j)+" 특수문자가 있습니다.");
				}
			}
			
		}
		// 1. sign의 0번 문자부터 찾는다.(먼저, i)
		// 2. id의 0번 문자가 특수문자인가? (나중, j)
		int cnt=0; // 특수문자 갯수 저장
		for(int i=0; i<sign.length(); i++) {
			for(int j=0; j<id.length(); j++) {
				if(sign.charAt(i)==id.charAt(j)) {
					cnt++;
				}
			}
			
		}
		if(cnt>0) {
			System.out.println("특수문자 "+cnt+"개 포함");
		}
	}
}

package _04Random;

import java.util.Random; // Ctrl + shift + o 치면 이게 생김. 이 Random class를 인식시켜주는 것.(import)
						 // JDK 설치하면서 어딘가에 random class도 같이 설치. 그거를 import로 뽑아내서 사용하는 것.
public class _00_Test {		// 6개의 랜덤한 로또번호 추출

	public static void main(String[] args) {
		// 시나리오.. 랜덤한 숫자를 뽑아서 로또 번호로 저장한다.
		// 로또 번호 저장할 배열
		int[] lotto = new int[6];
		// 랜덤한 번호를 추출하기 위한 객체 만들기
		Random r = new Random();	// 그냥 치면 Random이라는 클래스를 얘가 모른다. Ctrl + shift + o
		// 랜덤한 번호를 뽑기 위한 반복문
		for(int i=0; i<lotto.length; i++) {
//			System.out.println((i+1)+"번째 뽑아");
			int k = r.nextInt(45)+1;			
			// r변수를 참조하여 nextInt라는 기능을 호출. 리턴받은 수(0~44)에 +1 // 매개변수 45, 범위 0~44, 보정값 +1
			lotto[i]=k;
		}
		// 로또 번호를 출력하는 반복문
		for(int i = 0; i<lotto.length; i++) {
			if(i==lotto.length-1) {	// 마지막 번호
				System.out.println("보너스 : "+lotto[i]);
			}else {
				System.out.println(lotto[i]);
			}
			
		}

	}

}

package testpm;

import java.security.AlgorithmConstraints;
import java.util.Random;

public class test0812 {

	public static void main(String[] args) {

		// 0번 문제(선택받은너)
		// 0 int[] letter={8,12,4,13,2,14,4,5}
		// 짝수만 출력하시오.

		int[] letter = { 8, 12, 4, 13, 2, 14, 4, 5 };
		for (int i = 0; i < letter.length; i++) {
			if (letter[i] % 2 == 0) {
				System.out.println(letter[i]);
			}
		}
		System.out.println("-----");

		// 1번 문제(큰놈)
		// int[] letter={8,12,4,13,2,14,4,5}
		// 배열의 가장 큰수가 있는 인덱스를 출력하시오.
		int maxValue = 0;
		int maxIndex = -1;
		for (int i = 0; i < letter.length; i++) {
			if (maxValue < letter[i]) {
				maxValue = letter[i];
				maxIndex = i;
			}
		}
		System.out.println(maxIndex);
		System.out.println("-----");

		// 2번 문제(현상수배)
		// int[] letter={8,12,4,13,25,14,4,5}
		// 범인을찾으시오
		// 범인은 짝수이면서 가장큰 값이다.
		// 범인은 14입니다.
		int[] letter1 = { 8, 12, 4, 13, 25, 14, 4, 5 };
		int maxEven = 0;
		for (int i = 0; i < letter1.length; i++) {
			if (letter1[i] % 2 == 0 && maxEven < letter1[i]) {
				maxEven = letter1[i];
			}
		}
		System.out.println(maxEven);
		System.out.println("-----");

		// 3번 문제(비밀편지)
		// String word ="gehoudfkimjnlvy";
		// int[] letter={8,12,3,13,1,14,3,4};
		// letter 배열은 word문자열 알파벳의 위치이다.
		// letter배열의 암호를 풀어서 편지의 내용을 출력하시오.
		String word = "gehoudfkimjnlvy";
		int[] letter2 = { 8, 12, 3, 13, 1, 14, 3, 4 };
		for (int i = 0; i < letter2.length; i++) {
			System.out.print(word.charAt(letter2[i]));
		}
		System.out.println("");
		System.out.println("-----");

		// 4번 문제(난건물주)
		// int[] arr = {1,0,0,0,1,1,1,0,0,0,0,1,1,1,1,0,0,0,1}
		// int size=2;
		// arr 배열에서 0이 의미하는 것은 공터이다.
		// size는 건물의 크기 이다. 건물은 하나만 짓는다. 공터는 연속적으로 있어야 한다.
		// size 설정값에 따라 공터에 건물을 지을 수 있는 위치는 모두 몇개인가?
		// size가 2일경우에 7개이다.
		int[] arr = { 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1 };
		int zPlace = 0;
		int place = 0;
		int sumPlace = 0;
		int cnt = 0;
		int size = 2;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				cnt++;
			} else if (cnt != 0) {
				zPlace = cnt;
				cnt = 0;
				place = zPlace - size;
				sumPlace = sumPlace + place + 1;
			}
		}
		System.out.println(sumPlace);
		System.out.println("-----");

		// 6번 문제
		// String a ="23-56+45*2-56";
		// 수식을 계산하는 프로그램을 작성하세요.
		// 수식 계산 규칙은 연산자 우선순위 없이 앞에서 부터 차례대로 계산한다.
		// 지금까지 공부한 내용으로 해결하시고, 형변환만 검색이 가능합니다.
		// 메서드는 최대한 적게 사용하세요
//		String a ="23-56+45*2-56";
//		int s = Integer.valueOf(a);
//		for(int i = 0; i < a.length(); i++) {
//			
//		}
//		Integer.toString()
//		

		// 23 ETB, 56 8, 45 -, 2 STX, 56 8

//		System.out.println((int)t);
//		System.out.println(a.concat("="));
//		System.out.print((a.charAt(0)*10+a.charAt(1))-(a.charAt(2)*10+a.charAt(3))*a.charAt(4)-(a.charAt(5)*10+a.charAt(6)));
//		System.out.println("");
//		System.out.println("------");

		// 7번 문제
		// 최대값을 구하는 문제에서
		// 철수는 변수를 사용하지 않고 배열만 이용하여 푸는 방법을 생각하였다.
		int[] a1 = { 34, 2, 35, 8, 31, 45 };

		// 철수는 배열의 0번 인덱스부터 순회한다.
		// 0번 인덱스에서는 0번인덱스와 그 다음 인덱스를 비교하여 큰 수를 뒤로 배치한다.
		// 이러한 방식으로 배열의 뒤까지 반복하면 맨 뒤에 가장 큰 수가 배치 될 것이다.
		// 위와 같은 방식으로 가장큰 수를 구하시오.
		for (int i = 0; i < a1.length - 1; i++) {
			if (a1[i + 1] < a1[i]) {
				a1[i + 1] = a1[i];
			}
			if (a1[i + 1] > a1[5]) {
				a1[5] = a1[i + 1];
			}

		}
		System.out.println(a1[5]);
		System.out.println("------");

		// 8번 문제
		// 철수는 배열의 0번 인덱스에 가장 큰 값을 저장하면 될 것이라고 생각한다.
		// 0번 인덱스가 가장 큰 값이라고 정의하고 1번부터 마지막까지 순회하면서
		// 가장 큰 값이 나오면 가장 큰 값을 갱신한다.
		// 위와 같은 방식으로 가장 큰 수를 구하시오.
		int[] a2 = { 34, 2, 35, 8, 31, 45 };
		for (int i = 0; i < a1.length; i++) {
			if (a2[0] < a2[i] && i != 0) {
				a2[0] = a2[i];
			}
		}
		System.out.println(a2[0]);

		System.out.println("---");
		// 9번 문제
		// Random이라는 클래스로 객체를 만들어서 r이라는 참조변수로 참조해서 사용해 보자~
		// Random r = new Random();
		// int num = r.nextInt(45)+1; // 변수 r을 참조하여 nextInt 메서드를 호출함. 매개변수는 랜덤한 숫자의 범위를
		// 지정함
		// 즉 0 - 44까지 중 랜덤한 숫자 하나를 선택하여 리턴함.
		// 로또 번호는 1-45까지 이므로 리턴값이 +1로 보정함
		// 리턴값을 보정하여 num변수의 값에 대입
		Random r = new Random();
		int num = r.nextInt(45) + 1;
		int[] lotto = {};
		for (int i = 0; i < 6; i++) {
			lotto[i] = num;

		}
		System.out.println(lotto[0]);

		System.out.println("---");

		// 특별 1
		// String a = "6/4/3/2/5/1/4/5/6/7/8/9/1/2/3/4/5/6";
		// 문자열 a는 한자릿수의 숫자를 수집한 문자열이다.
		// 숫자별로 수집된 수만큼 카운팅하세요.
		// 카운팅 배열은
		// int[] a = new int[10];
		// 위 선언문은 길이 10의 배열을 생성한 선언문이다. 초기값은 0이다.
		// 인덱스 0 - 9까지를 숫자로 정의한다.
		// 조건 : 형변환은 사용하지 않는다. 메서드는 charAt()만 사용한다.
		int cnt11 = 0;
		String a4 = "6/4/3/2/5/1/4/5/6/7/8/9/1/2/3/4/5/6";
		String[] a5 = a4.split("/");

		int[] a6 = new int[10];
		for (int i = 0; i < a5.length; i++) {
			if (i % 2 == 0 && a4.charAt(0) == a4.charAt(i)) {
				cnt++;
				a6[i] = cnt++;
			}

		}
		cnt = 0;
		System.out.println(a6[0]);
		System.out.println(a5[1]);

		// 특별 2
		// 문자열 a는 해충에 대한 숫자를 카운팅한 결과이다.
		// 해충의 갯수를 모두 합하시오.
		// charAt() 메서드만 사용이 가능하다.
		// 형변환이 필요하면 검색하여 사용하시오.
//		 String a6 ="67/414/1/23/32/45/54/12/11/232";
//		char tt = 'C';
//		char 
//		System.out.println((int)'C');

	}

}

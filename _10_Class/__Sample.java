package _10_Class;

import java.util.Random;	// -> 클래스

public class __Sample {	// -> 클래스


	public static void main(String[] args) {		// -> 메서드
		// 변수 = 값을 저장하는 기억공간 (메모리에 저장)
		// int=4byte, char=2byte, String은 없음.
		// 변수는 원시변수, 참조변수
		// 원시변수(실제값 저장) - int, char, double, float ...(소문자 시작)
		// 실제값이란 내가 원하는 값
		// 참조변수(주소를 저장) - String, Random, Scanner ...
		// 참조변수가 저장한 주소의 의미는 객체가 있는 곳의 주소. 내가 원하는 값이 있는 주소
		// 현금(원시)과 카드(참조)로 생각. 통장은 하나인데 여러가지 카드가 있을 수 있다.
		// 현금은 직접 내는 것이고, 카드를 내면 돈이 있는 통장과 연결된다.
		int a=10;
		Random r = new Random();
		Random r1 = r;
		Random r2 = null;
		Random r3 = new Random();
		// 객체는 두 개 만들어졌다(new연산자로 만든 것이 객체)
		// a는 원시변수, 나머지 네 개는 참조변수
		// 참조한 연산자는 .(점)
		
		
		System.out.println(r.nextInt(4));
		System.out.println(r1.nextInt(4));
		System.out.println(r2.nextInt(4));
		System.out.println(r3.nextInt(4));

	}

}

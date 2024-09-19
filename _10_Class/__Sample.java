package _10_Class;

import java.util.Random; // -> 클래스

public class __Sample { // -> 클래스

	public static void main(String[] args) { // -> 메서드
//		 변수 = 값을 저장하는 기억공간 (메모리에 저장)
//		 int=4byte, char=2byte, String은 없음.
//		 변수는 원시변수, 참조변수
//		 원시변수(실제값 저장) - int, char, double, float ...(소문자 시작)
//		 실제값이란 내가 원하는 값
//		 참조변수(객체의 주소를 저장) - String, Random, Scanner ...
//		 참조변수가 저장한 주소의 의미는 객체가 있는 곳의 주소. 내가 원하는 값이 있는 주소
//		 객체는 heap이라는 공간에 있다.
//		 heap은 객체의 생성과 소멸까지 관여한다.
//		 객체가 아무도 참조하지 않을 때 제거 대상이 되고, GC(garbage collector)가 제거한다.
//		 현금(원시)과 카드(참조)로 생각. 통장은 하나인데 여러가지 카드가 있을 수 있다.
//		 현금은 직접 내는 것이고, 카드를 내면 돈이 있는 통장과 연결된다.
		int a = 10;
		Random r = new Random();
//		 클래스명 변수명 = new 생성자명()
//		 r은 객체를 저장x, 객체의 주소를 저장
//		 생성자는 객체가 만들어질 때, 제일 먼저 호출
//		 객체를 직접 만든 코드

		Random r1 = r;
//		 r1은 r값과 같은 변수인데, r값이 객체의 주소를 의미하므로 가능
//		 객체의 주소만 주입받은 코드. 이미 만들어진 주소를 받아서 쓰는 것

		Random r2 = null;
		Random r3 = new Random();
//		 객체는 두 개 만들어졌다(new연산자로 만든 것이 객체)
//		 a는 원시변수, 나머지 네 개는 참조변수
//		 참조한 연산자는 .(점)

		System.out.println(r.nextInt(4));
//		 객체의 주소를 가지고 참조(.) 해서 메서드(nextInt)로 이용
//		 = 객체가 가진 기능중에 nextInt()라는 기능을 이용한다.
		System.out.println(r1.nextInt(4));
//		 System.out.println(r2.nextInt(4));
//		 객체를 참조할 주소가 없기 때문에, 참조 연산자에서 에러가 난다.(예외)		
		System.out.println(r3.nextInt(4));
		
//		- 클래스는 객체를 만들기 위해 정의한 것.
//		- 클래스는 변수와 메서드로 정의
//		- 클래스로부터 만든 객체는 서로 독립적이다.
//		- 객체를 참조하는 변수는 원시변수가 아닌 참조변수
//		- 참조변수는 주소를 저장, 객체는 자바의 힙영역에 저장
//		- 참조변수가 저장하고 있는 주소값을 참조하여 객체에 접근
//		- new연산자로 객체를 만들 때는 생성자로 만든다
//		- 생성자는 객체를 만들 때 처음 호출되는 메서드이다. 클래스 이름과 동일하다.

	}

}

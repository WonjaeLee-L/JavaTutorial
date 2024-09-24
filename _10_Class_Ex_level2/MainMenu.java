package _10_Class_Ex_level2;

import java.util.Scanner;

public class MainMenu {
	// 의존관계 설정 시작
//	(1)EventAdmin eventAdm = null;
//	   MemberAdmin memberAdm = null;
	// 의존관계 변수만 설정하고, 주소를 저장하는 방법은
	// 직접 객체를 만들거나, 주소를 주입 받는 방식이 있다.
	// 이를 고려하자.
	// 의존관계 설정 끝
//	(2) EventAdmin eventAdm = new EventAdmin();
//	(2) MemberAdmin memberAdm = new MemberAdmin();
	// 메인 메뉴라는 객체가 생성될 때, 멤버변수가 각각 한 번 만들어진다.
	
	EventAdmin eventAdm = null;
	MemberAdmin memberAdm = null;
	// (3) 마지막 방법
	// 일반적으로 멤버변수로 값을 지정하지 않음

	MainMenu() {
		// 생성자는 초기화 작업을 할 때, 많이 사용한다.
		// 초기화 작업은 멤버변수의 값을 세팅하는 것을 말한다.
		// 예를 들면, 데이터베이스에서 값을 가져와서 초기값을 결정하는 것이다.
		// 메뉴는 초기화 작업이라고 보기 어렵다.
		// 별도로 메서드 처리 한다.

		

		if (eventAdm == null) {
			eventAdm = new EventAdmin();
		}
		if (memberAdm == null) {
			memberAdm = new MemberAdmin();
		}
//		 (3) 멤버변수에 null로 하고, 위와 같이 생성자에 초기 세팅 값을 결정한다.
		menu();
	}

//	EventAdmin eventAdm = null;
//	MemberAdmin memberAdm = null;
	// 여기다 선언해도 되는데 일반적으로 가장 위에 선언 한다.
	public void menu() {
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("1. 고객 관리");
			System.out.println("2. 이벤트 관리");
			System.out.println("3. 프로그램 종료");
			int num = in.nextInt();
			in.nextLine();
			if (num == 1) {
//				(1) memberAdm = new MemberAdmin();
				// 이렇게 하면 1번을 누를때마다 객체를 생성한다. 그러면 고객 정보가 사라진다
//				(2) memberAdm.menu();
				// 위에서 만든 (멤버변수가 생성될 때 만들어진) 객체를 참조하여 메뉴라는 메서드를 호출하여
				// 문제를 해결할 수 있다.
				
				memberAdm.menu();
				// (3)
			} else if (num == 2) {
//				(1) eventAdm = new EventAdmin();
//				(2) eventAdm.menu();
				
				eventAdm.menu();
				// (3)
			} else if (num == 3) {
				break; // while문 종료
			}

		}

	}

}

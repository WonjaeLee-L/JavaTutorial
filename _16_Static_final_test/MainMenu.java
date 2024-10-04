package _16_Static_final_test;

import java.util.Scanner;

public class MainMenu {
	private StuMge stuManager = null;
	private PartMge partManager = null;

	// 로그인 정보 객체 주소
	// nowUser가 stuManager에서 값 가져옴
	private Stu nowUser = null;
	
	MainMenu() {
		newin();
		Scanner in = new Scanner(System.in);
		while (true) {
			menu();
			System.out.println("메뉴선택");
			int selNum = in.nextInt();
			in.nextLine();

			if (selNum == 1) {
				goStuMge();
			} else if (selNum == 2) {
				goPartMge();
			} else if (selNum == 3) {
				loginProcess();
			} else if (selNum == 0) {
				break;
			}
		}
	}

	private void goStuMge() {
		// 학생을 관리하는 객체의 메뉴를 호출
		// 객체를 새로 만들지 말고, 기존 객체의 주소를 참조하여 메뉴를 호출해야 한다.
		// new StuMge(); 는 안된다.
		// StuMge class에 menu() 생성하여 호출
		stuManager.menu();

	}

	private void goPartMge() {
		partManager.menu();

	}

	private void loginProcess() {

	}

	private void newin() {
		if (stuManager == null) {
			stuManager = new StuMge();
		}
		if (partManager == null) {
			partManager = new PartMge();
		}
	}

	// 학생, 교과목 관리, 로그인 메뉴
	private void menu() {

		System.out.println("수강신청 프로그램");
		System.out.println("1. 학생 관리");
		System.out.println("2. 교과목 관리");
		System.out.println("3. 로그인");
		System.out.println("0. 프로그램 종료");
		System.out.print("선택 >> ");

	}

}

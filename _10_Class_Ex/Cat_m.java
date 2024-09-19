package _10_Class_Ex;

import java.util.Scanner;

// 고양이 관리 단일 책임을 부여 함.
public class Cat_m {
	// 고양이 객체 5개를 저장 하려고 cList 변수를 선언
	// 클래스 바로 안쪽이라서 멤버변수라고 한다.
	// 여기서 선언한 이유는 클래스 내부 어느곳에서든 참조 가능하게 하려고
	Cat_Obj[] cList = new Cat_Obj[5];

	Scanner in = new Scanner(System.in);

	Cat_m() {
		while (true) {
			System.out.println("고양이 관리자");
			System.out.println("1. 등록");
			System.out.println("2. 삭제");
			System.out.println("3. 수정");
			System.out.println("4. 전체보기");
			System.out.println(" 선택 >>");
			int selNum = in.nextInt();
			in.nextLine();
			System.out.println(selNum + "을 선택함");
			if (selNum == 1) {
				add(); // 메서드 호출
			} else if (selNum == 2) {

			} else if (selNum == 3) {

			} else if (selNum == 4) {
				allList(); // 메서드 호출
			} else {
				break;
			}
		}
	}

	public void add() { // 메서드 정의
		// 클래스 내부에 선언한 변수를 지역변수라고 한다.
		// 클래스가 종료되면 변수는 사라진다.
		System.out.println("고양이 등록");
		// 새로운 고양이 만들기 -> 새 객체 만들기
		Cat_Obj cat = new Cat_Obj();
		System.out.println("고양이 이름을 입력");
		cat.name = in.nextLine();

		for (int i = 0; i < cList.length; i++) {
			if (cList[i] == null) {
				cList[i] = cat;
				break;
			}
		}
	}

	public void allList() { // 메서드 정의
		
		System.out.println("고양이 전체 보기");
		for (int i = 0; i < cList.length; i++) {
			if (cList[i] != null) {
				cList[i].prt();

			}
		}

	}
}

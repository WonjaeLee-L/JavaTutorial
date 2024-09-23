package _10_Class_level_1;

import java.util.Scanner;

public class T_Center {
	// 기차 여러 대를 등록하고, 보고 수정하는 역할
	// 기차 여러 대를 관리하기 위해서 배열이라는 자료형을 선택한다.
	// T_one tone = null; T_one 객체를 의존하므로 변수 선언, 하나 일 때 이렇게 하는데...
	T_one[] tlist = new T_one[5]; // 여러 대 이므로 배열이라는 자료형을 선택했다.

	// 생성자는 없는게 아니라 기본이 생략된 상태인 것.
	public T_Center() {
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("1. 등록");
			System.out.println("2. 수정");
			System.out.println("3. 전체보기");
			System.out.println("4. 종료");
			System.out.println("메뉴 선택 > ");
			int selNum = in.nextInt();
			in.nextLine();

			if (selNum == 1) {
				add();
			} else if (selNum == 2) {
				mod();
			} else if (selNum == 3) {
				listAll();
			} else if (selNum == 4) {
				break;
			}

		}

	}

	private void listAll() {
		// TODO Auto-generated method stub
		for (int i = 0; i < tlist.length; i++) {
			if (tlist[i] != null) { // 주소값이 null일 경우 참조 불가하여 예외 발생하므로 조건문 적용
				tlist[i].prt();
			}
		}
	}

	private void mod() {
		// TODO Auto-generated method stub
		System.out.println("수정할 기차 번호 입력");
		Scanner in = new Scanner(System.in);
		String modNum = in.nextLine();

		// 조건을 걸어 본다. 기차 번호는 유니크 하다.
		for (int i = 0; i < tlist.length; i++) {

			String mnum = tlist[i].getTnum();
			if (mnum.equals(modNum)) {
//			if (tlist[i].tNum.equals(modNum)) {		// -> 이렇게 코드 짜지 말고 위에 두 줄처럼
													// 이건 T_one에 직접 접근해서 가져오는 것. -> 안좋음
													// 달라고 부탁하는 기능 메서드를 만들어서 해결
				// 기차 번호가 유니크하다는 것은 뒤에 있는 기차 번호와 중복이 될 수 없다는 것
				// 그래서 바로 수정 하도록 한다.
				System.out.println("수정 시간 입력");
				tlist[i].tTime = in.nextLine();
				break;
			}
		}
	}

	private void add() {
		// 기차 시간을 추가
		// T_one 객체를 생성하고 기차 번호와 시간을 입력
		Scanner in = new Scanner(System.in);
		T_one tempT = new T_one();
		System.out.println("기차 번호를 입력하세요");
		String a = in.nextLine();
		tempT.setNum(a);
		System.out.println("기차 시간을 1203 형식으로 입력하세요");
		tempT.tTime = in.nextLine();

		// 배열의 빈칸에 저장, 빈칸은 배열의 값이 null
		for (int i = 0; i < tlist.length; i++) {
			if (tlist[i] == null) {
				tlist[i] = tempT; // 객체의 주소값 저장
				break;
			}
		}

	}

}

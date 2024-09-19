package testpm_0919;

import java.util.Scanner;

public class P_m {
	P_Obj[] pList = new P_Obj[7];
	Scanner in = new Scanner(System.in);

	P_m() {
		while (true) {
			System.out.println("관리할 메뉴를 선택하세요");
			System.out.println("1. 등록");
			System.out.println("2. 조회");
			System.out.println("3. 전체보기");
			System.out.println("4. 삭제");
			int inNum = in.nextInt();
			in.nextLine();

			if (inNum == 1) {
				add();
			} else if (inNum == 2) {
				select();
			} else if (inNum == 3) {
				allList();
			} else if (inNum == 4) {
				delete();
			} else {
				break;
			}

		}

	}

	public void add() {
		System.out.println("소유자 정보를 입력하세요");
		P_Obj car = new P_Obj();
		car.name = in.nextLine();
		System.out.println("자동차 번호를 입력하세요");
		car.number = in.nextInt();
		in.nextLine();

		for (int i = 0; i < pList.length; i++) {
			if (pList[i] == null) {
				pList[i] = car;
				break;
			}
		}
	}

	public void select() {
		System.out.println("조회할 자동차의 번호를 입력하세요");
		int cNum = in.nextInt();
		in.nextLine();
		for (int i = 0; i < pList.length; i++) {
			if (pList[i].number == cNum) {
				pList[i].prt();
				break;
			}

		}

	}

	public void allList() {
		System.out.println("등록된 자동차 전체 정보");
		for (int i = 0; i < pList.length; i++) {
			if (pList[i] != null) {
				pList[i].prt();

			}

		}
	}

	public void delete() {
		System.out.println("삭제할 자동차 번호를 입력하세요");
		int cNum = in.nextInt();
		in.nextLine();
		for (int i = 0; i < pList.length; i++) {
			if (pList[i].number == cNum) {
				System.out.println(pList[i].name + "님의 " + pList[i].number + "차량이 삭제되었습니다.");
				pList[i] = null;
				break;
			}
		}

	}

}

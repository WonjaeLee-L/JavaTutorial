package testpm_0923;

import java.util.Scanner;

public class E_manage {

	E_one[] eList = new E_one[10];

	public E_manage() {
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("6. 이벤트 등록");
			System.out.println("7. 이벤트 전체 보기");
			System.out.println("8. 선택 페이지로 이동");

			int selNum = in.nextInt();
			in.nextLine();

			if (selNum == 6) {
				e_add();
			} else if (selNum == 7) {
				e_view();
			} else if (selNum == 8) {
//				C_E_select cESelect = new C_E_select();
				break;
			}

		}
	}

	private void e_view() {
		// TODO Auto-generated method stub
		for (int i = 0; i < eList.length; i++) {
			if (eList[i] != null) {
				eList[i].prt();
			}
		}

	}

	private void e_add() {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		E_one tempE = new E_one();
		System.out.println("이벤트 제목을 입력하세요");
		String a = in.nextLine();
		tempE.setEtitle(a);
		System.out.println("이벤트 내용을 입력하세요");
		String b = in.nextLine();
		tempE.setEtext(b);
		for (int i = 0; i < eList.length; i++) {
			if (eList[i] == null) {
				eList[i] = tempE;
				break;
			}
		}

	}

}

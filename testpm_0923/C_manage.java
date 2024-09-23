package testpm_0923;

import java.util.Scanner;

public class C_manage {
	C_one[] cList = new C_one[10];

	public C_manage() {
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("1. 고객 가입");
			System.out.println("2. 고객 정보 보기");
			System.out.println("3. 고객 정보 수정");
			System.out.println("4. 고객 정보 삭제");
			System.out.println("5. 이벤트 페이지로 이동");

			int selNum = in.nextInt();
			in.nextLine();
			if (selNum == 1) {
				c_add();
			} else if (selNum == 2) {
				c_view();
			} else if (selNum == 3) {
				c_mod();
			} else if (selNum == 4) {
				c_del();
			} else if (selNum == 5) {
				break;
			}

		}
	}

	private void c_mod() {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("수정할 고객의 아이디를 입력하세요");
		String modC = in.nextLine();

		for (int i = 0; i < cList.length; i++) {
			String modCid = cList[i].getCid();
			if (modCid.equals(modC)) {
				C_one tempC = new C_one();
				System.out.println("고객 아이디를 입력하세요");
				String a = in.nextLine();
				tempC.setCid(a);
				System.out.println("고객 이름을 입력하세요");
				String b = in.nextLine();
				tempC.setCname(b);
				cList[i] = tempC;
				break;
			}
		}

	}

	private void c_view() {
		// TODO Auto-generated method stub
		for (int i = 0; i < cList.length; i++) {
			if (cList[i] != null) {
				cList[i].prt();
			}
		}

	}

	private void c_add() {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		C_one tempC = new C_one();
		System.out.println("고객 아이디를 입력하세요");
		String a = in.nextLine();
		tempC.setCid(a);
		System.out.println("고객 이름을 입력하세요");
		String b = in.nextLine();
		tempC.setCname(b);

		for (int i = 0; i < cList.length; i++) {
			if (cList[i] == null) {
				cList[i] = tempC;
				break;
			}
		}

	}

	private void c_del() {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.println("삭제할 고객의 아이디를 입력하세요");
		String delC = in.nextLine();

		for (int i = 0; i < cList.length; i++) {
			String cIdNow = cList[i].getCid();
			if (cIdNow.equals(delC)) {
				cList[i] = null;
				break;
			}
		}

	}

}

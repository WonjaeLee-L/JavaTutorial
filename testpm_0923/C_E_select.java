package testpm_0923;

import java.util.Scanner;

public class C_E_select {

	public C_E_select() {
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("관리할 내용을 선택하세요");
			System.out.println("1. 고객");
			System.out.println("2. 이벤트");
			System.out.println("3. 종료");
			int selNum = in.nextInt();
			in.nextLine();
			if (selNum == 1) {
				System.out.println("고객 관리 페이지로 이동합니다");
				C_manage cManage = new C_manage();

			} else if (selNum == 2) {
				System.out.println("이벤트 관리 페이지로 이동합니다");
				E_manage eManage = new E_manage();

			} else if (selNum == 3) {
				break;
			}

		}

	}
}

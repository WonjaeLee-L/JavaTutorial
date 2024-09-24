package testpm_0923;

import java.util.Scanner;

public class C_E_select {

	public C_E_select() {
		Scanner in = new Scanner(System.in);
		C_manage cManage = new C_manage();
		E_manage eManage = new E_manage();
		while (true) {
			System.out.println("관리할 내용을 선택하세요");
			System.out.println("1. 고객");
			System.out.println("2. 이벤트");
			System.out.println("3. 종료");
			int selNum = in.nextInt();
			in.nextLine();
			if (selNum == 1) {
				System.out.println("고객 관리 페이지로 이동합니다");
//				C_manage cManage = new C_manage();
				// while문 안에 존재하고, C_manage() 내부에 관리 목록이 들어갈 경우
				// 객체가 계속 생성되어 고객 정보가 사라지는 문제가 발생
				// C_manage()를 비우고 새로운 c_c 메서드를 생성하여 호출하여 해결
				cManage.c_c();

			} else if (selNum == 2) {
				System.out.println("이벤트 관리 페이지로 이동합니다");
//				E_manage eManage = new E_manage();
				// C_manage()와 동일한 문제 발생하여 동일하게 해결
				eManage.e_e();

			} else if (selNum == 3) {
				break;
			}

		}

	}
}

package _10_Class_level_2;

import java.util.Scanner;

import _10_Class_level_1.T_one;

public class T_center {
	// Company_T와 T_one을 의존

	Company_T infoT = new Company_T();
	T_one[] tlist = new T_one[5];

		// 생성자는 없는게 아니라 기본이 생략된 상태인 것.
		public T_center() {
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

		}

		private void mod() {
			// TODO Auto-generated method stub

		}

		private void add() {
			// TODO Auto-generated method stub

		}
	}

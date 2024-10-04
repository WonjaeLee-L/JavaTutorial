package _18_IO_package;

import java.util.Scanner;

public class MainMenu {
	Word word = new Word();

	MainMenu() {
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("단어 검색 프로그램");
			System.out.println("1. 단어 목록 출력");
			System.out.println("2. 단어 등록");
			System.out.println("3. 단어 검색");
			System.out.println("0. 프로그램 종료");
			System.out.print(" 선택 >> ");

			int selNum = in.nextInt();
			in.nextLine();
			if (selNum == 1) {
				word.list();
			} else if (selNum == 2) {
				word.insertword();
			} else if (selNum == 3) {
				word.searchword();
			} else if (selNum == 0) {
				break;
			}

		}

	}

}

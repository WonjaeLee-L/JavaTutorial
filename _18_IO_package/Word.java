package _18_IO_package;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Word {
//	//미리 입력 된 텍스트 문서
//	File file1 = new File("C:\\Data\\20240801_tr\\JavaTu2\\src\\_18_IO_package\\Output1.txt");
//	// 텍스트 문서 내용 검색
//	public void wordSearch() {
//		try {
//			FileReader file_reader1 = new FileReader(file1);
//			BufferedReader bufferedReader1 = new BufferedReader(file_reader1);
//			Scanner in = new Scanner(System.in);
//			System.out.println("단어 입력");
//			String word = in.nextLine();
//			while (true) {
//				String line = bufferedReader1.readLine();
//				if (line.equals(word)) {
//					System.out.println(line + " 이 존재");
//				} else {
//				}
//			}
//		} catch (Exception e) {
//		}
//	}
//
//	// 텍스트 문서 내용 출력
//	public void wordList() {
//		try {
//			FileReader file_reader1 = new FileReader(file1);
//			BufferedReader bufferedReader1 = new BufferedReader(file_reader1);
//
//			while (true) {
//				String line = bufferedReader1.readLine();
//				if (line == null)
//					break;
//				System.out.println(line);
//
//			}
//			bufferedReader1.close();
//		} catch (Exception e) {
//
//		}
//	}

	
	// FileWriter 이용하여 텍스트 입력
	public void insertword() {
		try {
			File file = new File("Output.txt");
			FileWriter writer = new FileWriter(file, true);
			BufferedWriter bufferedWriter = new BufferedWriter(writer);
			Scanner in = new Scanner(System.in);
			System.out.print("새로운 영어 단어를 입력하세요 >>");
			String word = in.nextLine();
			bufferedWriter.write(word);
			bufferedWriter.write("\n");
			bufferedWriter.flush();
			bufferedWriter.close();
		} catch (Exception e) {
			e.getStackTrace();
		}
	}

	// FileWriter로 입력된 텍스트 문서를 출력
	public void list() {
		try {
			// 파일 객체 생성
			File file = new File("Output.txt");
			// 입력 스트림 생성
			FileReader file_reader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(file_reader);
			System.out.println("입력된 단어 목록을 출력합니다.");
			int num = 1;

			while (true) {
				String line = bufferedReader.readLine();
				if (line == null)
					break;
				System.out.println(num + ". " + line);
				num++;
			}
			bufferedReader.close();
		} catch (Exception e) {

		}
	}

	// 영어 단어 검색
	public void searchword() {
		int cnt = 0;
		String word = null;
		try {
			File file = new File("Output.txt");
			FileReader file_reader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(file_reader);
			Scanner in = new Scanner(System.in);
			System.out.println("영어 단어 검색");
			System.out.print("단어 입력 >> ");
			word = in.nextLine();
			while (true) {
				String line = bufferedReader.readLine();
				if (line.equals(word)) {
					System.out.println(line + "은 단어장에 포함되어 있습니다.");
					cnt = 1;
				}
			}

		} catch (Exception e) {
			if (cnt == 0)
				System.out.println(word+"는 포함되지 않은 단어입니다.");
		}
	}

}

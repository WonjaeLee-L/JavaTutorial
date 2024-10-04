package _18_IO_package;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStream;

public class aa {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file = new File("Output2.txt");
			FileWriter writer = new FileWriter(file);
			BufferedWriter bufferedWriter = new BufferedWriter(writer);
			bufferedWriter.write(" i love you \n i like you");
			bufferedWriter.write(" my test");
			bufferedWriter.flush();
			bufferedWriter.close();
		} catch (Exception e) {
			e.getStackTrace();
		}

		try {
			File file = new File("Output2.txt");
			FileWriter writer = new FileWriter(file, true);
			BufferedWriter bufferedWriter = new BufferedWriter(writer);
			bufferedWriter.write(" human");
			bufferedWriter.flush();
			bufferedWriter.close();
		} catch (Exception e) {
			e.getStackTrace();
		}

		try {
			// 파일 객체 생성
			File file = new File("Output2.txt");
			// 입력 스트림 생성
			FileReader file_reader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(file_reader);

			while (true) {
				String line = bufferedReader.readLine();
				if (line == null)
					break;
				System.out.println(line);
			}
			bufferedReader.close();
		} catch (Exception e) {

		}

	}

}
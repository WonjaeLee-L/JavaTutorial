package _19_Exception;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MemberAdmin {
	MemberOne[] m = new MemberOne[5];

	MemberAdmin() throws Exception { /*
										 * (3) 또 떠넘기기
										 * System.out.println(m[0]); System.out.println(m[1].getId());
										 * System.out.println(m[2]); System.out.println("close");
										 * 
										 * NullPointerException
										 */
		// test(); // 예외처리 해야하는 경우, 직접처리
		test1(); // 예외처리 안해도 되는 경우, 해본 코드
		test2(); // 예외처리 해야하는 경우, 예외 떠넘기기. 얘한테 떠넘기니까 얘가 오류발생함. (2)
	}

	private void test2() throws Exception { // (1)
		File file = new File("Output.txt");
		FileWriter writer;
		writer = new FileWriter(file);
		BufferedWriter bufferedWriter = new BufferedWriter(writer);
	}

	private void test1() {
		MemberOne[] mm = new MemberOne[5];
		try {
			System.out.println("1");
			System.out.println(mm[0]);
			// null
			System.out.println("2");
			System.out.println(mm[1].getId());
			// 객체가 없는데 참조(.)하려 해서 오류
			System.out.println("정상종료");
		} catch (Exception e) {
			System.out.println("예외발생2");
		} finally {
			System.out.println("finally 블록");
		}
	} // 실행 >> 1, null, 2, 예외발생2, finally 블록

	private void test() { // 이 예제는 예외처리를 반드시 해줘야 한다.
							// 예외 처리 방법은 직접처리 >> try catch finally
		try {
			// try 블록은 예외가 발생할 수 있는 코드를 작성한다.
			// 실행하다가 예외가 발생하면 더이상 코드를 실행하지 않고, catch 블록으로 이동한다.
			File file = new File("Output.txt");
			FileWriter writer;
			writer = new FileWriter(file);
			BufferedWriter bufferedWriter = new BufferedWriter(writer);
		} catch (IOException e) {
			// catch 소괄호() 안의 예외가 발생했을 때, 처리해주는 블록
			e.printStackTrace();

		} finally {
			// try 구문을 빠져 나갈 때, 실행 된다. 예외 발생 여부와 무관하게 실행 된다.
		}
		//

	}

}

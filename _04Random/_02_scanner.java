package _04Random;

import java.util.Scanner;

public class _02_scanner {

	public static void main(String[] args) {
		// 키보드로 입력할 때는 문자 외에 공백, 엔터키 가 같이 입력이 된다. 
				// 만약 키보드로 92하고 엔터키를 누른 다면   > 92엔터키가 같이 입력된다.
				// 만약 키보드로 abc efe  하고 엔터키를 누른다면 > abc공백efe엔터키가 입력된다.		
				// 입력된 값을 가져오는 메서드는
				// nextInt();   숫자만 가져온다. 그래서 엔터키가 남는다. 엔터키를 삭제해서 버터를 비운다. 엔터키까지 가져오는 
				                     // 메서드인  nextLine()을 다시 한 번 사용한다.  이것을 버터 지우기 라고 한다.
				// next();  공백까지만 가져온다. 엔터는 남는다.               버퍼 지우기 필요있음
				// nextLine();  엔터까지 가져온다. 즉 공백도 한꺼번에 가져온다. 엔터까지 가져오므로 버퍼 지우기 필요 없음
				Scanner in = new Scanner(System.in);
				
				System.out.println("1 문자열을 입력하세요");
				String a = in.nextLine();
				System.out.println(a);
				
				System.out.println("2 숫자를 입력하세요");
				int aa = in.nextInt();
				System.out.println(aa);
				
				System.out.println("3 문자열을 입력하세요");
				String a3 = in.nextLine();
				System.out.println(a3);
				
				System.out.println("4 숫자를 입력하세요");
				int a4 = in.nextInt();
				in.nextLine();
				System.out.println(a4);
				
				System.out.println("5 문자열을 입력하세요");
				String a5 = in.next();
				System.out.println(a5);
				
				System.out.println("6 문자열을 입력하세요");
				String a6 = in.next();
				System.out.println(a6);
				
				System.out.println("61 문자열을 입력하세요");
				String a61 = in.nextLine();
				System.out.println(a61);
				
				System.out.println("7 숫자를 입력하세요");
				int a7 = in.nextInt();
				System.out.println(a7);
				
				System.out.println("8 문자열을 입력하세요");
				String a8 = in.next();
				System.out.println(a8);
				
				in.close();   // in으로 가져온 객체(자원)을 반납한다.. 

	}

}

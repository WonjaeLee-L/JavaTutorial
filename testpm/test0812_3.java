package testpm;

public class test0812_3 {

	public static void main(String[] args) {
		// 3번 문제(비밀편지)
		// String word ="gehoudfkimjnlvy";
		// int[] letter={8,12,3,13,1,14,3,4};
		// letter  배열은 word문자열 알파벳의 위치이다.
		// letter배열의 암호를 풀어서 편지의 내용을 출력하시오.
		String word ="gehoudfkimjnlvy";
		int[] letter2={8,12,3,13,1,14,3,4};
		for(int i=0; i<letter2.length; i++) {
			
			System.out.print(word.charAt(letter2[i]));
		}

	}

}

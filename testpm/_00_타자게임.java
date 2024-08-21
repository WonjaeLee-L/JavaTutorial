package testpm;

import java.util.Random;
import java.util.Scanner;

public class _00_타자게임 {

	public static void main(String[] args) {
		
		String[] arrLevel1 = {"ㅂ","ㅈ","ㄷ","ㄱ","ㅅ","ㅁ","ㄴ","ㅇ","ㄹ","ㅎ","ㅋ","ㅌ","ㅊ","ㅍ","ㅛ","ㅕ","ㅑ","ㅐ","ㅔ","ㅗ","ㅓ","ㅏ","ㅣ","ㅠ","ㅜ","ㅡ"};
//		String level1Ty = in.nextLine();
		Random r = new Random();
		Scanner in = new Scanner(System.in);
		int score = 0;
		
		for(int i=0; i<16; i++) {
			
			int level1Word = r.nextInt(26);
			System.out.println(arrLevel1[level1Word]);
			String level1Typing = in.nextLine();
			
			
			if(arrLevel1[level1Word].equals(level1Typing)) {
				System.out.println("정답입니다. +10점!");
				
			}else {
				System.out.println("오답입니다.. -10점");
			}
			
			
		}
		
		
	}

}

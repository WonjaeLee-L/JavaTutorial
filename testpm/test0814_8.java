package testpm;

import java.util.Scanner;

public class test0814_8 {

	public static void main(String[] args) {
		System.out.println("-----8번 문제-----");
		// 배열 저장 변수
		// 1-45숫자를 벗어난 숫자를 입력하면
		// 범위 오류라고 출력하고 다시 번호를 입력할 수 있도록 수정.
		
		
		int[] lotto = new int[6];
		// 키보드로 부터 입력받기 위한 객체 만들기.
		Scanner in = new Scanner(System.in); // ctrl shift o
		// 0번째 번호부터 로또 번호 입력받기
		for (int i = 0; i < lotto.length; i++) {
			System.out.println((i + 1) + "번 입력하세요");
			
			int k = in.nextInt();
			in.nextLine();
						
			for(int j = 0; j<10; j++) {

				if(k>45 || k<1) {				
					System.out.println("범위 오류");
					System.out.println((i + 1) + "번 입력하세요");

					k = in.nextInt();
					in.nextLine(); //*** 엔터 누르기 전과 후를 나눠주는 역할
					
				}else {

					break;
				}				
			}
			lotto[i] = k;
		}
		
		// 로또 번호를 출력하는 반복문
		for (int i = 0; i < lotto.length; i++) {
			if (i == lotto.length - 1) { // 마지막 번호
				System.out.println("보너스 : " + lotto[i]);
			} else {
				System.out.println(lotto[i]);
			}
		}

	}

}

package _04Random;

import java.util.Scanner;

public class _01_Test {		

	public static void main(String[] args) {
		// 수동 로또 게임 만들기
		// 1부터 45까지를 키보드로 입력한다.
		// 이전에는 Random객체를 이용하여 랜덤 기능을 사용했지만
		// 지금은 키보드로 입력하기 위한 기능이 필요하므로 Scanner 객체 필요
		
		// 배열 저장 변수
		int[] lotto = new int[6];
		// 키보드로부터 입력받기 위한 객체 만들기.
		Scanner in = new Scanner(System.in); //ctrl shift o
		// 0번째 번호부터 로또 번호 입력받기
		for(int i=0; i<lotto.length; i++) {
			System.out.println((i+1)+ "번 입력하세요");
			int k = in.nextInt();	// nextInt는 키보드로 숫자만 가져온다.(숫자 치고 엔터)
			in.nextLine();	// 버퍼 지우기(버퍼에 남아있는 enter키를 지움)
			lotto[i] = k;
		}
		// 로또 번호를 출력하는 반복문
		for(int i = 0; i<lotto.length; i++) {
			if(i==lotto.length-1) {	// 마지막 번호
				System.out.println("보너스 : "+lotto[i]);
			}else {
				System.out.println(lotto[i]);
			}

		}
	}}

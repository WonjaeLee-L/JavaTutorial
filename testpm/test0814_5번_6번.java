package testpm;

import java.util.Random;

public class test0814_5번_6번 {

	public static void main(String[] args) {
		System.out.println("-----5번 문제-----");
		// 5. 로또번호를 자동으로 생성하는 게임을 작성하시오.
		//    중복허용 가능, 로또 번호 6개를 배열에 저장하고, 출력하시오.
		Random r = new Random();
		int[] lotto = new int[6];
		
		for(int i=0; i<6; i++) {
			int num = r.nextInt(45)+1;
			lotto[i]=num;
			System.out.println((i+1)+"번째는 "+lotto[i]);
		}
		
		System.out.println("-----6번 문제-----");
		// 컴퓨터는 랜덤으로 로또 번호를 10000번 뽑는다.
		// 가장 많이 뽑힌 로또 번호가 오늘의 추천 로또 번호이다.
		// 오늘의 추천 로또 번호 하나를 출력하시오.  만약 로또 번호가 같은 횟수로 나왔을 경우에는 큰 숫자가 우선한다. 

		int maxCnt=0;
		int maxNum=0;
		int[] lottoNum = new int[45];	//0-45
		for(int i=0; i<10000; i++) {
			int num = r.nextInt(45);
			lottoNum[num]++;
		}
		for(int i=0; i<45; i++) {
		// =
			if(maxCnt<=lottoNum[i]) {
				maxCnt = lottoNum[i];
				maxNum = i;
			}
				
		}
		System.out.println("오늘의 추천 로또 번호: "+ (maxNum+1) + ", 뽑힌 횟수: "+ maxCnt);
	}

}

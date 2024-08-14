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
		int cnt=0;
		int[] lottoNum = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45};
		for(int i=0; i<10001; i++) {
			int num = r.nextInt(45);
			
		}
		for(int i=0; i<10001; i++) {
			int num = r.nextInt(45); // 0-45까지만 뽑아. 나중에 더해줄거
			if(i==num) {
				lottoNum[i]=num;
				cnt++;
			}
		}
		
	}

}

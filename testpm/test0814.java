package testpm;

import java.util.Random;
import java.util.Scanner;

public class test0814 {

	public static void main(String[] args) {
		System.out.println("0번.");
		// 0. 키보드로 숫자 한 개를 입력 받아서 홀짝을 출력하는 프로그램을 작성하세요.
		System.out.println("숫자를 입력하세요");
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		
		if(k%2==0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		System.out.println("1번.");
		// 1. 키보드로 두 개의 숫자를 입력받아서 합하는 프로그램을 작성하세요.
		int sum = 0;
		int a = in.nextInt();
		int b = in.nextInt();
		sum = a + b;
		System.out.println(sum);
		
		
		System.out.println("-----2번 문제-----");
		// 2. 행운의 숫자인지를 판별해보자
		// 1부터 100까지 숫자 중 랜덤 수를 하나 뽑아서 출력한다.
		// 이 숫자가 7의 배수이면 행운의 숫자, 7의 배수가 아니면 조심해야하는 숫자 입니다.
		Random r = new Random();
		int a3 = r.nextInt(100)+1;
		System.out.println(a3);
		if(a3%7==0) {
			System.out.println("행운의 숫자입니다.");
		}else {
			System.out.println("조심해야하는 숫자입니다.");
		}
		
		System.out.println("-----3번 문제-----");
		// 3. 7의 배수가 나오면 행운의 숫자, 7의 배수가 아니면 행운의 숫자가 나올 때 까지 계속 뽑느다.
		for(int i=0; i<1000; i++) {
			System.out.println(i+" 번째 추첨");
			int b3 = r.nextInt(100)+1;
			System.out.println(b3);
			if(b3%7!=0) {
				System.out.println("조심해야하는 숫자입니다. 다시 뽑습니다.");
				continue;				
			}else {
				System.out.println("행운의 숫자입니다.");
				break;
			}
			
		}
		
		System.out.println("-----4번 문제-----");
		//4. 숫자 10개를 저장할수 있는 배열을 만들고
		//   0부터 99숫자중 랜덤으로 10개를 뽑습니다.
		//   이중 짝수만 저장하고 홀수는 무시합니다.(다시 뽑지 않습니다.)
		//  0번째 번호 98이라면   0번 인덱스에 저장
		//  1번째 번호 97이라면   무시  1번 인덱스는 선언시 초기값
		//  2번째 번호 88이라면   2번  인덱스에 저장
		int[] arr = new int[10];
		Random r2 = new Random();
		
		for(int i=0; i<10; i++) {
			int k2 = r.nextInt(100);
			if(k2%2==0) {
				arr[i] = k2;
			}
			System.out.println(i+"번째 번호"+arr[i]);
		}
		
		
		System.out.println("-----5번 문제-----");
		// 5. 로또번호를 자동으로 생성하는 게임을 작성하시오.
		//    중복허용 가능, 로또 번호 6개를 배열에 저장하고, 출력하시오.
		Random r1 = new Random();
		int[] lotto = new int[6];
		
		for(int i=0; i<6; i++) {
			int num = r1.nextInt(45)+1;
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
		
		System.out.println("-----7번 문제-----");
		// int jobTime ={40,32,4,16,5,8};
		// 위 배열에서 인덱스를 사람의 번호로 가정한다.
		// jobTime[2] 의 의미는 2번 사람이 업무를 마치기 위한 시간이다.
		// 작업장을 사용할 수 있는 시간은 최대  4시간이다.
		// 작업장은 한 사람만 사용할 수 있고. 사용이 끝나면 작업장을 나와야 하고
		// 다음 사람이 작업장을 사용한다. (만약,다음 사람의 업무가 종료 되었다면, 그 다음 사람이 사용이 가능하다)
		// 0번 부터 1 2 3 4 5번 순으로 작업장을 사용한다면
		// 실제 작업장을 사용한 사람의 기록을 순서대로 출력하시오.
		
		// 0, 1, 2, 3, 4, 5: 사람의 번호
		// value는 index사람이 업무를 마치기 위한 시간.
		// 0번은 10시간. 1번은 8시간, 2번은 1시간, 3번은 4시간, 4번은 5/4시간, 5번은 2시간

		int[] jobTime ={40,32,4,16,5,8};
		
		for(int j=0; j<10; j++) {
		
		
		for(int i=0; i<6; i++) {
			jobTime[i] = jobTime[i]-4;
			
			if(jobTime[i]>=0) {
				System.out.println(i + "번 사람, 남은 시간: " + (jobTime[i]));
			}else if(jobTime[i]>=-3) {
				System.out.println(i + "번 사람, 남은 시간: " + 0);
			}
			
		}
		
		}
		
		System.out.println("-----8번 문제-----");
		// 배열 저장 변수
		// 1-45숫자를 벗어난 숫자를 입력하면
		// 범위 오류라고 출력하고 다시 번호를 입력할 수 있도록 수정.
		
		
		int[] lotto1 = new int[6];
		// 키보드로 부터 입력받기 위한 객체 만들기.
		Scanner in1 = new Scanner(System.in); // ctrl shift o
		// 0번째 번호부터 로또 번호 입력받기
		for (int i = 0; i < lotto.length; i++) {
			System.out.println((i + 1) + "번 입력하세요");
			
			int k1 = in.nextInt();
			in.nextLine();
						
			for(int j = 0; j<10; j++) {

				if(k1>45 || k1<1) {				
					System.out.println("범위 오류");
					System.out.println((i + 1) + "번 입력하세요");

					k1 = in1.nextInt();
					in1.nextLine(); //*** 엔터 누르기 전과 후를 나눠주는 역할
					
				}else {

					break;
				}				
			}
			lotto[i] = k1;
		}
		
		// 로또 번호를 출력하는 반복문
		for (int i = 0; i < lotto.length; i++) {
			if (i == lotto.length - 1) { // 마지막 번호
				System.out.println("보너스 : " + lotto[i]);
			} else {
				System.out.println(lotto[i]);
			}
			
			

	}

	}}

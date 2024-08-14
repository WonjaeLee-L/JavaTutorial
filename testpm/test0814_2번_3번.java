package testpm;

import java.util.Random;

public class test0814_2번_3번 {

	public static void main(String[] args) {
		System.out.println("-----2번 문제-----");
		// 2. 행운의 숫자인지를 판별해보자
		// 1부터 100까지 숫자 중 랜덤 수를 하나 뽑아서 출력한다.
		// 이 숫자가 7의 배수이면 행운의 숫자, 7의 배수가 아니면 조심해야하는 숫자 입니다.
		Random r = new Random();
		int a = r.nextInt(99)+1;
		System.out.println(a);
		if(a%7==0) {
			System.out.println("행운의 숫자입니다.");
		}else {
			System.out.println("조심해야하는 숫자입니다.");
		}
		
		System.out.println("-----3번 문제-----");
		// 3. 7의 배수가 나오면 행운의 숫자, 7의 배수가 아니면 행운의 숫자가 나올 때 까지 계속 뽑느다.
		for(int i=0; i<1000; i++) {
			System.out.println(i+" 번째 숫자는");
			int b = r.nextInt(99)+1;
			System.out.println(b);
			if(b%7!=0) {
				System.out.println("조심해야하는 숫자입니다. 다시 뽑습니다.");
				continue;				
			}else {
				System.out.println("행운의 숫자입니다.");
				break;
			}
			
		}
		
	}

}

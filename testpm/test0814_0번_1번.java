package testpm;

import java.util.Scanner;

public class test0814_0번_1번 {

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
	}

}

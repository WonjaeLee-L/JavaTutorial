package testpm;

import java.util.Arrays;

public class test0806 {

	public static void main(String[] args) {
		// 기본 문제1
		int[] a = new int[5];
		a[0] = 30;
		a[1] = 40;
		a[2] = 50;
		a[3] = 60;
		a[4] = 55;
		System.out.println(a[0] + "," + a[1] + "," + a[2] + "," + a[3] + "," + a[4]);

		// 기본 문제2
		String[] name = new String[3];
		name[0] = "kim";
		name[1] = "lee";
		name[2] = "park";
		System.out.println(name[0] + "," + name[1] + "," + name[2]);

		// 기본 문제3
		int[] lotto = new int[6];
		lotto[0] = 6;
		lotto[1] = 12;
		lotto[2] = 33;
		lotto[3] = 4;
		lotto[4] = 5;
		lotto[5] = 26;
		System.out
				.println(lotto[0] + "," + lotto[1] + "," + lotto[2] + "," + lotto[3] + "," + lotto[4] + "," + lotto[5]);
		lotto[2] = lotto[2] + 2;
		System.out
				.println(lotto[0] + "," + lotto[1] + "," + lotto[2] + "," + lotto[3] + "," + lotto[4] + "," + lotto[5]);

		// 기본 문제4
		int oddSum = lotto[0] + lotto[2] + lotto[4];
		System.out.println(oddSum);

		// 중 문제5
		lotto[0] = lotto[0];
		lotto[1] = lotto[0] + lotto[1];
		lotto[2] = lotto[1] + lotto[2];
		lotto[3] = lotto[2] + lotto[3];
		lotto[4] = lotto[3] + lotto[4];
		lotto[5] = lotto[4] + lotto[5];
		System.out
				.println(lotto[0] + "," + lotto[1] + "," + lotto[2] + "," + lotto[3] + "," + lotto[4] + "," + lotto[5]);

		// 중 문제6
		lotto[0] = 6;
		lotto[1] = 12;
		lotto[2] = 33;
		lotto[3] = 4;
		lotto[4] = 5;
		lotto[5] = 26;
		System.out.println(lotto[3] % 2 != 0);
		System.out.println(lotto[3] % 2 == 1);

		// 중 문제7
		int money = 2750;
		int pay = 10000;
		int charge = pay - money;
		System.out.println(charge);
		System.out
				.println("천원" + charge / 1000 + "개, 백원" + (charge % 1000) / 100 + "개, 십원" + (charge % 100) / 10 + "개");

		// 상 문제8
		int xA = 703;
		int yA = 497;
		int xB = 897;
		int yB = 303;

		int xC = 650;
		int yC = 150;

		boolean result1 = (xC <= xB && xC >= xA) && (yC >= yB && yC <= yA);

		System.out.println(result1);
	}
}

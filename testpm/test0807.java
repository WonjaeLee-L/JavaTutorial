package testpm;

public class test0807 {

	public static void main(String[] args) {

		// 1
		double avg = 89.2;
		if (avg >= 80) {
			System.out.println("합격");
		} else
			System.out.println("불합격");

		// 2
		int level = 2;
		int point = 30;
		if (level == 1) {
			point += 30;
		} else
			point += 10;
		System.out.println(point);

		// 3
		int[] lotto = { 6, 12, 33, 4, 5, 26 };
		System.out.println(lotto[2] + 80);

		// 4
		if (lotto[3] % 2 == 0) {
			System.out.println("짝수");
		} else
			System.out.println("홀수");

		// 5
		int sum = 0;
		if (lotto[0] % 2 == 1) {
			sum += lotto[0];
		}
		if (lotto[1] % 2 == 1) {
			sum += lotto[1];
		}
		if (lotto[2] % 2 == 1) {
			sum += lotto[2];
		}
		if (lotto[3] % 2 == 1) {
			sum += lotto[3];
		}
		if (lotto[4] % 2 == 1) {
			sum += lotto[4];
		}
		if (lotto[5] % 2 == 1) {
			sum += lotto[5];
		}
		System.out.println(sum);

		// 6
		int[] a = { 45, 34, 64, 45, 24 };
		System.out.println(a[0] + a[1] + a[2] + a[3] + a[4]);

		// up1 (7)

		int[] b = { 45, 34, 64 };
		if ((b[0] / 10) + (b[0] % 10) >= (b[1] / 10) + (b[1] % 10)
				&& (b[0] / 10) + (b[0] % 10) >= (b[2] / 10) + (b[2] % 10)) {
			System.out.println("0번째 숫자이다.");
		} else if ((b[1] / 10) + (b[1] % 10) >= (b[0] / 10) + (b[0] % 10)
				&& (b[1] / 10) + (b[1] % 10) >= (b[2] / 10) + (b[2] % 10)) {
			System.out.println("1번째 숫자이다.");
		} else if ((b[2] / 10) + (b[2] % 10) >= (b[0] / 10) + (b[0] % 10)
				&& (b[2] / 10) + (b[2] % 10) >= (b[1] / 10) + (b[1] % 10)) {
			System.out.println("2번째 숫자이다.");
		}

		// 분해: 연산자 %, / (나머지, 몫)
		// 합하는 수식: x/10 + x%10
		// % 연산자 : 홀,짝 구분, 숫자 분해.

		// 단순 비교 말고 아래의 방식이 있다. 변수 설정 후 최댓값을 바꾸며 구하기 **
		// int maxValue = 0;
		// int maxIndex = 0;
		// int temp = a[0]/10 + a[0]%10;
		// if(temp>maxValue) {
		// maxValue = temp;
		// maxIndex = 0;
		// }
		// temp = a[1]/10 + a[1]%10;
		// if(temp>maxValue) {
		// maxValue = temp;
		// maxIndex = 1;
		// }
		// temp = a[2]/10 + a[2]%10;
		// if(temp>maxValue) {
		// maxValue = temp;
		// maxIndex = 2;
		// }

		// up2 (8)
		int[] x = { 6, 5, 9 };
		int[] y = { 4, 10, 6 };
		int[] bullet = { 3, 2 };

		if (x[0] % bullet[0] == 0 && y[0] % bullet[1] == 0) {
			System.out.println("0번 새");
		}
		if (x[1] % bullet[0] == 0 && y[1] % bullet[1] == 0) {
			System.out.println("1번 새");
		}
		if (x[2] % bullet[0] == 0 && y[2] % bullet[1] == 0) {
			System.out.println("2번 새");
		}
		// 기울기 문제

		// up3 (9)
		int[] x1 = { 10, 20 };
		int[] y1 = { 11, 5 };
		if (y1[0] <= (x1[0] + 5) && (y1[0] + 2) >= x1[0]) {
			if ((y1[1] + 2) >= x1[1] && y1[1] <= (x1[1] + 6)) {
				System.out.println("hit");
			} else
				System.out.println("miss");
		} else
			System.out.println("miss");

	}

}

package testpm;

public class test0812_special1 {

	public static void main(String[] args) {
		// 특별 1
		// String a = "6/4/3/2/5/1/4/5/6/7/8/9/1/2/3/4/5/6";
		// 문자열 a는 한자릿수의 숫자를 수집한 문자열이다.
		// 숫자별로 수집된 수만큼 카운팅하세요.
		// 카운팅 배열은
		// int[] a = new int[10];
		// 위 선언문은 길이 10의 배열을 생성한 선언문이다. 초기값은 0이다.
		// 인덱스 0 - 9까지를 숫자로 정의한다.
		// 조건 : 형변환은 사용하지 않는다. 메서드는 charAt()만 사용한다.
		int cnt11 = 0;
		String a4 = "6/4/3/2/5/1/4/5/6/7/8/9/1/2/3/4/5/6";
		String[] a5 = a4.split("/");

		int[] a6 = new int[10];
		for (int i = 0; i < a4.length(); i++) {
			if (i % 2 == 0 && a4.charAt(0) == a4.charAt(i)) {
				cnt11++;

				a6[0] = cnt11++;
			}

		}
		cnt11 = 0;
		System.out.println(a6[0] + "," + a6[1] + "," + a6[2] + "," + a6[3] + "," + a6[4] + "," + a6[5] + "," + a6[6]
				+ "," + a6[7] + ",");
		System.out.println(
				a5[0] + "," + a5[1] + "," + a5[2] + "," + a5[3] + "," + a5[4] + "," + a5[5] + "," + a5[6] + ",");

	}

}

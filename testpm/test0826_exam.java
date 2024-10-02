package testpm;

public class test0826_exam {

	public static void main(String[] args) {
		String a = new String("aabbccddeeeaaaa");
		int cnt = 0;
		int sumCnt = 0;

		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == 'a') {
				cnt++;
			} else {
				cnt = 0;
			}
			if (sumCnt < cnt) {
				sumCnt = cnt;
			}
		}
		System.out.println("길이는 " + sumCnt);

	}

}

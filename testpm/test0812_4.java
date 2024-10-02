package testpm;

public class test0812_4 {

	public static void main(String[] args) {
		// 4번 문제(난건물주)
		// int[] arr = {1,0,0,0,1,1,1,0,0,0,0,1,1,1,1,0,0,0,1}
		// int size=2;
		// arr 배열에서 0이 의미하는 것은 공터이다.
		// size는 건물의 크기 이다. 건물은 하나만 짓는다. 공터는 연속적으로 있어야 한다.
		// size 설정값에 따라 공터에 건물을 지을 수 있는 위치는 모두 몇개인가?
		// size가 2일경우에 7개이다.
		int[] arr = { 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1 };
		int zPlace = 0;
		int place = 0;
		int sumPlace = 0;
		int cnt = 0;
		int size = 2;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				cnt++;
			} else if (cnt != 0) {
				zPlace = cnt;
				cnt = 0;
				place = zPlace - size;
				sumPlace = sumPlace + place + 1;
			}
		}
		System.out.println(sumPlace);

	}

}

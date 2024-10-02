package _02if;

public class _00_Q3_Distance {

	public static void main(String[] args) {
		/*
		 * int a = 10; int b = 20; int my = 15; 문제 a와 b는 도로의 길이이며 위치이다 my는 나의 위치이다 내가
		 * 도로위에 있으면 도로위. 도로위가 아니면 도로가 아님이라고 출력하시오 up1 만약 내가 도로위라면 a 지점으로부터 5만큼 떨어져 있습니다.
		 * 라고 출력하시오 up2 up1에서 현재 my의 위치가 가까운 쪽 기준으로 출력한다 예를들어 my18이면 b에 더 가까우니 b에서부터 2거리
		 * 떨어져 있습니다.
		 */

		// 기본
//		int a = 10;
//		int b = 20;
//		int my = 15;
//		if(my>=a && my<=b) {
//			System.out.println("도로 위");
//		}else
//			System.out.println("도로가 아님");
//	}

		// up1
//		int a = 10;
//		int b = 20;
//		int my = 15;
//		int length = my-a;
//		if(my>=a && my<=b) {
//			System.out.println("a 지점으로부터 " + length + "만큼 떨어져 있습니다.");
//		}else
//			System.out.println("도로가 아님");
//	}

		// up2
		int a = 10;
		int b = 20;
		int my = 15;
		int length1 = my - a;
		int length2 = b - my;
		if (my >= a && my <= b) {
			if (length1 > length2) {
				System.out.println("b 지점으로부터 " + length2 + "만큼 떨어져 있습니다.");
			} else
				System.out.println("a 지점으로부터 " + length1 + "만큼 떨어져 있습니다.");
		} else
			System.out.println("도로가 아님");
	}

}

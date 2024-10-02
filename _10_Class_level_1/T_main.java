package _10_Class_level_1;

public class T_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// * T_Center를 의존하기 때문에 변수가 필요 *
//		T_Center tcenter = null;
//			 T_main class는 T_Center class를 의존하고 있다.(의존 관계)
//			 그러나 지금은 주소가 null이므로 참조가 불가능한 상태이다.(주소 값 유무)

//		 ** 참조 가능하게 만드는 법(직접 생성) -> 1. new 연산자 이용해서 직접 객체를 만든다.
		T_Center tcenter = new T_Center(); // T_main이 직접 만들었다.
//								생성자
//								객체를 만들 때 제일 먼저 실행 된다.

//		 ** 참조 가능하게 만드는 법(주입 받기 : 개발자가 객체를 함부로 만들지 않는다.) -> 2. 주소 값을 가져온다. 
//		T_Center tcenter1 = tcenter;	// 이렇게 주입 받으면 tcenter1에서도 변화를 알 수 있다.

	}
}

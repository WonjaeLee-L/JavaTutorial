package testpm_0919;

// 자동차 한 대에 대한 단일 책임의 클래스 정의
public class P_Obj {

	// 멤버 변수
	int number = 0;
	String name = null;

	// 메서드
	public void prt() {
		System.out.println("---자동차 정보---");
		System.out.println("소유자 이름 : " + name);
		System.out.println("자동차 번호 : " + number);
		System.out.println("--------------");
	}

}

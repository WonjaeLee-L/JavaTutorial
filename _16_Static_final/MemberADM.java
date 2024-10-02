package _16_Static_final;

public class MemberADM {

	public String name = null;
	// MemberADM 객체 다섯 개 만들면 name 변수도 다섯 개 만들어지고(각각 만든다)
	public static String companyName = "Human";
	// 이 변수는 하나를 같이 사용하는 것
	public static final String teamName = "KimTeam";
	// 이 변수는 값을 공용으로 사용하겠다.(Static) final이므로, 다른 코드에서 값을 변경할 수 없다
	public final String name1 = "aaa";

	MemberADM() {
		// this.name1 = "adf";	why? 상수는 초기값이 결정된 후, 변경 불가능
		String name = Thread.currentThread().getName();
		System.out.println(name + "스레드가 MemberADM" + "생성자 실행");
		// 다른 클래스인데 동일 스레드가 실행중임을 알 수 있다.
	}

	public static void prt() {
//		System.out.println(name);
	}

}

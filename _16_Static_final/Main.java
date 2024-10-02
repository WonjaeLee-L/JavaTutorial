package _16_Static_final;

public class Main {
// 접근제어자 공용변수 리턴타입 메서드명 (매개변수)
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = Thread.currentThread().getName();
		// 스레드가 코드를 실행한다.
		// 현재 코드를 실행하는 스레드의 여러 정보 중, 스레드의 이름을 가져오라.
		System.out.println(name + "스레드가 1초 뒤에 시작합니다.");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		MemberADM m = new MemberADM();

		// static 변수는 공용변수. 위치는 Method area
		// static과 접근제어자를 생각
		// 모든 스레드가 공용으로 사용 가능(변수값 접근 가능)
		// 객체를 만들지 않고, 클래스명과 변수 또는 메서드명으로 바로 접근 가능
		String a = MemberADM.companyName;
		System.out.println(a);
		System.out.println(MemberADM.companyName);
		MemberADM.prt();
		MemberADM.companyName = "HOman";
		// 이렇게 아무나 이름을 막 바꿀 수 있다.
		System.out.println(MemberADM.companyName);
		// 큰 단점

		// MemberADM 객체 다섯 개 만들면 name 변수도 다섯 개 만들어지고
		// Static 변수인 companyName은 하나를 같이 사용하는 것
		MemberADM mm = new MemberADM();
		mm.companyName = "abc";
		mm.name = "a";
		MemberADM mmm = new MemberADM();
		mmm.name = "b";
		mmm.companyName = "kkk";
		System.out.println(mm.name); // a 출력
		System.out.println(mm.companyName); // kkk 출력
		// companyName은 Static 변수이므로 공용(저장된 메모리를 같이 쓴다)으로 사용하여 mmm.companyName 이름으로 설정한
		// kkk가 호출된다.
		// Static 뒤에 final을 쓰면, 모든 객체 회사이름을 공용으로 쓰지만 고치지 못하도록 할 수 있다.
		// final -> 초기값이 결정되면 그 후에 값을 바꿀 수 없는 것.

		/*
		 * MemberADM.teamName = "kkk"; final은 상수이므로 초기값이 결정되면 값을 변경할 수 없다.
		 */

		/*
		 * 새로운 스레드를 하나 만들어서 멀티스레드로 운용이 가능 Thread t1 = new Thread(); // Thread라는 클래스로 새로운
		 * 스레드 생성 하였다. t1.setName("task1_thread"); String tname = t1.getName();
		 * System.out.println("새로만든 스레드 이름은 " + tname);
		 */

	}

}

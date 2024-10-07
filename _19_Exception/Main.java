package _19_Exception;

public class Main {

	public static void main(String[] args) throws Exception { // (4) 얘를 마지막으로 떠넘기면 jvm에게 떠넘긴다.
															  // 이 메서드는 jvm이 호출했으므로,,
		// TODO Auto-generated method stub
		// 바이너리 코드가 실행이 되면, jvm의 코드영역에 소스가 로딩이 되고
		// 스레드가 생성되어, main 메서드 코드를 실행한다.
		// new는 객체를 만들고, 객체의 주소를 리턴 받는다.
		// new 연산자 뒤에는 생성자를 작성한다.
		// 생성자로 객체를 만들고, 생성자(메서드)를 호출한다.
		// 생성자 메서드의 모든 코드가 종료되면 호출 위치로 리턴한다.
		new MemberAdmin();
	}

}
// 자바는 객체지향, 컴파일언어
// 이클립스에서 컨트롤 f11누르면 기계어로 번역되고, 기계어로 된 바이너리 파일이 클래스 코드 영역으로 로드된다.
// 스레드는 메인을 먼저 실행, 
// 해당되는 객체를 더이상 참조하지 않으면 GC가 객체를 지운다.

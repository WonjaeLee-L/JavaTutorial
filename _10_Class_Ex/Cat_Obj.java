package _10_Class_Ex;

// 한 마리 고양이에 대한 단일 책임의 클래스 정의
public class Cat_Obj {

	// 멤버 변수
	String name = null;
	int age = 0;

	// 메서드
	public void prt() {
		System.out.println("--- cat info ---");
		System.out.println(name);
		System.out.println(age);
	}

}

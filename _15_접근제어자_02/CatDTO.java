package _15_접근제어자_02;

public class CatDTO {
	private String name = null;
	private int age = 1;
	// 멤버변수는 접근제어자로 은닉화 시킨다.
	// 은닉화시키면, CatDTO(DTO : Data Transfer Object, 고양이 한 마리를 정의한 데이터를 이 객체에 전송) 클래스
	// 외부에서 변수에 참조를 어떻게 할까?
	// 멤버변수의 저장 및 인출에 관련된 메서드를 만든다.
	// 저장하는 메서드를 setter, 인출하는 메서드를 getter라고 부른다.

	public String getName() {
		return name;
	}

	public void setName(String name) {
		chkname(name);
		this.name = name;
	}

	private void chkname(String name2) {
		// TODO Auto-generated method stub

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// 우클릭, source, generate getters and setters 누르면 자동으로 만들어준다.

}

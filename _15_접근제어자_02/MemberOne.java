package _15_접근제어자_02;

public class MemberOne {
	String name = null;

	public void prt() {
		System.out.println(name);
	}

	void setName(String n) {
		this.name = n;
	}

	public void setName_1(String n) {
		if (chkName(n)) {
			this.name = n;
		} else {
			this.name = "err";
		}
		System.out.println(this.name);
	}

	private boolean chkName(String n) {
		if (n.charAt(0) == '4') {
			return false; // return 만나면 코드 종료(break 효과 포함)
		}
		return true;
	}
	// chkName은 내부적으로 호출하는 메서드로 정의했다. 따라서 private가 적당함.

}

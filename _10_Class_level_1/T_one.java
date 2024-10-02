package _10_Class_level_1;

public class T_one {
	private String tNum = null; // 앞에 private 걸면, tlist[i].tNum으로 가져오지 못한다.
								// 은닉화된 자원
	String tTime = null;

	// void와 String 부분은 리턴 타입을 말한다.
	// void -> 호출한 쪽에 데이터를 넘겨줄 필요 없다.(리턴값 x)
	public void prt() {
		System.out.println(tNum);
		System.out.println(tTime);
	}

	// String -> 메서드를 호출하면, 호출한 쪽에 문자열을 넘겨줘라. return은 넘겨줄 문자열을 의미
	// 즉, tNum에 있는 값을 넘겨달라는 것.
	// 이 안에 비밀번호, 인증절차 등 다른 걸 도입할 수 있다. 직접 tlist[i].tNum으로 가져오는 것과 다르게
	// T_one에 부탁하는 의미로 이해. tlist[i].getTnum();
	public String getTnum() { // getTnum() 은 메서드 이름. ()붙으면 메서드
		return tNum; // tNum을 반환하는 메서드 정의(결과를 바라는 메서드)
	}

	public void setNum(String a) {
		tNum = a;
	}

	// 입력하는 메서드는 따로 만들어서 해야 한다.
}

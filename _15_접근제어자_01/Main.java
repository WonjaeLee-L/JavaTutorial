package _15_접근제어자_01;

import _15_접근제어자_02.MemberOne;
// import 위치 확인. _15_접근제어자_02 package에 MemberOne class 

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberOne m = new MemberOne();
//		m.name = "hong"; // err why? name 변수의 접근제어자가 default
		m.prt(); /// 가능
//		m.setName(); // err why? setName 메서드의 접근제어자가 default
		m.setName_1("1234");
		m.setName_1("4567");

	}

}

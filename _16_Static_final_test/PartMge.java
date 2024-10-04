package _16_Static_final_test;

import java.util.ArrayList;

// 교과목 관리 추상화 클래스
public class PartMge {

	// 교과목을 관리하려면 교과목이라는 객체가 필요하여 의존관계 생성
	ArrayList<Part> plist = new ArrayList<>();

	public void menu() {
		System.out.println("1. 등록");
		System.out.println("2. 전체보기");
	}

	// 교과목 등록
	public void add() {

	}

	// 교과목 조회
	public void list() {

	}

}

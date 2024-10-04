package _16_Static_final_test;

import java.util.ArrayList;

// 요구사항에서 학생을 관리하는 내용을 추상화
public class StuMge {

	// 학생관리를 하려면 학생이라는 객체가 필요하여 의존관계 생성
	private ArrayList<Stu> slist = new ArrayList<>();

	public void menu() {
		System.out.println("1. 등록");
		System.out.println("2. 검색");
		System.out.println("3. 전체보기");
		System.out.println("4. 삭제");
	}

	// 학생 전체 리스트 확인
	private void list() {

	}

	// 학생 추가
	private void add() {

	}

	// 학생 검색
	private void search() {

	}

	// 학생 삭제
	private void delete() {

	}

}

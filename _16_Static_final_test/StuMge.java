package _16_Static_final_test;

import java.util.ArrayList;
import java.util.Scanner;

// 요구사항에서 학생을 관리하는 내용을 추상화
public class StuMge {

	// 학생관리를 하려면 학생이라는 객체가 필요하여 의존관계 생성
	private ArrayList<Stu> slist = new ArrayList<>();

	public void menu() {
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("1. 등록");
			System.out.println("2. 검색");
			System.out.println("3. 전체보기");
			System.out.println("4. 삭제");
			System.out.println("0. 초기화면");
			int selNum = in.nextInt();
			in.nextLine();
			if (selNum == 1) {
				add();
			} else if (selNum == 3) {
				list();
			} else if (selNum == 4) {
				delete();
			} else if (selNum == 0) {
				break;
			}

		}
	}

	// 학생 전체 리스트 확인
	private void list() {
		for (int i = 0; i < slist.size(); i++) {
			slist.get(i).prt();
		}

	}

	// 학생 추가
	private void add() {
		Scanner in = new Scanner(System.in);
		Stu newTemp = new Stu();
		System.out.println("아이디 입력");
		String id = in.nextLine();
		int returnValue = findID(id);
		if (returnValue == -1) {
			System.out.println("이름 입력");
			String name = in.nextLine();
			newTemp.setId(id);
			newTemp.setName(name);
			slist.add(newTemp);
		} else {
			System.out.println(id + "는 사용중");
		}
	}

	// 학생 검색
	private void search() {

	}

	// 아이디 검색
	// 리턴타입? 매개변수?
	private int findID(String a) {
		for (int i = 0; i < slist.size(); i++) {
			if (slist.get(i).getId().equals(a)) {
				return i;
			}
		}
		return -1;
	}
	
	// 리턴타입 Stu 주소
	public Stu loginID(String id) {
		int idx = findID(id);
		if(idx != -1) {
			return slist.get(idx);
		}
		return null;
	}

	// 학생 삭제
	private void delete() {
		Scanner in = new Scanner(System.in);
		System.out.println("삭제 아이디 입력");
		String delId = in.nextLine();
		int returnValue = findID(delId);
		if (returnValue != -1) {
			slist.remove(returnValue);
			System.out.println("삭제 됨");
		}else {
			System.out.println("등록되지 않은 아이디");
		}

		// slist.get(0).getId()
		// slist라는 ArrayList 변수에서 참조. get(0)의 리턴타입은 Stu객체 타입, 리턴 값은 주소.
		// 결과는 String type의 id가 리턴, 따라서 equals 사용 >> 하나씩 뜯어서 생각

		// for문은 아이디를 찾는 반복문
		// 아이디를 찾는 것은, 검색이나 입력에서도 이용한다.
		// 따라서 이 코드의 재사용성을 높이기 위해서 메서드 분리
//		for (int i = 0; i < slist.size(); i++) {
//			if (slist.get(i).getId().equals(delId)) {
//				// equals의 리턴 타입이 boolean이므로 조건절에 사용 가능
//				slist.remove(i);
//				break;
//			}
//		}
	}

}

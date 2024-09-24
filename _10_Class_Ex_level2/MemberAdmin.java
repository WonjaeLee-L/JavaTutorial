package _10_Class_Ex_level2;

import java.util.Scanner;

// 고객관리 클래스
public class MemberAdmin {
	// 의존관계 설정.	MemberOne객체를 만든 것이 아니다.
	// MemberOne 객체의 주소값을 저장할 배열(길이 5)를 생성한 것이다.
	// 배열도 객체이다. mlist는 참조변수이고,
	// MemberOne객체의 주소를 저장한 배열의 주소를 저장하고 있다.
	MemberOne[] mlist = new MemberOne[5];
	
	// 생성자 만들기
	MemberAdmin() {
//		menu();
		
	}
	public void menu() {
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("1. 고객 등록");
			System.out.println("2. 전체보기");
			System.out.println("9. 이전 메뉴");
			int num = in.nextInt();
			in.nextLine();
			if(num==1) {
				addUser();
			}else if(num==2) {
				allListUser();
			}else if(num==9) {
				break;	// while문 종료
			}

		}
	}
	public boolean duplexIDcheck(String id) {	// 아이디 중복 체크를 위한 메서드
		// int(4byte)도 가능, boolean(1byte)   	// 재사용성 높이기 위해 따로 생성해서 아래 메서드에서 사용
		// 이라서 boolean 사용						// addUser에서 말고도 다른데서도 자주 사용할 수 있다.
		for(int i=0; i<mlist.length; i++) {
			if(mlist[i]!=null) {
				if(mlist[i].id.equals(id)) {
					return true;
					// return을 만나면 함수가 종료되고
					// 호출부로 이동 한다. break가 필요 없다.
					
				}
			}
		}
		return false;
	}
	
	private void addUser() {
		Scanner in = new Scanner(System.in);
		MemberOne temp = new MemberOne();
		System.out.println("아이디를 입력하세요");
		String id =in.nextLine();
		if(duplexIDcheck(id)) {
			// if(true)일 경우
		}else {
			temp.id=id;
			System.out.println("이름을 입력하세요");
			String name = in.nextLine();
			temp.name=name;
			
			for(int i=0; i<mlist.length; i++) {
				if(mlist[i]==null) {
					mlist[i]=temp;
					break;
				}
			}
			
		}
		temp=null;	// temp에 저장된 주소값이 필요 없어서 null처리 하였다.
//		in.close();	// Scanner에 필요한 자원을 반납한다.
		
		
	}
	private void allListUser() {
		// TODO Auto-generated method stub
		for(int i=0; i<mlist.length; i++) {
			if(mlist[i]!=null) {
				mlist[i].prt();
			}
		}
	}

}

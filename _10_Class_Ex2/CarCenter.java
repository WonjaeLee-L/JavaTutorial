package _10_Class_Ex2;

import java.util.Scanner;

public class CarCenter {
	CarOne[] carList = new CarOne[7]; // 멤버변수, 클래스내에서 모두 사용 가능
	Scanner in = new Scanner(System.in);

	CarCenter() {
		int selNum = 0; // 여기서 선언한 이유는 메모리를 아끼기 위해서
						// while문 안으로 넣으면 돌때마다 계속 실행되기 때문이다.
		while (true) {
			menu(); // 이 안에 직접 menu를 쓰는 것과, 이렇게 나누는 방법이 있다.
					// ** 나누면 수정 등에 용이하므로 나누는 것이 더 좋다.
			System.out.println("번호 선택>");
			selNum = in.nextInt();
			in.nextLine();
			if (selNum == 1) {
				carAdd();
			} else if (selNum == 4) {
				carList();
			} else if (selNum == 5) {
				break;
			} else if (selNum == 3) {
				carMod();
			} else if (selNum == 2) {
				carDel();
			}
		}
	}

	public void menu() {
		System.out.println("1. 등록");
		System.out.println("2. 삭제");
		System.out.println("3. 수정");
		System.out.println("4. 전체보기");
		System.out.println("5. 종료");
	}

	public void carAdd() {
		// * 순서
		// 1. 새로운 차를 만든다. new CarOne()
		// 2. 차에다가 값을 저장한다.
		// 3. 차를 배열에 등록한다. carList[]
		CarOne temp = new CarOne();
		System.out.println("자동차 번호를 입력하세요");
		temp.carNumber = in.nextLine();
		System.out.println("소유자 이름을 입력하세요");
		temp.carUser = in.nextLine();

		// 배열에 저장
		// 빈칸을 찾자. 빈칸은 배열의 value가 null이다
		int maxSize = carList.length;
		// 이렇게 하면 carList.length가 여러번 쓰일 때마다 참조하는 것을 방지한다.
		for (int i = 0; i < maxSize; i++) {
			if (carList[i] == null) {
				carList[i] = temp;
				break;
			}
		}

	}

	public void carList() {
		// 메서드를 정의할 때는 구체적이면 좋다.
		// carList 배열 참조변수의 0번부터 순회하면서 저장된 주소값을 참조하여
		// carOne객체의 정보를 출력한다.
		for (int i = 0; i < carList.length; i++) {
			if (carList[i] != null) {
//				System.out.println(carList[i].carNumber);
//				System.out.println(carList[i].carUser);
				// 위에 두 줄처럼, 참조를 여러 번 하는 것을 방지하기 위해서
				// CarOne에 prt() 메서드를 만들었다.
				// 아래처럼 한 번만 참조하면 모든 정보를 출력할 수 있도록한다.
				carList[i].prt();
			}
		}

	}
	public void carMod() {
		// 시나리오 정의
		// 번호로 수정할 자동차 객체를 찾는다.
		// 번호는 수정이 불가능, 삭제만 가능하다. 소유자는 수정이 가능하다.
		System.out.println("수정할 자동차 번호 입력");
		String modNumber = in.nextLine();
		// 객체 찾기 >> 배열 순회 필요
		for (int i = 0; i < carList.length; i++) {
			if (carList[i] != null) {
				if (carList[i].carNumber.equals(modNumber))
					System.out.println("소유자의 이름을 입력");
					String newUser = in.nextLine();
					// 입력된 값의 유효성을 체크 하는 등의 무결성 코드 추가 가능
					carList[i].carUser = newUser;
					break;
			}
		}

	}

	public void carDel() {
		// 시나리오 정의
		// 번호로 삭제할 자동차 객체를 찾는다. 그리고 삭제
		System.out.println("삭제할 자동차 번호 입력");
		String delNumber = in.nextLine();
		// 객체 찾기 >> 배열 순회 필요
		for(int i=0; i<carList.length; i++) {
			if(carList[i]!=null) {
				if(carList[i].carNumber.equals(delNumber)) {
					carList[i]=null;
					break;
				}
			}
		}
	}
}

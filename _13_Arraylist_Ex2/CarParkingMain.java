package _13_Arraylist_Ex2;

import java.util.Scanner;

public class CarParkingMain {

	public static void main(String[] args) {
		// 주차장관리 프로그램
		System.out.println("[Car Parking Manger 프로그램]");
		CarParkingMge carPM = new CarParkingMge();
		CarParkingCustomMge carCusPM = new CarParkingCustomMge();
		CarParkingFileRead carDataRead = new CarParkingFileRead();

		// 고객 클래스에서 차량 정보, 출차 정보를 가지고 옴
		carPM.carList = carCusPM.carList;
		carPM.outList = carCusPM.outList;
		carDataRead.carList = carCusPM.carList;
		
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println();
			System.out.println("1. 고객 메뉴");
			System.out.println("2. 관리자 메뉴");
			System.out.println("3. data 읽기");
			System.out.println("0. 프로그램 종료");
			System.out.print("  선택 >>");
			
			String num = in.nextLine();
			if(num.equals("1")) {
				carCusPM.menuCustom();
			} else if(num.equals("2")) {
				carPM.menuMager();
			} else if(num.equals("3")) {
				carDataRead.CarParkingRead();
			} else if(num.equals("0")) {
				break;
			} else {
				System.out.println("선택 번호를 잘못 입력하셨습니다!");
			}
		}
		in.close();
		System.out.println("[프로그램]을 종료합니다");
	}

}

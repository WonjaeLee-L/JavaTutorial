package _13_Arraylist_Ex2;

import java.text.ParseException;
import java.util.Scanner;

public class CarParkingMain {

	public static void main(String[] args){
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
			System.out.println("1. 고객 메뉴");
			System.out.println("2. 관리자 메뉴");
			System.out.println("3. data 읽기");
			System.out.println("0. 프로그램 종료");
			System.out.print("  선택 >>");
			
			int num = in.nextInt();
			in.nextLine();
			if(num == 1) {
				carCusPM.menuCustom();
			} else if(num == 2) {
				carPM.menuMager();
			} else if(num == 3) {
				carDataRead.CarParkingRead();
			} else if(num == 0) {
				break;
			}
		}
		in.close();
		System.out.println("[프로그램]을 종료합니다");
	}

}

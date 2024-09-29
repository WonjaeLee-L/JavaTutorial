package _13_Arraylist_Ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class CarParkingMge {
	Scanner in = new Scanner(System.in);
	ArrayList<CarParkingOne> carList = null;
	ArrayList<CarParkingOne> outList = null;

	public CarParkingMge() {
		// TODO Auto-generated constructor stub
	}

	public void menuMager() {
		while(true) {
			System.out.println();
			System.out.println("2. 전체조회");
			System.out.println("3. 요금수정");
			System.out.println("4. 출차조회");
			System.out.println("0. 관리자메뉴 종료");	
			System.out.print("  선택 >> ");
			
			int num = in.nextInt();
			in.nextLine();
			if(num == 2) {
				listCar();
			} else if(num == 3) {
				modCar();
			} else if(num == 4) {
				outCarList();
			} else if(num == 0) {
				break;
			}
		}
	}	// 관리자 메뉴
	
	public int findCar(String car_no) {
		System.out.println("<전체조회>");
    	int ret = -1;
    	for (int i = 0; i < carList.size(); i++) {
			if (carList.get(i).carnum.equals(car_no)) {
				ret = i;
				break;
			}
		}
    	return ret;
    }	// 차량번호 찾기
	
    public void modCar() {
    	System.out.println("<요금수정>");
    	String temp_carnum = null;
    	int caridx =-1;
    	
    	System.out.println("차량 번호를 입력하세요");
		temp_carnum = in.nextLine();
		
		// 주차된 차량번호를 조회하여 index 값을 리턴한다.
    	caridx = findCar(temp_carnum);
    	if ( caridx != -1) {
    		System.out.println("수정할 요금을 입력하세요");
			int newPay = in.nextInt();
			carList.get(caridx).setCarpay(newPay);
    	} else {
    		System.out.println("수정할 차량번호 번호가 없습니다!");
    	}

    }	// 차 정보 수정

    public void listCar() {
    	 if(carList.size()==0) {
    		 System.out.println("주차된 차량이 없습니다.");
    	 }else {
    		 System.out.println("<주차된 차량 리스트>");    			
    		 for (CarParkingOne car : carList) {
    			 car.prt();
    		 }
    		 
    	 }
    	
    }	// 차 정보 보기
   
    public void outCarList() { 
    	System.out.println("<출차한 차량 리스트>");
    	int sumPay = 0;
    	
    	for(int i=0; i<outList.size(); i++) {
    		outList.get(i).prt();
    		sumPay += outList.get(i).carpay;
    	}
    	System.out.println("정산된 총 주차 요금은 :"+sumPay+"원 입니다.");
    }	// 출차된 차량 모두 조회
}

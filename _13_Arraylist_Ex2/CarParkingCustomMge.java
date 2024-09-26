package _13_Arraylist_Ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class CarParkingCustomMge {
	Scanner in = new Scanner(System.in);
	
	ArrayList<CarParkingOne> carList = new ArrayList<>();
	ArrayList<CarParkingOne> outList = new ArrayList<>();

	public CarParkingCustomMge() {
		// TODO Auto-generated constructor stub
	}

	public void menuCustom() {
		while(true) {
			System.out.println();
			System.out.println("1. 주차등록");
			System.out.println("2. 차량조회");
			System.out.println("3. 차량출차");
			System.out.println("0. 프로그램 종료");	
			System.out.print("  선택 >>");
			
			int num = in.nextInt();
			in.nextLine();
			if(num == 1) {
				addCar();
			} else if(num == 2) {
				serchCar();
			} else if(num == 3) {
				delCar();
			} else if(num == 0) {
				break;
			}
		}
	}	// 고객 메뉴
	
	
	public void addCar() {
		System.out.println("<주차등록>");
		String temp_carnum = null;
		int temp_cartype = 0;
		CarParkingOne car = new CarParkingOne();
		
		System.out.print("차량 번호를 입력하세요 :");
		temp_carnum = in.nextLine();
		car.setCarnum(temp_carnum);

		System.out.println();
		System.out.print("차량 종류를 입력 하세요(1.대형/2.중형/3.소형) :");
		temp_cartype = in.nextInt();
		if(temp_cartype == 1) {
			car.setCartype("대형");
			car.setCarpay(10000);
		} else if (temp_cartype == 2) {
			car.setCartype("중형");
			car.setCarpay(5000);
		} else if (temp_cartype == 3) {
			car.setCartype("소형");
			car.setCarpay(1000);
		}
		
		carList.add(car);
    }	// 차 정보 추가
	

    public void delCar() {
    	System.out.println("<출차삭제>");
    	String temp_carnum = null;
    	int caridx =-1;
    	
    	System.out.println("차량 번호를 입력하세요");
    	temp_carnum = in.nextLine();

    	// 주차된 차량번호를 조회하여 index 값을 리턴한다.
    	caridx = findCar(temp_carnum);
    	if ( caridx != -1) {
    		CarParkingOne out = new CarParkingOne();
    		out.setCarnum(carList.get(caridx).carnum);
			out.setCartype(carList.get(caridx).cartype);
			out.setCarpay(carList.get(caridx).carpay);
			outList.add(out);
			
    		System.out.println(carList.get(caridx).getCarnum()+"의 챠량이 출차 되었습니다");
    		carList.remove(caridx);
    	} else {
    		System.out.println("출차 차량번호 번호가 없습니다!");
    	}
    	
    }	// 차 정보 삭제
    
    public int findCar(String car_no) {
    	int ret = -1;
    	for (int i = 0; i < carList.size(); i++) {
			if (carList.get(i).carnum.equals(car_no)) {
				ret = i;
				break;
			}
		}
    	return ret;
    }	// 차량번호 찾기

    
    public void serchCar() {
    	System.out.println("<출차삭제>");
    	String temp_carnum = null;
    	
    	System.out.println("차량 번호를 입력하세요");
    	temp_carnum = in.nextLine();
		for(int i=0; i<carList.size();i++) {
			if(carList.get(i).carnum.equals(temp_carnum)) {
				carList.get(i).prt();
				break;
			}
		}
    } // 고객 조회

   }

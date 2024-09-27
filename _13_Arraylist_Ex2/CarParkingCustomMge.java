package _13_Arraylist_Ex2;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class CarParkingCustomMge {
	Scanner in = new Scanner(System.in);
	LocalDateTime now = LocalDateTime.now();
	Calendar caltime = Calendar.getInstance();

	
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
			System.out.println("0. 고객메뉴 종료");	
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
		int caridx =-1;
		CarParkingOne car = new CarParkingOne();
		String temp_carintime = null;
		String temp_carouttime = null;
		
		System.out.print("차량 번호를 입력하세요 :");
		temp_carnum = in.nextLine();
		
		// 주차된 차량번호를 조회하여 index 값을 리턴한다.
    	caridx = findCar(temp_carnum);
    	if (caridx == -1) {
			car.setCarnum(temp_carnum);
	
			System.out.println();
			System.out.print("차량 종류를 입력 하세요(1.대형/2.중형/3.소형) :");
			temp_cartype = in.nextInt();
			in.nextLine();
			
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
			
	
			// 입차시간 구하기
			temp_carintime = "0"+now.getMinute(); 
			temp_carintime = temp_carintime.substring(temp_carintime.length()-2, temp_carintime.length());
			temp_carintime = now.getHour() +":"+temp_carintime;
			temp_carintime = temp_carintime.substring(temp_carintime.length()-5, temp_carintime.length());
			car.setCarInTime(temp_carintime);
	
			
			temp_carouttime = null;
			car.setCarOutTime(temp_carouttime);	
			
			
			
			carList.add(car);
    	} else {
    		System.out.println("동일한 차량번호 번호가 있습니다! 다시 입력해 주세요.");
    	}
    }	// 차 정보 추가
	

    public void delCar() {
    	System.out.println("<출차삭제>");
    	String temp_carnum = null;
    	int caridx =-1;
    	String temp_carouttime = "0";
    	
    	
    	System.out.println("차량 번호를 입력하세요");
    	temp_carnum = in.nextLine();

    	// 주차된 차량번호를 조회하여 index 값을 리턴한다.
    	caridx = findCar(temp_carnum);
    	if ( caridx != -1) {
    		CarParkingOne out = new CarParkingOne();
    		out.setCarnum(carList.get(caridx).carnum);
			out.setCartype(carList.get(caridx).cartype);
//			out.setCarpay(carList.get(caridx).carpay);
			out.setCarInTime(carList.get(caridx).carintime);

			// 출차시간 구하기
			temp_carouttime = "0"+now.getMinute(); 
			temp_carouttime = temp_carouttime.substring(temp_carouttime.length()-2, temp_carouttime.length());
			temp_carouttime = now.getHour() +":"+temp_carouttime;
			temp_carouttime = temp_carouttime.substring(temp_carouttime.length()-5, temp_carouttime.length());
			carList.get(caridx).setCarOutTime(temp_carouttime);
			
					
			out.setCarOutTime(carList.get(caridx).carouttime);
			
			
			// 주차 시간에 따른 요금 추가
			String[] outarray = temp_carouttime.split(":",2);
			String out1 = outarray[0];
			String out2 = outarray[1];
			
			int outtime1 = Integer.parseInt(out1);
			int outtime2 = Integer.parseInt(out2);
			
			String[] inarray = carList.get(caridx).carintime.split(":",2);
			String in1 = inarray[0];
			String in2 = inarray[1];
			
			int intime1 = Integer.parseInt(in1);
			int intime2 = Integer.parseInt(in2);
			
			int sumouttime = (outtime1*60)+outtime2;
			int sumintime = (intime1*60)+intime2;
			
			int minustime = (sumouttime-sumintime)/10;
			carList.get(caridx).carpay += minustime*500;
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
    	System.out.println("<차량조회>");
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

package _13_Arraylist_Ex2;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class CarParkingCustomMge {
	Scanner in = new Scanner(System.in);
	LocalDateTime now = LocalDateTime.now();
	
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
			
			String num = in.nextLine();
			if(num.equals("1")) {
				addCar();
			} else if(num.equals("2")) {
				serchCar();
			} else if(num.equals("3")) {
				delCar();
			} else if(num.equals("0")) {
				break;
			} else {
				System.out.println("선택 번호를 잘못 입력하셨습니다!");
			}
		}
	}	// 고객 메뉴
	
	
	public void addCar() {
		System.out.println("<주차등록>");
		String temp_carnum = null;
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
			String temp_cartype = in.nextLine();
			if(temp_cartype.equals("1")) {
				car.setCartype("대형");
				car.setCarpay(10000);
			} else if (temp_cartype.equals("2")) {
				car.setCartype("중형");
				car.setCarpay(5000);
			} else if (temp_cartype.equals("3")) {
				car.setCartype("소형");
				car.setCarpay(1000);
			}
			
//			System.out.print("입차 시간을 입력하세요 :");
//			temp_carintime = in.nextLine();
			temp_carintime = curTime();
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
    	
    	System.out.print("차량 번호를 입력하세요 :");
    	temp_carnum = in.nextLine();

    	// 주차된 차량번호를 조회하여 index 값을 리턴한다.
    	caridx = findCar(temp_carnum);
    	if (caridx != -1) {
    		CarParkingOne out = new CarParkingOne();
    		out.setCarnum(carList.get(caridx).getCarnum());
			out.setCartype(carList.get(caridx).getCartype());
			out.setCarpay(carList.get(caridx).getCarpay());
			out.setCarInTime(carList.get(caridx).getCarInTime());
			// 출차시간 저장
			carList.get(caridx).setCarOutTime(curTime());

			out.setCarOutTime(carList.get(caridx).getCarOutTime());
			
			// 출차 추가요금 계산
			int addPay = carList.get(caridx).getCarpay() + calPay(carList.get(caridx).getCarInTime(), carList.get(caridx).getCarOutTime());
			out.setCarpay(addPay);

			// 출차정보 정보 출력
			carList.get(caridx).prt_serch();
			int retMin = calPayMinut(carList.get(caridx).getCarInTime(), carList.get(caridx).getCarOutTime());
			System.out.println("["+retMin+"]분 동안 주차한 주차요금 : "+addPay+"원 입니다.");
			System.out.println(carList.get(caridx).getCarnum()+"의 챠량이 출차 되었습니다");

			// 출차정보에 저장
			outList.add(out);
			
    		
    		carList.remove(caridx);
    	} else {
    		System.out.println("출차 차량번호 번호가 없습니다!");
    	}
    	
    }	// 차 정보 삭제
    
    public int findCar(String car_no) {
    	int ret = -1;
    	for (int i = 0; i < carList.size(); i++) {
			if (carList.get(i).getCarnum().equals(car_no)) {
				ret = i;
				break;
			}
		}
    	return ret;
    }	// 차량번호 찾기

    
    public void serchCar() {
    	System.out.println("<차량조회>");
    	String temp_carnum = null;
    	int caridx =-1;
    	
    	System.out.print("차량 번호를 입력하세요 :");
    	temp_carnum = in.nextLine();
    	
    	// 주차된 차량번호를 조회하여 index 값을 리턴한다.
    	caridx = findCar(temp_carnum);
    	if (caridx != -1) {
			for(int i=0; i<carList.size();i++) {
				if(carList.get(i).getCarnum().equals(temp_carnum)) {
					carList.get(i).prt_serch();
					int retMin = calPayMinut(carList.get(i).getCarInTime(), curTime());
					int retpay = carList.get(i).getCarpay() + calPay(carList.get(i).getCarInTime(), curTime());
					System.out.println(retMin+"분 동안 주차한 주차요금 : "+retpay+"원 입니다.");
					break;
				}
			}
    	} else {
    		System.out.println("조회 차량번호 번호가 없습니다!");
    	}	
    } // 고객 조회
    
    public int calPayMinut(String inTime, String outTime) {
    	int ret=0;
		LocalTime parkedAt = LocalTime.parse(inTime);
		LocalTime exitAt = LocalTime.parse(outTime);
		int amount = (int)Duration.between(parkedAt, exitAt).toMinutes(); //Duration, LocalTime을 통해 문자열로 주어진 시간의 차(분)를 구함
		return amount;
    } // 주차한 시간(분) 구하기
    
    public int calPay(String inTime, String outTime) {
    	int ret=0;
    	int amount = calPayMinut(inTime, outTime);
//		System.out.println(amount);
		if (amount > 30) {
			amount -= 30; 
			double temp = ((double)amount / 10)*500;
			ret = (int)temp;
		}
		else {
			ret = 0;
		}
		return ret;
    } // 주차경과 분에 따른 요금계산
    
    public String curTime() {
    	String temp_carouttime = null;
		// 출차시간 구하기
		temp_carouttime = "0"+now.getMinute(); 
		temp_carouttime = temp_carouttime.substring(temp_carouttime.length()-2, temp_carouttime.length());

		temp_carouttime = "0"+now.getHour() +":"+temp_carouttime;
		temp_carouttime = temp_carouttime.substring(temp_carouttime.length()-5, temp_carouttime.length());

		return temp_carouttime;
    } // 현재시간에서 [시간:분] 시간구하기
}

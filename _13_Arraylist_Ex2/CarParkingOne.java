package _13_Arraylist_Ex2;

public class CarParkingOne {
	String carnum  = null;
    String cartype = null;
    int carpay = 0;

	public CarParkingOne() {
		// TODO Auto-generated constructor stub
	}
	
	public void prt() {
		System.out.println("차번호["+carnum+"] 차종["+cartype+"] 주차요금["+carpay+"]");
	} // 차번호, 차종, 요금 출력
	
	public void setCarnum(String carnum) {
    	this.carnum=carnum;
    }	// 차번호 저장
    public void setCartype(String cartype) {
    	this.cartype=cartype;
    }	// 차종 저장
    public void setCarpay(int carpay) {
    	this.carpay=carpay;
    }	// 요금 저장
    
    public String getCarnum() {
    	return carnum;
    }	// 차번호 조회
    public String getCartype() {
    	return cartype;
    }	// 차종 조회
    public int getCarpay() {
    	return carpay;
    }	// 요금 조회
}

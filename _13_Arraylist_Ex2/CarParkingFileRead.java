package _13_Arraylist_Ex2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CarParkingFileRead {
	ArrayList<CarParkingOne> carList = null;
	
	public CarParkingFileRead() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean CarParkingRead() {
		String filePath = "D:\\Workspace\\java_src\\JavaTutorial\\src\\_13_Arraylist_Ex2";
		
		try {
			String carOne[] = new String[5];
			int tot_cnt=0;
			File myObj = new File(filePath+"\\data.txt");
		    Scanner myReader = new Scanner(myObj);
		    while (myReader.hasNextLine()) {
		    	String data = myReader.nextLine();
		    	carOne = data.split(" ");
//		    	for (int i=0; i<carOne.length; i++) {
//		    		System.out.print(carOne[i]+" ");
//		    	}
//		    	System.out.println();

		    	CarParkingOne car = new CarParkingOne();
		    	car.setCarInTime(carOne[0]);
		    	car.setCarOutTime(carOne[1]);
		    	car.setCarnum(carOne[2]);
		    	car.setCartype(carOne[3]);
		    	car.setCarpay(Integer.parseInt(carOne[4]));
		    	carList.add(car);
		    	tot_cnt++;
		    }
		    myReader.close();
		    System.out.println("총 "+tot_cnt+"건 입력되었습니다");
		    return true;
	    } catch (FileNotFoundException e) {
	    	System.out.println("An error occurred.");
	    	e.printStackTrace();
	    	return false;
	    }
	}
}

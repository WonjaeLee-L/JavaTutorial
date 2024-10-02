package testpm_0920;

import java.util.Scanner;

public class TrainManage {
	TrainOne[] trainList = new TrainOne[4];
	Scanner in = new Scanner(System.in);

	TrainManage() {
		TrainOne trainInfo = new TrainOne();

//		trainList[0].trainNum = 1111;
//		trainList[0].trainType = "무궁화";
//		trainList[1].trainNum = 2222;
//		trainList[1].trainType = "새마을";
//		trainList[2].trainNum = 3333;
//		trainList[2].trainType = "무궁화";
//		trainList[3].trainNum = 4444;
//		trainList[3].trainType = "새마을";

		int selNum = 0;
		int tLength = trainList.length;
		while (true) {
			start();
			selNum = in.nextInt();
			in.nextLine();
			if (selNum == 1) {
				timeAdd();
			} else if (selNum == 2) {
				view();
			} else if (selNum == 3) {
				mod();
			}
		}
	}

	public void start() {
		System.out.println("1. 기차 시간 등록");
		System.out.println("2. 기차 정보 전체 보기");
		System.out.println("3. 도착 시간 수정");
	}

	public void timeAdd() {

	}

	public void view() {

	}

	public void mod() {

	}

}

package testpm;

import java.util.Scanner;

public class test0820 {

	public static void main(String[] args) {

		System.out.println("-----1번 문제-----");
		/*
		 * int[] arr = {3,45,26,50,74};
		 * int a = 5;
	 	 * a로 나누어 떨어지는 배열의 값을 모두 출력하시오.
		 *
		 */
		int[] arr = {3,45,26,50,74};
		int a = 5;
		
		for(int i=0; i < arr.length; i++) {
			if(arr[i]%a==0) {
				System.out.println(arr[i]);
			}
		}

		
		
		System.out.println("-----2번 문제-----");
		int[] arr1 = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 97};
		//배열의 평균값을 구하시오. 소수점 표현하시오. 
		double avg=0.0;
		
		for(int i =0; i < arr1.length; i++) {
			avg += arr1[i];
		}
		System.out.println(avg/arr1.length);
		
		
		
		System.out.println("-----3번 문제-----");
		/*
		 * 팩토리얼의 합 구하기 (2중 for로 해결)
		 * 1부터 10까지 숫자의 각패토리얼의 합을 구하시오
		 * 예를들어 4의 팩토리얼은  1*2*3*4
         * 5의 팩토리얼은 1*2*3*4*5
		 */
		
		int sum=0;
		int fmul=1;
		for(int i=1; i<= 10; i++) {
			fmul=1;
			for(int j=i; j>=1; j--) {
				fmul *= j;
			}
			System.out.println(i+"일 때 팩토리얼 : "+fmul);
			sum += fmul;
			
		}
		System.out.println("팩토리얼 총합 : "+sum);
		
		
		
		System.out.println("-----4번 문제-----");
		int[] b = {93,45,83,58,75,56};
		/*
		 * 다음조건에 따라 오름차순으로 정렬하시오.
		 * 1. 가장큰 값을 찾아서 맨뒤 값과 교환한다.. 결과  {56,45,83,58,75,93}
		 * 2. 두번째로 큰 값을 찾아서 맨뒤에서 두번째 자리의 값과 교환한다.  결과  {56,45,75,58,83,93}
		 * 3. 세번째로 큰 값을 찾아서 맨뒤에서 세번째 자리의 값과 교환한다.  결과  {56,45,58,75,83,93}
		 * 오름차순으로 정렬이 될때 까지 반복한다.
		 */
		
		int tempMaxIndex = 0;
		
		for(int i=0; i<b.length; i++) {
			System.out.println(i+"번째 큰값 찾는 중 -------------");
			tempMaxIndex = 0;
			for(int j=0; j < b.length - i; j++) {
				System.out.println(j +"번째 부터 서치");
				if(b[tempMaxIndex] < b[j]) {
					tempMaxIndex = j;
				}
			}
			// 가장 큰 값과 뒤에 값과 swap
			int temp = b[b.length-1-i];
			b[b.length-1-i]=b[tempMaxIndex];
			b[tempMaxIndex]=temp;
			
			// i번째 큰 값 찾아서 변경된 배열 확인 반복문
			for(int k=0; k<b.length; k++) {
				System.out.print(b[k]+" ");
			}
			System.out.println();
			
		}

		
		
		System.out.println("-----5번 문제-----");
		/*
		 * carnum배열의 인덱스가 0인 값부터 주차장에 들어온다. // carnum배열은 자동차 번호를 의미합니다. 
		 * parking의 인덱스 번호가 주차번호이다. 
		 * 자동차 번호의 마지막 번호는 해당 차량이 주차할 주차번호이다.
		 * 만약 주차번호에 다른 차량이 주차되어 있으면 다음 주차번호에 주차를 한다.
		 * (이때, 다음 주차번호에도 차량이 있으면 주차불가이다.)
		 *  주차가 끝난 후 주차번호와 주차항 차량 번호를 출력하시오.
		 */
		
		
		int[] carnum = {1232,1221,1235,1252,1234,4536,3457,3239,3229,2599};
		int[] parking = new int[10];
		
		int nowCar=0;
		int carPositionIndex=0;
		int totalCarCnt=0;
		for(int i=0; i < carnum.length; i++) {
			//초기 주차 정보 분석
			nowCar = carnum[i];
			carPositionIndex = nowCar%10;
			System.out.println(nowCar+"차량 "+carPositionIndex +" 번이 주차자리입니다");
			
			// 주차장에 자리가 있다면
			if(totalCarCnt < parking.length) {
				//빈자리를 찾을 때 까지 반복
				for(;parking[carPositionIndex]!=0;) {
					System.out.println("빈자리인지 확인 중입니다.");
					carPositionIndex=(carPositionIndex+1)%(parking.length);
					System.out.println(carPositionIndex+"번호로 새로 배정");
				}
				
				// 22 반복문에서 빈자리를 찾았다면
				System.out.println(carPositionIndex+"번호에 주차 합니다");
				parking[carPositionIndex]=nowCar;		
				totalCarCnt++;				
			}
			
		}
		
		
		
		
		/*
		 * <이번 저희회사에서는 회원관리 프로젝트를 담당하게 되었습니다.
		 * 회원관리 프로젝트 중 회원의 아이디 유효성 체크를 미션으로 드립니다>
		 */
		
		System.out.println("-----6번 문제-----");
		/*
		 * 키보드로 아이디를 입력받는다.
		 * 입력 받은아이디에 특수 문자가 포함 되었는지 확인한다. (유효성)
		 * 특수 문자는 @한개로 정의한다.
		 * 특수문자가 몇 개 포함되었는지 출력합니다.
		 * 
		 */
		Scanner in = new Scanner(System.in);
		System.out.println("아이디를 입력하세요");
		String id = in.nextLine();
		
		int cnt=0;
		for(int i=0; i < id.length(); i++) {
			if(id.charAt(i)=='@') {
				cnt++;
			}
		}
		System.out.println(id +"문자열에는 @가 "+cnt+"개 있습니다.");

		
		
		
		System.out.println("-----7번 문제-----");
		// 특수문자는 String sign="!@#$%^&*"로 정의한다.
		
		String sign="!@#$%^&*";
//		Scanner in = new Scanner(System.in);
		System.out.println("아이디를 입력하세요");
//		String id = in.nextLine();
		
//		int cnt=0;
		for(int i=0; i < sign.length(); i++) {
			for(int j=0; j < id.length(); j++) {
				if(sign.charAt(i)==id.charAt(j)) {
					cnt++;
				}
			}
		}
		System.out.println(id +"문자열에는 특수문자가 "+cnt+"개 있습니다.");
		
		
		
	}

}

package testpm;

public class test0819 {

	public static void main(String[] args) {
		// 1.
		// 1*1=1  1*2=2   1*3=3
		// 2*1=2  2*2=4   2*3=6
		// 3*1=3  3*2=6   3*3=9
		// 4*1=4  4*2=8   4*3=12
		System.out.println("-----1번 문제-----");
		for(int i=1; i<5; i++) {
			for(int j=1; j<4; j++) {
				System.out.print(" "+i+"X"+j+"="+i*j);
			}
			System.out.println();
		}
		
		
		// 2.
		// *****
		// ****
		// ***
		// **
		// *				
		System.out.println("-----2번 문제-----");
		for(int i=0; i<5; i++) {
			for(int j=4; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		// 3.
		// 000*
		// 00***
		// 0*****
		// *******
		System.out.println("-----3번 문제-----");		
		for(int l=1; l<5; l++) {			
			for(int i=3; i-(l-1)>0; i--) {
					System.out.print("0");				
			}
			for(int j=1; j<(2*l); j++) {
				System.out.print("*");
			}
			System.out.println();			
		}
		
		
		// 4.
		//*******
		// 0*****
		// 00***
		// 000*		
		System.out.println("-----4번 문제-----");		
		for(int l=1; l<5; l++) {			
			for(int j=0; j<l-1; j++) {
				System.out.print("0");
			}
			for(int i=9; i>l*2; i--) {
					System.out.print("*");				
			}
			System.out.println();			
		}
		
		
		// 5.
		// int[] a ={34,55,23,56,34,45,34};
		// 40보다 큰 수는 모두 몇개인가?		
		System.out.println("-----5번 문제-----");
		int[] a = {34,55,23,56,34,45,34};
		int cntA = 0;
		for(int i=0; i<7; i++) {
			if(a[i]>40) {
				cntA++;
			}
		}
		System.out.println(cntA+"개");
				
		
		// 6.
		// int[] a ={34,55,23,56,34,45,34};
		// int[] b ={36,49};
		// b배열의 값보다 큰 값이 a 배열의 값에 모두 몇개가 있는가?
		// 각각 카운팅 하시오 
		// 출력은
		// a 배열의 값에는  36번호 보다 큰 숫자가 ?? 개 있습니다.
		// a 배열의 값에는  49번호 보다 큰 숫자가 ?? 개 있습니다.
		System.out.println("-----6번 문제-----");
		int[] a1 ={34,55,23,56,34,45,34};
		int[] b1 ={36,49};
		int cntAB = 0;
		int sumB1 =0;
		int sumB2 =0;		
		for(int i=0; i<b1.length; i++) {
			for(int j=0; j<a1.length; j++) {
				if(b1[i]<a1[j] && i==0) {
					cntAB++;
					sumB1 = sumB1 + cntAB;
					cntAB=0;
				} else if(b1[i]<a1[j] && i==1)
					cntAB++;
					sumB2 = sumB2 + cntAB;
					cntAB=0;
			}			
		}
		System.out.println("a 배열의 값에는 "+ 36 + "번호보다 큰 숫자가 "+sumB1+"개 있습니다.");
		System.out.println("a 배열의 값에는 "+ 49 + "번호보다 큰 숫자가 "+sumB2+"개 있습니다.");
		
		// 7.
		// 거스름돈 구하기   10000원짜리 0개, 1000원짜리 0 개, 100짜리 0개, 10짜리 0개,   조건 : /나 %연산자는 각각 최대 두 번씩 사용가능
		// 단, 거스름돈은 만천원이 최대 값이다. 
		// int money=4570;  // 가격
		// int pay = 10000;  //지불금액
		System.out.println("-----7번 문제-----");
		int money=4570;
		int pay=10000;	
		int charge = pay-money; // 5430
		int chargeI = charge/10;//543
		for(int i=1; i<1000; i=i*10) {
			int a11 = chargeI%(10*i);	// i=1, 3. i=10, 43, i100 543 
			if(a11==0) {
				System.out.println("1000원짜리 1개");
			}
			if(a11>10) {
				System.out.println(10*i+"원 짜리 "+a11/(1*i)+"개");
			}else
				System.out.println(10*i+"원 짜리 "+a11%(10*i)+"개");
			
//			for(int j=0; j<3; j++ ) {
//				a11
//			}
		}
		
//			charge/10 
//			여기다가 /100에서 /10과 %10 만, 천
//			%100에서 /10과 %10 백, 십
		
		
		
		// 8.
		// int[] pang={1,0,0,0,2,3,4,4,6,2,2,2,2,5}   -이중 for  사용
		// 애니팡 게임의 일부분인다. 게임의 캐릭터는 숫자로 구분한다.
		// 가로에 같은 캐릭터가 3개 이상이면 제거 대상이다.
		// 제거 대상 캐릭터 번호와 갯수, 시작위치 인덱스를 모두 출력하시오.
		System.out.println("-----8번 문제-----");
		// 
		int cntC = 0;
		int sumCnt = 0;
		int numberC = 0;
		int indexC = 0;
		int[] pang={1,0,0,0,2,3,4,4,6,2,2,2,2,5};
		for(int i=0; i<pang.length; i++) {
			for(int j=i+1; j<pang.length; j++) {
				if(pang[i]==pang[j]) {
					cntC++;
					
				}else if(cntC>=2){
					sumCnt = sumCnt+cntC;
					numberC = pang[i];
					indexC = i;
					System.out.println("캐릭터 번호는 "+numberC+", 시작 위치 인덱스는 "+indexC+", 갯수는 "+sumCnt);
					cntC=0;
					sumCnt=0;
					numberC=0;
					indexC=0;
					break;
				}
//				
//				if(sumCnt>=3) {
//					System.out.println("캐릭터 번호는 "+numberC+", 시작 위치 인덱스는 "+indexC+", 갯수는 "+sumCnt);
//				}				
			}			
		}
		
		
		// 9.
		// 가장 긴 터널의 알파벳 이름과 숫자를 찾으세요 <이중For사용>
		System.out.println("-----9번 문제-----");
		String ttt ="aabbbcccaaaaddbbbaaaaaE";
		int sumAl = 0;
		char Al = 'F';
		int cntT = 0;
		for(int i=0; i<ttt.length(); i++) {
			for(int j=i+1; j<ttt.length(); j++) {			
				if(ttt.charAt(i)==ttt.charAt(j)) {
					cntT++;			
				} else if(cntT>=sumAl) {
					sumAl=cntT;
					Al=ttt.charAt(i);
					cntT=0;
					break;
				}else {
					cntT=0;
					break;					
				}
			}
		}System.out.println(Al+", "+(sumAl+1));
		
		
		// 10.
		// 난건물주  <이중For사용>
		// int[] arr = {1,0,0,0,1,1,1,0,0,0,0,1,1,1,1,0,0,0,1}
		// int size=2;
		// arr 배열에서 0이 의미하는 것은 공터이다. 
		// size는 건물의 크기 이다. 건물은 하나만 짓는다. 공터는 연속적으로 있어야 한다. 
		// size 설정값에 따라 공터에 건물을 지을 수 있는 위치는 모두 몇개인가?
		// size가 2일경우에 7개이다. 
		System.out.println("-----10번 문제-----");
		int[] arr = {1,0,0,0,1,1,1,0,0,0,0,1,1,1,1,0,0,0,1};
		int size=2;
		int cntAA = 0;
		for(int i=0; i<arr.length-1; i++) {
			
				for(int j=i+1; j<i+2; j++) {
					if(arr[i]==arr[j] && arr[i]==0) {
						cntAA++;
					}else {
						break;
					}
			}
		}System.out.println(cntAA);
		
		// 11.
		// 000*
		// 00***
		// 0*****
		// *******
		// 0*****
		// 00***
		// 000*
		System.out.println("-----11번 문제-----");
		for(int l=1; l<8; l++) {			
			if(l<5) {		
					for(int i=3; i-(l-1)>0; i--) {
							System.out.print("0");				
					}
					for(int j=1; j<(2*l); j++) {
						System.out.print("*");
					}
					System.out.println("");
			}else {		
					for(int j=3; j<l-1; j++) {
						System.out.print("0");
					}
					for(int i=15; i>l*2; i--) {
							System.out.print("*");				
					}
					System.out.println();
			}
		}
		
		// 12.
			
			
		System.out.println("-----11번 문제-----");
		
		
		
	}

}

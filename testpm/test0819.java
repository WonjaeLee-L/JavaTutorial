package testpm;

public class test0819 {

	public static void main(String[] args) {
		// ★★★★★★1, 3, 9의 패턴은 완벽 숙지★★★★★★
		
		
		
		// 1.
		// 1*1=1  1*2=2   1*3=3
		// 2*1=2  2*2=4   2*3=6
		// 3*1=3  3*2=6   3*3=9
		// 4*1=4  4*2=8   4*3=12
		// i = 1, j = 1, 2, 3
		// i = 2, j = 1, 2, 3
		// ...
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
		// i: 줄찍는것, j: 열찍는것
		// i 0, j 0,1,2,3,4
		// i 1, j 0,1,2,3
		// i 2, j 0,1,2
		// i 3, j 0,1
		// i 4, j 0
		// 수식: 첫번째로 i값을 먼저 찾기
		// i=0일때 j의 마지막은 4
		// i=1				3
		// i=2 				2
		// i=3				1
		// i=4				0
		// 조건식 j<=4-i
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
		// 0만 보면 2번과 같다.
		// (1) 0을 for때리고, *을 for때리는 방법.
		// 
		/*	
		 *  (2) 일반적으로 줄을 i로 열을 j로 2번과 같이 푼다.
		 * 	i가 0일때 j는 0123
		 *  i가 1일때 j는 01234
		 *  i가 2일때 j는 012345
		 *  i가 3일때 j는 0123456
		 *  
		 *  int i=0; i<4
		 *  	int j=0; j<=3+i(끝점을 보고 수식 만들기)
		 *  012
		 *  01
		 *  0 을 경계로 0찍기 *찍기로 나뉨
		 *  --> if문으로 조건걸어서 바꾸기
		 *  
		 *  for(int i=0; i<4; i++) {
		 *  	for(int j=0; j<4+i; j++) {
		 *  		if(j>=4-i-1) {
		 *  			system.out.print("*");
		 *  		}else {
	 	 *  			system.out.print("0");
	 	 *  		}
	 	 *  	}
 		 *  }
		 *	  		
		 */
		
		
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
		// 거스름돈 구하기   10000원짜리 0개, 1000원짜리 0 개, 100짜리 0개, 10짜리 0개
		// 조건 : /나 %연산자는 각각 최대 두 번씩 사용가능
		// 단, 거스름돈은 만천원이 최대 값이다. 
		// int money=4570;  // 가격
		// int pay = 10000;  //지불금액
		System.out.println("-----7번 문제-----");
		int money=4570;
		int pay=15000;
		
		int charge = pay-money;
		int chargeI = charge/10;
		for(int i=1; i<=1000; i=i*10) {
			int a11 = chargeI%(10*i); 
			if(a11>=1000) {
				System.out.println(10*i+"원짜리 1개");
			}else if(a11>10) {
				System.out.println(10*i+"원 짜리 "+a11/(1*i)+"개");
			}else
				System.out.println(10*i+"원 짜리 "+a11%(10*i)+"개");
		}		
		
		
		// 8.
		// int[] pang={1,0,0,0,2,3,4,4,6,2,2,2,2,5}   -이중 for  사용
		// 애니팡 게임의 일부분인다. 게임의 캐릭터는 숫자로 구분한다.
		// 가로에 같은 캐릭터가 3개 이상이면 제거 대상이다.
		// 제거 대상 캐릭터 번호와 갯수, 시작위치 인덱스를 모두 출력하시오.
		System.out.println("-----8번 문제-----");
		int cntC = 0;
		int numberC = 0;
		int indexC = 0;
		int[] pang={1,0,0,0,2,3,4,4,6,2,2,2,2,1,0};
		for(int i=0; i<pang.length-1; i++) {
			for(int j=i+1; j<i+2; j++) {
				if(pang[i]==pang[j]) {
					cntC++;					
				}else if(cntC>=2){					
					numberC = pang[i];
					indexC = i;
					System.out.println("제거 대상의 캐릭터 번호는 "+numberC+", 시작 위치 인덱스는 "+(indexC-cntC)+", 갯수는 "+(cntC+1));
					cntC=0;
					numberC=0;
					indexC=0;
					break;
				}else {
					cntC=0;
				}
			}			
		}
		System.out.println("-----8번 문제(다른 방법)-----");
		int cntPang=0;
		int maxPang=0;
		int indexPang=0;
		int numberPang=0;
		// int[] pang={1,0,0,0,2,3,4,4,6,2,2,2,2,1,0};
		for(int i=0; i<pang.length; i++) {
			cntPang=0;
			maxPang=0;
			indexPang=0;
			numberPang=0;
			// j를 i+1이 아닌 i부터 시작하여 cnt 했기 때문에, 나중에 cnt+1 하지 않아도 되게 함
			for(int j=i; j<pang.length; j++) {
				if(pang[i]!=pang[j]) {
					break;
				}else {
					cntPang++;					
				}
				if(cntPang>=3) {
					maxPang=cntPang;
					indexPang=i;
					numberPang=pang[i];
				}
			}
			if(cntPang>=3) {
				System.out.println(maxPang+"갯수, "+indexPang+"인덱스, "+numberPang+"숫자");	
			}			
			i=i+cntPang-1;			
		}
		
		
		
		// 9. (8, 10)도 이 패턴으로 풀어보기 ★★★
		// 가장 긴 터널의 알파벳 이름과 숫자를 찾으세요 <이중For사용>
		/* String ttt ="aabbbcccaaaaddbbbaaaaa";
		 * 
		 * (1) a중에 가장 긴 a?
		 * i는 ttt문자열의 index로
		 * j는 a를 만나면 파고들어서 그 안의 for문(★★★중요 패턴★★★)
		 * 
		 * int maxCnt=0;
		 * int cnt=0;
		 * for(int i=0; i<a.length(); i++) {
		 * 		char temp = a.charAt(i);
		 * 		cnt=0;	// 항상 cnt는 0부터 시작하도록 초기화
		 * 		if(temp=='a') {
		 * 			for(int j=i; j<a.length; j++) {
		 * 				if(a.charAt(j)!='a'){
		 * 					break;
		 *				}else {
		 *					cnt++;
		 *				} 					
		 * 
		 * 			}	// i값 위치를 시작으로 연속된 a의 길이 구함
		 * 		if(maxCnt<cnt) {
		 * 			maxCnt=cnt;
		 * 		}
		 * 		}	
		 * 		i=i+cnt-1;	// ★★★ 내가 어려웠던 문제를 해결하는 표현
		 * 					// 카운팅 했는데 다음 i값에서 또 세는 것을 방지하기 위한 수식
		 * 					// 방금의 i값에서 카운팅 한 만큼 i 값을 늘리면 중복 되는 것을 방지
		 * 					// 다만, 반복문이 다시 시작되며 증감식(i++)이 적용되므로 -1 추가 ★★★
		 * } sysout(maxCnt)
		 * 
		 * 
		 * (2) 가장 긴 것?
		 * String ttt ="aabbbcccaaaaddbbbaaaaa";
		 * int maxCnt=0;
		 * int cnt=0;
		 * char maxChar;
		 * char nowChar;
		 * for(int i=0; i<a.length()-1; i++) {
		 * 		nowChar = a.charAt(i);
		 * 		cnt=0;
		 * 			for(int j=i; j<a.length; j++) {
		 * 				if(a.charAt(j)!=nowChar){
		 * 					break;
		 *				}else {
		 *					cnt++;
		 *				}
		 * 			}
		 * 		if(maxCnt<cnt) {
		 * 			maxCnt=cnt;
		 * 			maxChar=nowChar;
		 * 		}
		 * 		i=i+cnt-1;
		 * } sysout(maxChar+", "+maxCnt);
		 */
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
		}System.out.println("가장 긴 터널의 알파벳: "+Al+", 터널의 길이: "+(sumAl+1));
		
		
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
//		int size=2;
		int cntAA = 0;
		for(int i=0; i<arr.length-1; i++) {			
				for(int j=i+1; j<i+2; j++) {
					if(arr[i]==arr[j] && arr[i]==0) {
						cntAA++;
					}else {
						break;
					}
			}
		}System.out.println(cntAA+"개");
		
		System.out.println("-----10번 문제(다른 방법)-----");
		int cntArr=0;
		int size=2;
		int sumArr=0;
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]==0) {
				for(int j=i; j<arr.length; j++) {
					if(arr[i]!=arr[j]) {
						break;
					}else {
						cntArr++;
					}
				}
				i=i+cntArr-1;
				cntArr--;
			}
		} 
		System.out.println(cntArr);
		
		
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
		// 11번에서 for문 두 개만 사용하기
		// 000*
		// 00***
		// 0*****
		// *******
		// 0*****
		// 00***
		// 000*
		System.out.println("-----12번 문제-----");
		for(int i=0; i<7; i++) {
			int k=4+i;
			if(i<3) {
				for(int j=0; j<4+i; j++) {
					
				}
			}
			
		}
		
	}
}

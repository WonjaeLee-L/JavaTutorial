package testpm;

public class test0809 {

	public static void main(String[] args) {
		// 1번 문제 100부터 999까지의 숫자중에서 홀수만 출력하시오.
		for(int i = 100; i<=999; i++) {
			if(i%2==1) {
				System.out.println(i);
			}
		}
		// 그냥 for문을 작성한다. 로 분석을 시작하지말고
		// 처음부터 초기값 100, 초건은 <1000, 증감식 i++로 바로 생각
		// 그 다음 바로 sysout해서 한 번 확인.
		// i가 홀수인지 판단(%연산 활용)
		// 이런 방식으로 문제 접근.(구체적으로 디테일하게, 이것만 보고 누구든 동일하게 코드 짤 수 있도록.

		
		// 2번 문제 1부터 100까지 숫자중에서 홀수의 총합을 구하시오.
		int sumOdd = 0;
		for(int i = 1; i<=100; i++) {
			if(i%2==1) {
				sumOdd += i;
			}
		}
		System.out.println(sumOdd);
		// 1부터 100까지 for문 작성
		// 초기값 1, 조건 <= 100, i++
		// 홀수 판별: i값이 홀수인지 %2==1
		// 총합: 총합을 저장할 변수 선언
		// 변수는 동사+명사로 카멜표기법
		
		// 3번 문제 다음과 같이 출력하시오   10  9  8  7  6  5  4  3  2  1
		for(int i = 10; i>0; i--) {
			System.out.print(i+" ");
		}
		
		
		System.out.println();
		
		
		// 4번 문제 배열에서 배열의 값이 짝수인 것만 출력하시오.
		int[] arr = {45,23,25,64,3,24,48};
		for(int i = 0; i<7; i++) {
			if((arr[i]%2)==0) {
				System.out.println(arr[i]);
			}
		}
		// for문을 작성한다.
		// 초기값은 0, 조건 <7(배열의 길이)(arr.length), i++
		// i를 배열의 index로 본다.
		
		
		// 6번 문제 배열에서 배열의 값이 홀수 인 곳의 인덱스만 출력하시오.
		for(int i = 0; i<7; i++) {
			if((arr[i]%2)==1) {
				System.out.println(i);
			}
		}
		
		
		// 7번 문제 배열의 값을 모두 더한 총합을 구하시오.
		int sumAll=0;
		for(int i=0; i<7; i++) {
			sumAll += arr[i];
		}
		System.out.println(sumAll);
		
		
		// 8번 문제 짝수는 모두 몇개인가요?
		int cntEven=0;
		for(int i=0; i<7; i++) {
			if((arr[i])%2==0) {
				cntEven++;
			}
		}
		System.out.println(cntEven);
		
		
		 // 9번 문제
		/*
		 *  String test = "abcdeabce";
		    for(int i=0; i < 9; i ++){
			char aaa = test.charAt(i);
			sysout(aaa);
		    }
		
		   위 코드를 분석하여 a문자열에 a가 몇개 있는지 구하는 프로그램을 작성하세요
		 */
	    int cntA = 0;
		String test = "abcdeabce";
	    for(int i=0; i < 9; i ++){
		char aaa = test.charAt(i);
		if(aaa=='a') {
			cntA++;
		}
		
	    }
	    System.out.println(cntA);

	    
	    // 10번 문제 배열에서 가장 큰 값과 가장 큰 값이 있는 인덱스를 출력하시오.
	    // int[] arr = {45,23,25,64,3,24,48};
	    int index = 0;
	    int maxValue = 0;
	    for(int i=0;i<7;i++) {
	    	if(maxValue<arr[i]) {
	    		maxValue = arr[i];
	    		index = i;
	    	}
	    }
	    System.out.println("가장 큰 값은"+maxValue+"이고, 그 때의 index는 "+index+"이다.");
	    
	    
	    // 11번 문제 범인은 100부터 999까지 숫자중에 여러명이다. 
	    // 범인의 특징은 숫자의 각자릿수를 더한 값이 짝수이다.  범인의 숫자를 모두 찾으시오.
	    for(int i=100; i<=999; i++) {
	    	if((((i/10)/10)+((i/10)%10)+(i%10))%2==0) {
	    		System.out.println(i);
	    	}
	    }
	    
	     
	    // 12번 문제  0은 터널이다. 가장 긴 터널의 길이를 구하시오.
	    int k = 0;
	    int cntT = 0;
	    int sumCnt = 0;
	    int[] arr1 = {1,2,3,0,0,0,1,2,3,4,5,2,2,2,2,0,0,0,0,0,3,3};
	    for(int i=0; i<arr1.length; i++) {
	    	if(arr1[i]==arr1[k] && arr1[i] == 0) {
	    		cntT++;
	    	} else if(sumCnt<cntT) {
	    		sumCnt = cntT;
	    		cntT=0;
	    	} else
	    		cntT=0;
	    	
	    	k=i;
	    }
	    System.out.println(sumCnt+1);
	    
	    
	    // 13번 문제 숫자는 터널의 번호이다. 터널의 길이가 가장 긴 숫자와 길이를 출력하시오. 
	    int k1 = 0;
	    int cntT1 = 0;
	    int sumCnt1 = 0;
	    int[] arr2 = {1,2,3,0,0,0,1,2,2,4,2,2,2,2,2,2,0,0,0,0,0,3,3};
	    for(int i=0;i<arr2.length; i++) {
	    	if(arr2[i]==arr2[k1]) {
	    		cntT1++;
	    	} else if(sumCnt1<cntT1) {
	    		sumCnt1 = cntT1;
	    		cntT1=0;
	    		System.out.println(arr2[i]);
	    	} else
	    		cntT1=0;
	    	k1=i;
	    }
	    System.out.println(sumCnt1+1);
		
	    	    
	    // 14번 문제 가장 긴 터널의 알파벳 이름과 숫자를 찾으세요
	    String ttt = "aabbbcccaaaaddbbbaaaaa";
	    int sumCntAlphabet = 0;
	    int cntAlphabet = 0;
	    int kk = 0;
	    char alphabetName = 'a';
	    for(int i=0; i<22; i++) {
	    	
	    char alphabet = ttt.charAt(i);
	    char alphabetB = ttt.charAt(kk);
	    
	    	if(alphabet==alphabetB) {
	    		cntAlphabet++;
	    		
	    	} else if(sumCntAlphabet<cntAlphabet) {
	    		sumCntAlphabet = cntAlphabet;
	    		alphabetName = alphabetB;
	    		cntAlphabet = 0;
	    	} else
	    		cntAlphabet = 0;
	    	
	    	kk = i;
	    
	    }
	    System.out.println("갯수는 "+ sumCntAlphabet+1 + ", 이름은 "+ alphabetName);
	    
	    // 15번 문제 압축하시오. 압축 하는 방법 a2b3c3a4d2b3a5
	    // String ttt ="aabbbcccaaaaddbbbaaaaa";
	    
	    
		
	}

}

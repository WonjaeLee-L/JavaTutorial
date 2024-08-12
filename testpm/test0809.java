package testpm;

public class test0809 {

	public static void main(String[] args) {
		// 1번 문제 100부터 999까지의 숫자중에서 홀수만 출력하시오.
		for(int i = 100; i<=999; i++) {
			if(i%2==1) {
				System.out.println(i);
			}
		}
		// 1번 분석
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
		// 2번 분석
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
		// 4번 분석
		// 1. for문을 작성한다.
		// 초기값은 0, 조건 <7(배열의 길이)(arr.length), i++
		// i를 배열의 index로 본다.
		// 2. arr[i]%2==0 조건
		// 3. 출력
		
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
		
		   위 코드를 분석하여 test문자열에 a가 몇개 있는지 구하는 프로그램을 작성하세요
		 */
		// 문자열 부품이 제공하는 기능(method)을 이용하여 문제 해결 .은 참조(냉장고.open door)
		// . 뒤에가 기능이다 ***
		// 그 중에 charAt이라는 기능은 문자를 하나씩 가져오는 것.
	    int cntA = 0;
		String test = "abcdeabce";	// 선언문(자료형 변수=초기값) 연산자는 자료형에 따라서 정해짐(Ex 문자열은 사칙연산 불가)
	    for(int i=0; i < 9; i ++){	// 결론: 변수는 test, 문자열의 값, 초기 문자열은 "abcdeabce"
		char aaa = test.charAt(i);	
		if(aaa=='a') {				
			cntA++;
		}
		
	    }
	    System.out.println(cntA);
	    // 왜 변수를 만들었나? 자료 수집
	    // 대문자로 시작하는 String의 변수는 변수. 가능. 소문자로 시작하면 변수. 불가능
	    // 자료 형 중에서 -> **원시타입의 자료형) int, char, boolean, double, float : .을 사용할 수 없다.
	    //			   -> **참조타입의 자료형) 소문자가 아닌 대문자로 시작하는 자료형은 변수. 을 사용할 수 있다.(예외: 배열은 . 사용 가능)
	    //								객체는 참조 타입과 밀접한 관련이 있다.
	    // 객체(누가 미리 만들어 놓은 제품.을 그대로 씀. 그걸 사용하는 방법이 있다.): method (.은 참조라고 부름)
	    

	    
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
	    // 10번 분석
	    // 1. for문 작성 i=0, i<arr.length, i++. i는 배열의 index로 본다.
	    // 2. 배열에서 가장 큰 값 -> 시나리오 직접 실행. 가장 큰 값 정보 필요 -> 선언
	    // 3. i의 value값과 최대값을 저장한 변수랑 비교 arr[i]<max시 최대값 변경
	    
	    // 11번 문제 범인은 100부터 999까지 숫자중에 여러명이다. 
	    // 범인의 특징은 숫자의 각자릿수를 더한 값이 짝수이다.  범인의 숫자를 모두 찾으시오.
	    for(int i=100; i<=999; i++) {
	    	if((((i/10)/10)+((i/10)%10)+(i%10))%2==0) {
	    		System.out.println(i);
	    	}
	    }
	    
	    // *****12 ~ 15 중요***** 
	    // 12번 문제  0은 터널이다. 가장 긴 터널의 길이를 구하시오.
	    int k = 0;
	    int cntT = 0;
	    int sumCnt = 0;
	    int[] arr1 = {1,2,3,0,0,0,1,2,3,4,5,2,2,2,2,0,0,0,0,0,3,3};
	    for(int i=0; i<arr1.length; i++) {
//	    	System.out.println("현재번호"+arr1[i]);
	    	if(arr1[i] == 0) {
	    		cntT++;
	    				//if(arr1[i]==arr1[k] && arr1[i] == 0)에서 arr1[i] == 0만 필요함을 확인
	    	} else if(sumCnt<cntT) {
	    		sumCnt = cntT;
	    		cntT=0;
	    	} else
	    		cntT=0;
	    	
	    	k=i;
	    }
	    System.out.println(sumCnt);
	    				//System.out.println(sumCnt+1); 에서 1을 더하지 않아도 해결
	    
	    // 12번 분석
	    // 1. for문으로 배열순회. 초기값 i = 0, 조건 <배열의 길이, i++. i는 배열의 index로 본다.
	    // 2. 현재 번호: arr1[i] -> 터널인지 아닌지. arri1[i]==0 이면 터널이다.
	    //							-> 참 : 카운팅 -> 변수
	    //							-> 거짓 : 카운팅 cnt -> 초기화
	    // 3. 제일 긴 터널의 길이를 저장. cnt++아래에 판단. cnt증가할때마다 계속 비교
	    // A에서는 터널 카운팅. B에서는 최대길이 판별
	    for(int i=0;i<arr1.length;i++) {
	    	if(arr1[i]==0) {	//A
	    		cntT++;
	    	}else cntT=0;
	    	
	    	if(cntT>sumCnt) {	//B
	    		sumCnt=cntT;
	    	}
	    }
	    System.out.println(sumCnt);
	    // 위와 같은 코드로 정리할 수 있다.
	    
	    
	    // 13번 문제 숫자는 터널의 번호이다. 터널의 길이가 가장 긴 숫자와 길이를 출력하시오. 
	    int[] arr2 = {1,2,3,0,0,0,1,2,2,4,2,2,2,2,2,2,0,0,0,0,0,3,3};
	    int k1 = arr2[0]; // arr2[0];로(원래 0으로 했었음)
	    int cntT1 = 0; // 이걸 1로 해야 나중에 조정 안해도 됨.(원래 0으로 했었음)
	    int sumCnt1 = 0;
	    int maxIndex1 = 0;
//	    for(int i=0;i<arr2.length; i++) {
//	    	if(arr2[i]==arr2[k1]) {
//	    		cntT1++;
//	    	} else if(sumCnt1<cntT1) {
//	    		sumCnt1 = cntT1;
//	    		cntT1=0;
//	    		System.out.println(arr2[i]);
//	    	} else
//	    		cntT1=0;
//	    	k1=i;
//	    }
//	    System.out.println(sumCnt1+1);
	    // 13번 분석
	    // 1. for문으로 배열순회. 초기값 i = 0, 조건 <배열의 길이, i++. i는 배열의 index로 본다.
	    // 2.현재 번호: arr2[i] -> 연속된 터널인지 확인 -> 이전 터널에대한 정보 필요
	    // 3. A에서는 터널 카운팅. b에서는 최대길이 판별
	    
	    
	    for(int i=0; i<arr2.length;i++) {
	    	if(arr2[i]==k1) {					//A
	    		cntT1++;
	    		
	    	} else {
	    		cntT1=1;
	    		k1=arr2[i];
	    	}
//	    	System.out.println(i+"/"+cntT1);	
	    	if(sumCnt1<cntT1) {					//B
	    		sumCnt1 = cntT1;
	    		maxIndex1 = k1;
	    	}
	    	
	    }
	    System.out.println("터널의 길이는 "+sumCnt1);
    	System.out.println("터널의 숫자는 "+maxIndex1);
	    	    
    	
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
	    
	    String ttt1 = "aabbbcccaaaaddbbbaaaaa";
	    for(int i=0; i<ttt1.length(); i++) {
	    	char a = ttt1.charAt(i);
	    	System.out.println(a);
	    }
	    
	    // ttt는 현재 객체. 참조타입. 기능을 가지고 있다. charAt(i)이용
	    // 가장 긴 터널의 알파벳 이름과 숫자
	    // 배열에서는 value를 하나씩 가져옴
	    // 1. 문자열의 문자를 가져온다.
	    // 			-> 문자를 첫번째부터 하나씩 가져온다.
	    
	    
	    
	    
	    
	    // 15번 문제 압축하시오. 압축 하는 방법 a2b3c3a4d2b3a5
	    // String ttt ="aabbbcccaaaaddbbbaaaaa";
	    
	    
		
	}

}

package testpm;

public class test0809 {

	public static void main(String[] args) {
		// 1번 문제
		for(int i = 100; i<=999; i++) {
			if(i%2==1) {
				System.out.println(i);
			}
		}

		
		// 2번 문제
		int sumOdd = 0;
		for(int i = 1; i<=100; i++) {
			if(i%2==1) {
				sumOdd += i;
			}
		}
		System.out.println(sumOdd);
		
		
		// 3번 문제
		for(int i = 10; i>0; i--) {
			System.out.print(i+" ");
		}
		
		
		System.out.println();
		
		
		// 4번 문제
		int[] arr = {45,23,25,64,3,24,48};
		for(int i = 0; i<7; i++) {
			if((arr[i]%2)==0) {
				System.out.println(arr[i]);
			}
		}
		
		
		// 6번 문제
		for(int i = 0; i<7; i++) {
			if((arr[i]%2)==1) {
				System.out.println(i);
			}
		}
		
		
		// 7번 문제
		int sumAll=0;
		for(int i=0; i<7; i++) {
			sumAll += arr[i];
		}
		System.out.println(sumAll);
		
		
		// 8번 문제
		int cntEven=0;
		for(int i=0; i<7; i++) {
			if((arr[i])%2==0) {
				cntEven++;
			}
		}
		System.out.println(cntEven);
		
		
		// 9번 문제 다시다시다시다시다시다시다시다시다시다시
//		String test = "abcdeabce";
//	    for(int i=0; i < 9; i ++){
//		char aaa = test.charAt(i);
//		System.out.println(aaa);
//	    }
//		
//	    int cnt = 0;
//	    String a = "a";
//	    String test1 = "abcdeabce";
//	    for(int i=0; i < 9; i ++){
//		if(a=="aaa") {
//			char aaa = test1.charAt(i);
//			cnt++;
//		}
//		
//		System.out.println(cnt);
//	    }
	    //다시다시다시다시다시다시다시다시다시다시다시다시다시
	    
	    // 10번 문제
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
	    
	    
	    // 11번 문제
	    for(int i=100; i<=999; i++) {
	    	if((((i/10)/10)+((i/10)%10)+(i%10))%2==0) {
	    		System.out.println(i);
	    	}
	    }
	    
	    
	    
	    
	    // 12번 문제
	    int k = 0;
	    int cntT = 0;
	    int sumCnt = 0;
	    int[] arr1 = {1,2,3,0,0,0,1,2,3,4,5,2,2,2,2,0,0,0,0,0,3,3};
	    // 전에꺼랑 숫자가 같으면 cnt1을 하고
	    for(int i=0; i<22; i++) {
	    	if(arr1[i]==arr1[k]) {
	    		cntT++;
	    	} else if(sumCnt<cntT) {
	    		sumCnt = cntT;
	    		cntT=0;
	    	}	    		
	    	
	    	k=i;
	    }
	    System.out.println(sumCnt+1);
	    
	    
	    // 13번 문제
	    
		
		
	}

}

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
		
		
		 // 9번 문제
	    int cntA = 0;
		String test = "abcdeabce";
	    for(int i=0; i < 9; i ++){
		char aaa = test.charAt(i);
		if(aaa=='a') {
			cntA++;
		}
		
	    }
	    System.out.println(cntA);

	    
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
	    
	    
	    // 13번 문제
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
		
	    	    
	    // 14번 문제
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
	    
	    // 15번 문제
	    
		
	}

}

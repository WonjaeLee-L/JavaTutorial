package testpm;

public class test0808 {

	public static void main(String[] args) {
	
		/*
		 * 	1번 문제
		 *  0
		 *  1
		 *  2
		 *  3
		 *  4
		 * 
		 * 
		 *  2번 문제
		 *  5
		 *  4
		 *  3
		 *  2
		 *  1
		 *  0
		 *  
		 *  
		 *  3번 문제
		 *  100미만의 짝수가 출력
		 *  
		 *  
		 *  4번 문제
		 *  0+1+1+1+1+1이 되어 5가 출력
		 */
		
		
		// 1. 1부터 100까지 숫자 중 홀수는 더하고 짝수는 뺀 결과값 1개를 출력하시오.
		int result = 0;
		for(int i = 1; i <= 100; i++) {
			if(i%2==0) {
				result -= i;
			} else 
				result += i;
		}
		System.out.println(result);
		
		
		// 2. 1부터 100까지 숫자 중 홀수는 홀수끼리 더한 값을 짝수는 짝수끼리 더한 값을 각각출력하시오.
		int odd = 0;
		int even = 0;
		for(int i = 1; i <= 100; i++) {
			if(i%2==0) {
				even += i;
			} else
				odd += i;
		}
		System.out.println("짝수끼리 더한 값은 "+even+"이고, 홀수끼리 더한 값은 "+odd+"이다.");
		
		
		// 3. 1부터 100까지 숫자 중 홀수는 모두 몇개인가?
		int cntOdd = 0;
		for(int i = 1; i <=100; i++) {
			if(i%2==1) {
				cntOdd++;
			}
		}
		System.out.println("홀수는 "+cntOdd+"개 이다.");
		
		
		// 4. 100부터 999까지의 숫자의 모든 숫자의 합을 구하시오.
	    // 453인 경우 4+5+3로 합한 값의 모든 총합을 구하시오.
		int sum999 = 0;
		for(int i = 100; i <= 999; i++) {
			sum999 += (i/100)+((i%100)/10)+((i%100)%10);
		}
		System.out.println(sum999);
		
		
		// 5. 범인은 100부터 999까지 숫자에 숨어 있다.
		// 범인은 십의 자리에 있고. 3의 배수이다. 범인 숫자를 모두 출력하시오.
		for(int i = 100; i <= 999; i++) {
			if(((i/10)%10)%3==0 && ((i/10)%10)!=0) {
				System.out.println(i);
			}
		}
	
	
		// 6. 범인을 찾아라. 0부터 100까지 숫자중 하나이다. 0부터 1 2 3 순서대로 합한 값을
		// 누적한다. 합한 값이 44를 넘어가게 하는 숫자 한개가 범인이다.
		// 범인 숫자 한 개를 출력하시오.. (단, break사용하지 않는다)
		int sumCri = 0;
		int cntCri = 0;
		for(int i = 0; i <= 100; i++) {
			if(sumCri<=44) {
				sumCri += i;
				cntCri++;
			}
		}
		System.out.println(cntCri-1);
		
		
		/*	7.
		 *	   System.out.println("abc");  
			   System.out.println("def"); 
			   // 위코드를 실행하면
			   abc
			   def
			
			   System.out.print("abc");    // ln이 빠지면 i변수 값을 출력 후 줄바꿈을 하지 않는 코드이다. 
			   System.out.print("def"); 
			   // 위코드를 실행하면
			    abcdef
			
			   문제>> 다음과 같이 출력하게 하시오.
			   1+2+3+4+5+6+7+8+9+10=결과값 
		 */
			int sum10 = 0;
			for(int i = 1; i <= 10; i++) {
				if(i!=10) {
					System.out.print(i+"+");
				} else
					System.out.print(i+"=");
				sum10 += i;
			}
				System.out.println(sum10);
				
				 
		 /*	 	8번 문제
	 	 *   피보나치 수열 1
			  i는 피보나치 수의 갯수이다. 총 8개의 피보나치 수를 구하고 합한 값을 출력하시오. 
			  i는 1 2 3 4 5 6 7 까지 증가, i가 4일 때 피보나치 수는 3이 된다.
			
			   int fib=1;  // 파보나치 수   1 1 2 3 5 8 13
			   for(int i=1;i < 8; i++){  // 피보나치 수의 개수 i  
			   
			   }
			  결과 : 1 + 1 + 2 +3 + 5 + 8 + 13 = 합한 값
		 */
			int fib=1;
			int sumfib=0;
			int d = 0;
			int e = 0;
			for(int i=1; i<8; i++) {
				
				e = d;
				sumfib += fib;
				d = fib;
				fib = d + e;
				
			}
			System.out.println(sumfib);
			
		
			/* 9번 문제(문제 이해 x 다시 수정)
			 * 피보나치 수열 2
			  i를 피보나치 수로 정의한다.
			  i의 변화는 1 1 2 3 5 8 13 이 된다.
			  for(int i=1;i < 20; ){  
			   
			   }
			 */
		
			
//			for(int i=1; i<20; ) {
//				
//			}
			
			
			
			/* 10번 문제
			 * 987654321이라는 숫자가 있다.. 변수2개와 for 문 한개로
			   모든 자릿수를 더한 합을 구하시오.. 9+8+7+6+5+4+3+2+1 = 합
			   합만 출력하면 됩니다.
			   main 메서드 안의 라인수를 최소화 하여서 작성하세요. 최소 라인수로 작성하라는 의미입니다. 
			
			 	a ++
				a = a+1
			 */
			int sumN = 0;
			int number = 987654321;
			for(int i = 10;i<=1000000000;i*=10) {
				sumN += (number%i)/(i/10);
			}
			System.out.println(sumN);
			

	}

}

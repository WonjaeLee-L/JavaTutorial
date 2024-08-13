package testpm;

public class test0812_6 {

	public static void main(String[] args) {
		// 6번 문제
		// String a ="23-56+45*2-56";
		// 수식을 계산하는 프로그램을 작성하세요.
		// 수식 계산 규칙은 연산자 우선순위 없이 앞에서 부터 차례대로 계산한다.
		// 지금까지 공부한 내용으로 해결하시고, 형변환만 검색이 가능합니다. 
		// 메서드는 최대한 적게 사용하세요
				String a ="23-56+45*2-56";
				
				
				int s = Integer.valueOf(a.charAt(0))-48;
				int s1 = Integer.valueOf(a.charAt(1))-48;
				 
				int s3 = Integer.valueOf(a.charAt(3))-48;
				int s4 = Integer.valueOf(a.charAt(4))-48;
				
				int s6 = Integer.valueOf(a.charAt(6))-48;
				int s7 = Integer.valueOf(a.charAt(7))-48;
				
				int s9 = Integer.valueOf(a.charAt(9))-48;
				
				int s11 = Integer.valueOf(a.charAt(11))-48;
				int s12 = Integer.valueOf(a.charAt(12))-48;
				
				
				
				System.out.println(((s*10+s1)-(s3*10+s4)+(s6*10+s7))*s9-(s11*10+s12));
				
				
				
				
				
				
				
//				for(int i = 0; i < a.length(); i++) {
//				int s1 = Integer.valueOf(a.charAt(i));
//					
//				System.out.println(s1);
//			}
			
			
	
	
	// 23 ETB, 56 8, 45 -, 2 STX, 56 8
	
//			System.out.println((int)t);
//			System.out.println(a.concat("="));
//			System.out.print((a.charAt(0)*10+a.charAt(1))-(a.charAt(2)*10+a.charAt(3))*a.charAt(4)-(a.charAt(5)*10+a.charAt(6)));
//			System.out.println("");
				}
				
	}

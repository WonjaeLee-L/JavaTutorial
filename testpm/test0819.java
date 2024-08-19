package testpm;

public class test0819 {

	public static void main(String[] args) {
		// 1.
		// 1*1=1  1*2=2   1*3=3
		// 2*1=2  2*2=4   2*3=6
		// 3*1=3  3*2=6   3*3=9
		// 4*1=4  4*2=8   4*3=12
		System.out.println("-----1번-----");
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
				
		System.out.println("-----2번-----");
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
		
		
		System.out.println("-----3번-----");
		
		for(int i=0; i<7; i++) {
			for(int j=3; j>=i; j++) {
				System.out.print("0");
			}
			System.out.println("*");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

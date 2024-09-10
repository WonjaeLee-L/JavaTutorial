package testpm;

import java.util.Random;
import java.util.Scanner;

public class test0910_9 {

	public static void main(String[] args) {
		// 1 1 0 2
		// 3 2 1 2
		// 0 0 3 2
		// 4 4 4 4
		// 2 4 3 1
		// 2 4 1 3
		int[][] a = {{1,1,0,2},
					 {3,2,1,2},
					 {0,0,3,2},
					 {4,4,4,4},
					 {2,4,3,1},
					 {2,4,1,3}};
		// 키보드로 좌표를 입력하면, 좌표 기준으로 왼쪽 또는 오른쪽으로 3개 이상의 연속된 숫자가 있으면 제거 가능
		// 제거 가능이면 제거를 하고, 위에 있는 숫자가 아래로 내려온다.
		// 맨위에 배열은 랜덤수로 채워진다.
		
		Random r = new Random();
		Scanner in = new Scanner(System.in);
		
		System.out.println("좌표를 입력하세요, 숫자+엔터 두 번");
		
		int co1 = in.nextInt();
		in.nextLine();
		int co2 = in.nextInt();
		in.nextLine(); 
		
		for (int i=0; i<a.length; i++) {
			
			for (int j=0; j<a[0].length; j++) {
				if(co1==i && co2==j) {
					// j = 0
					if(j==0) {

						if(a[i][j]==a[i][j+1] && a[i][j]==a[i][j+2]) {
							
							if(a[i][j]==a[i][j+3]) {
								// 4개 중복
								// 위에 있는 숫자가 아래로 내려온다
								for(int k=0; k<i; k++) {
									a[i-k][j]=a[i-k-1][j];
									a[i-k][j+1]=a[i-k-1][j+1];
									a[i-k][j+2]=a[i-k-1][j+2];
									a[i-k][j+3]=a[i-k-1][j+3];
									}
								// 맨 위 좌표 랜덤 수 배정
								a[0][j]= r.nextInt(10);
								a[0][j+1]= r.nextInt(10);
								a[0][j+2]= r.nextInt(10);
								a[0][j+3]= r.nextInt(10);
								}else {
								//3개 중복
								// 위에 있는 숫자가 아래로 내려온다
								for(int k=0; k<i; k++) {
									a[i-k][j]=a[i-k-1][j];
									a[i-k][j+1]=a[i-k-1][j+1];
									a[i-k][j+2]=a[i-k-1][j+2];
									}
								// 맨 위 좌표 랜덤 수 배정
								a[0][j]= r.nextInt(10);
								a[0][j+1]= r.nextInt(10);
								a[0][j+2]= r.nextInt(10);								
								}
						
						}	
						
						}
					
					// j = 1
					
					// j = 2
					
					// j = 3
					
					
					}
					
					
					
					
					
				}
			
			
			
			}
		
		//중간 test (3,0) 좌표 일 때
		System.out.println(a[0][0]+","+a[0][1]+","+a[0][2]+","+a[0][3]+"<-1102가 랜덤으로...."+a[3][0]+","+a[3][1]+","+a[3][2]+","+a[3][3]+"...<-4444가 0032로");
		System.out.println(a[2][0]+","+a[2][1]+","+a[2][2]+","+a[2][3]+"<-0032가 3212로...."+a[1][0]+","+a[1][1]+","+a[1][2]+","+a[1][3]+"...<-3212가 1102로");
		
		}

	}


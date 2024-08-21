package testpm;

import java.util.Random;
import java.util.Scanner;

public class _00_타자게임 {

	public static void main(String[] args) {
		
		String[] arrLevel1 = {"ㅂ","ㅈ","ㄷ","ㄱ","ㅅ","ㅁ","ㄴ","ㅇ","ㄹ","ㅎ","ㅋ","ㅌ","ㅊ","ㅍ","ㅛ","ㅕ","ㅑ","ㅐ","ㅔ","ㅗ","ㅓ","ㅏ","ㅣ","ㅠ","ㅜ","ㅡ"};
		String[] arrLevel2 = {"가","분","미","돌","차","랑","빈","날","풀","비","자","은","응","네","실","궁","짐","달","솔","숲","체","팀","팔","꿈","물","영"};
		String[][] level = {arrLevel1, arrLevel2};
		Random r = new Random();
		Scanner in = new Scanner(System.in);
		int score=0;
		double avg=0;
		int cnt=0;
		
		while (true) {
			System.out.println("게임을 시작하려면 1/ 종료하려면 0을 누르세요");
			String word = in.nextLine();
			if(word.equals("1")) {
				System.out.println("게임을 시작합니다.");

				for(int i=0; i<16; i++) {
					int level1Word = r.nextInt(26);
					System.out.println(level[0][level1Word]);
					String level1Typing = in.nextLine();
					
					if(level[0][level1Word].equals(level1Typing)) {
						score += 10;
						cnt++;
						avg += 100;
						System.out.println("정답입니다. +10점!"+"점수는 "+score+"입니다.");
						if(avg!=0) {
							System.out.println("정확도는 "+(avg/cnt)+"% 입니다.");
						}else {
							System.out.println("정확도는 50% 입니다.");
						}
						
					}else {
						score -= 10;
						cnt++;
						avg -= 100;
						System.out.println("오답입니다.. -10점"+"점수는 "+score+"입니다.");
						if(avg>0) {
							System.out.println("정확도는 "+(avg/cnt)+"% 입니다.");
						}else if(avg<=0) {
							System.out.println("정확도는 0% 입니다.");
						}
					}
					
					if(score<100 && cnt>=10) {
						System.out.println("실력이 부족합니다. 다시 시작하시겠습니까?");
						i=0;
						score=0;
						avg=0;
						cnt=0;
					}else if(score==100) {
						System.out.println("점수가 100점 입니다. 다음 게임으로 넘어갑니다.");
						break;
					}
					
					
					
				}//for종료
				
				if(score==100) {
					score=0;
					avg=0;
					cnt=0;
					for(int j=0; j<16; j++) {
						int level2Word = r.nextInt(26);
						System.out.println(level[1][level2Word]);
						String level2Typing = in.nextLine();
						
						if(level[1][level2Word].equals(level2Typing)) {
							score += 10;
							cnt++;
							avg += 100;
							System.out.println("정답입니다. +10점!"+"점수는 "+score+"입니다.");
							if(avg!=0) {
								System.out.println("정확도는 "+(avg/cnt)+"% 입니다.");
							}else {
								System.out.println("정확도는 50% 입니다.");
							}
							
						}else {
							score -= 10;
							cnt++;
							avg -= 100;
							System.out.println("오답입니다.. -10점"+"점수는 "+score+"입니다.");
							if(avg>0) {
								System.out.println("정확도는 "+(avg/cnt)+"% 입니다.");
							}else if(avg<=0) {
								System.out.println("정확도는 0% 입니다.");
							}
						}
						
						if(score<=30 && cnt>=10) {
							System.out.println("실력이 부족합니다. 1단계로 돌아갑니다.");
							break;
						}else if(score<100 && cnt>=10) {
							System.out.println("현재 게임을 다시 시작합니다.");
							j=0;
							score=0;
							avg=0;
							cnt=0;
						}else if(score==100) {
							System.out.println("점수가 100점 입니다. 다음 게임으로 넘어갑니다.");
							break;
						}
					}
						
				}
				
		
		
				
				
				
				
				
				
				
				
		
			}else if(word.equals("0")) {
				System.out.println("종료");
				break;
			}
			
		}
		
		
	}
}

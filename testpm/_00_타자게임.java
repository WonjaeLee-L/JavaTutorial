package testpm;

import java.util.Random;
import java.util.Scanner;

public class _00_타자게임 {

	public static void main(String[] args) {
		
		String[] arrLevel1 = {"ㅂ","ㅈ","ㄷ","ㄱ","ㅅ","ㅁ","ㄴ","ㅇ","ㄹ","ㅎ","ㅋ","ㅌ","ㅊ","ㅍ","ㅛ","ㅕ","ㅑ","ㅐ","ㅔ","ㅗ","ㅓ","ㅏ","ㅣ","ㅠ","ㅜ","ㅡ"};
		String[] arrLevel2 = {"가","분","미","돌","차","랑","빈","날","풀","비","자","은","응","네","실","궁","짐","달","솔","숲","체","팀","팔","꿈","물","영"};
		String[] arrLevel3 = {"구름","바람","하늘","도미노","탕수육","가자미","소고기","라일락","프리지아","라넌큘러스","튤립","전기차","미용실","축구공","연필","하품"};
		String[] arrLevel4 = {"여름비는 잠비고, 가을비는 떡비","호랑이 그리려다 고양이 그린다","호랑이도 제 말하면 온다","단단한 땅에 물이 괸다","뚝배기보다 장맛이 좋다","다 된 죽에 코 빠뜨린다","망건 쓰자 파장","아닌 밤중에 홍두깨","물이 깊어야 고기가 모인다","개구리 올챙이 적 생각 못 한다","가랑잎이 솔잎더러 바스락거린다고 한다","첫술에 배부를까","다람쥐 쳇바퀴 돌듯","벼룩도 낯짝이 있다","소경이 개천 나무란다","우물 안 개구리","닭 소 보듯, 소 닭 보듯"};
		String[] arrLevel5 = {"astonish","lift","punish","angle","dress","fire","fowl","volleyball","shrill","squealing","frighten","wnader","learning","squirrel","gainful","crack","reflective","stream","rotten","icicle","bring","imperfect","cower"};
		String[] arrLevel6 = {"When you have faults, do not fear to abandon them","ge is no guarantee of maturity","Youth isn’t always all it’s touted to be","Life is either a daring adventure or nothing at all","This too shall pass","The die is cast","When in doubt, choose change","Life is unfair, get used to it.","Being happy never goes out of style","Despite the forecast, live like it’s spring","Turn your wounds into wisdom","Change the world by being yourself","Great minds have purposes, others have wishes","Be gentle first with yourself","All we have is now","Believe in yourself"};
		String[][] level = {arrLevel1, arrLevel2, arrLevel3, arrLevel4, arrLevel5, arrLevel6};
		/* 
		 * 이차배열 활용하여 단순화하는 방법 ★★★
		 * level[i][arrLevel1[r.nextInt(arrLevel1.length)]] 
		 * 
		 */
		
		Random r = new Random();
		Scanner in = new Scanner(System.in);
		int score=0;
		double avg=0;
		int cnt=0;
		int location=1;
		int k=0;
		String k1="";
		int j=0;
		String j1="";
		// 숙련자일 경우
		int beforeScore = 0;
		
		while (true) {
			System.out.println("★타자 게임★");
			System.out.println("시작하시겠습니까?(시작/종료)");
			String word = in.nextLine();
			
			if(word.equals("시작")) {
				System.out.println("게임을 시작합니다.");

				for(int i=0; i<16; i++) {
					// location을 이용하여 게임 level 이동
					if(location==1) {
						int level1Word = r.nextInt(26);
						System.out.println(level[0][level1Word]);
						String level1Typing = in.nextLine();
						k=level1Word;
						k1=level1Typing;
					}else if(location==2) {
						int level2Word = r.nextInt(26);
						System.out.println(level[1][level2Word]);
						String level2Typing = in.nextLine();
						j=level2Word;
						j1=level2Typing;
					}else {						// location 추가
						break;
					}
					
					
					if((level[0][k].equals(k1)) || (level[1][j].equals(j1))) {
						score += 10;
						cnt++;
						avg += 100;
						System.out.println("정답입니다. +20점!"+"점수는 "+score+"입니다.");
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
						beforeScore = 0;
						break;
					}else if(score<100 && cnt>=10) {
						System.out.println("실력이 부족합니다. 이 게임을 다시 시작합니다.");
						i = -1;
						score = 0;
						avg = 0;
						cnt = 0;
						beforeScore = 0;
						location = 1;
					}else if(beforeScore==100 && score==100) {
						
					}
					
					
					
					else if(score==100) {
						System.out.println("점수가 100점 입니다. 다음 게임으로 넘어갑니다.");
						score = 0;
						avg = 0;
						cnt = 0;
						beforeScore = 100;
						location++;
						break;
					}
					
					
					
				}				
		
		
				
				
				
				
				
				
				
				
		
			}else if(word.equals("종료")) {
				System.out.println("종료");
				break;
			}
			
		}
		
		
	}
}

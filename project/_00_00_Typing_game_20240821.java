package project;

import java.util.Random;
import java.util.Scanner;

public class _00_00_Typing_game_20240821 {
// 2024/08/21

	public static void main(String[] args) {
		// 배열에 저장된 문자를 랜덤으로 가져오기 위해 사용
		Random r = new Random();
		// 키보드 입력을 위해 사용
		Scanner in = new Scanner(System.in);

		// Level별 단어를 array에 저장
		String[] arrLevel1 = { "ㅂ", "ㅈ", "ㄷ", "ㄱ", "ㅅ", "ㅁ", "ㄴ", "ㅇ", "ㄹ", "ㅎ", "ㅋ", "ㅌ", "ㅊ", "ㅍ", "ㅛ", "ㅕ", "ㅑ", "ㅐ",
				"ㅔ", "ㅗ", "ㅓ", "ㅏ", "ㅣ", "ㅠ", "ㅜ", "ㅡ" };
		String[] arrLevel2 = { "가", "분", "미", "돌", "차", "랑", "빈", "날", "풀", "비", "자", "은", "응", "네", "실", "궁", "짐", "달",
				"솔", "숲", "체", "팀", "팔", "꿈", "물", "영" };
		String[] arrLevel3 = { "구름", "바람", "하늘", "도미노", "탕수육", "가자미", "소고기", "라일락", "프리지아", "라넌큘러스", "튤립", "전기차", "미용실",
				"축구공", "연필", "하품" };
		String[] arrLevel4 = { "여름비는 잠비고, 가을비는 떡비", "호랑이 그리려다 고양이 그린다", "호랑이도 제 말하면 온다", "단단한 땅에 물이 괸다", "뚝배기보다 장맛이 좋다",
				"다 된 죽에 코 빠뜨린다", "망건 쓰자 파장", "아닌 밤중에 홍두깨", "물이 깊어야 고기가 모인다", "개구리 올챙이 적 생각 못 한다",
				"가랑잎이 솔잎더러 바스락거린다고 한다", "첫술에 배부를까", "다람쥐 쳇바퀴 돌듯", "벼룩도 낯짝이 있다", "소경이 개천 나무란다", "우물 안 개구리",
				"닭 소 보듯, 소 닭 보듯" };
		String[] arrLevel5 = { "astonish", "lift", "punish", "angle", "dress", "fire", "fowl", "volleyball", "shrill",
				"squealing", "frighten", "wnader", "learning", "squirrel", "gainful", "crack", "reflective", "stream",
				"rotten", "icicle", "bring", "imperfect", "cower" };
		String[] arrLevel6 = { "When you have faults, do not fear to abandon them", "ge is no guarantee of maturity",
				"Life is either a daring adventure or nothing at all", "This too shall pass", "The die is cast",
				"When in doubt, choose change", "Life is unfair, get used to it.",
				"Being happy never goes out of style", "Turn your wounds into wisdom",
				"Change the world by being yourself", "Great minds have purposes, others have wishes",
				"Be gentle first with yourself", "All we have is now", "Believe in yourself" };
		String[][] level = { arrLevel1, arrLevel2, arrLevel3, arrLevel4, arrLevel5, arrLevel6 };

		/*
		 * 이차배열 활용하여 단순화하는 방법 ★★★ level[i][arrLevel1[r.nextInt(arrLevel1.length)]]
		 * 
		 */

		int score = 0;
		double avg = 0;
		int cnt = 0;

		int w1 = 0;
		int w2 = 0;
		int w3 = 0;
		int w4 = 0;
		int w5 = 0;
		int w6 = 0;
		String t1 = "";
		String t2 = "";
		String t3 = "";
		String t4 = "";
		String t5 = "";
		String t6 = "";

		// 레벨 이동을 위한 변수.
		int location = 0;
		// 숙련자일 경우 최고 난이도 이동을 위한 변수
		int beforeScore = 0;

		while (true) {
			System.out.println("★타자 게임★");
			System.out.println("시작하시겠습니까?(시작/종료)");
			String word = in.nextLine();

			// 초기 location은 0, 마지막 난이도 클리어 후 location을 0으로 선언
			// 게임 중 돌아올 경우 난이도 선택 없이 진행(점수 조건에 따라 자동으로 레벨 변경)
			if (word.equals("시작") && (location != 0)) {
				System.out.println("게임을 시작합니다.");

				// 처음 시작하는 게임은 난이도 선택 가능
			} else if (word.equals("시작")) {
				System.out.println("게임을 시작합니다.");
				System.out.println("레벨을 선택하세요");
				System.out.println("▶(1~6)숫자 입력◀");
				int inputLevel = in.nextInt();
				in.nextLine();
				if (inputLevel == 1) {
					location = 1;
				} else if (inputLevel == 2) {
					location = 2;
				} else if (inputLevel == 3) {
					location = 3;
				} else if (inputLevel == 4) {
					location = 4;
				} else if (inputLevel == 5) {
					location = 5;
				} else if (inputLevel == 6) {
					location = 6;
				} else {
					System.out.println("잘못된 입력입니다. 다시 입력하세요!");
					continue;
				}
			} else if (word.equals("종료")) {
				System.out.println("게임을 종료합니다.");
				break;
			} else {
				System.out.println("잘못된 입력입니다. 다시 입력하세요!");
				continue;
			}

			for (int i = 0; i < 15; i++) {
				// location을 이용하여 게임 level 이동
				if (location == 1) {
					int level1Word = r.nextInt(arrLevel1.length);
					System.out.println(level[0][level1Word]);
					String level1Typing = in.nextLine();
					w1 = level1Word;
					t1 = level1Typing;
				} else if (location == 2) {
					int level2Word = r.nextInt(arrLevel2.length);
					System.out.println(level[1][level2Word]);
					String level2Typing = in.nextLine();
					w2 = level2Word;
					t2 = level2Typing;
				} else if (location == 3) {
					int level3Word = r.nextInt(arrLevel3.length);
					System.out.println(level[2][level3Word]);
					String level3Typing = in.nextLine();
					w3 = level3Word;
					t3 = level3Typing;
				} else if (location == 4) {
					int level4Word = r.nextInt(arrLevel4.length);
					System.out.println(level[3][level4Word]);
					String level4Typing = in.nextLine();
					w4 = level4Word;
					t4 = level4Typing;
				} else if (location == 5) {
					int level5Word = r.nextInt(arrLevel5.length);
					System.out.println(level[4][level5Word]);
					String level5Typing = in.nextLine();
					w5 = level5Word;
					t5 = level5Typing;
				} else if (location == 6) {
					int level6Word = r.nextInt(arrLevel6.length);
					System.out.println(level[5][level6Word]);
					String level6Typing = in.nextLine();
					w6 = level6Word;
					t6 = level6Typing;
				}
				if ((level[0][w1].equals(t1)) || (level[1][w2].equals(t2)) || (level[2][w3].equals(t3))
						|| (level[3][w4].equals(t4)) || (level[4][w5].equals(t5)) || (level[5][w6].equals(t6))) {
					score += 20;
					cnt++;
					avg += 100;
					System.out.println("정답입니다. +20점!" + "점수는 " + score + "입니다.");
					// 이전 레벨에서 저장된 정답을 모두 초기화
					t1 = "";
					t2 = "";
					t3 = "";
					t4 = "";
					t5 = "";
					t6 = "";
				} else {
					score -= 10;
					cnt++;
					avg -= 100;
					System.out.println("오답입니다.. -10점" + "점수는 " + score + "입니다.");
				}
				if (score < 0 && cnt >= 10) {
					System.out.println("실력이 처참합니다. 게임을 종료합니다.");
					score = 0;
					avg = 0;
					cnt = 0;
					beforeScore = 0;
					location = 0;
					break;
				}
				if (score <= 30 && cnt >= 10) {
					System.out.println("정확도는 " + (avg / cnt) + "% 입니다.");
					System.out.println("실력이 부족합니다. 1단계로 돌아갑니다.");
					beforeScore = 0;
					score = 0;
					avg = 0;
					cnt = 0;
					beforeScore = 0;
					location = 1;
					break;
				} else if (score < 100 && cnt >= 10) {
					System.out.println("정확도는 " + (avg / cnt) + "% 입니다.");
					System.out.println("100점을 달성하지 못하여 현재 난이도를 다시 시작합니다.");
					i = -1;
					score = 0;
					avg = 0;
					cnt = 0;
					beforeScore = 0;
				} else if (location == 6 && score >= 100 && (avg / cnt) == 100) {
					System.out.println("최고 레벨을 클리어 하였습니다. 게임을 종료합니다.");
					// 최고 난이도 클리어시 처음으로 돌아가서 난이도 선택 가능
					score = 0;
					avg = 0;
					cnt = 0;
					beforeScore = 0;
					location = 0;
					break;
				} else if (beforeScore == 100 && score >= 100 && (avg / cnt) == 100) {
					// 이전 점수 100점 달성, 이번 정확도 100%면 최고 난이도로 이동
					System.out.println("정확도는 " + (avg / cnt) + "% 입니다.");
					System.out.println("숙련자로 판단됩니다. 최고 난이도로 이동합니다.");
					score = 0;
					avg = 0;
					cnt = 0;
					beforeScore = 0;
					location = 6;
					break;
				} else if (score >= 100) {
					System.out.println("정확도는 " + (avg / cnt) + "% 입니다.");
					System.out.println("점수가 100점 입니다. 다음 게임으로 넘어갑니다.");
					System.out.println("정확도 100%를 노려보세요!");
					score = 0;
					avg = 0;
					cnt = 0;
					beforeScore = 100;
					location++;
					break;
				}

			}

		}

		// 입력 설정 해제
		in.close();
	}
}

package project;

import java.util.Random;
import java.util.Scanner;

public class _00_02_TeamTypingGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();

		String[] level1 = { "ㄱ", "ㄴ", "ㄷ", "ㄹ", "ㅁ", "ㅂ", "ㅅ", "ㅇ", "ㅈ", "ㅊ", "ㅋ", "ㅌ", "ㅍ", "ㅎ", "ㅏ", "ㅑ", "ㅓ", "ㅕ",
				"ㅗ", "ㅛ", "ㅜ", "ㅠ", "ㅡ", "ㅣ" };
		String[] level2 = { "가", "나", "다", "라", "마", "바", "사", "아", "자", "차", "카", "타", "파", "하", "몸", "삶", "꿈", "물",
				"불", "피", "잠", "새", "옷", "집", "흙", "글", "길", "눈", "점", "방", "빛", "코", "간", "잎", "새", "강", "양", "말", "산",
				"귀", "신", "빵" };
		String[] level3 = { "배우", "주스", "폐지", "지하", "사수", "기체", "죠스", "야구", "코드", "이찬", "자바", "자료", "마치", "하이", "동상",
				"게임", "점수", "원본", "시작", "코딩", "레벨", "문장", "이중", "차원", "정확", "수원", "휴먼", "교육", "센터", "객체" };
		String[] level4 = { "텀블러", "색종이", "컴퓨터", "선생님", "조건문", "반복문", "모니터", "마우스", "키보드", "비상구", "책가방", "구글링", "닉네임",
				"지우개", "깃허브", "검색기", "이미지", "동영상", "더보기", "박진우", "이원재", "죠스바", "수박바", "아이스", "출입문", "한글날", "유튜브", "자료형",
				"형광등", "화이트", "그레이", "아파트", "상록수", "침엽수", "수원시", "인계동" };
		String[] level5 = { "고진감래", "구사일생", "과유불급", "괄목상대", "근묵자흑", "다다익선", "대동소이", "동병상련", "문전성시", "백발백중", "사면초가",
				"살신성인", "설상가상", "아전인수", "역지사지", "우이독경", "자업자득", "죽마고우", "청출어람", "촌철살인", "타산지석", "토사구팽", "파죽지세", "풍전등화",
				"함흥차사", "동상이몽", "일박이이" };

		String[][] level = { level1, level2, level3, level4, level5 };

		while (true) {
			int levelCount = 0;
			int saveJumsu = 0;
			int jumsu = 0;
			int totalJumsu = 0;
			boolean check = false;
			System.out.print("▶ 선택해주세요. [ 1 : 시작 / 0 : 종료 ] ");
			String startEnd = scan.nextLine();

			if (startEnd.equals("1")) {
				while (true) {
					System.out.print("\n▶ 레벨을 선택해주세요 [ 1~5 : 난이도 / 0 : 처음 화면으로 ] ");
					String selectLevel = scan.nextLine();
					if (selectLevel.equals("1")) {
						levelCount = 0;
					} else if (selectLevel.equals("2")) {
						levelCount = 1;
					} else if (selectLevel.equals("3")) {
						levelCount = 2;
					} else if (selectLevel.equals("4")) {
						levelCount = 3;
					} else if (selectLevel.equals("5")) {
						levelCount = 4;
					} else if (selectLevel.equals("0")) {
						System.out.println("처음 화면으로 돌아갑니다.");
						levelCount = level.length;
					} else {
						System.out.println("다시 입력해주세요");
						continue;
					}
					break;
				}
				System.out.println("");
				for (int i = levelCount; i < level.length; i++) {
					if (jumsu != 0) {
						jumsu = 0;
						break;
					}
					float avgCount = 0;
					for (int j = 1; j <= 15; j++) {
						System.out.println("▶ " + (i + 1) + "단계 (" + j + "/15)" + " ◀");
						String levelText = level[i][ran.nextInt(level[i].length)];
						System.out.println("단어 : " + levelText);
						System.out.print("입력 : ");
						String text = scan.nextLine();

						if (text.equals(levelText)) {
							avgCount++;
							jumsu += 20;
							System.out.println("\n★ 정답입니다(점수+20)");
						} else {
							jumsu -= 10;
							System.out.println("\n◆ 틀렸습니다(점수-10)");
						}
						System.out.printf("☆ 현재 점수 : " + jumsu + " / 정확도 : " + "%.1f" + "％\n\n",
								((avgCount / j) * 100));

						while (j == 15) {
							if (jumsu <= 30) {
								System.out.println("◇ " + (i + 1) + "단계 실패..");
								System.out.printf("☆ 총 점수 : " + jumsu + " / 정확도 : " + "%.1f" + "％\n\n",
										((avgCount / j) * 100));
								System.out.print("\n▶ 선택해주세요. [ 1 : 1단계부터 도전 / 2 : 처음 화면으로 ] ");
								String select = scan.nextLine();
								if (select.equals("1")) {
									System.out.println("1단계부터 다시 도전합니다. \n");
									jumsu = 0;
									i = -1;
								} else if (select.equals("2")) {
									System.out.println("처음 화면으로 돌아갑니다. \n");
									jumsu = 1;
								} else {
									System.out.println("※ 다시 선택해주세요. \n");
									continue;
								}
							}

							if (jumsu > 30 && jumsu < 100) {
								System.out.println("◆ " + (i + 1) + "단계 종료, 100점을 노려보세요!");
								System.out.printf("☆ 총 점수 : " + jumsu + " / 정확도 : " + "%.1f" + "％\n\n",
										((avgCount / j) * 100));
								System.out.print("\n▶ 선택해주세요. [ 1 : 재도전 / 2 : 처음 화면으로 ] ");
								String select = scan.nextLine();
								if (select.equals("1")) {
									System.out.println((i + 1) + "단계를 재도전합니다. \n");
									jumsu = 0;
									i -= 1;
								} else if (select.equals("2")) {
									System.out.println("처음 화면으로 돌아갑니다. \n");
								} else {
									System.out.println("※ 다시 선택해주세요. \n");
									continue;
								}
							}
							break;
						}

						if (jumsu >= 100) {
							totalJumsu += jumsu;
							if (i == level.length - 1) {
								System.out.print(
										" ██████╗ ██████╗ ███╗   ██╗ ██████╗ ██████╗  █████╗ ████████╗██╗   ██╗██╗      █████╗ ████████╗██╗ ██████╗ ███╗   ██╗██╗\r\n"
												+ "██╔════╝██╔═══██╗████╗  ██║██╔════╝ ██╔══██╗██╔══██╗╚══██╔══╝██║   ██║██║     ██╔══██╗╚══██╔══╝██║██╔═══██╗████╗  ██║██║\r\n"
												+ "██║     ██║   ██║██╔██╗ ██║██║  ███╗██████╔╝███████║   ██║   ██║   ██║██║     ███████║   ██║   ██║██║   ██║██╔██╗ ██║██║\r\n"
												+ "██║     ██║   ██║██║╚██╗██║██║   ██║██╔══██╗██╔══██║   ██║   ██║   ██║██║     ██╔══██║   ██║   ██║██║   ██║██║╚██╗██║╚═╝\r\n"
												+ "╚██████╗╚██████╔╝██║ ╚████║╚██████╔╝██║  ██║██║  ██║   ██║   ╚██████╔╝███████╗██║  ██║   ██║   ██║╚██████╔╝██║ ╚████║██╗\r\n"
												+ " ╚═════╝ ╚═════╝ ╚═╝  ╚═══╝ ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝   ╚═╝    ╚═════╝ ╚══════╝╚═╝  ╚═╝   ╚═╝   ╚═╝ ╚═════╝ ╚═╝  ╚═══╝╚═╝\r\n");
								System.out.println("★ 마지막 단계 클리어! / 누적 점수 : " + totalJumsu + " ★");
								System.out.println("▶ 마지막 단계를 클리어 하셨습니다. 어떻게 하시겠습니까?");
								while (true) {
									System.out.print("\n▶ 선택해주세요. [ 1 : 1단계부터 도전 / 2 : 재도전 / 3 : 처음 화면으로 ] ");
									String select = scan.nextLine();
									if (select.equals("1")) {
										System.out.println("1단계부터 다시 도전합니다. \n");
										jumsu = 0;
										i = -1;
										break;
									} else if (select.equals("2")) {
										System.out.println((i + 1) + "단계를 재도전합니다. \n");
										jumsu = 0;
										i -= 1;
										break;
									} else if (select.equals("3")) {
										System.out.println("처음 화면으로 돌아갑니다. \n");
										break;
									} else {
										System.out.println("※ 다시 선택해주세요.");
									}
								}
								break;
							}
							System.out.println("★ " + (i + 1) + "단계 클리어! ★");
							System.out.printf("☆ 총 점수 : " + jumsu + " / 정확도 : " + "%.1f" + "％\n",
									((avgCount / j) * 100));
							System.out.println("☆ 누적 점수 : " + totalJumsu);
							while (true) {
								System.out.print("\n▶ 선택해주세요. [ 1 : 1단계부터 도전 / 2 : 재도전 / 3 : 다음 단계 / 4 : 처음 화면으로 ");
								if (saveJumsu >= 100 && (avgCount / j * 100) == 100) {
									System.out.print("/ 5 : 최고 단계로 ] ");
									check = true;
								} else {
									System.out.print("] ");
								}
								String select = scan.nextLine();
								if (select.equals("1")) {
									System.out.println("1단계부터 다시 도전합니다. \n");
									totalJumsu = 0;
									saveJumsu = 0;
									jumsu = 0;
									i = -1;
									break;
								} else if (select.equals("2")) {
									System.out.println((i + 1) + "단계를 재도전합니다. \n");
									totalJumsu -= jumsu;
									jumsu = 0;
									i -= 1;
									break;
								} else if (select.equals("3")) {
									System.out.println("다음 단계로 넘어갑니다. \n");
									saveJumsu = jumsu;
									jumsu = 0;
									break;
								} else if (select.equals("4")) {
									System.out.println("처음 화면으로 돌아갑니다. \n");
									break;
								} else if (select.equals("5") && check == true) {
									jumsu = 0;
									i = 3;
									break;
								} else {
									System.out.println("※ 다시 선택해주세요.");
								}
							}
							break;
						}
					}
				}
			} else if (startEnd.equals("0")) {
				System.out.println("게임을 종료했습니다.");
				break;
			} else {
				System.out.println("※ 다시 선택해주세요. \n");
			}
		}
		scan.close();
	}

}
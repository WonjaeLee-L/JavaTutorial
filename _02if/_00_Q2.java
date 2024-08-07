package _02if;

public class _00_Q2 {

	public static void main(String[] args) {
		/*
		 *  수강관리 프로젝트를 진행한다.
			학생의 정보는 이름 학번 나이 성적이다.
			나이가 18세 미만은 수강신청을 할 수 없다.
			성적이 60점 이상이면서 70점 미만인 학생은 수강 신청을 할 수 있지만,
			이름 뒤에 별표를 추가한다.
			학생의 성적을 기준으로
			90점 이상이면 a
			80점 이상이면 b
			70점 이상이면 c
			60점 이상이면 d
			60점 미만이면 f라고 출력한다.
			
		 */

		String name = "학생";
		int age = 17;
		int score = 65;
		
		if(age >= 18) {
			if(score >= 90) {
				System.out.println("성적은 a, "  + "나이는 " + age + ", 점수는 " + score + ", 이름은 " + name);
			} else if(score >= 80) {
				System.out.println("성적은 b, "  + "나이는 " + age + ", 점수는 " + score + ", 이름은 " + name);
			} else if(score >= 70) {
				System.out.println("성적은 c, "  + "나이는 " + age + ", 점수는 " + score + ", 이름은 " + name);
			} else if(score >= 60) {
				System.out.println("성적은 d, "  + "나이는 " + age + ", 점수는 " + score + ", 이름은 " + name+"*");
			} else
				System.out.println("성적은 d, "  + "나이는 " + age + ", 점수는 " + score + ", 이름은 " + name);			
		} else
			System.out.println("18세 미만은 수강신청을 할 수 없습니다.");
		
		
		
		
		
		
	}

}

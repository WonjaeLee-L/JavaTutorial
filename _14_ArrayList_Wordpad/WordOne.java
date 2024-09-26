package _14_ArrayList_Wordpad;

public class WordOne {
	String ename=null;
    String kname=null;
     public void prt() {
    	 System.out.println(ename);
    	 System.out.println(kname);
    	 
     }    // 단어와 한글 뜻 출력
     public void setEname(String ename) {
    	 this.ename=ename;
     }     // 영어 단어 저장
     public void setKname(String kname) {;    // 한글 단어 저장
     	 this.kname=kname;
     }
     
     // ename과 kname의 경우에 멤버변수와 지역변수 모두 존재한다. 이름이 같을 때,
     // ename=ename을 하면 지역변수가 우선한다.
     // 멤버변수임을 표시하기 위해서, this.ename으로 입력한다.
     // 변수 이름을 다르게하면 이해하기 어렵기 때문에, 단어 이름을 다르게 하지 않는다.
     public String getEname() {    // 영어 단어 조회
    	 return ename;
     }
     public String getKname() {
    	 return kname;
     }    // 한글 단어 조회
}
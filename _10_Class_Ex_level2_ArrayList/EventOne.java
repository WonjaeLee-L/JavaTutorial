package _10_Class_Ex_level2_ArrayList;

public class EventOne {
	private String title = null;
	private String memo = null;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public void prt() {
		System.out.println(title);
		System.out.println(memo);
	}
}
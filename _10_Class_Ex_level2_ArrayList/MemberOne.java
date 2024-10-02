package _10_Class_Ex_level2_ArrayList;

public class MemberOne {
	private String id = null;
	private String name = null;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void prt() {
		System.out.println(id);
		System.out.println(name);
	}

}
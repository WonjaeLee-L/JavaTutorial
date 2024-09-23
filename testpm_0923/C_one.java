package testpm_0923;

public class C_one {
	private String cId = null;
	private String cName = null;

	public void prt() {
		System.out.println(cId);
		System.out.println(cName);
	}

	public String getCid() {
		return cId;
	}

	public String getCname() {
		return cName;
	}

	public void setCid(String a) {
		cId = a;
	}

	public void setCname(String b) {
		cName = b;
	}
}

package testpm_0923;

public class E_one {
	private String eTitle = null;
	private String eText = null;

	public void prt() {
		System.out.println(eTitle);
		System.out.println(eText);
	}

	public String getEtitle() {
		return eTitle;
	}

	public String getEtext() {
		return eText;
	}

	public void setEtitle(String a) {
		eTitle = a;
	}

	public void setEtext(String b) {
		eText = b;
	}

}

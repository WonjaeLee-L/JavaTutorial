package _16_Static_final_test;

public class Part {
	private String partName = null;
	private String className = null;
	private String partPro = null;

	public void prt() {
		System.out.println("과목명 : " + partName);		
	}

	public String getPartName() {
		return partName;
	}

	public void setPartName(String partName) {
		this.partName = partName;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getPartPro() {
		return partPro;
	}

	public void setPartPro(String partPro) {
		this.partPro = partPro;
	}

}

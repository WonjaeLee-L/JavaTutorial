package _11_method;

public class Main1 {

	public static void main(String[] args) {
		TestMethod t = new TestMethod();
		System.out.println(t.name);
		t.setName("lee");
		System.out.println(t.name);
		System.out.println(t.getName());
		String resultName = t.getName2("1122");
		if (resultName != null) {
			System.out.println(resultName);
		} else {
			System.out.println("비번틀림");
		}

		System.out.println(t.maskName(" wonjae"));

	}

}

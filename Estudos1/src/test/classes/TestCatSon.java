package test.classes;

public class TestCatSon extends TestMotherCat{
	
	public void catJump(){
		System.out.println("Son...");
	}

	public static void main(String[] args) {
		TestMotherCat cat = new TestCatSon();
		try {
			cat.catJump();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

package test.classes;

public class TestClass10 extends Sub{

	TestClass10(){
		s += "Sub2 ";
	}
	
	public static void main(String[] args) {
		
		System.out.println(new TestClass10().s);
		
		char []arrayChar = {'g','o','n','c'};
		String a = new String(arrayChar);		//Aceita char[]
		StringBuilder sb = new StringBuilder(a);//Não aceita char[]
		sb.append(" Aprovado");
		System.out.println(a.charAt(1));
		System.out.println(sb.charAt(2));
		System.out.println(sb.capacity());
		System.out.println(sb.toString().toUpperCase());
	}

}

class Sup{
	String s ="";
	Sup(){
		s = s + "Super ";
	}
}

class Sub extends Sup{
	String s ="";
	Sub(){
		s = super.s + "Sub ";
	}
}

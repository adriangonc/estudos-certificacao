package test.casting;

public class CastingT1 implements InterfaceX{
	public static String v1;
	public static void main(String...args) {
		Object[] obj = new Object[1532];
		obj[0] = "Test";
		String txt = new String("Test2");
		short short1 = 5;
		obj[1] = txt;
		obj[2] = 1532;
		obj[3] = short1;
		String s = (String) obj[0]; //Cast sem ele não funciona...
		System.out.println(obj[2]);
		
		InterfaceX x = new CastingT1();
		//InterfaceX x2 = (InterfaceX) new CastingT2(); //Compila mas retorna erro em execução.
		CastingT1 ct1 = new CastingT1();
		CastingT1.v1 = "t";
		
		//Long i2 = (Long) (Object) obj[3]; //Erro de execução class cast exception
		
	}

}

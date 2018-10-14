package test.inheritance;

public class Test02 {
	Test02(String s){
		System.out.println(s);
	}
}

class Sub extends Test02{
	Sub(){
		//super(); //Não funciona pois o construtor default de Test02 não existe mais com a criação do novo cosntrutor
		super("AGS"); //Funciona pois aciona o construtor modificado da classe pai
	}
}

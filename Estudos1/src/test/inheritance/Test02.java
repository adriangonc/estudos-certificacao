package test.inheritance;

public class Test02 {
	Test02(String s){
		System.out.println(s);
	}
}

class Sub extends Test02{
	Sub(){
		//super(); //N�o funciona pois o construtor default de Test02 n�o existe mais com a cria��o do novo cosntrutor
		super("AGS"); //Funciona pois aciona o construtor modificado da classe pai
	}
}

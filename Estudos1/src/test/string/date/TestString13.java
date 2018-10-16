package test.string.date;

public class TestString13 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Java");
		String s2 = "Love";
		sb.append(s2);
		sb.substring(4); //Substring não modifica o conteudo da variável StringBuilder, o método substring(int) retorna todos os caracteres aós o index passado
		System.out.println(sb + " " + sb.substring(4)); //JavaLove Love
		System.out.println(sb.indexOf(s2)); //4
	}

}

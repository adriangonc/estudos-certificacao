package estruturas.de.desisao;

public class TestIf06 {

	public static void main(String[] args) {
		boolean b = true;
		if(b = false){ //Este c�digo compila, pois atribui false para 'b' 
					   //Ao invez de comparar 'b' com false.
			System.out.println("if");
		}else if(b){ //Como 'b' agora e false n�o entra no else if.
			System.out.println("else");
		} //Como n�o entrou no if ou else, n�o imprime nada.
	}

}

package estruturas.de.desisao;

public class TestIf06 {

	public static void main(String[] args) {
		boolean b = true;
		if(b = false){ //Este código compila, pois atribui false para 'b' 
					   //Ao invez de comparar 'b' com false.
			System.out.println("if");
		}else if(b){ //Como 'b' agora e false não entra no else if.
			System.out.println("else");
		} //Como não entrou no if ou else, não imprime nada.
	}

}

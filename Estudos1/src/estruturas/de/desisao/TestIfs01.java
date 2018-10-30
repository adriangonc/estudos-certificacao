package estruturas.de.desisao;

public class TestIfs01 {

	public static void main(String[] args) {
		
		String out = "A";
		int i = -1, j = -10;
		if(i < 4)  if(j > 0) 
		if(i > j)
		out += "1";
		else out += "2"; else out += "3";
		else out += "4";
		System.out.println(out);
		
		/*String out = "A"; //Versão indentada.
		int i = -1, j = -10;
		if (i < 4)
			if (j > 0)
				if (i > j)
					out += "1";
				else
					out += "2";
			else
				out += "3";
		else
			out += "4";
		System.out.println(out);*/
	}

}

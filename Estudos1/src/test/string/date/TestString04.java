package test.string.date;

public class TestString04 {

	public static void main(String[] args) {
		char[] a = {'A','G','S'};
		StringBuilder sb = new StringBuilder();
		sb.append(a,0,a.length-1);
		sb.append('s');
		//sb.insert(10,"e"); Tentar inserir um valor em um index inexistente de um StringBuilder irá resultar em 'StringIndexOutOfBoundsException'
		System.out.println(sb);
	}

}

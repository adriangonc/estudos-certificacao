package test.string.date;

public class TestString09 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("A"); //O construtor de string builder n�o pode receber um array de char[]
		sb.append(new char[] {'A','G','S'}); //J� o m�todo append aceita array de char[] normalmente.
		sb.append(1532); //Append aceita int normalmente.
		sb.append(true); //Append aceita booleando e insere true na string.
		System.out.println(sb);
	}

}

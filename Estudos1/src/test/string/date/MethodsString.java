package test.string.date;

public class MethodsString {
	public static void main (String... args) {
		String text1 = new String("Adriano Gonçalves de Souza");
		String text2 = text1.replace("\\s", "-"); //Adriano Gonçalves de Souza
		System.out.println(text2);
		
		text2 = text2.replaceAll("\\s", "-"); //Adriano-Gonçalves-de-Souza
		System.out.println(text2);
		
		String[] stringArray = text1.split("\\s");
		
		for(String s : stringArray)
		System.out.println(s);
		
		String text3 = "Adriano";
		String[] text4 = text3.split("\\s");
		
		System.out.println(text4[0]);
		
		String message = String.join("-", "Java", "is", "cool");
		// message returned is: "Java-is-cool"
		System.out.println(message);
		
	}
}

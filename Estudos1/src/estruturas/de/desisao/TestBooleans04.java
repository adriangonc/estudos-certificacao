package estruturas.de.desisao;

public class TestBooleans04 {

	public static void main(String[] args) {
		System.out.println(true ^ (false | true)); //false
		System.out.println(true ^ (true | true)); //false
		System.out.println(true ^ (false | false)); //true
		System.out.println(true ^ false | true); // true
		System.out.println((true ^ false) | true); //true
		System.out.println(true ^ true); //false
		System.out.println(false ^ false); //false
		System.out.println(false ^ true); //true
		System.out.println(true ^ false); //true
		
	}

}

package test.loops;

public class TestLoop06 {
	public static final void main(String arg[]){
		int a[] = {3,2,1};
		int x = a.length;
		
		System.out.println(true ^ true); //false
		
		while(x>=0){
			System.out.println(a[--x]);
		}
		
		
	}
}

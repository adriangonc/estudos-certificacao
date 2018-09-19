package test.inheritance;

public abstract class Test1 {
	Object meuObjeto = new String("Adriano"); //String e sub tipo de object
	
	String myString = "Adriano";
	
	Object myObject = myString; //up-casting não precisa de (cast)
	
	{
		Object myObject = new Object();
		//String myString = (String) myObject; //down-casting precisa ser feito com cast
	}
	
}

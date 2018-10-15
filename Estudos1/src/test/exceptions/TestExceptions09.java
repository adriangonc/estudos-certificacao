package test.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import static java.util.Arrays.*;
import java.util.Arrays;
import java.util.ArrayList;

public class TestExceptions09 {

	public static void main(String[] args) {
		try{
			method();
		}catch(Exception e){ //Se o método retorna uma IOException, a exception tratada pelo bloco catch deve ser hierarquicamente maior que IOException, se não irá ocorrer erro de compilação.
			System.out.println("IO exception ");
		}finally{
			
		}
	}

	static IOException method(){
		try{
			ArrayList<String> list = new ArrayList<String>();
			return new IOException();
		}catch(Exception fne){
			return new FileNotFoundException();
		}
		
	}
	
	public static void main(String a){ //Aceita outro método com o nome maim desde que seja sobrecarregado
		
	}
	
}

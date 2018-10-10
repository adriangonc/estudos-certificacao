package test.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TestExceptions07 {

	public static void main(String[] args) {

	}

	public static IOException test() {
		try {
			return new IOException();
		} catch (Exception io) { //A exceção do catch deve obrigatoriamente ser maior que a do try
			return (IOException) new Exception();
		}
	}

}

package tp03;

import java.util.Scanner;

public class Usuario extends Pessoa{
	
	private static String nomeUs = "";

	public static  String lerNomeUs() {
		System.out.println("informe o nome do usuario:");
		Scanner ler = new Scanner(System.in);
		return nomeUs = ler.next();
		
	}
	
	
	public static String getNomeUs() {
		return nomeUs;
	}

	public void setNomeUs(String nomeUs) {
		Usuario.nomeUs = nomeUs;
	}
	
}


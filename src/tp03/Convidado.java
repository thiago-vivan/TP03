package tp03;

import java.util.Random ;                                        /* utilizado para randomizar se o convidado está confirmado ou não */
import java.util.Scanner;

public class Convidado extends Pessoa {
  
	private boolean confirmado;;                                /* convidados */
	             
		
	
	public String  regConvidado() {
		Convidado cv = new Convidado();
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("informe o nome do convidado");
		
		cv.nome  = ler.next();
		
		System.out.println("informe o numero de telefone do convidado");
		
		Scanner lerr = new Scanner(System.in);
		
		cv.telefone = lerr.nextInt();
		
		return nome;
		
		
	}
	
	
	
	
	public boolean isConfirmado() {
		return confirmado;
	}
	public void setConfirmado(boolean confirmado) {
		this.confirmado = confirmado;
	}
	
	/* classe de convidados- confirmados-nome */
}
 
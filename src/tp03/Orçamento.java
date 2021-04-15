package tp03;

import java.util.Scanner;

public class Orçamento {
	
	public float orçaTotal;											// ARGUMENTO
		
	
	public Orçamento(float ler) {                            // CONSTRUTOR
	
		this.orçaTotal = ler;
	
	}
	
	public void lerOrç(float orçaTotal) {
		
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("informe o Orçamento para o evento");
		
		orçaTotal = ler.nextFloat();
	
		System.out.println(orçaTotal);
	}
	

	public  float getOrçaTotal() {
		
		return orçaTotal;
	
	}

	
	public void setOrçaTotal(float orçaTotal) {
		
		this.orçaTotal = orçaTotal;
		
	}
	

	
	
	public void lerSaldo(){	
		
		
		float x=0;

		float l=0;
		
		Gastos var = new Gastos(x, l);
	
		x = var.getGastoTotal();
		
		l = var.gastoTotal;
		
		float saldo = (orçaTotal - x) ;
		
		System.out.println("o Saldo do evento é = " + saldo + l);
		
		System.out.println("o Saldo do evento é = " + orçaTotal);
		
		System.out.println("o Saldo do evento é = " + x);
		
	}









}




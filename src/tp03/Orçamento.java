package tp03;

import java.util.Scanner;

public class Or�amento {
	
	public float or�aTotal;											// ARGUMENTO
		
	
	public Or�amento(float ler) {                            // CONSTRUTOR
	
		this.or�aTotal = ler;
	
	}
	
	public void lerOr�(float or�aTotal) {
		
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("informe o Or�amento para o evento");
		
		or�aTotal = ler.nextFloat();
	
		System.out.println(or�aTotal);
	}
	

	public  float getOr�aTotal() {
		
		return or�aTotal;
	
	}

	
	public void setOr�aTotal(float or�aTotal) {
		
		this.or�aTotal = or�aTotal;
		
	}
	

	
	
	public void lerSaldo(){	
		
		
		float x=0;

		float l=0;
		
		Gastos var = new Gastos(x, l);
	
		x = var.getGastoTotal();
		
		l = var.gastoTotal;
		
		float saldo = (or�aTotal - x) ;
		
		System.out.println("o Saldo do evento � = " + saldo + l);
		
		System.out.println("o Saldo do evento � = " + or�aTotal);
		
		System.out.println("o Saldo do evento � = " + x);
		
	}









}




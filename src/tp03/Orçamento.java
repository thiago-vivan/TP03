package tp03;

import java.util.Scanner;

public class Orçamento {
	
	private static float orçaTotal;
	private static Gastos gastos;
	
	public static final void lerOrç(){
	
			Orçamento orç1 = new Orçamento();
	
			Scanner ler = new Scanner(System.in);
			System.out.println("informe o Orçamento para o evento");
			orçaTotal = ler.nextFloat();
			System.out.println("Saldo do Evento é = " + (orçaTotal - gastos.getGastos()));
	
	}


}

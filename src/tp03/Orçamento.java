package tp03;

import java.util.Scanner;

public class Or�amento {
	
	private static float or�aTotal;
	private static Gastos gastos;
	
	public static final void lerOr�(){
	
			Or�amento or�1 = new Or�amento();
	
			Scanner ler = new Scanner(System.in);
			System.out.println("informe o Or�amento para o evento");
			or�aTotal = ler.nextFloat();
			System.out.println("Saldo do Evento � = " + (or�aTotal - gastos.getGastos()));
	
	}


}

package tp03;
import java.util.Scanner;
public class Gastos {
	

	private static float gastoTotal = 1;
	public static float gastos ;
	
	public final static void lerGasto() {
		
		System.out.println("digite os gastos, para parar digite -1");
		
		while (gastos != -1) {
			Scanner ler = new Scanner(System.in);
			gastos = ler.nextFloat();
			gastoTotal = gastoTotal + gastos;
		}
	
		System.out.println("gasto total = " + gastoTotal);
	
	}

	public static float getGastos() {
		return gastoTotal;
	}

	public static void setGastos(float gastoTotal) {
		Gastos.gastoTotal = gastoTotal;
	}
	

	
}

package tp03;
import java.util.Scanner;
public class Gastos {
	

	public	float gastoTotal = 0;
	public  float gastos = 0 ;
	
	
	public Gastos(float gastoTotal, float gastos) {
		this.gastoTotal = gastoTotal;
		this.gastos = gastos;
	}
	

	
	public  void setaGastos(float gastoTotal) {                               //
	
	
		
		System.out.println("digite os gastos, para parar digite 0");
		
		while (gastos != 0) {
			Scanner ler = new Scanner(System.in);
			gastos = ler.nextFloat();
			gastoTotal = gastoTotal + gastos;
		}
	
		
		System.out.println("gasto total = " + gastoTotal);
	
			
	}
	

	public float getGastoTotal() {
		return gastoTotal;
	}


	public void setGastoTotal(float gastoTotal) {
		this.gastoTotal = gastoTotal;
	}



}	
/*	public void lerSaldo(){
		Or�amento or�1 = new Or�amento();
		Gastos gst = new Gastos();	
		gst.getGastos();
			
		float saldo = (or�1.or�aTotal) - (gst.gastoTotal) ;
		
		System.out.println("o Saldo do evento � = " + saldo);

	}*/



////////////////////////////////////////////////////////////////


/* public void lerGasto() {

		Or�amento or�1 = new Or�amento();
		
		System.out.println("digite os gastos, para parar digite -1");
		
		while (gastos != -1) {
			Scanner ler = new Scanner(System.in);
			gst.gastos = ler.nextFloat();
			gst.gastoTotal = gastoTotal + gastos;
			}
		
		float getOr�aTotal = Or�amento.getOr�aTotal();
	
		or�aTotal2 ;= Or�amento.getOr�aTotal(or�aTotal.Or�amento);
		
				System.out.println("gasto total = " + gst.gastoTotal);
		
		
		System.out.println("Saldo do Evento � "  + ((or�1.getOr�aTotal()) - (gst.gastoTotal)));
		
		
	}*/

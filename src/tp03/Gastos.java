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
		Orçamento orç1 = new Orçamento();
		Gastos gst = new Gastos();	
		gst.getGastos();
			
		float saldo = (orç1.orçaTotal) - (gst.gastoTotal) ;
		
		System.out.println("o Saldo do evento é = " + saldo);

	}*/



////////////////////////////////////////////////////////////////


/* public void lerGasto() {

		Orçamento orç1 = new Orçamento();
		
		System.out.println("digite os gastos, para parar digite -1");
		
		while (gastos != -1) {
			Scanner ler = new Scanner(System.in);
			gst.gastos = ler.nextFloat();
			gst.gastoTotal = gastoTotal + gastos;
			}
		
		float getOrçaTotal = Orçamento.getOrçaTotal();
	
		orçaTotal2 ;= Orçamento.getOrçaTotal(orçaTotal.Orçamento);
		
				System.out.println("gasto total = " + gst.gastoTotal);
		
		
		System.out.println("Saldo do Evento é "  + ((orç1.getOrçaTotal()) - (gst.gastoTotal)));
		
		
	}*/

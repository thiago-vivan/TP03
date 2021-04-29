package tp03;

/**
 * Classe base Gastos
 * @author thiag
 * @version 1.0 (28/04/2021)
 */
public class Gastos {
	

	public	float gastoTotal;
	public  float gastos;

	public Gastos() {
		gastos = 0;
		gastoTotal=0;
	}
	
	public float getGastoTotal() {
		return gastoTotal;
	}
	public void setGastoTotal(float gastoTotal) {
		this.gastoTotal = gastoTotal;
	}
	public float getGastos() {
		return gastos;
	}
	public void setGastos(float gastos) {
		this.gastos = gastos;
	}


	

}

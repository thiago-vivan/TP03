package tp03;

import java.util.Random ;  /* utilizado para randomizar se o convidado está confirmado ou não */

public class Convidado extends Pessoa {

	private boolean confirmado;;
	Convidado convidado = new Convidado();
	Random random = new Random();
	
	
	public boolean isConfirmado() {
		return confirmado;
	}
	public void setConfirmado(boolean confirmado) {
		this.confirmado = confirmado;
	}
	
	/* classe de convidados- confirmados-nome */
}
 
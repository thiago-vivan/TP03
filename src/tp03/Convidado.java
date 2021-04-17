package tp03;

                                       
public class Convidado extends Pessoa {
  
	private boolean confirmado;;                                
	             
		
	
	public Convidado(String nome, int telefone, boolean confirmado) {
		super(nome, telefone);
		this.confirmado = confirmado;
	
	}



	public boolean isConfirmado() {
		return confirmado;
	}



	public void setConfirmado(boolean confirmado) {
		this.confirmado = confirmado;
	}
		
	
}	
	
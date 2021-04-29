package tp03;
/**
 * Classe abstrata pessoa, da origem a classe usuario e classe convidado
 * @author thiag
 * @version1.0 (28/04/2021)
 */
public abstract class Pessoa {						//Classe abstrata Pessoa que gera usuario e convidados

	protected String nome;
	protected int telefone;
	
	
	public Pessoa(String nome, int telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}


	public String getNome() {
		return nome;
	}

 
	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getTelefone() {
		return telefone;
	}


	public void setTelefone(int telefone) {
		this.telefone = telefone;
	
}
}
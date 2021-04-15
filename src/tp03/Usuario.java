package tp03;

import java.util.Scanner;

public class Usuario extends Pessoa{
	
	private String login;
	private String senha;
	private boolean status;
	
	public Usuario(String login, String senha) {
		super(nome, telefone);
		this.login = login;
		this.senha = senha;
		this.status = status;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}

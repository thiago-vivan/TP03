 package controle;

import javax.swing.JOptionPane;
import tp03.*;

public class Principal {
	

	private Usuario u;
	
//	Funçao para cadastrar Usuário
//	
//	
	public void cadastraUsu(String l, String s, String n, int t) {
		
		u = new Usuario(l,s,n,t);
		
		JOptionPane.showMessageDialog(null, "Sua conta foi criada com sucesso!");
		
	
	}
	

// Função para efetuar login de usuario já cadastrado	
//	
//	
	public void realizarLogin(String l, String s) {

	
		if(l.equalsIgnoreCase(u.getLogin())) {
				if(s.equals(u.getSenha())){
					
					JOptionPane.showMessageDialog(null, "Bem vindo " + u.getNome());
					;
					
				}
				else {
					JOptionPane.showMessageDialog(null, "A senha inserida está incorreta", null, JOptionPane.ERROR_MESSAGE);
					
				}
			
		}
	}		



}	
 package controle;

import javax.swing.JOptionPane;
import tp03.*;

public class Principal {
	

	private Usuario u;
	
//	Fun�ao para cadastrar Usu�rio
//	
//	
	public void cadastraUsu(String l, String s, String n, int t) {
		
		u = new Usuario(l,s,n,t);
		
		JOptionPane.showMessageDialog(null, "Sua conta foi criada com sucesso!");
		
	
	}
	

// Fun��o para efetuar login de usuario j� cadastrado	
//	
//	
	public void realizarLogin(String l, String s) {

	
		if(l.equalsIgnoreCase(u.getLogin())) {
				if(s.equals(u.getSenha())){
					
					JOptionPane.showMessageDialog(null, "Bem vindo " + u.getNome());
					;
					
				}
				else {
					JOptionPane.showMessageDialog(null, "A senha inserida est� incorreta", null, JOptionPane.ERROR_MESSAGE);
					
				}
			
		}
	}		



}	
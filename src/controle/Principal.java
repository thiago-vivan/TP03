 package controle;

import java.util.ArrayList;

import javax.swing.JList;
import javax.swing.JOptionPane;
import tp03.*;
import visao.ListaConv;



/**
 * Classe principal, responsavel pelo controle de informações
 * @author thiag
 *@version 1.0 (28/04/2021)
 */
public class Principal {
	

	private Usuario u;
	private Evento ev;
	private Orçamento orc;
	private Gastos gst;
	

	/**
	 * Metodo para cadastrar um usuario "u"
	 * @param l
	 * @param s
	 * @param n
	 * @param t
	 * @return void
	 */
	public void cadastraUsu(String l, String s, String n, int t) {
		
		u = new Usuario(l,s,n,t);
		
		JOptionPane.showMessageDialog(null, "Sua conta foi criada com sucesso!");      			//Cria uma janela de aviso
		
	
	}
	

	/**
	 *  Metodo para checar login e senha
	 * @param l
	 * @param s
	 * @return boolean, true-> se login e senha iguais aos cadastrados, false-> se forem diferentes
	 */
	public boolean realizarLogin(String l, String s) {
		
		boolean status = false;
	
		if(l.equalsIgnoreCase(u.getLogin())) {								//  Conjunto de ifs responsaveis
				if(s.equals(u.getSenha())){								    //	por checar login e senha
					
					JOptionPane.showMessageDialog(null, "Bem vindo " + u.getNome());
					status = true;
					
				}
				else {
					JOptionPane.showMessageDialog(null, "A senha inserida está incorreta", null, JOptionPane.ERROR_MESSAGE);
					status = false;
				}
		}

		return status;
	}		

	
	
	/**
	 * Cadastra evento e registra nome e data
	 * @param n
	 * @param d
	 */
	
	public void criaEve(String n, String d) {
	
		ev = new Evento();
		ev.setNomeEve(n);
		ev.setDataEv(d);
	
	}
	
	
	/**
	 * Adiciona um convidado ao arraylist do evento
	 * @param c
	 */	
	public void cadConv(Convidado c) {
 
		ev.addConvidado(c);
		
	
	}

	/**
	 * Funçao que busca array list de convidados
	 * @return arrayList de convidados
	 */
	public ArrayList<Convidado> retornaConv() {
		
		ArrayList<Convidado> c = new ArrayList<Convidado>();             
		c = ev.getConvidados();                                                   
		
		return c;
			
	}
	/**
	 * verifica se foi escrito um numero na string
	 * @param t
	 * @return
	 */
	public boolean verificaTel(String t) {
		if (t == null) {
	        return false;
	    }
	    try {
	        double d = Double.parseDouble(t);
	    } catch (NumberFormatException nfe) {
	        return false;
	    }
	    return true;
		

	}
	

}	
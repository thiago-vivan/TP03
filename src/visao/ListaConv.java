package visao;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

import controle.Principal;
import tp03.Convidado;
import tp03.Evento;
/**
 * Classe que mostra lista de convidados confirmados e nao confirmados
 * @author thiag
 *
 */
public class ListaConv {


	
		private ArrayList<Convidado> listaConvidados;
		private JList lista;
		
	/**
	 * metodo que cria janela com JList de convidados
	 * @param p
	 */
	public void criaLista(Principal p) {
		
		JFrame f = new JFrame("lISTA DE CONVIDADOS");		
		f.setBounds(500, 300, 500, 400);
		f.setVisible(true);
		f.setLayout(null);
		f.setVisible(true);
		
 
		JLabel lblConf = new JLabel("o Convidado está confirmado");
		lblConf.setHorizontalAlignment(SwingConstants.TRAILING);
		lblConf.setFont(new Font("Arial", Font.PLAIN, 15));
		lblConf.setBounds(150, 10, 300, 27);
		lblConf.setVisible(false);
		f.add(lblConf);
	

		JLabel lblConf2 = new JLabel("o Convidado NÃO está confirmado");
		lblConf2.setHorizontalAlignment(SwingConstants.TRAILING);
		lblConf2.setFont(new Font("Arial", Font.PLAIN, 15));
		lblConf2.setBounds(150, 10, 300, 27);
		lblConf2.setVisible(false);
		f.add(lblConf2);
	

		listaConvidados = p.retornaConv();

		String stringConv[] = new String[listaConvidados.size()];
		for(int i = 0; i < listaConvidados.size(); i++) {
			stringConv[i] = listaConvidados.get(i).getNome();
		}

		
		lista = new JList(stringConv);
		lista.setVisibleRowCount(10);
		lista.setVisible(true);
		lista.setBounds(0, 0, 200, 300);
		lista.addListSelectionListener(e -> {
			int index = lista.getSelectedIndex();
			listaConvidados.get(index).isConfirmado();			
			if(listaConvidados.get(index).isConfirmado() == true) {
			
				lblConf.setVisible(true);
				lblConf2.setVisible(false);
				JOptionPane.showMessageDialog(null, "telefone:" + listaConvidados.get(index).getTelefone());
			
			}else {
			
				lblConf.setVisible(false);
				lblConf2.setVisible(true);
				JOptionPane.showMessageDialog(null, "telefone:" + listaConvidados.get(index).getTelefone());	
			}
					
		});
		f.add(lista);

	
	
	
	}





}

package visao;

import javax.swing.JFrame;
import controle.Principal;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Classe de Menu principal onde pode gerar lista de convidados e organizar orçamento
 * @author thiag
 * @version 1.0 (28/04/2021)
 */
public class MenuPrinci extends JFrame{

	
	public MenuPrinci() {
		
	}
	
	
	/**
	 * metodo que cria janela do menu principal
	 * @param p
	 */
	public void telaMenu(Principal p) {
		
		
		JFrame f = new JFrame("Menu Principal");		
		f.setBounds(500, 300, 500, 400);
		f.setVisible(true);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
		JButton b1 = new JButton("Gerar lista de convidados");
		b1.setBounds(0,110,500,90);
		b1.setVisible(false);
		b1.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent e) {

				ListaConv lst = new ListaConv();
			
				lst.criaLista(p);
		
			}			
		});		
		f.add(b1);

		
		JButton b2 = new JButton("orçamento do evento");
		b2.setBounds(0,210,500,90);
		b2.setVisible(false);
		b2.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent e) {
				
				Financeiro fin = new Financeiro();
				fin.telaFinaceiro();
			
			}			
		});	
		f.add(b2);
		

		JButton b = new JButton("criar evento");
		b.setBounds(0,10,500,90);
		b.setVisible(true);
		b.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent e) {
					
					CadEve cadE = new CadEve();
					cadE.CadastraEve(p);
					b1.setVisible(true);
					b2.setVisible(true);
					b.setVisible(false);
			}			
			
		});		
		f.add(b);
		
		
	}


}

package visao;

import javax.swing.JFrame;
import controle.Principal;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPrinci extends JFrame{

	
	public MenuPrinci() {
		
	}
	
//	Funçao para gerar janela do Menu Principal
//	
//	*algumas funcionalidades nao foram implementadas ainda
	public void telaMenu(Principal p) {
		
		
		JFrame f = new JFrame("Menu Principal");		
		f.setBounds(500, 300, 500, 400);
		f.setVisible(true);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		JButton b = new JButton("criar evento");
		b.setBounds(10,10,120,90);
		b.setVisible(true);
		b.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent e) {
					CadEve cadE = new CadEve();
					
					cadE.CadastraEve();
			}			
		}
		);		
		f.add(b);
		
		
//		JButton b1 = new JButton("Adicionar Convidados");
//		b1.setBounds(0,0,0,0);
//		b1.setVisible(true);
//		b1.addActionListener(new ActionListener() {	
//			public void actionPerformed(ActionEvent e) {
					
			
//			}			
//		}
//		);		
//		f.add(b1);

		
//		JButton b2 = new JButton("gerar lista de convidados");
//		b2.setBounds(0,0,0,0);
//		b2.setVisible(true);
//		b2.addActionListener(new ActionListener() {	
//			public void actionPerformed(ActionEvent e) {
					
			
//			}			
//		}
//		);		
//		f.add(b2);
		
		
		
		
	}


}

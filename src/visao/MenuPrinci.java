package visao;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPrinci extends JFrame{

	
	public MenuPrinci() {
		
	}
	
	public void telaMenu() {
		
		
		JFrame f = new JFrame("Menu Principal");		
		f.setBounds(500, 300, 500, 400);
		f.setVisible(true);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		JButton b = new JButton("criar evento");
		b.setBounds(0,0,0,0);
		b.setVisible(true);
		b.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent e) {
					
			
			}			
		}
		);		
		f.add(b);
		
		
		JButton b1 = new JButton("Adicionar Convidados");
		b1.setBounds(0,0,0,0);
		b1.setVisible(true);
		b1.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent e) {
					
			
			}			
		}
		);		
		f.add(b1);

		
		
		
		
		
		
	}


}

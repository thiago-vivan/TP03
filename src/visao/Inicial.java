package visao;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Inicial extends JFrame{

	TelaLogin tela = new TelaLogin();
			
	public Inicial() {									// CONSTRUTOR
	
	
	}

	public void janelaInicial() {
	
		
		JFrame f = new JFrame("Tela Inicial");		
		f.setBounds(500, 300, 500, 400);
		f.setVisible(true);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel T = new JLabel("Meus Convidados");
		T.setFont(new Font("Arial", Font.PLAIN, 25));
		T.setBounds(150, 0, 200, 100);
		T.setVisible(true);
		
		f.add(T);
		
		JButton b = new JButton("Login");
		b.setBounds (125, 125, 200, 100);
		b.setVisible(true);
		b.setLayout(null);
		
		f.add(b);
	
		b.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
					
			
			tela.setVisible(true);
			f.setVisible(false);
			}
			
		}
		);

		JButton b2 = new JButton("Registrar Usuário");
		b2.setBounds (125, 250, 200, 100);
		b2.setVisible(true);
		
		f.add(b2);
		
		b2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
					
				CadUser cadu = new CadUser();
				cadu.setVisible(true);
			
			}
			
		}
		);
	}

	public void Visivel() {
		setVisible(true);
	}

}
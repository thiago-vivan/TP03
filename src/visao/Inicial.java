package visao;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import controle.Principal;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Classe inicial do programa
 * @author thiag
 * @version 1.0 (28/04/2021)
 */
public class Inicial extends JFrame{


	 
	public Principal p = new Principal();
	
		public Inicial() {									// CONSTRUTOR
	
		}

/**
 * Método que cria janela inicial	
 */
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
		b.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
			
			TelaLogin tela = new TelaLogin();
			tela.janelaLogin(p);
			}
		});
		f.add(b);
		
		JButton b2 = new JButton("Registrar Usuário");
		b2.setBounds (125, 250, 200, 100);
		b2.setVisible(true);	
		b2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				CadUser cadU = new CadUser();
				cadU.CadastroUsuario(p);	

			}			
		});
	
		f.add(b2);
	}



}
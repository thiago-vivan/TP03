 package visao;


import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.border.EmptyBorder;
	import javax.swing.JLabel;
	import javax.swing.JOptionPane;
	import java.awt.Font;
	import javax.swing.SwingConstants;
	import javax.swing.JTextField;
	import javax.swing.JButton;
	import javax.swing.JPasswordField;
	import java.awt.event.ActionListener;
	import java.awt.event.ActionEvent;
	import controle.*;

/**
 * Classe onde será realizado o login
 * @author thiag
 *
 */
public class TelaLogin extends JFrame {	
		

		private JTextField textField;
		private JPasswordField passwordField;
		private Inicial ini;
			


		/**
		 * Metódo que cria Janela de login
		 * @param p
		 */
		public void janelaLogin(Principal p) {			
			
			JFrame tela = new JFrame("Tela Login");		
			tela.setBounds(100, 100, 535, 299);
			tela.setVisible(false);
			tela.setLayout(null);
			tela.setVisible(true);
			tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			
			JLabel lblNewLabel = new JLabel("Login:");
			lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
			lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 15));
			lblNewLabel.setBounds(98, 64, 77, 27);
			
			tela.add(lblNewLabel);
			
			textField = new JTextField();
			textField.setColumns(10);
			textField.setBounds(185, 64, 217, 27);
			
			tela.add(textField);
			
			JLabel lblSenha = new JLabel("Senha:");
			lblSenha.setHorizontalAlignment(SwingConstants.TRAILING);
			lblSenha.setFont(new Font("Arial", Font.PLAIN, 15));
			lblSenha.setBounds(98, 101, 77, 27);
			
			tela.add(lblSenha);
			
			JButton b1 = new JButton("Voltar");
			b1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					tela.setVisible(false);
				}
			});		
			b1.setBounds(304, 138, 98, 46);
			tela.add(b1);
			
			passwordField = new JPasswordField();
			passwordField.setBounds(185, 101, 217, 27);
			tela.add(passwordField);
						
			
			JButton btnLogin = new JButton("Login");
			btnLogin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(textField.getText().equals("") || passwordField.getText().equals("") ) {
								JOptionPane.showMessageDialog(null, "Preencha todos os campos antes de logar", null, JOptionPane.ERROR_MESSAGE);
							}
					else {	
					
						String s = passwordField.getText();
						
							if (p.realizarLogin(textField.getText(), s) == true) {																

								MenuPrinci menu = new MenuPrinci();
								menu.telaMenu(p);
								tela.setVisible(false);
							}
							else {
								JOptionPane.showMessageDialog(null, "Login ou senha incorretos", null, JOptionPane.ERROR_MESSAGE);
							}
					}
				}
			});
			btnLogin.setBounds(185, 138, 98, 46);
			tela.add(btnLogin);
			
		}
	
}

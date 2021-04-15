package visao;


	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.border.EmptyBorder;
	import javax.swing.JLabel;
	import java.awt.Font;
	import javax.swing.SwingConstants;
	import javax.swing.JTextField;
	import javax.swing.JButton;
	import javax.swing.JPasswordField;
	import java.awt.event.ActionListener;
	import java.awt.event.ActionEvent;
	import controle.*;

	public class TelaLogin extends JFrame {
		
		
		
	
		private JPanel contentPane;
		private JTextField textField;
		private JPasswordField passwordField;
		private Inicial ini;
		
	
		
		public TelaLogin() {
			JanelaLogin();
			
		}
		
		public void JanelaLogin() {			
			
			JFrame frame = new JFrame();
			frame.setSize(100, 100);
			frame.setVisible(true);
			contentPane = new JPanel();
		
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 535, 299);			
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("Login:");
			lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
			lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 15));
			lblNewLabel.setBounds(98, 64, 77, 27);
			contentPane.add(lblNewLabel);
			
			textField = new JTextField();
			textField.setColumns(10);
			textField.setBounds(185, 64, 217, 27);
			contentPane.add(textField);
			
			JLabel lblSenha = new JLabel("Senha:");
			lblSenha.setHorizontalAlignment(SwingConstants.TRAILING);
			lblSenha.setFont(new Font("Arial", Font.PLAIN, 15));
			lblSenha.setBounds(98, 101, 77, 27);
			contentPane.add(lblSenha);
			
			JButton b1 = new JButton("Voltar");
			b1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frame.setVisible(false);
					ini = new Inicial();
					ini.janelaInicial();
				}
			});
		
			b1.setBounds(304, 138, 98, 46);
			contentPane.add(b1);
			
			passwordField = new JPasswordField();
			passwordField.setBounds(185, 101, 217, 27);
			contentPane.add(passwordField);
			
			
			
			JButton btnLogin = new JButton("Login");
	//		btnLogin.addActionListener(new ActionListener() {
	//			public void actionPerformed(ActionEvent e) {
	//				String s = passwordField.getText();
	//				p.realizarLogin(textField.getText(), s);
	//				if(p.livraria.getStatus()) {
	//					p.visivel();
	//					setVisible(false);
	//				}
	//			}
	//		});
			btnLogin.setBounds(185, 138, 98, 46);
			contentPane.add(btnLogin);
			frame.add(contentPane);
		}
	

		













}

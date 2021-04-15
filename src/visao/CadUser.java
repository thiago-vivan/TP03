package visao;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import controle.*;

/**
 * Classe responsável por apresentar uma interface de cadastro de usuário simples e interativa para o usuário
 * @author Thiago França
 * @version 1.0 (29/11/2020)
 */
public class CadUser extends JFrame {
	

	private JTextField textField;
	
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	private JTextField textField_6;


	// private Validacoes check = new Validacoes();
	


	public void CadastroUsuario() {
		
		JFrame f = new JFrame("cadastrar usuario");		
		f.setBounds(500, 300, 500, 400);
		f.setVisible(true);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JLabel lblNewLabel = new JLabel("Login:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel.setBounds(64, 61, 77, 27);
		f.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(151, 61, 217, 27);
		f.add(textField);
		textField.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setHorizontalAlignment(SwingConstants.TRAILING);
		lblSenha.setFont(new Font("Arial", Font.PLAIN, 15));
		lblSenha.setBounds(64, 98, 77, 27);
		f.add(lblSenha);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(151, 98, 217, 27);
		f.add(textField_1);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNome.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNome.setBounds(64, 135, 77, 27);
		f.add(lblNome);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(151, 135, 217, 27);
		f.add(textField_2);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setHorizontalAlignment(SwingConstants.TRAILING);
		lblEmail.setFont(new Font("Arial", Font.PLAIN, 15));
		lblEmail.setBounds(64, 172, 77, 27);
		f.add(lblEmail);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(151, 172, 217, 27);
		f.add(textField_3);
		

		

		JLabel lblTelefone_1 = new JLabel("Telefone:");
		lblTelefone_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTelefone_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblTelefone_1.setBounds(64, 283, 77, 27);
		f.add(lblTelefone_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(151, 283, 217, 27);
		f.add(textField_6);
		
		JLabel lblNewLabel_1 = new JLabel("Criar nova conta");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(151, 10, 217, 34);
		f.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				if(textField.getText().equals("") || textField_1.getText().equals("") || textField_2.getText().equals("") ||  
//					textField_3.getText().equals("")  || textField_6.getText().equals("")) {
//						JOptionPane.showMessageDialog(null, "Preencha todos os campos antes de criar sua conta", null, JOptionPane.ERROR_MESSAGE);
//					}else {
//					if(check.vcu(p.livraria ,textField.getText(), textField_3.getText())) {
//				principal.cadastrarUsu(cadastrar());
//				principal.visivel();
//				setVisible(false);
//			} 
//					}
			}
		});
		btnNewButton.setBounds(150, 320, 98, 46);
		f.add(btnNewButton);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
		//	principal.visivel();
			}
		});
		btnVoltar.setBounds(270, 320, 98, 46);
		f.add(btnVoltar);
	}


	}



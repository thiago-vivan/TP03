package visao;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import controle.*;
import tp03.Usuario;

/**
 * clase CadUser onde será criada uma janela interativa para cadastrar um usuario
 * @author thiag
 * @version 1.0 (28/04/2021)
 */
public class CadUser extends JFrame {
	

	public JTextField textField;
	public JTextField textField_1;
	public JTextField textField_2;
	public JTextField textField_3;
	public JTextField textField_6;



	
/**
 * metodo que cria a janela para cadastro do usuario
 * @param p
 */
	public void CadastroUsuario(Principal p) {

		JFrame cadU = new JFrame("cadastrar usuario");		
		cadU.setBounds(500, 300, 500, 400);
		cadU.setLayout(null);
		cadU.setVisible(true);
		cadU.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JLabel lblNewLabel = new JLabel("Login:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel.setBounds(64, 61, 77, 27);
		lblNewLabel.setVisible(true);
		cadU.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(151, 61, 217, 27);
		cadU.add(textField);
		textField.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setHorizontalAlignment(SwingConstants.TRAILING);
		lblSenha.setFont(new Font("Arial", Font.PLAIN, 15));
		lblSenha.setBounds(64, 98, 77, 27);
		lblSenha.setVisible(true);
		cadU.add(lblSenha);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(151, 98, 217, 27);
		textField_1.setVisible(true);
		cadU.add(textField_1);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNome.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNome.setBounds(64, 135, 77, 27);
		lblNome.setVisible(true);
		cadU.add(lblNome);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(151, 135, 217, 27);
		textField_2.setVisible(true);
		cadU.add(textField_2);
		

		JLabel lblTelefone_1 = new JLabel("Telefone:");
		lblTelefone_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTelefone_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblTelefone_1.setBounds(64, 172, 77, 27);
		lblTelefone_1.setVisible(true);
		cadU.add(lblTelefone_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(151, 172, 217, 27);
		textField_6.setVisible(true);
		cadU.add(textField_6);
		
		JLabel lblNewLabel_1 = new JLabel("Criar nova conta");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(151, 10, 217, 34);
		lblNewLabel_1.setVisible(true);
		cadU.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(textField.getText().equals("") || textField_1.getText().equals("") || textField_2.getText().equals("") ||  
					 textField_6.getText().equals("") || !p.verificaTel(textField_6.getText())) {
						JOptionPane.showMessageDialog(null, "Verifique se os dados estão corretos ", null, JOptionPane.ERROR_MESSAGE);
					}else {				
						
						p.cadastraUsu(textField.getText(), textField_1.getText(), textField_2.getText(),
								Integer.parseInt(textField_6.getText()));
						setVisible(false);
			
					}
			}
		});
		btnNewButton.setBounds(150, 250, 98, 46);
		btnNewButton.setVisible(true);
		cadU.add(btnNewButton);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			cadU.setVisible(false);
		
			}
		});
		btnVoltar.setBounds(270, 250, 98, 46);
		btnVoltar.setVisible(true);
		cadU.add(btnVoltar);
	}
	
/**
 * metodo para cadastrar efetivamente um usuario
 * @return
 */
	public Usuario cadastrar() {
		
		Usuario u = new Usuario(textField.getText(), textField_1.getText(), textField_2.getText(),
				Integer.parseInt(textField_6.getText()));
	
		u.setLogin(textField.getText());
		
		u.setSenha(textField_1.getText());
		
		u.setNome(textField_2.getText());
		
		u.setTelefone(Integer.parseInt(textField_6.getText()));
		
		return u;
		
		
	}

	}



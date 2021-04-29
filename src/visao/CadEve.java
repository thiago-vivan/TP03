package visao;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;

import controle.Principal;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import tp03.Evento;

/**
 * Classe com o JFrame onde é cadastrado um Evento
 * @author thiag
 * @version 1.0 (28/04/2021)
 */
public class CadEve extends JFrame{

	public JTextField textField;
	public JTextField textField_1;
	public JTextField textField_5;

	/**
	 * metodo que cria janela 
	 * @param p
	 */
	public void CadastraEve(Principal p) {
	 
		
		JFrame f = new JFrame("Cadastra Evento");		
		f.setBounds(500, 300, 500, 400);
		f.setVisible(true);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
		JLabel lblNewLabel = new JLabel("Nome do evento");
		lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel.setBounds(25, 61, 120, 27);
		lblNewLabel.setVisible(true);
		f.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(151, 61, 217, 27);
		f.add(textField);
		
		
		JLabel lblSenha = new JLabel("Data do evento");
		lblSenha.setHorizontalAlignment(SwingConstants.TRAILING);
		lblSenha.setFont(new Font("Arial", Font.PLAIN, 15));
		lblSenha.setBounds(25, 98, 120, 27);
		lblSenha.setVisible(true);
		f.add(lblSenha);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(151, 98, 217, 27);
		textField_1.setVisible(true);
		f.add(textField_1);
		
		JLabel lblQtd = new JLabel("Numero de convidados");
		lblQtd.setHorizontalAlignment(SwingConstants.TRAILING);
		lblQtd.setFont(new Font("Arial", Font.PLAIN, 15));
		lblQtd.setBounds(25, 135, 120, 27);
		lblQtd.setVisible(true);
		f.add(lblQtd);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(151, 135, 217, 27);
		textField_5.setVisible(true);
		f.add(textField_5);

		
		
		JButton b = new JButton("cadastrar");
		b.setBounds(200, 200, 98, 46);
		b.setVisible(true);
		f.add(b);
		
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("") || textField_1.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Preencha todos os campos antes de criar um evento", null, JOptionPane.ERROR_MESSAGE);
				}else {											
					p.criaEve(textField.getText(), textField_1.getText());
							f.setVisible(false);
							
							int c = Integer.parseInt(textField_5.getText());
							
							for(int i=0;i<c;i++) {
								CadConvidado cad = new CadConvidado();
								cad.TelaConvidado(p);																			
							}
						}
			}
		});
				

		
	}




}

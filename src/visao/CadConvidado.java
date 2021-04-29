package visao;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;

import controle.Principal;
import tp03.Convidado;
import tp03.Evento;
import javax.swing.JButton;
import javax.swing.JCheckBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Classe CadConvidado onde sera criado um JFrame para cadastrar convidados
 * @author thiag
 * @version 1.0 (28/04/2021)
 */
public class CadConvidado {

	/**
	 * Metodo que cria janela para cadastrar convidados
	 */
	public CadConvidado() {
		
	}

	
	public JTextField textField;
	public JTextField textField_1;
	public JTextField textField_2;



	public void TelaConvidado(Principal p){

		JFrame f = new JFrame("Cadastra convidado");		
		f.setBounds(500, 300, 500, 400);
		f.setVisible(true);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
		JLabel lblNewLabel = new JLabel("Nome do convidado");
		lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel.setBounds(25, 61, 120, 27);
		lblNewLabel.setVisible(true);
		f.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(151, 61, 217, 27);
		f.add(textField);
		
		
		JLabel lblTel = new JLabel("telefone");
		lblTel.setHorizontalAlignment(SwingConstants.TRAILING);
		lblTel.setFont(new Font("Arial", Font.PLAIN, 15));
		lblTel.setBounds(25, 98, 120, 27);
		lblTel.setVisible(true);
		f.add(lblTel);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(151, 98, 217, 27);
		textField_1.setVisible(true);
		f.add(textField_1);
		
		JLabel lblConf = new JLabel("Confirmação");
		lblConf.setHorizontalAlignment(SwingConstants.TRAILING);
		lblConf.setFont(new Font("Arial", Font.PLAIN, 15));
		lblConf.setBounds(25, 125, 120, 27);
		lblConf.setVisible(true);
		f.add(lblConf);
		
		JCheckBox check = new JCheckBox();
		check.setVisible(true);
		check.setBounds(150, 125, 20, 20);
		f.add(check);
		
		
		JButton b = new JButton("cadastrar");
		b.setBounds(200, 200, 98, 46);
		b.setVisible(true);
		f.add(b);		
		b.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
				Convidado c = new Convidado(textField.getText(), Integer.parseInt(textField_1.getText()),check.isSelected());
				p.cadConv(c);
				f.setVisible(false);
			}
		});
				
	}

}

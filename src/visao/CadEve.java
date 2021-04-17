package visao;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import tp03.Evento;


public class CadEve {

	public JTextField textField;
	public JTextField textField_1;
	public JTextField textField_2;
	public JTextField textField_3;
	public JTextField textField_6;

// 	Função para gerar janela onde é cadastrado novo evento
//	
//	
	public void CadastraEve() {
	
		
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
		
		JButton b = new JButton("cadastrar");
		b.setBounds(200, 200, 98, 46);
		b.setVisible(true);
		f.add(b);
		
		b.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
				
				Evento ev = new Evento();
		
			}
		});
	
	}




}

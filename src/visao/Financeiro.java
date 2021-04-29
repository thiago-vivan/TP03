package visao;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;

import controle.Principal;
import tp03.Convidado;
import tp03.Evento;
import tp03.Gastos;
import tp03.Orçamento;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Classe onde a parte financeira do evento sera tratada
 * @author thiag
 *
 */
public class Financeiro extends JFrame{



	public JTextField textField;
	public JTextField textField1 , textField3;
	private JList list;
	private Float orcTotal = (float) 0;
	private Float saldo = (float) 0;
	private Float gastoTotal = (float) 0;
	int posicao;
	private Principal p;
	String[] listaGastos = new String[999];
	
	
	 
	/**
	 * metodo que cria janela para cadastrar gastos e orçamento
	 */
	public void telaFinaceiro() {
	

	
		JFrame f = new JFrame("Financeiro");		
		f.setBounds(500, 300, 500, 400);
		f.setVisible(true); 
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		JLabel lblNewLabel = new JLabel("Digite o orçamento total");
		lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel.setBounds(5, 10, 200, 27);
		lblNewLabel.setVisible(true);
		f.add(lblNewLabel);
	
		textField = new JTextField();
		textField.setBounds(5, 40, 217, 27);
		f.add(textField);

		JLabel lblNewLabel2 = new JLabel("digite o valor do gasto");
		lblNewLabel2.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel2.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel2.setBounds(5, 70, 200, 27);
		lblNewLabel2.setVisible(true);
		f.add(lblNewLabel2);
	
		textField1 = new JTextField();
		textField1.setBounds(5, 110, 217, 27);
		f.add(textField1);
	
		JLabel label = new JLabel("escreva descriçao do gasto");
		label.setHorizontalAlignment(SwingConstants.TRAILING);
		label.setFont(new Font("Arial", Font.PLAIN, 15));
		label.setBounds(5, 140, 200, 27);
		label.setVisible(true);
		f.add(label);
	
		textField3 = new JTextField();
		textField3.setBounds(5, 170, 217, 27);
		f.add(textField3);
	

	
		list = new JList(listaGastos);
		list.setBounds(0, 0, 300, 500);

	
		
		JButton b1 = new JButton("adicionar gasto");
		b1.setBounds(130,250,120,90);
		b1.setVisible(true);
		b1.addActionListener(new ActionListener() {	
		public void actionPerformed(ActionEvent e) {
			
						
			gastoTotal = gastoTotal + Float.parseFloat(textField1.getText());
			adicionar(textField3.getText());
			textField1.setText(null);
			textField3.setText(null);
		}			
		});		
		f.add(b1);
	
	
		JButton b2 = new JButton("Gerar lista de Gastos");
		b2.setBounds(10,250,120,90);
		b2.setVisible(true);
		b2.addActionListener(new ActionListener() {	
		public void actionPerformed(ActionEvent e) {

			orcTotal = Float.parseFloat(textField.getText());
			saldo = orcTotal - gastoTotal;
			
			JFrame f2 = new JFrame("Financeiro");		
			f2.setBounds(500, 300, 500, 400);
			f2.setVisible(true); 
			f2.setLayout(null);
			f2.setVisible(true);

			JLabel lblNewLabel3 = new JLabel("Saldo " + saldo );
			lblNewLabel3.setHorizontalAlignment(SwingConstants.TRAILING);
			lblNewLabel3.setFont(new Font("Arial", Font.PLAIN, 15));
			lblNewLabel3.setBounds(225, 10, 200, 30);
			lblNewLabel3.setVisible(true);
			f2.add(lblNewLabel3);
				
			f2.add(list);
		
		
		}			
		});		
		f.add(b2);


	}

/**
 * método que recebe uma String e adiciona a um array 
 * @param nome
 */
	public void adicionar(String nome) {
		
		for (int i = 0; i < this.listaGastos.length; i++) {
			if (this.listaGastos[i] != null) {
				this.posicao += 1;
			}
		}
		this.listaGastos[posicao] = nome;
	}




}

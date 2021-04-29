package tp03;

import java.util.ArrayList;
import java.util.Date;

/**
 * Classe base do evento
 * @author thiag
 * @version 1.0 (28/04/2021)
 */
public class Evento {

	private String nomeEve;
	private String dataEv;
	private ArrayList<Convidado> convidados = new ArrayList<Convidado>();
	private Float saldo;														
	private Orçamento orç = new Orçamento();
	private Gastos gastoTotal;
	private Gastos gasto;
			
	public Evento() {
		
	}
	
	/**
	 * Metodo retornaConv, responsavel por montar um array com os nomes dos convidados
	 * @return
	 */
	public String[] retornaConv() {
	String stringConv[] = new String[convidados.size()];							//   pega cada nome de 
	for(int i = 0; i < convidados.size(); i++) {									//   convidados e transforma 
		stringConv[i] = convidados.get(i).getNome();								//	em um array de string
	}
	return stringConv;
	}
	
	
	public void addConvidado(Convidado c) {
		this.convidados.add(c);
	}
	
	public Gastos getGastoTotal() {
		return gastoTotal;
	}


	public void setGastoTotal(Gastos gastoTotal) {
		this.gastoTotal = gastoTotal;
	}


	public Gastos getGasto() {
		return gasto;
	}


	public void setGasto(Gastos gasto) {
		this.gasto = gasto;
	}


	public String getNomeEve() {
		return nomeEve;
	}

	public void setNomeEve(String nomeEve) {
		this.nomeEve = nomeEve;
	}

	public String getDataEv() {
		return dataEv;
	}

	public void setDataEv(String dataEv) {
		this.dataEv = dataEv;
	}

	public ArrayList<Convidado> getConvidados() {
		return convidados;
	}

	public void setConvidados(ArrayList<Convidado> convidados) {
		this.convidados = convidados;
	}

	public Float getSaldo() {
		return saldo;
	}

	public void setSaldo(Float saldo) {
		this.saldo = saldo;
	}

	public Orçamento getOrç() {
		return orç;
	}

	public void setOrç(Orçamento orç) {
		this.orç = orç;
	}
	
	

}

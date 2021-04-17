package tp03;

import java.util.ArrayList;
import java.util.Date;

public class Evento {

	private String nomeEve;
	private Date dataEv;
	private ArrayList<Convidado> convidados = new ArrayList<Convidado>();
	private Float saldo;
	private Orçamento orç = new Orçamento();
	private Gastos gastoTotal;
	private Gastos gasto;
			
	public Evento() {
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

	public Date getDataEv() {
		return dataEv;
	}

	public void setDataEv(Date dataEv) {
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

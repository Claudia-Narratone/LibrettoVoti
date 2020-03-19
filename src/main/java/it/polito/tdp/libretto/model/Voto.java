package it.polito.tdp.libretto.model;

import java.time.LocalDate;

public class Voto {

	private String nomeCorso;
	private int voto;
	private LocalDate data;
	
	
	public Voto(String nomeCorso, int voto, LocalDate data) {
		super();
		this.nomeCorso = nomeCorso;
		this.voto = voto;
		this.data = data;
	}


	public String getNomeCorso() {
		return nomeCorso;
	}


	public int getVoto() {
		return voto;
	}


	public LocalDate getData() {
		return data;
	}


	public void setNomeCorso(String nomeCorso) {
		this.nomeCorso = nomeCorso;
	}


	public void setVoto(int voto) {
		this.voto = voto;
	}


	public void setData(LocalDate data) {
		this.data = data;
	}


	@Override
	public String toString() {
		return "Voto [nomeCorso=" + nomeCorso + ", voto=" + voto + ", data=" + data + "]";
	}
	
	
}

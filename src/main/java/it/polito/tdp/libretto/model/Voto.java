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


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomeCorso == null) ? 0 : nomeCorso.hashCode());
		return result;
	}


	//ridefinisco equals così indexOf() può ritenere uguali due oggetti voto se hanno lo stesso nome corso
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Voto other = (Voto) obj;
		if (nomeCorso == null) {
			if (other.nomeCorso != null)
				return false;
		} else if (!nomeCorso.equals(other.nomeCorso))
			return false;
		return true;
	}
	
	
}

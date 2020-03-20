package it.polito.tdp.libretto.model;

import java.util.ArrayList;
import java.util.List;

public class Libretto {
	
	private List<Voto> voti=new ArrayList<Voto>();
	

	public boolean add(Voto v) {
		if(this.isConflitto(v)||this.isDuplicato(v))
			return false;
		else {
			voti.add(v);
			return true;
		}
			
	}
	
	public String toString() {
		String s="";
		for(Voto v:this.voti) {
			s+=v.toString()+"\n";
		}
		return s;
	}
	
	public String stampaVotiUguali(int voto) {
		String s="";
		for(Voto v:this.voti) {
			if(v.getVoto()==voto) {
				s+=v.toString()+"\n";
			}
		}
		return s;
	}
	
	public Libretto estraiVotiUguali(int voto) {
		Libretto nuovo=new Libretto();
		for(Voto v:voti) {
			if(v.getVoto()==voto) {
				nuovo.add(v);
			}
		}
		return nuovo;
	}
	
	public Voto cercaNomeCorso(String nomeCorso) {
		/*for(Voto v:voti) {
			if(v.getNomeCorso().equals(nomeCorso)) {
				return v;
			}
		}
		return null;*/
		
		int posizione=this.voti.indexOf(new Voto(nomeCorso, 0, null));
		if(posizione!=-1)
			return this.voti.get(posizione);
		else
			return null;
	}
	
	public boolean isDuplicato(Voto v) {
		Voto esiste=this.cercaNomeCorso(v.getNomeCorso());
		if(esiste==null)
			return false;
		return(esiste.getVoto()==v.getVoto());
	}
//determina se esiste un oggetto Voto con lo stesso nome corso ma voto  diverso:
	public boolean isConflitto(Voto v) {
		Voto esiste=this.cercaNomeCorso(v.getNomeCorso());
		if(esiste==null)
			return false;
		return(esiste.getVoto()!=v.getVoto());
	}
}

package it.polito.tdp.libretto.model;

import java.util.ArrayList;
import java.util.List;

public class Libretto {
	
	private List<Voto> voti=new ArrayList<Voto>();
	

	public void add(Voto v) {
		voti.add(v);
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
}

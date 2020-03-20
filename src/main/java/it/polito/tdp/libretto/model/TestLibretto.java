package it.polito.tdp.libretto.model;

import java.time.LocalDate;

public class TestLibretto {
	
	Libretto lib;
	
	private void run() {
		this.lib=new Libretto();
		Voto v2=new Voto("Analisi 2", 24,LocalDate.of(2019, 06, 20) );
		Voto v1=new Voto("Tecniche di Programmazione", 30, LocalDate.of(2019, 06, 15));
		
		lib.add(v1);
		lib.add(v2);
		lib.add(new Voto("Economia", 26,LocalDate.of(2019, 06, 25)));
		
		System.out.println(this.lib);
		System.out.println(this.lib.stampaVotiUguali(20));
		System.out.println(this.lib.estraiVotiUguali(24));
		
		String nomeCorso="Analisi 2";
		Voto votoAnalisi=lib.cercaNomeCorso(nomeCorso);
		System.out.println("Il voto di "+nomeCorso+" é "+votoAnalisi);
		}

	public static void main(String[] args) {
		TestLibretto test= new TestLibretto();
		test.run();
	}
	
	
}

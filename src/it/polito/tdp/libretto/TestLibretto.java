package it.polito.tdp.libretto;

import java.time.LocalDate;
import java.util.List;

public class TestLibretto {

	public static void main(String[] args) {
		Libretto libr = new Libretto();
		
		libr.add( new Voto(30, "Analisi I", LocalDate.of(2017, 1, 15)) );
		libr.add( new Voto(25, "Analisi II", LocalDate.of(2017, 3, 13)) );
		libr.add( new Voto(23, "Fisica I", LocalDate.of(2017, 2, 1)) );
		libr.add( new Voto(22, "Fisica II", LocalDate.of(2018, 7, 7)) );
		libr.add( new Voto(25, "Geometria", LocalDate.of(2018, 6, 4)) );
		libr.add( new Voto(28, "Programmazione ad oggetti", LocalDate.of(2017, 9, 3)) );
		libr.add( new Voto(18, "Economia", LocalDate.of(2018, 2, 5)) );
		libr.add( new Voto(30, "RIcerca operativa", LocalDate.of(2019, 8, 15)) );
		libr.add( new Voto(25, "Sistemi di produzione", LocalDate.of(2019, 6, 15)) );
		libr.add( new Voto(20, "Sistemi telematici", LocalDate.of(2019, 1, 15)) );
   
		List<Voto> venticinque = libr.cercaVoti(25);
	    System.out.println(venticinque);
	}

}

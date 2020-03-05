package it.polito.tdp.libretto;

import java.time.LocalDate;
import java.util.*;

public class Libretto {
	private List <Voto> voti ;
	
	public Libretto () {
		this.voti= new ArrayList <Voto>();
	}

 public void add(Voto v) {
	 voti.add(v);
 }
 
 public List<Voto> cercaVoti (int punti){
	 List <Voto> result = new ArrayList<Voto>();
	 for (Voto v : this.voti) {
		 if (v.getPunti()==punti)
			 result.add(v);
	 }
	 return result;
 }
 public Voto cercaEsame(String nomeEsame) {
	/* for (Voto v : this.voti) {
		 if (v.getCorso().equals(nomeEsame) )
			 return v;
	 }*/
	 Voto voto = new Voto(0, nomeEsame, null);// il metodo equals considera solo nomeEsame per come 
	 //lo abbiamo implementato
	 int pos = this.voti.indexOf(voto);
	 if (pos ==-1)
	     return null;
	 else
		 return this.voti.get(pos);
 }
 /**
  * Dato un voto determina se esiste gi aun voto con uguale corso e punteggio.
  * @param v
  * @return
  */
 public boolean esisteGiaVoto(Voto v) {
	 
	  Voto trovato = this.cercaEsame(v.getCorso());
	  if (trovato ==null) {
		  return false;
		 
	  }
	  if (trovato.getPunti()==v.getPunti()){
		  return true;
		  }else
	      return false;
 }
 
 
 
 
 
 
 
 
 
}

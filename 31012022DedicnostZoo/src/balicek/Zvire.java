package balicek;

import java.time.LocalDate;
import java.util.List;

public class Zvire {
	LocalDate datumNarozeni;
	List<Integer>hodinyKrmeni;
	int pocetKrmeniZaDen;
	String jmeno;
	boolean zijuVCesku;
	
	public Zvire (LocalDate datumNarozeni, String jmeno, boolean zijuVCesku) {
		this.datumNarozeni = LocalDate.parse("2010-01-01");
		this.jmeno = "Honza";
		this.zijuVCesku = true;
	}
	
	public void vypisInformace(){
		System.out.println("Zvíøe je narozeno " + datumNarozeni + ", jmenuje se " + jmeno + ". Žije zvíøe v ÈR? " + zijuVCesku);
	}

	
	
	public LocalDate getDatumNarozeni() {
		return datumNarozeni;
	}

	public void setDatumNarozeni(LocalDate datumNarozeni) {
		this.datumNarozeni = datumNarozeni;
	}

	public List<Integer> getHodinyKrmeni() {
		return hodinyKrmeni;
	}

	public void setHodinyKrmeni(List<Integer> hodinyKrmeni) {
		this.hodinyKrmeni = hodinyKrmeni;
	}

	public int getPocetKrmeniZaDen() {
		return pocetKrmeniZaDen;
	}

	public void setPocetKrmeniZaDen(int pocetKrmeniZaDen) {
		this.pocetKrmeniZaDen = pocetKrmeniZaDen;
	}

	public String getJmeno() {
		return jmeno;
	}

	public boolean isZijuVCesku() {
		return zijuVCesku;
	}

	
}

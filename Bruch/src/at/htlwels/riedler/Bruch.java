package at.htlwels.riedler;

public class Bruch {
	private int zaehler;
	private int nenner = 1;
	
	public void setzezaehler(int zaehler){
		//Objektkomponente zaehler setzen
	this.zaehler= zaehler;
	}
	public void setzeNenner(int nenner) {
		//Ausnahme ausloesen wenn nenner 0 ist
		//alternativ: wenn nenner ==0 return false (void durch boolean ersetzen)
		if (nenner==0){
			throw new IllegalArgumentException("Nenner darf nicht 0 sein");
		}
		//Objektkomponente nenner setzen
			this.nenner = nenner;
		}
	
	public int gibZaehler() {
		return this.zaehler;
	}
	public int gibNenner() {
		return nenner;
	}
	
	public Bruch(int zaehler, int nenner) {
		super();
		this.zaehler = zaehler;
		this.nenner = nenner;
	}
	public String toString() {
		return "Bruch [zaehler=" + zaehler + ", nenner=" + nenner + "]";
	}
	
	public int dividiere(){
		return this.zaehler/this.nenner;
	}
	
	public void addiere(Bruch b){
		this.zaehler = this.zaehler * b.nenner + this.nenner * b.zaehler;
		this.nenner =this.nenner * b.nenner;
	}
	
}


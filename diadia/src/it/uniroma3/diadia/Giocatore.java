package it.uniroma3.diadia;

public class Giocatore {
	
	private int cfu;
	private Borsa borsa;
	
	public Giocatore() {
		this.borsa = new Borsa();	//inizializzazione bprsa per giocatore
	}

	public Borsa getBorsa() {
		return borsa;
	}

	public void setBorsa(Borsa borsa) {
		this.borsa = borsa;
	}

	public int getCfu() {
		return cfu;
	}

	public void setCfu(int cfu) {
		this.cfu = cfu;
	}

	
	
	

}

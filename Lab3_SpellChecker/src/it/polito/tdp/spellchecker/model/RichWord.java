package it.polito.tdp.spellchecker.model;

public class RichWord {

	private String parolaInserita;
	private boolean giusto;
	public RichWord(String parolaInserita, boolean giusto) {
		this.parolaInserita = parolaInserita;
		this.giusto = giusto;
	}
	

	public RichWord(String parolaInserita) {
		super();
		this.parolaInserita = parolaInserita;
	}


	public String getParolaInserita() {
		return parolaInserita;
	}

	public void setParolaInserita(String parolaInserita) {
		this.parolaInserita = parolaInserita;
	}

	public boolean isGiusto() {
		return giusto;
	}

	public void setGiusto(boolean giusto) {
		this.giusto = giusto;
	}
	
}

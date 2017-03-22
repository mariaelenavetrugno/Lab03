package it.polito.tdp.spellchecker.model;

public class RichWord {
	
	private String parola;
	private boolean corretta;
	
	public RichWord() {
	}

	/**
	 * @return the parola
	 */
	public String getParola() {
		return parola;
	}

	/**
	 * @param parola the parola to set
	 */
	public void setParola(String parola) {
		this.parola = parola;
	}

	/**
	 * @return the corretta
	 */
	public boolean isCorretta() {
		return corretta;
	}

	/**
	 * @param corretta the corretta to set
	 */
	public void setCorretta(boolean corretta) {
		this.corretta = corretta;
	}
	
	
}

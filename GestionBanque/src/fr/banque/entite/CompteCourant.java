package fr.banque.entite;

import fr.banque.entite.Compte;
import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: CompteCourant
 *
 */
@Entity

public class CompteCourant extends Compte implements Serializable {

	
	private double decouvert;
	private static final long serialVersionUID = 1L;

	public CompteCourant() {
		super();
	}   
	public double getDecouvert() {
		return this.decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}
   
}

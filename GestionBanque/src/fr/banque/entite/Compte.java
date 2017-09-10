package fr.banque.entite;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Compte
 *
 */
@Entity

public class Compte implements Serializable {

	   
	@Id
	private Long CompteId;
	private String Nom;
	private static final long serialVersionUID = 1L;

	public Compte() {
		super();
	}   
	public Long getCompteId() {
		return this.CompteId;
	}

	public void setCompteId(Long pCompteId) {
		this.CompteId = pCompteId;
	}   
	public String getNom() {
		return this.Nom;
	}

	public void setNom(String pNom) {
		this.Nom = pNom;
	}
   
}

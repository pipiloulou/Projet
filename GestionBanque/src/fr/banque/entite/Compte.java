package fr.banque.entite;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Compte
 *
 */
@Entity

public class Compte implements Serializable {

	   
	@Id
	private Long compteId;
	private String nom;
	private static final long serialVersionUID = 1L;

	public Compte() {
		super();
	}   
	public Long getCompteId() {
		return this.compteId;
	}

	public void setCompteId(Long pCompteId) {
		this.compteId = pCompteId;
	}   
	public String getNom() {
		return this.nom;
	}

	public void setNom(String pNom) {
		this.nom = pNom;
	}
   
}

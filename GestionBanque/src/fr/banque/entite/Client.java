package fr.banque.entite;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Client
 *
 */
@Entity

public class Client implements Serializable {

	   
	@Id
	private Long codeClient;
	private String nom;
	private String prenom;
	private Long adresse;
	private static final long serialVersionUID = 1L;

	public Client() {
		super();
	}   
	public Long getCodeClient() {
		return this.codeClient;
	}

	public void setCodeClient(Long codeClient) {
		this.codeClient = codeClient;
	}   
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}   
	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}   
	public Long getAdresse() {
		return this.adresse;
	}

	public void setAdresse(Long adresse) {
		this.adresse = adresse;
	}
   
}

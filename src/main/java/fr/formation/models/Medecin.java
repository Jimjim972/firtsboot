package fr.formation.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Medecin {
	@Id
	@GeneratedValue
	private long idMedecin;
	private String nom,prenom,specialite;
	
	@ManyToOne
	@JoinColumn
	private Hopital h;

	public Medecin(String nom, String prenom, String specialite, Hopital h) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.specialite = specialite;
		this.h = h;
	}

	public Medecin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getIdMedecin() {
		return idMedecin;
	}

	public void setIdMedecin(long idMedecin) {
		this.idMedecin = idMedecin;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	public Hopital getH() {
		return h;
	}

	public void setH(Hopital h) {
		this.h = h;
	}

	


	

}

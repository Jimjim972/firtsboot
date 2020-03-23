package fr.formation.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Patient {
	@Id
	@GeneratedValue
	private long idPatient;
	private String nom,prenom,patholagie;
	
	@ManyToOne
	@JoinColumn
	private Medecin m;
	
	
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Patient(String nom, String prenom, String patholagie, Medecin m) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.patholagie = patholagie;
		this.m = m;
	}



	public long getIdPatient() {
		return idPatient;
	}

	public void setIdPatient(long idPatient) {
		this.idPatient = idPatient;
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

	public String getPatholagie() {
		return patholagie;
	}

	public void setPatholagie(String patholagie) {
		this.patholagie = patholagie;
	}

	public Medecin getM() {
		return m;
	}

	public void setM(Medecin m) {
		this.m = m;
	}

	
	
	
	

}

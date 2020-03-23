package fr.formation.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_hopital")
public class Hopital {
	@Id
	@GeneratedValue
	private long idHopital;
	private String nom,adress;
	private int capacite;
	
	public Hopital() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hopital(String nom, String adress, int capacité) {
		super();
		this.nom = nom;
		this.adress = adress;
		this.capacite = capacité;
	}

	public long getIdHopital() {
		return idHopital;
	}

	public void setIdHopital(long idHopital) {
		this.idHopital = idHopital;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getCapacite() {
		return capacite;
	}

	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}

	

	
	

}

package fr.formation.service;

import java.util.List;

import fr.formation.models.Medecin;



public interface IMedecinService {
	
	public Medecin createMedecin(Medecin m);
	public Medecin updateHopial(Medecin m);
	public void delateMedecin(Long id);
	public Medecin getMedecin(Long id);
	public List<Medecin> getAllMedecin();
	public Medecin setAttributeHopital(Long idM, Long idH);

}

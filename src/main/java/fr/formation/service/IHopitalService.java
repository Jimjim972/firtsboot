package fr.formation.service;

import java.util.List;


import fr.formation.models.Hopital;

public interface IHopitalService {
	
	public Hopital createHopital(Hopital h);
	public Hopital updateHopial(Hopital h);
	public void delateHopital(Long id);
	public Hopital getHopital(Long id);
	public List<Hopital> getAllHopital();
}
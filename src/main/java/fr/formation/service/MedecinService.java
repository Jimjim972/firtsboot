package fr.formation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.models.Hopital;
import fr.formation.models.Medecin;
import fr.formation.repository.IHopitalRepository;
import fr.formation.repository.IMedecinRepository;
@Service
public class MedecinService implements IMedecinService {

	@Autowired
	IMedecinRepository medecinRespository;
	@Autowired
	IHopitalService hopitalService;
	
	public Medecin createMedecin(Medecin m) {
		// TODO Auto-generated method stub
		return medecinRespository.save(m);
	}

	
	public Medecin updateHopial(Medecin m) {
		// TODO Auto-generated method stub
		return medecinRespository.save(m);
	}


	public void delateMedecin(Long id) {
		// TODO Auto-generated method stub
		
		Medecin m = new Medecin();
		m.setIdMedecin(id);
		medecinRespository.delete(m);
		
	}

	
	public Medecin getMedecin(Long id) {
		Optional<Medecin> opMedecine = medecinRespository.findById(id);
		Medecin medecin = new Medecin();
		if(opMedecine.isPresent()) medecin= opMedecine.get();
		
		return medecin;
	}


	public List<Medecin> getAllMedecin() {
		// TODO Auto-generated method stub
		return medecinRespository.findAll();
	}

	public Medecin setAttributeHopital(Long idM, Long idH) {
		
		Hopital h = hopitalService.getHopital(idH);
		Medecin m = this.getMedecin(idM);
		m.setH(h);
		this.updateHopial(m);
		
		
		return m;
		
	}
}

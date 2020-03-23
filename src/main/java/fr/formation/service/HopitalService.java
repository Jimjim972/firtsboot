package fr.formation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.models.Hopital;
import fr.formation.repository.IHopitalRepository;
@Service
public class HopitalService implements IHopitalService{

	@Autowired
	IHopitalRepository hopitalRepository;
	
	@Override
	public List<Hopital> getAllHopital() {
		// TODO Auto-generated method stub
		return hopitalRepository.findAll();
	}

	@Override
	public Hopital createHopital(Hopital h) {
		// TODO Auto-generated method stub
		return hopitalRepository.save(h);
	
	}

	@Override
	public Hopital updateHopial(Hopital h) {
		// TODO Auto-generated method stub
		return hopitalRepository.save(h);
	}

	@Override
	public void delateHopital(Long id) {
		// TODO Auto-generated method stub
		Hopital h = new Hopital();
		h.setIdHopital(id);
		hopitalRepository.delete(h);
	
	}

	@Override
	public Hopital getHopital(Long id) {
		// TODO Auto-generated method stub
		Optional<Hopital> opHopitale = hopitalRepository.findById(id);
		Hopital hopital = new Hopital();
		if(opHopitale.isPresent()) hopital= opHopitale.get();
		
		return hopital;
	}

}

package fr.formation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import fr.formation.models.Medecin;
import fr.formation.models.Patient;
import fr.formation.repository.IPatientRepository;
@Service
public class PatientService implements IPatientService{

	@Autowired
	IPatientRepository patientRepository;
	@Autowired
	IMedecinService medecinService;

	public Patient createPatient(Patient p) {
		// TODO Auto-generated method stub
		return patientRepository.save(p);
	}

	
	public Patient updateHopial(Patient p) {
		// TODO Auto-generated method stub
		return patientRepository.save(p);
	}

	@Override
	public void delatePatient(Long id) {
		// TODO Auto-generated method stub
		Patient p = new Patient();
		p.setIdPatient(id);
		patientRepository.delete(p);
	}

	@Override
	public Patient getPatient(Long id) {
		Optional<Patient> opPatient = patientRepository.findById(id);
		Patient patient  = new Patient();
		if(opPatient.isPresent()) patient= opPatient.get();
		
		return patient;
	}

	@Override
	public List<Patient> getAllPatient() {
		// TODO Auto-generated method stub
		return patientRepository.findAll();
	}


	@Override
	public Patient setAttributeMedecin(Long idM, Long idP) {
		Medecin m =medecinService.getMedecin(idM);
		Patient p = this.getPatient(idP);
		p.setM(m);
		this.updateHopial(p);
		return p;
	}



}

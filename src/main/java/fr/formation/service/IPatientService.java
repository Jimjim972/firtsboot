package fr.formation.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.models.Patient;

public interface IPatientService {

	
	public Patient createPatient(Patient m);
	public Patient updateHopial(Patient m);
	public void delatePatient(Long id);
	public Patient getPatient(Long id);
	public List<Patient> getAllPatient();
	public Patient setAttributeMedecin(Long idM, Long idP);
}

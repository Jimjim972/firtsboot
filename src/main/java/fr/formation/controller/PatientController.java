package fr.formation.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import fr.formation.models.Patient;
import fr.formation.service.IPatientService;

@RestController
@RequestMapping("patient")
@CrossOrigin("http://localhost:4200")
public class PatientController {
	
	@Autowired
	IPatientService patientService;
	
	@GetMapping("all")
	public List<Patient> getAll(){
		
		return patientService.getAllPatient();
		
	}
	
	@GetMapping("/{id}")
	public Patient getById(@PathVariable Long id) 
	{
		return patientService.getPatient(id);
	}

}

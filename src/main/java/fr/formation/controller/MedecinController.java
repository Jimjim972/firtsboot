package fr.formation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import fr.formation.models.Medecin;
import fr.formation.service.IMedecinService;

@RestController
@RequestMapping("medecin")
@CrossOrigin("http://localhost:4200")
public class MedecinController {
	
	@Autowired
	IMedecinService medecinService;
	
	@GetMapping("/all")
	public List<Medecin> getAll()
	{
		return medecinService.getAllMedecin();
	}
	
	@GetMapping("/{id}")
	public Medecin getById(@PathVariable Long id) 
	{
		return medecinService.getMedecin(id);
	}

	@PostMapping("/newmedecin")
	 public Medecin createHoptital(@RequestBody Medecin m)        
	{
		return medecinService.createMedecin(m);
	}
	
	@DeleteMapping("/{id}")
	public String deleteMedecin(@PathVariable Long id) 
	{
		medecinService.delateMedecin(id);
		return "Le medecin "+id+ "a été supprimé";
	}
	
	@PutMapping("/updatemedecin/{id}")
	public Medecin updateMedecin(@PathVariable Long id, @RequestBody Medecin m) 
	{
		Medecin m1 = medecinService.getMedecin(id);
		m1.setNom(m.getNom());
		m1.setPrenom(m.getPrenom());;
		m1.setSpecialite(m.getSpecialite());
		m1.setH(m.getH());
		
		 return medecinService.updateHopial(m1) ;
	}
	
	@PutMapping("affecterHop/{idM}/{idH}")
	public Medecin affecterHopital(@PathVariable Long idM,@PathVariable Long idH) {
		
		return medecinService.setAttributeHopital(idM, idH);
	}
	
	
}


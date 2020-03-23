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

import fr.formation.models.Hopital;
import fr.formation.service.IHopitalService;

@RestController
@RequestMapping("hopital")//url du we bservice
@CrossOrigin("http://localhost:4200")
public class HopitalController {
	@Autowired  
	IHopitalService hopitalService;
	
	@GetMapping("/all")
	public List<Hopital> getAll()
	{
		return hopitalService.getAllHopital();
	}
	@GetMapping("/{id}")
	public Hopital getById(@PathVariable Long id) 
	{
		return hopitalService.getHopital(id);
	}
	                                    
	@PostMapping("/newhopital")
	 public Hopital createHoptital(@RequestBody Hopital h)        
	{
		return hopitalService.createHopital(h);
	}
  
	@DeleteMapping("/{id}")
	public boolean deleteHopital(@PathVariable Long id) 
	{
		try {
			hopitalService.delateHopital(id);
		} catch (Exception e) {
			return false;
		}
		
		return true;
	}
	
	@PutMapping("/updatehopital/{id}")
	public Hopital updateHopital(@PathVariable Long id, @RequestBody Hopital h) 
	{
		Hopital h1 = hopitalService.getHopital(id);
		h1.setNom(h.getNom());
		h1.setAdress(h.getAdress());
		h1.setCapacite((h.getCapacite()));
		
		 return hopitalService.updateHopial(h1);
	}

}

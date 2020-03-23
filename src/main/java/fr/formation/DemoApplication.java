package fr.formation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.formation.models.Hopital;
import fr.formation.models.Medecin;
import fr.formation.models.Patient;
import fr.formation.service.IHopitalService;
import fr.formation.service.IMedecinService;
import fr.formation.service.IPatientService;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	
	@Autowired
	IHopitalService hopitalService;
	@Autowired
	IMedecinService medecinService;
	@Autowired
	IPatientService patientService;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub    
		
//		Hopital h = new Hopital("chu Pierre Zombda quidman","Chateauboeuf",300);
//		//hopitalService.createHopital(h);
//		 
//		Medecin m = new Medecin("PAVADE", "Jimmy", "Généralsite", null);
//		//medecinService.createMedecin(m);
//		
		medecinService.delateMedecin(6l);
//		
//		Patient p = new Patient("SACARABANY", "Andji", "diabète", null);
//		patientService.createPatient(p);
//		patientService.setAttributeMedecin(2l, 3l);
//		
		
		
	}
	

}

package asw.project.aservice.domain;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class AService {
	
	private String[] animals = {"Orso", "Lupo", "Cane", "Gatto", "Coniglio"};
	
	@Autowired 
	private CService animalsService;
	
	@Value("${eureka.instance.metadataMap.instanceId}")
	String instanceId;
	
	public void saveAnimal() {
		String name = this.instanceId + ": " + this.getRandomAnimal();
		this.animalsService.saveAnimal(name);
	}
	
	public String getAnimal() {
		return this.animalsService.getAnimal();
	}

	private String getRandomAnimal() {
		int rnd = new Random().nextInt(this.animals.length);
		return animals[rnd];
	}

}

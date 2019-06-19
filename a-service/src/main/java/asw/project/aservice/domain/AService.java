package asw.project.aservice.domain;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class AService {
	
	@Autowired 
	private CService animalsService;
	
	@Value("${eureka.instance.metadataMap.instanceId}")
	String instanceId;
	
	@Value("${animals}")
	private String animals;
	
	public void saveAnimal() {
		String name = this.instanceId + ": " + this.getRandomAnimal();
		this.animalsService.saveAnimal(name);
	}
	
	public String getAnimals() {
		return this.animalsService.getAnimals();
	}

	private String getRandomAnimal() {
		String[] animalsArray = this.animals.split(",");
		int rnd = new Random().nextInt(animalsArray.length);
		return animalsArray[rnd];
	}

}

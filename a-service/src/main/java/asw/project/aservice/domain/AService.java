package asw.project.aservice.domain;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class AService {
	
	@Autowired 
	private CService animalsService;
	
	//@Value("${eureka.instance.metadataMap.instanceId}")
	//String instanceId;
	
	@Value("${animals}")
	private String[] animals;
	
	@Value("${names}")
	private String[] names;
	
	private String instanceName;
	
	public void saveAnimal() {
		String name = this.getInstanceName() + ":" + this.getRandomAnimal();
		this.animalsService.saveAnimal(name);
	}

	public String getAnimals() {
		return this.animalsService.getAnimals();
	}

	private String getRandomAnimal() {
		int rnd = new Random().nextInt(this.animals.length);
		return this.animals[rnd];
	}
	
	private String getInstanceName() {
		if(this.instanceName == null) {
			int rnd = new Random().nextInt(this.names.length);
			this.instanceName = this.names[rnd];
		}
		return this.instanceName;
	}

}

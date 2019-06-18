package asw.project.aservice.bservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import asw.project.aservice.domain.BService;

@Service
public class AnimalsService implements BService {
	
	@Autowired 
	private AnimalsClient animalsClient;
	
	public void saveAnimal(String name) {
		animalsClient.saveAnimal(name);
	}
	
	public String getAnimal() {
		return animalsClient.getAnimals(); 
	}
	
}

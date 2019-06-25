package asw.project.bservice.cservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import asw.project.bservice.domain.CService;

@Service
public class AnimalsService implements CService {
	
	@Autowired 
	private AnimalsClient animalsClient;
	
	public void saveAnimal(String name) {
		this.animalsClient.saveAnimal(name);
	}
	
}

package asw.project.cservice.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class CService {
	
	@Value("${eureka.instance.metadataMap.instanceId}")
	String instanceId;
	
	private List<String> animals = new ArrayList<String>();
	
	public void saveAnimal(String name) {
		this.animals.add(name);
	}
	
	public String getAnimals() {
		String commaSeparated = String.join(",", this.animals);
		String r = this.instanceId + ": [" + commaSeparated + "]";
		return r; 
	}

}

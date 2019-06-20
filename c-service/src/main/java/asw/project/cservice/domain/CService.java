package asw.project.cservice.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class CService {
	
	//@Value("${eureka.instance.metadataMap.instanceId}")
	//String instanceId;
	
	@Value("${names}")
	private String[] names;
	
	private String instanceName;
	
	private List<String> animals = new ArrayList<String>();
	
	public void saveAnimal(String name) {
		this.animals.add(name);
	}
	
	public String getAnimals() {
		String commaSeparated = String.join(",", this.animals);
		String r = this.getInstanceName() + ":[" + commaSeparated + "]";
		return r; 
	}
	
	private String getInstanceName() {
		if(this.instanceName == null) {
			int rnd = new Random().nextInt(this.names.length);
			this.instanceName = this.names[rnd];
		}
		return this.instanceName;
	}

}

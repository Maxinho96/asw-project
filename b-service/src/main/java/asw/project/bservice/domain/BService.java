package asw.project.bservice.domain;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class BService {
	
	@Autowired 
	private CService animalsService;
	
	//@Value("${eureka.instance.metadataMap.instanceId}")
	//String instanceId;
	
	@Value("${names}")
	private String[] names;
	
	private String instanceName;
	
    public void onMessage(String message) {
		this.saveAnimal(message);
	}
    
	public void saveAnimal(String message) {
		String name = this.getInstanceName() + ":" + message;
		this.animalsService.saveAnimal(name);
	}
	
	private String getInstanceName() {
		if(this.instanceName == null) {
			int rnd = new Random().nextInt(this.names.length);
			this.instanceName = this.names[rnd];
		}
		return this.instanceName;
	}

}

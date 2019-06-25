package asw.project.bservice.cservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("cservice")
public interface AnimalsClient {
	
	@RequestMapping(value="/", method=RequestMethod.POST)
	public void saveAnimal(@RequestBody String name); 

}

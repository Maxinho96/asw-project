package asw.project.cservice.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import asw.project.cservice.domain.CService;

@RestController
public class CController {
	
	@Autowired
	private CService cService;
	
	@RequestMapping(value="/", method=RequestMethod.POST)
	public void saveAnimal(String name) {
		this.cService.saveAnimal(name);
	}
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String getAnimals() {
		return this.cService.getAnimals();
	}

}

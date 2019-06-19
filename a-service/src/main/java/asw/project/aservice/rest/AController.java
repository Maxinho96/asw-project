package asw.project.aservice.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import asw.project.aservice.domain.AService;

@RestController
public class AController {
	
	@Autowired 
	private AService aService;

	@RequestMapping(value="/", method=RequestMethod.POST)
	public void saveAnimal() {
		this.aService.saveAnimal();
	}
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String getAnimal() {
		return "Prova";
		//return this.aService.getAnimal();
	}

}

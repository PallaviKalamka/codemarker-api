package in.codemarker.api.web;




import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import in.codemarker.api.domain.Technology;
import in.codemarker.api.service.MapValidationErrorService;
import in.codemarker.api.service.TechnologyService;

@RestController
@RequestMapping("/api/technologies")
public class TechnologyController {

	@Autowired
	private TechnologyService technologyService; 
	@Autowired
	private MapValidationErrorService mapValidationErrorService;
	
	@PostMapping("")
	public ResponseEntity<?> createNewBatch(@Valid@RequestBody Technology technology, BindingResult result){
		
		 ResponseEntity<?> errorMap = mapValidationErrorService.mapValidationError(result);
		if(errorMap!=null) {
			return errorMap;
		}
		Technology tech = technologyService.saveOrUpdate(technology);
		 return new ResponseEntity<Technology>(tech, HttpStatus.CREATED);
	    }
	@GetMapping("/all")
	public Iterable<Technology>getAllTechnologies(){
		return technologyService.findALlTechnologies();
	}
	
	@DeleteMapping("/{technologyId}")
	public ResponseEntity<?> removeTechnology(@PathVariable String technologyId) {
		
		technologyService.delete(technologyId);
		return new ResponseEntity<String>("Technology deleted successfully", HttpStatus.OK);
	}
	
	
	
}
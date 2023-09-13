package in.codemarker.api.web;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.codemarker.api.domain.Report;
import in.codemarker.api.service.MapValidationErrorService;
import in.codemarker.api.service.ReportService;

@RestController
@RequestMapping("/api/reports")
public class ReportController {
	
	@Autowired
	private ReportService reportService;
	
	@Autowired
	private MapValidationErrorService mapValidationErrorService;
	
	@PostMapping("")
	
	public ResponseEntity<?> createNewProject(@Valid @RequestBody Report report,BindingResult result){
		
		ResponseEntity<?> errorMap=mapValidationErrorService.mapValidationError(result);
		if(errorMap!=null)
		{
			return errorMap;
		}
		Report repo=reportService.saveOrUpdate(report);
		return new ResponseEntity<Report>(repo,HttpStatus.CREATED);
	
	}
	
	@GetMapping("/all")
	public Iterable<Report> getAllReports(){
		return reportService.findAllReports();
		
	}
	
	@DeleteMapping("/{reportId}")
	public ResponseEntity<?> removeReport(@PathVariable String reportId){
		reportService.delete(reportId);
		return new ResponseEntity<String>("Project Deleted Successsfully",HttpStatus.OK);
		
	}

}

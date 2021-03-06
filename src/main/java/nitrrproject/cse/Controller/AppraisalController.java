package nitrrproject.cse.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nitrrproject.cse.Exception.ResourceNotFoundException;
import nitrrproject.cse.Model.Appraisal;
import nitrrproject.cse.Repository.AppraisalRepository;


@RestController
@RequestMapping("/api/")

public class AppraisalController {



	@Autowired
	private AppraisalRepository AppraisalRepository;

	// get all appraisal reports
	@GetMapping("/appraisal")
	public List<Appraisal> getAllAppraisal(){
		return AppraisalRepository.findAll();
	}

	// create appraisal report rest api
	@PostMapping("/appraisal")
	public Appraisal createAppraisal(@RequestBody Appraisal apprt) {
		return AppraisalRepository.save(apprt);
	}

	// get appraisal report by id rest api
	@GetMapping("/appraisal/{id}")
	public ResponseEntity<Appraisal> getAppraisalById(@PathVariable Long id) {
		Appraisal appraisal = AppraisalRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Appraisal not exist with id :" + id));
		return ResponseEntity.ok(appraisal);
	}

	// update employee rest api

	// @PutMapping("/appraisal/{id}")
	// public ResponseEntity<Appraisal> updateEmployee(@PathVariable Long id, @RequestBody Appraisal reportDetails){
	// 	Appraisal employee = AppraisalRepository.findById(id)
	// 			.orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));

	// 	Appraisal updatedEmployee = AppraisalRepository.save(employee);
	// 	return ResponseEntity.ok(updatedEmployee);
	// }

	// delete appraisal report rest api
	@DeleteMapping("/appraisal/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteAppraisal(@PathVariable Long id){
		Appraisal rep = AppraisalRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));

		AppraisalRepository.delete(rep);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}




}
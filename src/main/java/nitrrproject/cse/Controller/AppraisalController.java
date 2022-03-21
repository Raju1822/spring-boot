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
import org.springframework.web.bind.annotation.PutMapping;
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
	private AppraisalRepository appraisalRepository;

	// get all appraisal reports
	@GetMapping("/appraisal")
	public List<Appraisal> getAllAdmin(){
		return appraisalRepository.findAll();
	}

	// create appraisal report rest api
	@PostMapping("/appraisal")
	public Appraisal createAdmin(@RequestBody Appraisal apprt) {
		return appraisalRepository.save(apprt);
	}

	// get appraisal report by id rest api
	@GetMapping("/apprasisal/{id}")
	public ResponseEntity<Appraisal> getAdminById(@PathVariable Long id) {
		Appraisal rep = appraisalRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Appraisal not exist with id :" + id));
		return ResponseEntity.ok(rep);
	}

	// update employee rest api

	// @PutMapping("/appraisal/{id}")
	// public ResponseEntity<Appraisal> updateEmployee(@PathVariable Long id, @RequestBody Appraisal reportDetails){
	// 	Appraisal repe = appraisalRepository.findById(id)
	// 			.orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));

	// 	employee.setFirstName(employeeDetails.getFirstName());
	// 	employee.setLastName(employeeDetails.getLastName());
	// 	employee.setEmailId(employeeDetails.getEmailId());

	// 	Admin updatedEmployee = adminRepository.save(employee);
	// 	return ResponseEntity.ok(updatedEmployee);
	// }

	// delete appraisal report rest api
	@DeleteMapping("/appraisal/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteEmployee(@PathVariable Long id){
		Appraisal rep = appraisalRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));

		appraisalRepository.delete(rep);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}




}
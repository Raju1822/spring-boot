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

import nitrrproject.cse.Model.Auth;
import nitrrproject.cse.Repository.AuthRepository;


@RestController
@RequestMapping("/api/")

public class AuthController {



	@Autowired
	private AuthRepository AuthRepository;

	// get all employees
	@GetMapping("/auth")
	public List<Auth> getAllAuth(){
		return AuthRepository.findAll();
	}

	// create employee rest api
	@PostMapping("/auth")
	public Auth createAuth(@RequestBody Auth adm) {
		return AuthRepository.save(adm);
	}

	// get employee by id rest api
	@GetMapping("/auth/{id}")
	public ResponseEntity<Auth> getAuthById(@PathVariable Long id) {
		Auth employee = AuthRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Auth not exist with id :" + id));
		return ResponseEntity.ok(employee);
	}

	// update employee rest api

	@PutMapping("/auth/{id}")
	public ResponseEntity<Auth> updateEmployee(@PathVariable Long id, @RequestBody Auth employeeDetails){
		Auth employee = AuthRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));

		employee.setFirstName(employeeDetails.getFirstName());
		employee.setLastName(employeeDetails.getLastName());
		employee.setEmailId(employeeDetails.getEmailId());

		Auth updatedEmployee = AuthRepository.save(employee);
		return ResponseEntity.ok(updatedEmployee);
	}

	// delete employee rest api
	@DeleteMapping("/auth/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteEmployee(@PathVariable Long id){
		Auth employee = AuthRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));

		AuthRepository.delete(employee);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}




}
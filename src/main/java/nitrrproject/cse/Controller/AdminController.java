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
import nitrrproject.cse.Model.Admin;
import nitrrproject.cse.Repository.AdminRepository;


@RestController
@RequestMapping("/api/")

public class AdminController {



	@Autowired
	private AdminRepository adminRepository;

	// get all employees
	@GetMapping("/admin")
	public List<Admin> getAllAdmin(){
		return adminRepository.findAll();
	}

	// create employee rest api
	@PostMapping("/admin")
	public Admin createAdmin(@RequestBody Admin adm) {
		return adminRepository.save(adm);
	}

	// get employee by id rest api
	@GetMapping("/admin/{id}")
	public ResponseEntity<Admin> getAdminById(@PathVariable Long id) {
		Admin employee = adminRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Admin not exist with id :" + id));
		return ResponseEntity.ok(employee);
	}

	// update employee rest api

	@PutMapping("/admin/{id}")
	public ResponseEntity<Admin> updateEmployee(@PathVariable Long id, @RequestBody Admin employeeDetails){
		Admin employee = adminRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));

		employee.setFirstName(employeeDetails.getFirstName());
		employee.setLastName(employeeDetails.getLastName());
		employee.setEmailId(employeeDetails.getEmailId());

		Admin updatedEmployee = adminRepository.save(employee);
		return ResponseEntity.ok(updatedEmployee);
	}

	// delete employee rest api
	@DeleteMapping("/admin/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteEmployee(@PathVariable Long id){
		Admin employee = adminRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));

		adminRepository.delete(employee);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}




}
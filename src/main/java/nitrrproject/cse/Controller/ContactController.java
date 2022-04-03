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
import nitrrproject.cse.Model.Contact;
import nitrrproject.cse.Repository.ContactRepository;


@RestController
@RequestMapping("/api/")

public class ContactController {



	@Autowired
	private ContactRepository contactRepository;

	// get all employees
	@GetMapping("/contact")
	public List<Contact> getAllContact(){
		return contactRepository.findAll();
	}

	// create employee rest api
	@PostMapping("/contact")
	public Contact createContact(@RequestBody Contact mails) {
		return contactRepository.save(mails);
	}

	// get employee by id rest api
	@GetMapping("/contact/{id}")
	public ResponseEntity<Contact> getContactById(@PathVariable Long id) {
		Contact employee = contactRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Contact not exist with id :" + id));
		return ResponseEntity.ok(employee);
	}

	// update employee rest api

	// @PutMapping("/Contact/{id}")
	// public ResponseEntity<Contact> updateEmployee(@PathVariable Long id, @RequestBody Contact employeeDetails){
	// 	Contact employee = ContactRepository.findById(id)
	// 			.orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));

	// 	employee.setFirstName(employeeDetails.getFirstName());
	// 	employee.setLastName(employeeDetails.getLastName());
	// 	employee.setEmailId(employeeDetails.getEmailId());

	// 	Contact updatedEmployee = ContactRepository.save(employee);
	// 	return ResponseEntity.ok(updatedEmployee);
	// }

	// delete employee rest api
	@DeleteMapping("/contact/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteEmployee(@PathVariable Long id){
		Contact employee = contactRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Contact not exist with id :" + id));

		contactRepository.delete(employee);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}




}
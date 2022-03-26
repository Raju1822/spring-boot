package nitrrproject.cse.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nitrrproject.cse.Exception.ResourceNotFoundException;
import nitrrproject.cse.Model.Staff;
import nitrrproject.cse.Repository.StaffRepository;


@RestController
@Controller
@RequestMapping("/api/")

public class StaffController {

	@Autowired
	private StaffRepository staffRepository;

	// get all Staffs
	@GetMapping("/staff")
	public List<Staff> getAllStaff(){
		return staffRepository.findAll();
	}

	// create Staff rest api
	@PostMapping("/staff")
	public Staff createStaff(@RequestBody Staff x) {
		return staffRepository.save(x);
	}

	// get Staff by id rest api
	@GetMapping("/staff/{id}")
	public ResponseEntity<Staff> getStaffById(@PathVariable Long id) {
		Staff staff = staffRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Staff not exist with id :" + id));
		return ResponseEntity.ok(staff);
	}

	// update Staff rest api

	@PutMapping("/staff/{id}")
	public ResponseEntity<Staff> updateStaff(@PathVariable Long id, @RequestBody Staff StaffDetails){
		Staff staff = staffRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Staff not exist with id :" + id));

		staff.setFirstName(StaffDetails.getFirstName());
		staff.setLastName(StaffDetails.getLastName());
		staff.setEmailId(StaffDetails.getEmailId());
		// staff.setReason(StaffDetails.getReason());

		Staff updatedStaff = staffRepository.save(staff);
		return ResponseEntity.ok(updatedStaff);
	}


// update reason in staff table
	@PutMapping("/staff/reason/{id}")
	public ResponseEntity<Staff> updateStaffReason(@PathVariable Long id, @RequestBody Staff StaffDetails){
		Staff staff = staffRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Staff not exist with id :" + id));

		staff.setReason(StaffDetails.getReason());
		staff.setStatus(StaffDetails.getStatus());

		Staff updatedStaff = staffRepository.save(staff);
		return ResponseEntity.ok(updatedStaff);
	}

	// update status of employee tabale for appraisal form
	@PutMapping("/staff/status/{id}")
	public ResponseEntity<Staff> updateStaffStatus(@PathVariable Long id, @RequestBody Staff StaffDetails){
		Staff staff = staffRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Staff not exist with id :" + id));

		staff.setReason(StaffDetails.getReason());
		staff.setStatus(StaffDetails.getStatus());

		Staff updatedStaff = staffRepository.save(staff);
		return ResponseEntity.ok(updatedStaff);
	}



	// delete Staff rest api
	@DeleteMapping("/staff/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteStaff(@PathVariable Long id){
		Staff staff = staffRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Staff not exist with id :" + id));

		staffRepository.delete(staff);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}




}
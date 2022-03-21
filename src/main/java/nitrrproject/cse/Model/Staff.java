package nitrrproject.cse.Model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "staff")

public class Staff {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "email_id")
	private String emailId;

    @Column(name = "password")
	private String password;

	@Column(name = "status")
	private long status;

	@Column(name = "salary")
	private long salary;

	@Column(name = "mobile")
	private long mobile;

	@Column(name = "gender")
	private String gender;

	@Column(name = "doj")
	private String doj;


	public Staff(){

	}

	public Staff(String firstName, String lastName, String emailId, String password, long status, long salary,long mobile, String gender, String doj) {
        super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
        this.password = password;
		this.status = status;
		this.salary = salary;
		this.gender = gender;
		this.mobile = mobile;
		this.doj = doj;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
	public long getStatus() {
		return status;
	}
	public void setStatus(long status) {
		this.status = status;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}

	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}


}
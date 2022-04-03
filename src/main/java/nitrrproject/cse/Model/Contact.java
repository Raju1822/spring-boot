package nitrrproject.cse.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contact")

public class Contact {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "name")
	private String fullName;



	@Column(name = "emailid")
	private String emailId;

    @Column(name = "message")
	private String message;

  public Contact(){

  }

	public Contact(String fullName, String emailId, String message) {
		super();
		this.fullName = fullName;
		this.emailId = emailId;
        this.message = message;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

    public String getMessage(){
        return message;
    }
    public void setMessage(String message){
        this.message = message;
    }
}
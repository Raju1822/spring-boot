package nitrrproject.cse.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import nitrrproject.cse.Model.Contact;


@Repository
public interface ContactRepository extends JpaRepository<Contact, Long>{

}

package nitrrproject.cse.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import nitrrproject.cse.Model.Staff;


@Repository
public interface StaffRepository extends JpaRepository<Staff, Long>{

}


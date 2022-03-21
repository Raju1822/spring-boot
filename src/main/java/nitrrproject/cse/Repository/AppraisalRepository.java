package nitrrproject.cse.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import nitrrproject.cse.Model.Appraisal;


@Repository
public interface AppraisalRepository extends JpaRepository<Appraisal, Long>{

}
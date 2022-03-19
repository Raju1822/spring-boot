package nitrrproject.cse.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import nitrrproject.cse.Model.Auth;


@Repository
public interface AuthRepository extends JpaRepository<Auth, Long>{

}

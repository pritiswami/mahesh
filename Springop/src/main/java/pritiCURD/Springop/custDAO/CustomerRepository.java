package pritiCURD.Springop.custDAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pritiCURD.Springop.custdto.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}

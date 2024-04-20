package lk.ijse.gdse.spring.webmvc.repository;

import lk.ijse.gdse.spring.webmvc.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer,String> {
}

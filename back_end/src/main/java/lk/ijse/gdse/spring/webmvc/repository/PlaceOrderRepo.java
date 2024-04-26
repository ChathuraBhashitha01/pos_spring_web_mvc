package lk.ijse.gdse.spring.webmvc.repository;

import lk.ijse.gdse.spring.webmvc.entity.Placeorder;
import org.hibernate.query.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaceOrderRepo extends JpaRepository<Placeorder,String> {
}

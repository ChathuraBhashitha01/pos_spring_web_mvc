package lk.ijse.gdse.spring.webmvc.repository;

import lk.ijse.gdse.spring.webmvc.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepo extends JpaRepository<OrderDetail,String> {
}

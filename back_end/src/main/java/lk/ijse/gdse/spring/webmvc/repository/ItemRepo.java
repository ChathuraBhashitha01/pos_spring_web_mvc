package lk.ijse.gdse.spring.webmvc.repository;

import lk.ijse.gdse.spring.webmvc.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepo extends JpaRepository<Item,String> {
}

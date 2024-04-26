package lk.ijse.gdse.spring.webmvc.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orderdetail")
public class OrderDetail {
    @Id
    private String orderID;
    private String itemCode;
    private int qty;
    private double price;
}

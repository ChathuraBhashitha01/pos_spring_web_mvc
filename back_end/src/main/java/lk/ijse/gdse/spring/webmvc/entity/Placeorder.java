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
@Table(name = "placeorder")
public class Placeorder {
    @Id
    private String orderID;
    private String date;
    private String customerID;
    private double total;
}

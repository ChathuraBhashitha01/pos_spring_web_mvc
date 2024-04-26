package lk.ijse.gdse.spring.webmvc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Placeorder {
    private String orderID;
    private String date;
    private String customerID;
    private double total;
}

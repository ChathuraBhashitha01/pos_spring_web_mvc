package lk.ijse.gdse.spring.webmvc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetail {
    private String orderID;
    private String itemCode;
    private int qty;
    private double price;
}

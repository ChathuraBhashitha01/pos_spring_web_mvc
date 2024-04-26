package lk.ijse.gdse.spring.webmvc.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetailDTO {
    private String orderID;
    private String itemCode;
    private int qty;
    private double price;
}

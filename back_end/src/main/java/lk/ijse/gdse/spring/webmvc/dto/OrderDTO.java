package lk.ijse.gdse.spring.webmvc.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {
    private String orderID;
    private String date;
    private String customerID;
    private double total;
    private List<OrderDetailDTO> orderDetails;

    public OrderDTO(String orderID, String date, String customerID, double total) {

    }
}

package lk.ijse.gdse.spring.webmvc.service;

import lk.ijse.gdse.spring.webmvc.dto.OrderDTO;
import lk.ijse.gdse.spring.webmvc.dto.OrderDetailDTO;

import java.util.List;

public interface PlaceOrderService {
    List<OrderDetailDTO> getAllDetails();
    void savePlaceOrder(OrderDTO orderDTO);
}

package lk.ijse.gdse.spring.webmvc.service.impl;

import lk.ijse.gdse.spring.webmvc.dto.OrderDTO;
import lk.ijse.gdse.spring.webmvc.dto.OrderDetailDTO;
import lk.ijse.gdse.spring.webmvc.entity.Customer;
import lk.ijse.gdse.spring.webmvc.entity.OrderDetail;
import lk.ijse.gdse.spring.webmvc.entity.Placeorder;
import lk.ijse.gdse.spring.webmvc.repository.OrderDetailRepo;
import lk.ijse.gdse.spring.webmvc.repository.PlaceOrderRepo;
import lk.ijse.gdse.spring.webmvc.service.PlaceOrderService;
import org.modelmapper.ModelMapper;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PlaceOrderServiceImpl implements PlaceOrderService {

    private ModelMapper modelMapper;
    private PlaceOrderRepo placeOrderRepo;
    private OrderDetailRepo orderDetailRepo;

    public PlaceOrderServiceImpl(ModelMapper modelMapper, PlaceOrderRepo placeOrderRepo,OrderDetailRepo orderDetailRepo) {
        this.modelMapper = modelMapper;
        this.placeOrderRepo = placeOrderRepo;
        this.orderDetailRepo=orderDetailRepo;
    }

    @Override
    public List<OrderDetailDTO> getAllDetails() {
        return  placeOrderRepo.findAll().stream().map(order -> modelMapper.map(order, OrderDetailDTO.class)).toList();
    }

    @Override
    public void savePlaceOrder(OrderDTO orderDTO) {
        OrderDTO orderDTO1 = new OrderDTO(orderDTO.getOrderID(), orderDTO.getDate(), orderDTO.getCustomerID(), orderDTO.getTotal());
        placeOrderRepo.save(modelMapper.map(orderDTO1,Placeorder.class));

        for (OrderDetailDTO c:orderDTO.getOrderDetails()) {
            orderDetailRepo.save(modelMapper.map(c, OrderDetail.class));
        }
    }
}

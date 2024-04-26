package lk.ijse.gdse.spring.webmvc.api;

import lk.ijse.gdse.spring.webmvc.dto.OrderDTO;
import lk.ijse.gdse.spring.webmvc.dto.OrderDetailDTO;
import lk.ijse.gdse.spring.webmvc.service.PlaceOrderService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/placeorders")
@CrossOrigin
public class PlaceOrderController {

    private PlaceOrderService placeOrderService;

    public PlaceOrderController(PlaceOrderService placeOrderService) {
        this.placeOrderService = placeOrderService;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void savePlaceOrders(@RequestBody OrderDTO orderDTO){
        placeOrderService.savePlaceOrder(orderDTO);
    }

    @GetMapping(produces =MediaType.APPLICATION_JSON_VALUE )
    public List<OrderDetailDTO> getAllDetails(){
        return placeOrderService.getAllDetails();
    }
}

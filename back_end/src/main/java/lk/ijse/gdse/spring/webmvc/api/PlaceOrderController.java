package lk.ijse.gdse.spring.webmvc.api;

import lk.ijse.gdse.spring.webmvc.dto.OrderDTO;
import lk.ijse.gdse.spring.webmvc.dto.OrderDetailDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/placeorders")
@CrossOrigin
public class PlaceOrderController {

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void savePlaceOrders(@RequestBody OrderDTO orderDTO){

    }

    @GetMapping(produces =MediaType.APPLICATION_JSON_VALUE )
    public List<OrderDetailDTO> getAllDetails(){
        return null;
    }
}

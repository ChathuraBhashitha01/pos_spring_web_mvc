package lk.ijse.gdse.spring.webmvc.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/placeorders")
@CrossOrigin
public class PlaceOrderController {

    @PostMapping()
    public void savePlaceOrders(){

    }
}

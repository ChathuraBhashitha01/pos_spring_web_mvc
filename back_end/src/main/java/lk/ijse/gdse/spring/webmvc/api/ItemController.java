package lk.ijse.gdse.spring.webmvc.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("items")
public class ItemController {

    @GetMapping
    public String getItem(){
        return "Item";
    }
}

package lk.ijse.gdse.spring.webmvc.api;

import lk.ijse.gdse.spring.webmvc.dto.CustomerDTO;
import lk.ijse.gdse.spring.webmvc.service.CustomerService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/customers")
@CrossOrigin
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CustomerDTO> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    @GetMapping(value = "{/id}")
    public CustomerDTO getCustomerDetails(@PathVariable("id") String id){
        return customerService.getCustomerDetails(id);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public boolean saveCustomer(@RequestBody CustomerDTO customerDTO){
        return customerService.saveCustomer(customerDTO);
    }

    @PatchMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public boolean updateCustomer(CustomerDTO customerDTO){
        return customerService.updateCustomer(customerDTO);
    }

    @DeleteMapping(value = "{/id}")
    public boolean deleteCustomer(@PathVariable("id") String id){
        return customerService.deleteCustomer(id);
    }
}

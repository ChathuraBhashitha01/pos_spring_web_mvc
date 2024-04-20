package lk.ijse.gdse.spring.webmvc.service;

import lk.ijse.gdse.spring.webmvc.dto.CustomerDTO;

import java.util.List;

public interface CustomerService {
    List<CustomerDTO> getAllCustomers();
    CustomerDTO getCustomerDetails(String id);
    boolean saveCustomer(CustomerDTO customerDTO);
    boolean updateCustomer(CustomerDTO customerDTO);
    boolean deleteCustomer(String id);
}

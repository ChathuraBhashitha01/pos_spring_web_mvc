package lk.ijse.gdse.spring.webmvc.service.impl;

import lk.ijse.gdse.spring.webmvc.dto.CustomerDTO;
import lk.ijse.gdse.spring.webmvc.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public List<CustomerDTO> getAllCustomers() {
        return null;
    }

    @Override
    public CustomerDTO getCustomerDetails(String id) {
        return null;
    }

    @Override
    public boolean saveCustomer(CustomerDTO customerDTO) {
        return false;
    }

    @Override
    public boolean updateCustomer(CustomerDTO customerDTO) {
        return false;
    }

    @Override
    public boolean deleteCustomer(String id) {
        return false;
    }
}

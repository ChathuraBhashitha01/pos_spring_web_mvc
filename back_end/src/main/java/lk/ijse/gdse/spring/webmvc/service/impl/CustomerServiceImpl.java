package lk.ijse.gdse.spring.webmvc.service.impl;

import lk.ijse.gdse.spring.webmvc.dto.CustomerDTO;
import lk.ijse.gdse.spring.webmvc.entity.Customer;
import lk.ijse.gdse.spring.webmvc.repository.CustomerRepo;
import lk.ijse.gdse.spring.webmvc.service.CustomerService;
import lk.ijse.gdse.spring.webmvc.service.exception.NotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private ModelMapper modelMapper;
    private CustomerRepo customerRepo;

    public CustomerServiceImpl(ModelMapper modelMapper, CustomerRepo customerRepo) {
        this.modelMapper = modelMapper;
        this.customerRepo = customerRepo;
    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
        return customerRepo.findAll().stream().map(customer -> modelMapper.map(customer,CustomerDTO.class)).toList();
    }

    @Override
    public CustomerDTO getCustomerDetails(String id) {
        if(!customerRepo.existsById(id)){
            throw new NotFoundException("CustomerID : "+id+" does not exists");
        }
        return modelMapper.map(customerRepo.findById(id).get(),CustomerDTO.class);
    }

    @Override
    public void saveCustomer(CustomerDTO customerDTO) {
        customerRepo.save(modelMapper.map(customerDTO, Customer.class));
    }

    @Override
    public void updateCustomer(CustomerDTO customerDTO) {
        if(!customerRepo.existsById(customerDTO.getId())){
            throw new NotFoundException("CustomerID : "+customerDTO.getId()+" does not exists");
        }
        customerRepo.save(modelMapper.map(customerDTO, Customer.class));
    }

    @Override
    public void deleteCustomer(String id) {
        if(!customerRepo.existsById(id)){
            throw new NotFoundException("CustomerID : "+id+" does not exists");
        }
        customerRepo.deleteById(id);
    }
}

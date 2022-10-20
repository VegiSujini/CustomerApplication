package guru.springframework.CustomerApplication.services;

import guru.springframework.CustomerApplication.webmodel.CustomerDto;

import java.util.UUID;

public interface CustomerService {

    CustomerDto getCustomerById(UUID customerId) ;
}

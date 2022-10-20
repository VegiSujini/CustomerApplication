package guru.springframework.CustomerApplication.services;

import guru.springframework.CustomerApplication.webmodel.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class CustomerServiceImpl implements CustomerService{
    @Override
    public CustomerDto getCustomerById(UUID customerId){
        return CustomerDto.builder().id(UUID.randomUUID())
                .customerName("Sujini vegi")
                .build();
    }
}

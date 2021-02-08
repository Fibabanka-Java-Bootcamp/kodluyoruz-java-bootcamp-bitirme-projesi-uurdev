package org.kodluyoruz.mybank.customer.service.impl;

import org.kodluyoruz.mybank.customer.dto.CustomerAccountDto;
import org.kodluyoruz.mybank.customer.repository.CustomerRepository;
import org.kodluyoruz.mybank.customer.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Optional<CustomerAccountDto> save(CustomerAccountDto customer) {
        return null;
        //return customerRepository.save()
    }
}

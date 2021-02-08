package org.kodluyoruz.mybank.customer.service;

import org.kodluyoruz.mybank.customer.dto.CustomerAccountDto;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface CustomerService {

    public Optional<CustomerAccountDto> save(CustomerAccountDto customer);
}

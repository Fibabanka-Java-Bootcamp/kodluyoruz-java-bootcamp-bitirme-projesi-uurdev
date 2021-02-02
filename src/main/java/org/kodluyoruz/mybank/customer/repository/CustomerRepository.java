package org.kodluyoruz.mybank.customer.repository;

import org.kodluyoruz.mybank.customer.entity.CustomerAccount;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<CustomerAccount, Long> {
}

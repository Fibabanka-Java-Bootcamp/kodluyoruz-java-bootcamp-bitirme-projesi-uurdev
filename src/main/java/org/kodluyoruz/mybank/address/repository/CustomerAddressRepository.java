package org.kodluyoruz.mybank.address.repository;

import org.kodluyoruz.mybank.address.entity.CustomerAddress;
import org.springframework.data.repository.CrudRepository;

public interface CustomerAddressRepository extends CrudRepository<CustomerAddress, Long> {
}

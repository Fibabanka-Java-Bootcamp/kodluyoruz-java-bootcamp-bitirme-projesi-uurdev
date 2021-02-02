package org.kodluyoruz.mybank.account.repository;

import org.kodluyoruz.mybank.account.entity.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Long> {
}

package org.kodluyoruz.mybank.account.repository;

import org.kodluyoruz.mybank.account.entity.BankAccount;
import org.springframework.data.repository.CrudRepository;

public interface BankAccountRepository extends CrudRepository<BankAccount, Long> {
}

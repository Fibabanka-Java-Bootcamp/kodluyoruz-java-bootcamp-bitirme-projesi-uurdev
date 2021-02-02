package org.kodluyoruz.mybank.card.repository;

import org.kodluyoruz.mybank.card.entity.CustomerCard;
import org.springframework.data.repository.CrudRepository;

public interface CustomerCardRepository  extends CrudRepository<CustomerCard,Long> {
}

package org.kodluyoruz.mybank.account.entity;

import lombok.*;
import org.kodluyoruz.mybank.account.enums.AccountMoneyType;
import org.kodluyoruz.mybank.account.enums.AccountType;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "account")
@Entity
@Builder
public class Account {

    @Id
    @GeneratedValue
    private Long accountId;

    private String iban;

    private BigDecimal balance;

    @Enumerated(value = EnumType.STRING)
    private AccountType accountType;

    @Enumerated(value = EnumType.STRING)
    private AccountMoneyType accountMoneyType;

    private Date accountCreateDate;

    /*
        TODO :  this entity owner relation with : customerId;
     */
}

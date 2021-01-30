package org.kodluyoruz.mybank.account.entity;

import lombok.*;
import org.kodluyoruz.mybank.account.enums.AccountMoneyType;
import org.kodluyoruz.mybank.account.enums.AccountType;
import org.kodluyoruz.mybank.card.entity.CustomerCard;
import org.kodluyoruz.mybank.customer.CustomerAccount;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "account" ,uniqueConstraints = @UniqueConstraint(columnNames = {"iban"}))
@Entity
@Builder
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long accountId;

    @Column(name = "iban")
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

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private CustomerAccount customerAccount;

    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL)
    private Set<CustomerCard> customerCards;
}

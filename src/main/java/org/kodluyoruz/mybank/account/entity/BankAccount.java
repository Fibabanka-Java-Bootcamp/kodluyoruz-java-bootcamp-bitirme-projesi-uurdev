package org.kodluyoruz.mybank.account.entity;

import lombok.*;
import org.kodluyoruz.mybank.account.enums.BankAccountMoneyType;
import org.kodluyoruz.mybank.account.enums.BankAccountType;
import org.kodluyoruz.mybank.card.entity.CustomerCard;
import org.kodluyoruz.mybank.customer.entity.CustomerAccount;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "bankAccount" ,uniqueConstraints = @UniqueConstraint(columnNames = {"iban"}))
@Entity
@Builder
public class BankAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long accountId;

    @Column(name = "iban")
    private String iban;

    private BigDecimal balance;

    @Enumerated(value = EnumType.STRING)
    private BankAccountType bankAccountType;

    @Enumerated(value = EnumType.STRING)
    private BankAccountMoneyType bankAccountMoneyType;

    private Date accountCreateDate;

    /*
        TODO :  this entity owner relation with : customerId;
     */

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private CustomerAccount customerAccount;

    @OneToMany(mappedBy = "bankAccount", cascade = CascadeType.ALL)
    private Set<CustomerCard> customerCards;
}

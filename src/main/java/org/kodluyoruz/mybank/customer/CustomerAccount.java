package org.kodluyoruz.mybank.customer;

import lombok.*;
import org.kodluyoruz.mybank.account.entity.Account;
import org.kodluyoruz.mybank.address.entity.CustomerAddress;

import javax.persistence.*;
import java.util.Set;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customerAccount")
public class CustomerAccount {

    @Id
    private Long customerId;

    private String customerName;

    private String customerLastName;

    private String customerPhone;

    private String customerMail;

    private String customerCreateDate;

   /*
    TODO : relation customeraccount(1) - account(many)(vadeli-birikim)
    */

    @OneToMany(mappedBy = "customerAccount", cascade = CascadeType.ALL)
    private Set<Account> accounts;


    @OneToMany(mappedBy = "customerAccount", cascade = CascadeType.ALL)
    private Set<CustomerAddress> customerAddresses;


}

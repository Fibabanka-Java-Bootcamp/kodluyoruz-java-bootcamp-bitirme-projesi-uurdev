package org.kodluyoruz.mybank.customer;

import com.sun.xml.bind.v2.TODO;
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
    private Long identityNo;

    private String customerName;

    private String customerLastName;

    private String customerPhone;

   /*
    TODO : relation customeraccount(1) - account(many)(vadeli-birikim)
    */

    @OneToOne(mappedBy = "accountDetail", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private CustomerDetail customerDetail;

    @OneToMany(mappedBy = "customerAccount", cascade = CascadeType.ALL)
    private Set<Account> accounts;


    @OneToMany(mappedBy = "customerAccount", cascade = CascadeType.ALL)
    private Set<CustomerAddress> customerAddresses;


}

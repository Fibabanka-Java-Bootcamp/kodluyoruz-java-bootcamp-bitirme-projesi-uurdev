package org.kodluyoruz.mybank.customer.entity;

import lombok.*;
import org.kodluyoruz.mybank.account.entity.BankAccount;
import org.kodluyoruz.mybank.address.entity.CustomerAddress;
import org.kodluyoruz.mybank.customer.dto.CustomerAccountDto;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "customerAccount")
public class CustomerAccount {

    @Id
    private Long identityNo;

    private String customerName;

    private String customerLastName;

    private String customerPhone;


    private String customerMail;

    private String customerPassword;

    private Date customerCreateDate;

   /*
    TODO : relation customeraccount(1) - account(many)(vadeli-birikim)
    */

    @OneToOne(mappedBy = "customerAccount", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private CustomerToken customerToken;

    @OneToMany(mappedBy = "customerAccount", cascade = CascadeType.ALL)
    private Set<BankAccount> bankAccounts;


    @OneToMany(mappedBy = "customerAccount", cascade = CascadeType.ALL)
    private Set<CustomerAddress> customerAddresses;


    public CustomerAccountDto toCustomerDto(){
        return CustomerAccountDto.builder()
                .customerLastName(this.customerLastName)
                .customerMail(this.customerMail)
                .customerPhone(this.customerPhone)
                .customerName(this.customerName)
                .build();
    }

}

package org.kodluyoruz.mybank.customer.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customerIdentity")
public class CustomerToken {

    @Id
    @GeneratedValue
    private Long id;

    private String customerToken;

    private Date tokenCreateTime;

    private Date tokenExpiryTime;

    @OneToOne
    @JoinColumn(name = "customer_id")
    private CustomerAccount customerAccount;
}

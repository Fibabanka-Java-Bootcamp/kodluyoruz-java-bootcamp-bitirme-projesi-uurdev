package org.kodluyoruz.mybank.customer;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
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

    private Long tokenOwnerCustomer;
}

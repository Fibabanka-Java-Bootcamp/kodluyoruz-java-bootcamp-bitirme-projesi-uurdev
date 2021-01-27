package org.kodluyoruz.mybank.customer;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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

}

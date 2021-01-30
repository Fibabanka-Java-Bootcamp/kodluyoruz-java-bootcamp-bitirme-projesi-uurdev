package org.kodluyoruz.mybank.customer;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customerDetail")
public class CustomerDetail {

    @Id
    @Column(name = "identity_no")
    private Long id;

    private String customerPassword;

    private String customerMail;

    private Date customerCreateDate;

    @OneToOne
    @MapsId
    @JoinColumn(name = "identity_no")
    private CustomerAccount accountDetail;

}

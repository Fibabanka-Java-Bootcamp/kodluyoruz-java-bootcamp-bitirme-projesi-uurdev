package org.kodluyoruz.mybank.customer.entity;

import lombok.*;
import org.kodluyoruz.mybank.customer.entity.CustomerAccount;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.*;
import java.util.Date;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customerDetail")
@Controller
@RestController
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

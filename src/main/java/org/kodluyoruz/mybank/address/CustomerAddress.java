package org.kodluyoruz.mybank.address;


import lombok.*;
import org.kodluyoruz.mybank.address.enums.AddressType;

import javax.persistence.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customerAddress")
public class CustomerAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long addressId;

    private String county;

    private String district;

    private String zipCode;

    private String anotherDetail;

    private AddressType addressType;

    /*
       TODO :  added customer relation
       Customer(ONE) -> CustomerAddress(MANY)(Relation OWNER)
       //customerNo
     */
}

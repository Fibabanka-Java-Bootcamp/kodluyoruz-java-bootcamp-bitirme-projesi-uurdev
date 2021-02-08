package org.kodluyoruz.mybank.customer.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.kodluyoruz.mybank.address.dto.CustomerAddressDto;
import org.kodluyoruz.mybank.customer.entity.CustomerAccount;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class CustomerAccountDto {
    private String customerName;

    private String customerLastName;

    private String customerPhone;

    private String customerMail;

    private Set<CustomerAddressDto> customerAddress;

}

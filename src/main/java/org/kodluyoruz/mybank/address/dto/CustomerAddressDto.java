package org.kodluyoruz.mybank.address.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.kodluyoruz.mybank.address.enums.AddressType;
import org.kodluyoruz.mybank.customer.dto.CustomerAccountDto;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class CustomerAddressDto {

    private String county;

    private String district;

    private String zipCode;

    private String anotherDetail;

    private AddressType addressType;

    private CustomerAccountDto customerAccount;
}

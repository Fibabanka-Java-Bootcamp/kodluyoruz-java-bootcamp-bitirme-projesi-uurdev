package org.kodluyoruz.mybank.customer.dto;

import org.kodluyoruz.mybank.address.dto.CustomerAddressDto;

import java.util.Set;

public class CustomerDto {
    private String customerName;

    private String customerLastName;

    private String customerPhone;

    private String customerMail;

    private Set<CustomerAddressDto> customerAddress;
}

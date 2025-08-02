package com.springbank.mapper;

import com.springbank.customer.dto.CustomerDto;
import com.springbank.customer.dto.CustomerIU;
import com.springbank.customer.entity.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    CustomerDto toDto(Customer customer);

    Customer toEntity(CustomerIU customerIU);

    void updateCustomerFromDto(CustomerIU dto, @MappingTarget Customer customer);
}
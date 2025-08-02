package com.springbank.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerDto {
    private Long id;
    private String fullName;
    private String email;
    private String phone;
    private String city;
}
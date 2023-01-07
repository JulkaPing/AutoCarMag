package ru.ecosystem.aurtocarmag.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class SignUpDto {

    private String username;

    private String password;

    private String secretHash;

    private String secretNumber;
}

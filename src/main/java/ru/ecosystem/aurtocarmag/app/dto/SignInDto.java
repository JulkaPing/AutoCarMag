package ru.ecosystem.aurtocarmag.app.dto;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class SignInDto {

    private String username;

    private String password;
}

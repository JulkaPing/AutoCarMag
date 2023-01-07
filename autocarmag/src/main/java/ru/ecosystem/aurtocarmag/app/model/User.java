package ru.ecosystem.aurtocarmag.app.model;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class User {

    private long id;

    private String username;

    private String password;
}

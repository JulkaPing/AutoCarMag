package ru.ecosystem.aurtocarmag.app.model;

import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
@Getter
@Setter
public class Auto {
    private long id;
    private String model;
    private String marka;
    private String price;
    private String author;
    private String description;
    private byte[] photo;
    private LocalDateTime created;
}

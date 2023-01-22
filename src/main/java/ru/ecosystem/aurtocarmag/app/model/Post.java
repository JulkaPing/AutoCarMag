package ru.ecosystem.aurtocarmag.app.model;

import lombok.*;
import ru.ecosystem.aurtocarmag.app.dto.enums.SellStatus;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
@Getter
@Setter
public class Post {
    private long id;
    private Car car;
    private String description;
    private String price;
    private byte[] photo;
    private LocalDateTime created;
    private SellStatus sellStatus;
    private User user;
}

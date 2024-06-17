package com.bookMyWish.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="users")
public class Movie {
    @Id
    private String movieId;
    private String title;
    private String genre;
    private int year;
    private String director;
}

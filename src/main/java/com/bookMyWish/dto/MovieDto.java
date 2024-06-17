package com.bookMyWish.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MovieDto {

    private String movieId;
    private String title;
    private String genre;
    private int year;
    private String director;
}

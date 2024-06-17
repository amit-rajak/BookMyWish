package com.bookMyWish.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MovieDto {

    private String id;
    private String title;
    private String genre;
    private int year;
    private String director;
}

package com.bookMyWish.Service;

import com.bookMyWish.dto.MovieDto;
import org.springframework.stereotype.Service;

@Service
public interface MovieService {
    MovieDto createMovie(MovieDto movieDto);

}

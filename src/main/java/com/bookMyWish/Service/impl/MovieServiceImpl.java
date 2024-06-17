package com.bookMyWish.Service.impl;


import com.bookMyWish.Repository.MovieReopsitory;
import com.bookMyWish.Service.MovieService;
import com.bookMyWish.dto.MovieDto;
import com.bookMyWish.entity.Movie;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class MovieServiceImpl  implements MovieService {

    @Autowired(required=true)
    private ModelMapper mapper;
    @Autowired
    MovieReopsitory movieReopsitory;

    @Override
    public MovieDto createMovie(MovieDto movieDto) {


        String userId= UUID.randomUUID().toString();
        movieDto.setId(userId);
        //dto->entity
        Movie movie=dtoToEntity(movieDto);
        Movie savedMovie= movieReopsitory.save(movie);
        //entity->dto
        MovieDto movieDto1=entityToDto(savedMovie);
        return movieDto1;
    }

    private Movie dtoToEntity(MovieDto movieDto) {
        return mapper.map(movieDto,Movie.class);
    }
    private MovieDto entityToDto(Movie savedMovie) {

        return mapper.map(savedMovie,MovieDto.class);
    }
}

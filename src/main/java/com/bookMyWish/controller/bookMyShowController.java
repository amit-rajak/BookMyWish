package com.bookMyWish.controller;


import com.bookMyWish.Service.MovieService;
import com.bookMyWish.dto.MovieDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bookMyShow")
public class bookMyShowController {

   @Autowired
   private  MovieService movieService;

    @PostMapping("/movies")
    public ResponseEntity<MovieDto> createUser(@RequestBody MovieDto movieDto)
    {
        MovieDto movie= movieService.createMovie(movieDto);
        return new ResponseEntity<>(movie, HttpStatus.CREATED);
    }

}

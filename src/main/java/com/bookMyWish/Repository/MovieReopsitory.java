package com.bookMyWish.Repository;

import com.bookMyWish.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieReopsitory extends JpaRepository<Movie,String> {

}

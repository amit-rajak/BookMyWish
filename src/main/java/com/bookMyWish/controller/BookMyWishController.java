package com.bookMyWish.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bookmywish")
public class BookMyWishController {


    @GetMapping("/getData")
                public String say(){
                    System.out.println("Hello");
                    return  "hello Book My Wish";
                }


}

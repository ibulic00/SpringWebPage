package com.example.SpringWebPage.controllers;

import com.example.SpringWebPage.repositories.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {

    AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }
    @RequestMapping(name = "/authors")
    public String getAuthors(Model model){

        model.addAttribute("Authors", authorRepository.findAll());

        return "books/authors";

    }

}
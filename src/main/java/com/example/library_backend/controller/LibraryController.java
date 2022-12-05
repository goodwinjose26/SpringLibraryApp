package com.example.library_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {
    @GetMapping("/")
    public String home()
    {
        return "WELCOME TO LIBRARY APP";
    }
    @PostMapping("/login")
    public String login()
    {
        return "LOGIN DETAILS";
    }
    @PostMapping("/registration")
    public String registration()
    {
        return "REGISTRATION DETAILS";
    }
    @PostMapping("/add")
    public String add()
    {
        return "ADD BOOK DETAILS";
    }
    @PostMapping("/view")
    public String view()
    {
        return "VIEW BOOK DETAILS";
    }
    @PostMapping("/edit")
    public String edit()
    {
        return "EDIT BOOK DETAILS";
    }
    @PostMapping("/search")
    public String search()
    {
        return "SEARCH BOOK";
    }
    @PostMapping("/delete")
    public String delete()
    {
        return "DELETE BOOK";
    }
}

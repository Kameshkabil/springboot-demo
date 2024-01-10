package com.example.springbootdemo.controller;

import com.example.springbootdemo.entity.Book;
//import com.example.springbootdemo.model.Registration;
import com.example.springbootdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class BookController {

    @Autowired
    private StudentService studentService;
    @RequestMapping(value = "/books" , method = RequestMethod.GET)
    public List<Book> getBooks(){


        return studentService.getBooks();
    }

//    @GetMapping("getUsername/{username}")
//    public String getUserName(@PathVariable (value = "username") String n){
//        return  "HI "+ n;
//    }

//    @Autowired
//    StudentService studentService;
//
//    @PostMapping("/registration")
//
//    public Registration addValue(@RequestBody Registration registration){
//
//        return this.studentService.addData(registration);
//    }




}

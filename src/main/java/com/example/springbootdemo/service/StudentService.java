package com.example.springbootdemo.service;

import com.example.springbootdemo.entity.Book;
//import com.example.springbootdemo.model.Registration;
//import com.example.springbootdemo.repo.JpaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

//    @Autowired
//    JpaRepo jpa;

    static List<Book> bookList = Arrays.asList(
            new Book(1,"2 states", "desc of 2 states",2007,"fiction"),
            new Book(2,"Harry potter","desc of hp",2003 , "fiction"),
            new Book(3,"The Air","desc of air",2015, "non-fiction")
    );

    //Get

    public List<Book> getBooks(){
        return bookList;
    }
}

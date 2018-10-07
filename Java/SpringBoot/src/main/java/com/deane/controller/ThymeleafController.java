package com.deane.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by IntelliJ IDEA.
 * User: Deane
 * Date: 2018/10/4
 * Time: 11:00 AM
 */
@Controller
@RequestMapping
public class ThymeleafController {
    @GetMapping("/index")
    public ModelAndView index() {
        ModelAndView view = new ModelAndView();
        view.setViewName("index");
        view.addObject("title", "my first web page");
        view.addObject( "desc", "welcome to my web system");
        Author author = new Author();
        author.setAge(40);
        author.setEmail("11953356@qq.com");
        author.setName("Deane");
        view.addObject("author", author);

        return view;
    }


    @GetMapping("/index1")
    public String index1(HttpServletRequest request) {
        request.setAttribute("title", "my first web page");
        request.setAttribute( "desc", "welcome to my web system");
        Author author = new Author();
        author.setAge(40);
        author.setEmail("11953356@qq.com");
        author.setName("Deane");
        request.setAttribute("author", author);

        return "index";
    }
}

class Author {
    private int age;
    private String name;
    private String email;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
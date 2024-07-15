package com.example.servingwebcontent.controller;

import com.mysql.jdbc.Driver;
import org.springframework.boot.autoconfigure.amqp.RabbitProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.print.DocFlavor;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Controller
public class MainController {

    @GetMapping("/")
    public String main( Model model) {
        model.addAttribute("title","Головна сторінка");
        return "home";
    }
    @GetMapping("/about")
    public String about( Model model) {
        model.addAttribute("title","About us");
        return "about";
    }
}

package com.example.thymeleaf.controller;

import com.example.thymeleaf.model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/")
    public String showForm(Model theModel) {
        theModel.addAttribute("theCustomer", new Customer());

        return "customer-from";
    }
}

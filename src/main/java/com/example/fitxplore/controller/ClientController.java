package com.example.fitxplore.controller;

import com.example.fitxplore.dao.ClientRepository;
import com.example.fitxplore.entity.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping("/client")
public class ClientController {

    @RequestMapping("/dashBoard")
    public String clientDashBoard(){
        return "client_dashboard";
    }

}
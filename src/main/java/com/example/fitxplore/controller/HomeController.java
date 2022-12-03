package com.example.fitxplore.controller;

import com.example.fitxplore.dao.ClientRepository;
import com.example.fitxplore.dao.TrainerRepository;
import com.example.fitxplore.entity.Client;
import com.example.fitxplore.entity.Trainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.validation.Valid;

@Controller

public class HomeController {

    @Autowired
    private TrainerRepository trainerRepository;

    @GetMapping("/test")
    @ResponseBody
    public String test(){
        Trainer trainer = new Trainer();
        trainer.setUserName("Aastha Dubey");
        trainer.setEmail("aasthaadubeyy@gmail.com");
        trainerRepository.save(trainer);

        System.out.println("Working");
        return "jai mataaaa diiiiiiiiii!!!!!!!!!!!!!!!!!!!";
    }
    @GetMapping("/trainerInput")
    public String home(Model model){
        model.addAttribute("title","Trainer-Input Details");
        model.addAttribute("trainer",new Trainer());
        return "trainerInputDetails";
    }
    //this to register user
    @PostMapping("/input_details")
    public String registerTrainer(@Valid @ModelAttribute("trainer") Trainer trainer, Model model, BindingResult biresult)
    {
        if(biresult.hasErrors())
        {
            System.out.println(biresult);
            return "trainerInputDetails";
        }
        System.out.println("TRAINER"+trainer);
        Trainer result = this.trainerRepository.save(trainer);
        model.addAttribute("trainer",result);
        return "payment";
    }
    @Autowired


    private ClientRepository clientRepository;

    @GetMapping("/test1")
    @ResponseBody
    public String test1(){
        Client client = new Client();
        client.setUserName("Aastha Dubey");
        client.setEmail("aasthaadubeyy@gmail.com");
        clientRepository.save(client);
        return "jai mataaaa diiiiiiiiii!!!!!!!!!!!!!!!!!!!";
    }
    @GetMapping("/clientInput")
    public String client(Model model){
        model.addAttribute("title","Client-Input Details");
        model.addAttribute("client",new Client());
        return "clientInputDetails";
    }

    @PostMapping("/client_input_details")
    public String registerClient(@ModelAttribute("client") Client client,Model model){
        System.out.println("Client"+client);
        Client res = this.clientRepository.save(client);
        model.addAttribute("client",res);
        return "base";

    }
    @GetMapping("/payment")
    public String payment(){
        return "payment";
    }
    @GetMapping("/get_fit")
    public String getFit(){
        return "getFit";
    }
}

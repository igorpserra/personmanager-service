package com.dio.challenges.personapi.controllers;

import com.dio.challenges.personapi.dtos.PersonDTO;
import com.dio.challenges.personapi.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping
    public void createPerson(PersonDTO personDTO){
        personService.createPerson(personDTO);
    }
}

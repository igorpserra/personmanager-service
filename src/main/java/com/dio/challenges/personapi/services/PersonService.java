package com.dio.challenges.personapi.services;

import com.dio.challenges.personapi.dtos.PersonDTO;
import com.dio.challenges.personapi.entities.Person;
import com.dio.challenges.personapi.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public void createPerson(PersonDTO personDTO){
        Person person = new Person(personDTO);

        personRepository.save(person);
    }
}

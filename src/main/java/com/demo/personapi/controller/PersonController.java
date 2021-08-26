package com.demo.personapi.controller;

import com.demo.personapi.dto.response.MessegeResponseDTO;
import com.demo.personapi.entity.Person;
import com.demo.personapi.repository.PersonRespository;
import com.demo.personapi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessegeResponseDTO createPerson(@RequestBody Person person)
    {
       return personService.createPerson(person);

    }
}

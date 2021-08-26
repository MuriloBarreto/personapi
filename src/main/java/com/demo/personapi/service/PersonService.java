package com.demo.personapi.service;


import com.demo.personapi.dto.response.MessegeResponseDTO;
import com.demo.personapi.entity.Person;
import com.demo.personapi.repository.PersonRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

public class PersonService {
    private PersonRespository personRespository;

    @Autowired
    public PersonService(PersonRespository personRespository) {
        this.personRespository = personRespository;
    }

    public MessegeResponseDTO createPerson(Person person)
    {
        Person savedPerson = personRespository.save(person);
        return MessegeResponseDTO.builder().message("Create person with ID "+ savedPerson.getId()).build();

    }
}

package com.demo.personapi.repository;

import com.demo.personapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRespository extends JpaRepository<Person, Long> {

}

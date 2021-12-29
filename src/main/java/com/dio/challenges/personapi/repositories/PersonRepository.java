package com.dio.challenges.personapi.repositories;

import com.dio.challenges.personapi.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {

}

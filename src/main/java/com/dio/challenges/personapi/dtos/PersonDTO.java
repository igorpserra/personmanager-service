package com.dio.challenges.personapi.dtos;

import com.dio.challenges.personapi.entities.Person;
import com.dio.challenges.personapi.entities.Phone;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PersonDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private String cpf;
    private LocalDate birthDate;
    private List<Phone> phones;

    public PersonDTO (Person person){
        this.id = person.getId();
        this.firstName = person.getFirstName();
        this.lastName = person.getLastName();
        this.cpf = person.getCpf();
        this.birthDate = person.getBirthDate();
        this.phones = person.getPhones();
    }
}

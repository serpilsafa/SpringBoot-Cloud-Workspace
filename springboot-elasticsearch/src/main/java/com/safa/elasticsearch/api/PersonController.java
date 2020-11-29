package com.safa.elasticsearch.api;

import com.safa.elasticsearch.entity.Person;
import com.safa.elasticsearch.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.Calendar;
import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @PostConstruct
    public void init(){
        Person person =new Person();
        person.setName("Haydi");
        person.setLastName("Kodlayalim");
        person.setAddress("test");
        person.setBirthday("16.04.1992");
        person.setId("K0001");
        personRepository.save(person);
    }



    @GetMapping("/{search}")
    public ResponseEntity<List<Person>> getAllPerson(@PathVariable String search){
        List<Person> people = personRepository.findByNameOrLastName(search,search);
        return ResponseEntity.ok(people);

    }
}

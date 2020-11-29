package com.safa.elasticsearch.repository;

import com.safa.elasticsearch.entity.Person;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends ElasticsearchRepository<Person, String> {

    @Query("{\"bool\": {\"must\": [{\"match\": {\"ad\": \"?0\"}}]}}")
    List<Person> customGetPerson(String search);

    List<Person> findByNameOrLastName(String name, String lastName);
}

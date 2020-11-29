package com.safa.elasticsearch.entity;

import com.sun.source.doctree.SeeTree;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.time.temporal.Temporal;
import java.util.Date;

@Document(indexName = "people", indexStoreType ="person" )
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
public class Person {
    @Id
    private String id;

    @Field(name = "name", type = FieldType.Text)
    private String name;

    @Field(name = "last_name", type = FieldType.Text)
    private String lastName;

    @Field(name = "address", type = FieldType.Text)
    private String address;

    @Field(name = "birthday", type = FieldType.Text)
    private String birthday;

    public Person() {
    }

    public Person(String id, String name, String lastName, String address, String birthday) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.birthday = birthday;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}

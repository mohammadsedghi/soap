package com.example.demo.service;

import org.springframework.stereotype.Service;
@Service
public class PersonServiceImpl implements PersonService{
    public String registerPerson(Person person) {
        boolean saved = saveToDatabase(person);
        if (saved) {
            return "Person registered successfully.";
        } else {
            return "Failed to register person.";
        }
    }
    private boolean saveToDatabase(Person person) {
        System.out.println("Saved to database: " + person.getName());
        return true;
    }
}

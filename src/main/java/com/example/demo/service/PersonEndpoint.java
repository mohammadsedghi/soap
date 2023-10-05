package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class PersonEndpoint {
    private final PersonService personService;
//   private static final String NAMESPACE_URI = "http://example.com/person";
   private static final String NAMESPACE_URI = "http://localhost:8080/ws/person.wsdl";

  @Autowired
    public PersonEndpoint(PersonService personService) {
        this.personService = personService;
    }
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "Person")
    @ResponsePayload
  public String registerPerson(@RequestPayload Person person) {
        return personService.registerPerson(person);
    }
}


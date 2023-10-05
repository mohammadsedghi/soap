package com.example.demo.service;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
//@XmlAccessorType(XmlAccessType.FIELD)
//@XmlRootElement(name = "",namespace = "http://example.com/person")
//@XmlType(name = "",namespace = "http://example.com/person")
public class Person {
    String name;
}

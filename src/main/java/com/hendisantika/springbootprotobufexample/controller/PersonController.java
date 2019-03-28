package com.hendisantika.springbootprotobufexample.controller;

import com.hendisantika.springbootprotobufexample.domain.Person;
import com.hendisantika.springbootprotobufexample.domain.PhoneNumber;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-protobuf-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-03-28
 * Time: 23:54
 */
@RestController
@RequestMapping(value = "person")
public class PersonController {

    @RequestMapping("json")
    public Person getPerson() {
        Person person = new Person("Uzumaki", "Naruto");
        person.setEmailAddress("uzumaki_naruto@konohagakure.co.jp");
        person.setHomeAddress("123 Konohagakure");
        person.addPhoneNumber(new PhoneNumber(123, 1234567));
        return person;
    }

    @RequestMapping(value = "protoBuf", produces = "application/x-protobuf")
    public PersonProto getPersonProto() {
        return PersonProto
                .newBuilder()
                .setFirstName("Jake")
                .setLastName("Partusch")
                .setEmailAddress("jakepartusch@abc.com")
                .setHomeAddress("123 Seasame Street")
                .addPhoneNumbers(PersonProto.PhoneNumber
                        .newBuilder()
                        .setAreaCode(123)
                        .setPhoneNumber(1234567))
                .build();
    }
}
package br.com.chrony.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.apache.logging.log4j.message.ReusableMessage;
import org.springframework.stereotype.Service;

import br.com.chrony.model.Person;

@Service
public class PersonServices {

    private final AtomicLong counter = new AtomicLong();

    public Person create(Person person) {
        person.setId(counter.incrementAndGet());

        return person;
    }

    public Person update(Person person) {

        return person;
    }

    public void delete(String id) {
    }

    public Person findById(String id) {

        final Person person = new Person();

        person.setId(counter.incrementAndGet());
        person.setFirstName("Chrony");
        person.setLastName("Joseph");
        person.setAddress("Jaboatão dos Guararapes - Pernambuco - Brasil");
        person.setGender("M");

        return person;
    }

    public List<Person> findAll() {

        List<Person> persons = new ArrayList<Person>();
        for (int i = 0; i < 3; i++) {
            Person person = mockPerson(i);
            persons.add(person);
        }

        return persons;
    }

    private Person mockPerson(final int i) {
        final Person person = new Person();

        person.setId(counter.incrementAndGet());
        person.setFirstName("Person name " + i);
        person.setLastName("Last name " + i);
        person.setAddress("Address " + i);
        person.setGender("M");

        return person;
    }

}
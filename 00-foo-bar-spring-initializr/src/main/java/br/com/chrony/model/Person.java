package br.com.chrony.model;

import java.io.Serializable;
import java.util.Objects;

public class Person implements Serializable {

    private static final long serialVersionUID = -5800035791464640766L;

    private long id;
    private String firstName;
    private String lastName;
    private String address;
    private String gender;

    public Person() {
    }

    public long getId() {
        return id;
    }

    public void setId(final long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(final String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(final String gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof final Person person)) {
            return false;
        }
        return id == person.id && Objects.equals(firstName, person.firstName) && Objects.equals(
            lastName, person.lastName) && Objects.equals(address, person.address) && Objects.equals(
            gender, person.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, address, gender);
    }
}

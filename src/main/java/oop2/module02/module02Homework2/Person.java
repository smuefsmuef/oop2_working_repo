package oop2.module02.module02Homework2;

public class Person {
    private int personNr;
    private String lastName;
    private String firstName;

    public Person(int personNr, String lastName, String firstName) {
        this.personNr = personNr;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return personNr + ": " + lastName + " " + firstName;
    }

    public int getPersonNr() {
        return personNr;
    }

    public int getHash() {
        return personNr;
    }
}

package oop2.module02.set;

import oop2.module02.Person;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Dieter Holz
 */
public class Family {

    private final Set<Person> members = new HashSet<>();

    public int size() {
        return members.size();
    }

    public void add(Person p) {
        members.add(p);
    }

    public boolean isMember(Person p) {
        if (members.contains(p)) {
            return true;
        } else {
            return false;
        }
    }

    public Person getOldest() {
        Person oldestPerson = new Person(0,0,0);
        for(Person p : members) {
            if(p.getAge() > oldestPerson.getAge()) {
                oldestPerson = p;
            }
        } return oldestPerson;
    }
}

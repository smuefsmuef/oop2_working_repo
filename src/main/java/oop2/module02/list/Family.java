package oop2.module02.list;

import oop2.module02.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dieter Holz
 */
public class Family {

    private final List<Person> members = new ArrayList<>();

    public int size() {
        return members.size();
    }

    public void add(Person p) {
        if (!isMember(p)) {
            members.add(p);
        }
    }

    public boolean isMember(Person p) {
        if (members.contains(p)) {
            return true;
        } else return false;
    }

    public Person getOldest() {
        Person oldestPers = new Person(0, 0, 0);
        for (Person p : members) {
            if (p.getAge() > oldestPers.getAge()) {
                oldestPers = p;
            }
        }
        return oldestPers;
    }

}

package oop2.module02.hashmap;

import java.util.HashSet;
import java.util.Set;

import oop2.module02.Person;

/**
 * @author Dieter Holz
 */

public class Family {

    private final Set<Person> members = new HashSet<>();
    private final Set<Integer> ages = new HashSet<>();


    public int size() {
        return members.size();
    }

    public void add(Person person) {
        members.add(person);
    }

    public Person getOldest() {
        Person oldest = null;
        for (Person p : members) {
            if (oldest == null || p.getAge() > oldest.getAge()) {
                oldest = p;
            }
        }
        return oldest;
    }

    public boolean isMember(Person person) {
        return members.contains(person);
    }

    public int numberOfMembers(int age) { // alterantiv mit neuem Set arbeiten, siehe next allAges()
        int counter = 0;
        for (Person p : members) {
            if (p.getAge() == age) {
                counter++;
            }
        }
        return counter;
    }

    public Set<Integer> allAges(){ // a Set that contains all ages of the family
        for(Person p : members) {
            ages.add(p.getAge());
        }
        return ages;
    }
    /* teacher-solution
    public Set<Integer> allAges() {
        return ageToCountMap.keySet();
    }
    */

}

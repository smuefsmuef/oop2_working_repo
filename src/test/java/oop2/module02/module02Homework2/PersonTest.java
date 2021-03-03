package oop2.module02.module02Homework2;

import org.junit.jupiter.api.Test;

import java.util.*;

class PersonTest {

    @Test
    void testArrayList() {

        Person p1 = new Person(1, "Merz", "Didi");
        Person p2 = new Person(2, "Toller", "Barb");
        Person p3 = new Person(3, "Bieri", "Nadine");
        Person p4 = new Person(4, "Sihi", "Didi");
        Person p5 = new Person(5, "Agoe", "Sam");
        Person p6 = new Person(5, "Agoe", "Sam"); // absichtlich 2x

        // init
        List<Person> familyList = new ArrayList<>();

        // add
        familyList.add(p1);
        familyList.add(p2);
        familyList.add(p3);
        familyList.add(p4);
        familyList.add(p5);
        familyList.add(p6);

        System.out.println("Daten in ArrayList");
        for (Person p : familyList) {
            System.out.println(p);
        }

        System.out.println("---------------");

        // init
        Set<Person> familySet = new HashSet<>();

        // add
        familySet.add(p1);
        familySet.add(p2);
        familySet.add(p3);
        familySet.add(p4);
        familySet.add(p5);
        familySet.add(p6);

        System.out.println("Daten in Hashset");
        for (Person p : familySet) {
            System.out.println(p);
        }

        System.out.println("---------------");

        // init
        Map<Integer, Person> familyMap = new HashMap();

        // add
        /*
        familyMap.put(p1.getHash(), p1);
        familyMap.put(p2.getHash(), p2);
        familyMap.put(p3.getHash(), p3);
        familyMap.put(p4.getHash(), p4);
        familyMap.put(p5.getHash(), p5);
        familyMap.put(p6.getHash(), p6);

      */
        familyMap.put(p1.getPersonNr(), p1);
        familyMap.put(p2.getPersonNr(), p2);
        familyMap.put(p3.getPersonNr(), p3);
        familyMap.put(p4.getPersonNr(), p4);
        familyMap.put(p5.getPersonNr(), p5);
        familyMap.put(p6.getPersonNr(), p6);

        System.out.println("Daten in Hashmap");
        for (Person p : familyMap.values()) {
            System.out.println(p);
        }

    }
}
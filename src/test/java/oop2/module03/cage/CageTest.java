package oop2.module03.cage;

import oop2.module03.cage.animal.Bird;
import oop2.module03.cage.animal.Lion;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Dieter Holz
 */
class CageTest {

    @Test
    void testInit() {

        //when
        Cage<Lion> c = new Cage<>();
        Lion l = new Lion();

        //then
        assertEquals(0, c.numberOfAnimals());
        assertFalse(c.shelters(l));
    }

    @Test
    void testFangen() {
        //given
        Cage<Lion> c = new Cage<>();
        Lion l1 = new Lion();
        Lion l2 = new Lion();

        //when
        c.fangen(l1);
        c.fangen(l2);
        c.fangen(l2); // need to add a set (with list i get duplicates!)

        // c.fangen(new Bird()); //Compile-Fehler, sehr gut.

        //then
        assertEquals(2, c.numberOfAnimals());
        assertTrue(c.shelters(l1));
        assertTrue(c.shelters(l2));
    }

    @Test
    void testfreilassen() {
        //given
        Cage<Lion> c = new Cage<>();
        Lion l1 = new Lion();
        Lion l2 = new Lion();
        c.fangen(l1);
        c.fangen(l2);

        //when
        c.freilassen(l1);
        c.freilassen(l2);

        //then
        assertEquals(0, c.numberOfAnimals());
        assertFalse(c.shelters(l1));
        assertFalse(c.shelters(l2));
    }

    @Test
    void testfangenAll() {
        //given
        Cage<Bird> c = new Cage<>();
        Bird b1 = new Bird();
        Bird b2 = new Bird();
        Bird[] birds = {b1, b2};

        //when
       // todo: why? its not compiling?
        // Cage.fangenAll(c, birds);

        //then
        assertEquals(2, c.numberOfAnimals());
        assertTrue(c.shelters(b1));
        assertTrue(c.shelters(b2));
    }

}
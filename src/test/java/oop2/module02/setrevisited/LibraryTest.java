package oop2.module02.setrevisited;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;

/**
 * @author Dieter Holz
 */
class LibraryTest {

    @Test
    void add() {
        Library lib = new Library();
        Book book1 = new Book(123);
        Book book2 = new Book(143);
        Book book3 = book1;
        Book book4 = new Book(123);

        // when
        lib.add(book1);
        lib.add(book1);
        lib.add(book2);

        // then
        assertFalse(book1.equals(book2));
        assertTrue(book1.equals(book3));
        assertTrue(book1.equals(book4));
        assertFalse(book2.equals(book3));

        assertTrue(lib.contains(book1));
        assertTrue(lib.contains(book2));
        assertTrue(lib.contains(book3));
        assertFalse(lib.contains(book4)); // das buch wurde nicht hinzugefügt, da bereits book 1 es abdeckt
    }

}
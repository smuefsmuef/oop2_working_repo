package oop2.module03.cage;

import oop2.module03.cage.animal.Animal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Cage<T> {
    Set<T> gefangeneTiere = new HashSet<>(); // need to add a set (with list i get duplicates!)

    public void fangen(T tier) {
        gefangeneTiere.add(tier);
    }

    public void freilassen(T tier) {
        if (gefangeneTiere.size() > 0) {
            gefangeneTiere.remove(tier);
        }
    }

    public boolean shelters(T tier) {
        if (gefangeneTiere.contains(tier)) {
            return true;
        }
        return false;
    }

    public int numberOfAnimals() {

        return gefangeneTiere.size();
    }

    // todo: why? in solution it's
    // public static <A extends Animal> void jailAll(Cage_Solution<A> cage, A[] allAnimals) {

    public void fangenAll(Cage<T> kaefig, T[] alleEinerSpezies) {
        for (T a : alleEinerSpezies) {
            kaefig.fangen(a);
        }
    }

}

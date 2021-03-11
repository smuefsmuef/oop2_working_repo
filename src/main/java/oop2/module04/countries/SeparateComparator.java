package oop2.module04.countries;

import java.util.Comparator;

public class SeparateComparator implements Comparator <Country>{

    @Override
    public int compare(Country a, Country b) {
        return (int) (a.getArea()-b.getArea());
    }
}

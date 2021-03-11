package oop2.module04.countries;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class CountryTest {

    private Country ch;
    private Country de;
    private Country fr;
    private Country it;
    private Country au;
    private List<Country> countries;

    @BeforeEach
    public void setUp() {
        ch = new Country("Schweiz", 41_285.00);
        de = new Country("Deutschland", 357_121.41);
        fr = new Country("Frankreich", 668_763.00);
        it = new Country("Italien", 301_338.00);
        au = new Country("\u00D6sterreich", 83_878.99);

        countries = new ArrayList<>();
        countries.add(fr);
        countries.add(de);
        countries.add(ch);
        countries.add(it);
        countries.add(au);
    }

    private Country getFirst() {
        return countries.get(0);
    }

    private Country getLast() {
        return countries.get(countries.size() - 1);
    }

    @Test // extene klasse
    public void testSortByAreaViaSeparateComparatorClass() {
        //when
        Collections.sort(countries, new SeparateComparator());

        //then
        assertSame(ch, getFirst());
        assertSame(fr, getLast());
    }


    @Test // innere klasse
    public void testSortByAreaViaInnerClass() {
        //when
        Collections.sort(countries, new InnerComparator());

        //then
        assertSame(ch, getFirst());
        assertSame(fr, getLast());
    }

    // add private class and implement by 'new'
    private class InnerComparator implements Comparator<Country> {
        @Override
        public int compare(Country a, Country b) {
            //return (int) (a.getArea() - b.getArea());
            return Double.compare(a.getArea(), b.getArea());
        }
    }


    @Test // Anonyme Klasse
    public void testSortByAreaViaAnonymousInnerClass() {
        //when
        Collections.sort(countries, new Comparator<Country>() {
            @Override
            public int compare(Country a, Country b) {
                //return (int) (a.getArea() - b.getArea());
                return Double.compare(a.getArea(), b.getArea());
            }
        });

        //then
        assertSame(ch, getFirst());
        assertSame(fr, getLast());
    }

    @Test // Innere Klasse -- Name
    public void testSortByNameViaInnerClass() {
        //when
        Collections.sort(countries, new Comparator<Country>() {
            @Override
            public int compare(Country a, Country b) {
                return (a.getName().compareTo(b.getName()));
            }
        });

        //then
        assertSame(de, getFirst());
        assertSame(au, getLast());
    }


    @Test
    public void testSortByNameViaLambda() {
        //when
        Collections.sort(countries, (a, b) -> {
            return (a.getName().compareTo(b.getName()));
        });

        //then
        assertSame(de, getFirst());
        assertSame(au, getLast());
    }


    @Test
    public void testSortByAreaViaLambda() {
        //when
        Collections.sort(countries, (a, b) -> Double.compare(a.getArea(), b.getArea()));
        //Todo: merke Collections oder direct countries....seit java8 auch direct methode sort implementiert

        //then
        assertSame(ch, getFirst());
        assertSame(fr, getLast());
    }

    @Test // lambda --> hier direkt ohne collections
    public void testSortByNameViaSortMethod() {
        //when
        countries.sort((a, b) -> {
                return a.getName().compareTo(b.getName());
        });
        //  countries.removeIf(c -> c.getArea() > 6000000); // test
        //  countries.replaceAll(c -> c.getArea()<9000000? c : null);
        //then
        assertSame(de, getFirst());
        assertSame(au, getLast());
    }

    @Test
    public void testSortByAreaViaSortMethod() {
        //when
        countries.sort((a, b) -> Double.compare(a.getArea(), b.getArea()));
        //then
        assertSame(ch, getFirst());
        assertSame(fr, getLast());
    }


	@Test //Method References
	public void testSortByNameViaMethodReference(){
		//when
        countries.sort(Comparator.comparing(Country::getName));
		//then
		assertSame(de, getFirst());
		assertSame(au, getLast());
	}


	@Test
	public void testSortByAreaViaMethodReference(){
		//when
		countries.sort(Comparator.comparing(Country::getArea));

		//then
		assertSame(ch, getFirst());
		assertSame(fr, getLast());
	}


	@Test
	public void testSortReversedByAreaViaMethodReference(){
		//when
		countries.sort(Comparator.comparing(Country::getArea).reversed());

		//then
		assertSame(fr, getFirst());
		assertSame(ch, getLast());
	}


	@Test
	public void testSortReversedByNameViaMethodReference(){
		//when
		countries.sort(Comparator.comparing(Country::getName).reversed());

		//then
		assertSame(au, getFirst());
		assertSame(de, getLast());
	}


	@Test
	public void testRemoveCountriesSmallerThan100_000(){
		//when
		countries.removeIf(a -> (a.getArea() < 100000));

		//then
		assertSame(3, countries.size());

		assertTrue(countries.contains(de));
		assertTrue(countries.contains(fr));
		assertTrue(countries.contains(it));
	}


}

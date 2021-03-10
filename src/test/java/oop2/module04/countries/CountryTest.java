package oop2.module04.countries;

import oop2.module04.countries.Country;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.List;

public class CountryTest {

	private Country       ch;
	private Country       de;
	private Country       fr;
	private Country       it;
	private Country       au;
	private List<Country> countries;

	@BeforeEach
	public void setUp()  {
		ch = new Country("Schweiz",          41_285.00);
		de = new Country("Deutschland",     357_121.41);
		fr = new Country("Frankreich",      668_763.00);
		it = new Country("Italien",         301_338.00);
		au = new Country("\u00D6sterreich",  83_878.99);

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

//	@Test
//	public void testSortByAreaViaSeparateComparatorClass(){
//		//when
//		Collections.sort(countries, ...);
//
//
//		//then
//		assertSame(ch, getFirst());
//		assertSame(fr, getLast());
//	}


//	@Test
//	public void testSortByAreaViaInnerClass(){
//		//when
//		Collections.sort(countries, ...);
//
//		//then
//		assertSame(ch, getFirst());
//		assertSame(fr, getLast());
//	}


//	@Test
//	public void testSortByAreaViaAnonymousInnerClass(){
//		//when
//		Collections.sort(countries, ...);
//
//		//then
//		assertSame(ch, getFirst());
//		assertSame(fr, getLast());
//	}

//	@Test
//	public void testSortByNameViaInnerClass(){
//		//when
//		Collections.sort(countries, ...);
//
//		//then
//		assertSame(de, getFirst());
//		assertSame(au, getLast());
//	}


//	@Test
//	public void testSortByNameViaLambda(){
//		//when
//		Collections.sort(countries, ...);
//
//		//then
//		assertSame(de, getFirst());
//		assertSame(au, getLast());
//	}
//
//
//	@Test
//	public void testSortByAreaViaLambda(){
//		//when
//		Collections.sort(countries, ...);
//
//		//then
//		assertSame(ch, getFirst());
//		assertSame(fr, getLast());
//	}

//    @Test
//    public void testSortByNameViaSortMethod() {
//        //when
//        countries.sort(...);
//
//        //then
//        assertSame(de, getFirst());
//        assertSame(au, getLast());
//    }

//	@Test
//	public void testSortByAreaViaSortMethod(){
//		//when
//		countries.sort(...);
//
//		//then
//		assertSame(ch, getFirst());
//		assertSame(fr, getLast());
//	}


//	@Test
//	public void testSortByNameViaMethodReference(){
//		//when
//		countries.sort(...);
//
//		//then
//		assertSame(de, getFirst());
//		assertSame(au, getLast());
//	}



//	@Test
//	public void testSortByAreaViaMethodReference(){
//		//when
//		countries.sort(...);
//
//		//then
//		assertSame(ch, getFirst());
//		assertSame(fr, getLast());
//	}



//	@Test
//	public void testSortReversedByAreaViaMethodReference(){
//		//when
//		countries.sort(...);
//
//		//then
//		assertSame(fr, getFirst());
//		assertSame(ch, getLast());
//	}


//	@Test
//	public void testSortReversedByNameViaMethodReference(){
//		//when
//		countries.sort(...);
//
//		//then
//		assertSame(au, getFirst());
//		assertSame(de, getLast());
//	}


//	@Test
//	public void testRemoveCountriesSmallerThan100_000(){
//		//when
//		countries.removeIf(...);
//
//		//then
//		assertSame(3, countries.size());
//
//		assertTrue(countries.contains(de));
//		assertTrue(countries.contains(fr));
//		assertTrue(countries.contains(it));
//	}



}

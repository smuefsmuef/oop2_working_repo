package oop2.module04;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author Dieter Holz
 */
public class MethodReferences {
    public static void main(String[] args) {

        // test für externe Methode
        String myExString = "25";
        int exNumber = stringToInteger(myExString);
        System.out.println(exNumber); // 25

        // -------------------------

        String myString = "42";
        Function<String, Integer> stringToInteger = (String s) -> Integer.parseInt(s);

        int number = stringToInteger.apply(myString);
        System.out.println(number); //42

        // -------------------------

        List<String> myList = Arrays.asList("Hallo", "Grüezi", "Hola");

        BiPredicate<List<String>, String> contains = (list, element) -> list.contains(element);
        System.out.println(contains.test(myList, "Hallo")); // true
        System.out.println(contains.test(myList, "Hoi")); // false

        // -------------------------

        // Externe Methode
        System.out.println(myBiPredicate(myList, "Hallo", (list, e) -> list.size() > 2));





//        Function<Integer, String> func = (Integer i) -> {
//            return "James" + i;
//        };
//
//        Supplier<String> func2 = () -> "Raoul";
//
//        Supplier<String> func3 = () -> {
//            return "Richard";
//        };

//		  Consumer<String> func4 = (String s) -> {
//		  return "Raoul";

    }

    // Als eigene Methode für eine spezielle Aufgabe
    public static int stringToInteger(String s) {
        return Integer.parseInt(s);
    }

    public static boolean myBiPredicate(List<String> list, String value, BiPredicate<List<String>, String> expression) {
        return expression.test(list, value);
    };

}

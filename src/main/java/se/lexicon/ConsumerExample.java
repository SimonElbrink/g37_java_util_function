package se.lexicon;

import se.lexicon.model.Person;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Person simon = new Person(0,"Simon", "Elbrink", LocalDate.parse("1997-03-18"));
        Person ulf = new Person(1, "Ulf", "Bengtsson",LocalDate.parse("1970-01-01"));

        List<Person> personList = Arrays.asList(simon, ulf);

        //Preparing our function printout
        Consumer<Person> printOut = (person) -> System.out.println(person);

        //Using our lambda
        System.out.println("Printing using forEach + prepared consumer");
        personList.forEach(printOut);

        System.out.println("Printing using for-loop");
        for (Person p : personList) {
            printOut.accept(p);
        }

        System.out.println("Printing using forEach + inline lambda");
        //Lambda Inline
        personList.forEach(person -> System.out.println(person));


        System.out.println("Printing using forEach + Method Reference");
        personList.forEach(System.out::println);





    }
}

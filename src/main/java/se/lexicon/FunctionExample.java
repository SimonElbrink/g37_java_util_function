package se.lexicon;

import se.lexicon.model.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {


        Function<String[], String> arrayToString = (array) -> {
            StringBuilder sb = new StringBuilder();
            for (String s :
                    array) {
                sb.append(s);
                sb.append("/");
            }

            return sb.toString();
        };

        String[] letters = new String[] {"A","B","C","D","E","F"};

        String lettersInString = arrayToString.apply(letters);

        System.out.println(lettersInString);


        Person simon = new Person(0,"Simon", "Elbrink", LocalDate.parse("1997-03-18"));
        Person ulf = new Person(1, "Ulf", "Bengtsson",LocalDate.parse("1970-01-01"));

        List<Person> personList = Arrays.asList(simon, ulf);


        Function<Person,String> extractFullName = person -> person.getFirstName() + " " + person.getLastName();

        extractFullName.apply(simon);
        extractFullName.apply(ulf);

        List<String> strings = extractNames(personList, extractFullName);
        strings.forEach(System.out::println);
    }


    public static List<String> extractNames(List<Person> personList, Function<Person, String> function){
        List<String> fullNames = new ArrayList<>();

        for (Person p : personList){
            fullNames.add(function.apply(p));
        }

        return fullNames;
    }



}

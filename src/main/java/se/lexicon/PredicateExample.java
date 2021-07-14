package se.lexicon;

import se.lexicon.model.Person;

import java.time.LocalDate;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        //AIC - Anonymous inner class
        Predicate<Integer> negative = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer < 0;
            }
        };

        //Lambda
        Predicate<Integer> positive = (integer) -> integer > 0;

        // AIC
        Predicate<Person> leapYearIf = new Predicate<Person>() {
            @Override
            public boolean test(Person person) {
                if (person.getBirthDate().isLeapYear() == true ){
                    return true;
                }else{
                    return false;
                }
            }
        };

        //Lambda
        Predicate<Person> leapYear = person -> person.getBirthDate().isLeapYear();

        Predicate<Person> bornAfterCovid19 = person ->
                person.getBirthDate().isAfter(LocalDate.parse("2020-03-14"));

        Predicate<Person> bornAfterCovid19AndOnALeapYear = person -> person.getBirthDate().isLeapYear() && person.getBirthDate().isAfter(LocalDate.parse("2020-03-14"));

        Person simon = new Person(0,"Simon", "Elbrink", LocalDate.parse("1997-03-18"));

        System.out.println(leapYearIf.test(simon));
        System.out.println(leapYear.test(simon));
        System.out.println(bornAfterCovid19.test(simon));


        // && AND .and()
        // || OR .or()
        // ! NOT .negate() (Flipping boolean from true to false or false to true)
        bornAfterCovid19
                .negate()
                .and(leapYear)
                .or(null)
                .test(simon);


    }
}

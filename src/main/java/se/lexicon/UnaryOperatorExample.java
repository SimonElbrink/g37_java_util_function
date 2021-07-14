package se.lexicon;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {

        Function<String, String> toLowerCaseFunction = (string) -> string.toLowerCase();

        UnaryOperator<String> toLowerCaseUnary = (string) -> string.toLowerCase();

        System.out.println(toLowerCaseFunction.apply("AbC"));
        System.out.println(toLowerCaseUnary.apply("AbC"));
    }
}

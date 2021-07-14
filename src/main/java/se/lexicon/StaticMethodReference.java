package se.lexicon;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class StaticMethodReference {

    public static void main(String[] args) {

        UnaryOperator<Integer> getRandomNumber = (maxValue) -> getRandomInt(maxValue);
        UnaryOperator<Integer> getRandomNumberMF = StaticMethodReference::getRandomInt;

        Consumer<String> printOut = s -> System.out.println(s);
        Consumer<String> printOutMF = System.out::println;
    }

    public static int getRandomInt(int max){
        return new Random().nextInt(max + 1);
    }

}

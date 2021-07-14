package se.lexicon;

import se.lexicon.model.Calculator;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.ToDoubleBiFunction;

public class InstanceMethodReference {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double numb1 = 90;
        double numb2 = 100;

        //ToDoubleBiFunction<T, U>
        ToDoubleBiFunction<Double,Double> addCalc = (num1, num2) -> calculator.add(num1, num2);
        ToDoubleBiFunction<Double,Double> addCalcMF = calculator::add;

        //                      double applyAsDouble(T t, U u);
        System.out.println(addCalc.applyAsDouble(numb1, numb2));


        Function<String, String> toLowerCase = (string) -> string.toLowerCase();
        Function<String, String> toLowerCaseMF = String::toLowerCase;


    }
}

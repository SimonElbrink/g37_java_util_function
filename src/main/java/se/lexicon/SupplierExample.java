package se.lexicon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;


public class SupplierExample {
    public static void main(String[] args) {

        Supplier<List<String>>  init = () -> new ArrayList<>();
        Supplier<List<String>>  initMF = ArrayList::new;

        List<String> stringList0 = new ArrayList<>();
        List<String> stringList1 = init.get();
        List<String> stringList2 = Collections.emptyList();



    }
}

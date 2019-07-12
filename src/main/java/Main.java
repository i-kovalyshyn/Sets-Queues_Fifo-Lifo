package main.java;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<Integer> set = new TreeSet<>(new MyComparator());
        set.addAll(Arrays.asList(25,30,33,27,20,2,10,1,4,3,7));
        System.out.println(set);
    }
}


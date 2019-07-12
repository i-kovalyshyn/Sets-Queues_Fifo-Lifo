package main.java;

import java.util.Comparator;

class MyComparator implements Comparator<Integer> {


    @Override
    public int compare(Integer n1, Integer n2) {
        return n1 % 2 == 0 & n2 % 2 != 0 ? -1 : ((n1 % 2 != 0 & n2 % 2 == 0) ? 1 : n1.compareTo(n2));

    }
}

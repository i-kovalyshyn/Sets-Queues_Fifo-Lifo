package main.java;

import java.util.Comparator;

class MyComparator implements Comparator<Integer> {


    @Override
    public int compare(Integer n1, Integer n2) {
        if (n1 % 2 == 0 & n2 % 2 != 0) {
            return -1;
        } else if (n1 % 2 != 0 & n2 % 2 == 0) {
            return 1;
        } else {
            return n1.compareTo(n2);
        }
    }
}



package com.epam.rd.autotasks.arrays;

public class SumOfEvenNumbers {
    public static int sum(int[] array){
        int sum =0;
        if (array == null || array.length == 0){
            return sum;
        }
        for (int var: array) {
            if (var%2 == 0){
                sum += var;
            }
        }
        return sum;
    }
}

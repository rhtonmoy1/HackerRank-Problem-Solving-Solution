package com.tonmoy.solution.easy.basic;
//Complete the function solveMeFirst to compute the sum of two integers.
//        Function Description
//
//        Complete the solveMeFirst function in the editor below.
//
//        solveMeFirst has the following parameters:
//
//        int a: the first value
//        int b: the second value
//        Returns
//        - int: the sum of a and b
import java.util.*;
public class SolveMeFirst {
    static int solveMeFirst(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int sum = solveMeFirst(a, b);
        System.out.println(sum);
    }
}

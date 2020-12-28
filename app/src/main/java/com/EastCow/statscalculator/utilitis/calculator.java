package com.EastCow.statscalculator.utilitis;

import java.util.Scanner;

public class calculator {
    private static int n;
    private static int nFact;
    private static int r;
    private static int rFact;
    private static int nrFact;

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("give the data, n for objects, r for samples.");
        System.out.println("n");
        n = in.nextInt();
        nFact = getFactorial(n);
        System.out.println("r");
        r = in.nextInt();
        rFact = getFactorial(r);
        int nr = n - r;
        nrFact = getFactorial(nr);

        System.out.println("Combination answer is: " + nFact / (rFact * nrFact));
        System.out.println("Permutation answer is: " + nFact / nrFact);
    }

    public static int getFactorial(int data) {
        int i;
        int fact = 1;
        int num = data;
        for (i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
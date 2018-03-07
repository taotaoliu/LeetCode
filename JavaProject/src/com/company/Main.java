package com.company;

public class Main {

    public static void main(String[] args) {
        JewelsAndStones je = new JewelsAndStones();
        String j = "aA";
        String s = "aAAbbbb";
        int n = je.numJewelsInStones(j, s);
        System.out.print(n);
    }
}

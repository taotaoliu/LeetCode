package com.company;

public class Main {

    public static void main(String[] args) {

        //JewelsAndStones
//        JewelsAndStones je = new JewelsAndStones();
//        String j = "aA";
//        String s = "aAAbbbb";
//        int n = je.numJewelsInStones(j, s);
//        System.out.print(n);

        //Hamming Distance
        HammingDistance h = new HammingDistance();
        int d = h.hammingDistance(1, 4);
        System.out.print(d);
        System.out.print('\n');

        int d1 = h.hammingDistanceSolution(1, 4);
        System.out.print(d);
        System.out.print('\n');

    }
}

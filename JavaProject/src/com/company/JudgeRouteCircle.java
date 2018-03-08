package com.company;


public class JudgeRouteCircle {
    static int UpKey = 1;
    static int RightKey = 2;
    public boolean judgeCircle(String moves) {
        int n = 0;
        for (int i = 0; i < moves.length(); i ++) {
            if (moves.charAt(i) == 'U') {
                n += UpKey;
            }
            if (moves.charAt(i) == 'D') {
                n += -UpKey;
            }
            if (moves.charAt(i) == 'R') {
                n += RightKey;
            }
            if (moves.charAt(i) == 'L') {
                n += -RightKey;
            }
        }
        return n == 0;
    }
}

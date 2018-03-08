package com.company;

public class HammingDistance {
    public int hammingDistance(int x, int y) {
        int num = 0;
        String n_x = Integer.toBinaryString(x);
        String n_y = Integer.toBinaryString(y);
        if (n_x.length() > n_y.length()) {
            StringBuffer n_y_buffer = new StringBuffer();
            n_y_buffer.append(n_y);
            for(int i = 0; i < n_x.length() - n_y.length(); i ++) {
                n_y_buffer.insert(0, '0');
            }
            n_y = n_y_buffer.toString();
        } else  {
            StringBuffer n_x_buffer = new StringBuffer();
            n_x_buffer.append(n_x);
            for(int i = 0; i < n_y.length() - n_x.length(); i ++) {
                n_x_buffer.insert(0, '0');
            }
            n_x = n_x_buffer.toString();
        }

        System.out.print("x: " + n_x + '\n');
        System.out.print("y: " + n_y + '\n');

        for(int i = 0; i < n_x.length(); i ++) {
            if (n_x.charAt(i) != n_y.charAt(i)) {
                num += 1;
            }
        }
        return num;
    }

    public int hammingDistanceSolution(int x, int y) {
        int num = 0;
        int z = x ^ y;
        while (z != 0) {
            if (z % 2 == 1) {
                num += 1;
            }
            z = z / 2;
        }
        return  num;
    }
}
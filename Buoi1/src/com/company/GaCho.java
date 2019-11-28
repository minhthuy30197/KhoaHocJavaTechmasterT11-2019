package com.company;

public class GaCho {
    public static void main(String[] args) {
        int soCon = 36;
        int soChan = 100;

        for (int ga=0; ga<=soCon; ga++) {
            int cho = soCon - ga;
            if ((cho*4 + ga*2) == soChan) {
                System.out.println("So ga: " + ga + ", So cho: " + cho);
            }
        }
    }
}

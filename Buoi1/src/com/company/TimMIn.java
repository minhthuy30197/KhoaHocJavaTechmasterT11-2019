package com.company;

import javax.sound.midi.MidiFileFormat;

public class TimMIn {
    public static void main(String[] args) {
        int arr[] = {5, 6, -1, 10, -15};
        int min = arr[0];
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }
        // Cach duyet mang so 2
//        for (int i=1; i<arr.length; i++) {
//            if (arr[i] < min) {
//                min = arr[i];
//            }
//        }
        System.out.println("GTNN la " + min);
    }
}

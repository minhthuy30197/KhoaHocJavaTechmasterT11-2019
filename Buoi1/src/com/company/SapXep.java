package com.company;

public class SapXep {
    public static void main(String[] args) {
        int arr[] = {5, 6, -1, 10, -15};

        // Thuc hien sap xep
        for (int i=0; i<arr.length-1; i++) {
            for (int j=i+1; j<arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        // In ra mang theo thu tu tang dan
        for (int i : arr) {
            System.out.print(i+ " ");
        }

        System.out.println();

        // In ra mang theo thu tu giam dan
        for (int i=arr.length-1; i>=0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}

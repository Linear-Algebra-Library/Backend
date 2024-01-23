package com.example.springboot.model;

public class Test {

    private static void test1() {
        Double[][] arr = new Double[10000][10000];
        for(int i = 0; i<arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                if(j >= i) {
                    arr[i][j] = (double) (i + 1);
                }
                else {
                    arr[i][j] = 0.0;
                }
            }
        }
        Matrix m = new Matrix(arr);
    }
    public static void main(String[] args) {
        test1();
    }
}

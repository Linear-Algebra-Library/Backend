package com.example.springboot.model;

public class Matrix<T> {

    T [][] mat;

    T [][] rref;

    public Matrix(T[][] arr) {
        this.mat = arr;
        rref_();
    }

    /**
     * A method which calculates the Reduced Row Echelon Form of the private property /mat/ and populates /rref/ with that data.
     */
    private void rref_() {

    }

    public T[][] rref() {
        return this.rref;
    }
}

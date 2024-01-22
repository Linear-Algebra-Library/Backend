package com.example.springboot.dao;

import com.example.springboot.model.Matrix;

public class MatrixDAO implements MatrixDAO_I {

    @Override
    public Double[][] rref(Double[][] arr) {
        Matrix mat = new Matrix(arr);
        return mat.rref();
    }
}

package com.example.springboot.service;

import com.example.springboot.dao.MatrixDAO;

public class MatrixDAS {

    private final MatrixDAO matrixDAO;

    public MatrixDAS(MatrixDAO dao) {
        this.matrixDAO = dao;
    }

}

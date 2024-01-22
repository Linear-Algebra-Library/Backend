package com.example.springboot.service;

import com.example.springboot.dao.MatrixDAO;
import com.example.springboot.dao.MatrixDAO_I;
import org.springframework.stereotype.Service;

@Service

public class MatrixService {

    private MatrixDAO matrixDAO;

    public Double[][] rref(Double[][] mat) {
        this.matrixDAO = new MatrixDAO();
        return (matrixDAO.rref(mat));
    }


}

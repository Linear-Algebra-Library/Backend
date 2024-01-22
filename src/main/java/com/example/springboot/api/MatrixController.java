package com.example.springboot.api;

import com.example.springboot.model.Matrix;
import com.example.springboot.service.MatrixService;
import org.springframework.web.bind.annotation.*;

@RequestMapping("api/v1/matrix")
@RestController
public class MatrixController {

    private final MatrixService service;

    public MatrixController(MatrixService service) {
        this.service = service;
    }

    @PostMapping
    public void rref(@RequestBody Matrix mat) {
        System.out.println(mat.rref());
    }


}

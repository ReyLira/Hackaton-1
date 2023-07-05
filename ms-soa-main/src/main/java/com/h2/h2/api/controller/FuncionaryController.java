package com.h2.h2.api.controller;

import com.h2.h2.api.model.Funcionary;
import com.h2.h2.api.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("ms-soa")
public class FuncionaryController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Funcionary> listar() {
        return productService.listados();
    }

    @PostMapping
    public Funcionary create(@RequestBody Funcionary funcionary) {
        return productService.crear(funcionary);
    }

    @PutMapping("{id}")
    public Funcionary update(@RequestBody Funcionary funcionary) {
        return productService.update(funcionary);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Integer id) {
        productService.delete(id);
    }
}

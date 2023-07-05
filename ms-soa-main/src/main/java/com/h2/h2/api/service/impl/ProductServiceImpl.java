package com.h2.h2.api.service.impl;

import com.h2.h2.api.model.Funcionary;
import com.h2.h2.api.respository.FuncionaryRepository;
import com.h2.h2.api.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private FuncionaryRepository funcionaryRepository;

    @Override
    public List<Funcionary> listados() {
        return funcionaryRepository.findAll();
    }

    @Override
    public Funcionary crear(Funcionary funcionary) {
        return funcionaryRepository.save(funcionary);
    }

    @Override
    public Funcionary update(Funcionary funcionary) {
        return funcionaryRepository.save(funcionary);
    }

    @Override
    public Funcionary delete(Integer id) {
        Funcionary unidadbusca = funcionaryRepository.findById(id).get();
        unidadbusca.setActive("I");
        return funcionaryRepository.save(unidadbusca);
    }

}

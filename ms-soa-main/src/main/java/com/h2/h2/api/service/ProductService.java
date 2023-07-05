package com.h2.h2.api.service;

import com.h2.h2.api.model.Funcionary;

import java.util.List;

public interface ProductService {
    List<Funcionary> listados();
    Funcionary crear(Funcionary funcionary);

    Funcionary update(Funcionary funcionary);

    Funcionary delete (Integer id);

}

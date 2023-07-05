package com.h2.h2.api.respository;

import com.h2.h2.api.model.Funcionary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionaryRepository extends JpaRepository<Funcionary,Integer> {
}

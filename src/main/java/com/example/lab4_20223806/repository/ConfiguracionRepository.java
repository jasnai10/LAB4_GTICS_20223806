package com.example.lab4_20223806.repository;

import com.example.lab4_20223806.entity.Configuracion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfiguracionRepository extends CrudRepository<Configuracion,Integer> {

}

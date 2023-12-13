package com.analitrix.sellbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.analitrix.sellbook.entities.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}

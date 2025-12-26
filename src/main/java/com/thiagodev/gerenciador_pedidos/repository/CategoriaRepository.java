package com.thiagodev.gerenciador_pedidos.repository;

import com.thiagodev.gerenciador_pedidos.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}

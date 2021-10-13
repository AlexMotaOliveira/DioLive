package com.dio.live.repository;

import com.dio.live.model.CategoriaUsuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CalendarioRepository extends JpaRepository<CategoriaUsuario, Long> {
}

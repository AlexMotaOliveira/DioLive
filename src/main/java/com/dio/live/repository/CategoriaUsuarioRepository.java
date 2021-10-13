package com.dio.live.repository;

import com.dio.live.model.CategoriaUsuario;
import com.dio.live.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaUsuarioRepository extends JpaRepository<CategoriaUsuario, Long> {
}

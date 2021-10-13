package com.dio.live.repository;

import com.dio.live.model.Empresa;
import com.dio.live.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
}

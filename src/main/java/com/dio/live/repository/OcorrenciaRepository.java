package com.dio.live.repository;

import com.dio.live.model.Ocorrencia;
import com.dio.live.model.TipoData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OcorrenciaRepository extends JpaRepository<Ocorrencia, Long> {
}

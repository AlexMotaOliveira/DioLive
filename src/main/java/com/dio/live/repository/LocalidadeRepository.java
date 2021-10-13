package com.dio.live.repository;

import com.dio.live.model.Localidade;
import com.dio.live.model.Movimentacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocalidadeRepository extends JpaRepository<Localidade, Long> {
}

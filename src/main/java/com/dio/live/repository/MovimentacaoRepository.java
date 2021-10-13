package com.dio.live.repository;

import com.dio.live.model.Movimentacao;
import com.dio.live.model.NivelAcesso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Long> {
}

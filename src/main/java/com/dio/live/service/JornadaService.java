package com.dio.live.service;

import com.dio.live.model.JornadaTrabalho;
import com.dio.live.repository.JornadaTrabalhoRepository;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class JornadaService {

    private final JornadaTrabalhoRepository jornadaRepository;

    public JornadaTrabalho save(JornadaTrabalho jornadaTrabalho) {
        return jornadaRepository.save(jornadaTrabalho);
    }

    public List<JornadaTrabalho> getJornadaList() {
        return jornadaRepository.findAll();
    }

    @SneakyThrows
    public JornadaTrabalho getJornadaByid(Long id) {
        return jornadaRepository.findById(id).orElseThrow(() -> new Exception("id não localiado"));
    }

    public void deleteJornadaByid(Long id) {
        jornadaRepository.deleteById(id);
    }
}



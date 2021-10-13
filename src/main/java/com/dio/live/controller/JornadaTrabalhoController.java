package com.dio.live.controller;

import com.dio.live.model.JornadaTrabalho;
import com.dio.live.service.JornadaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jornada")
@RequiredArgsConstructor
public class JornadaTrabalhoController {

    private final JornadaService jornadaService;

    @PostMapping
    public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho) {
        return jornadaService.save(jornadaTrabalho);
    }

    @GetMapping
    public List<JornadaTrabalho> getJornadaList() {
        return jornadaService.getJornadaList();
    }

    @GetMapping("/{id}")
    public ResponseEntity<JornadaTrabalho> getJornadabyId(@PathVariable(name = "id") Long id) {
        return ResponseEntity.ok(jornadaService.getJornadaByid(id));
    }

    @PutMapping
    public JornadaTrabalho updateJornada(@RequestBody JornadaTrabalho jornadaTrabalho) {
        return jornadaService.save(jornadaTrabalho);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteJornadabyId(@PathVariable(name = "id") Long id) {
        jornadaService.deleteJornadaByid(id);
    }
}

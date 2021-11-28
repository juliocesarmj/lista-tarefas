package com.br.juliomoraes.listatarefas.controller;

import com.br.juliomoraes.listatarefas.entidades.TarefaDTO;
import com.br.juliomoraes.listatarefas.service.ITarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefa")
public class TarefaController {

    @Autowired
    private ITarefaService service;

    @GetMapping
    public ResponseEntity<List<TarefaDTO>> getTarefas() {
        return ResponseEntity.status(HttpStatus.OK).body(this.service.tarefas());
    }

    @GetMapping("/{id}")
    public ResponseEntity<TarefaDTO> getTarefa(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(this.service.tarefa(id));
    }

    @PostMapping
    public ResponseEntity<Void> post(@RequestBody TarefaDTO dto) {
        this.service.novaTarefa(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(null);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> put(@RequestBody TarefaDTO dto, @PathVariable Long id) {
        this.service.atualizarTarefa(dto, id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        this.service.excluirTarefa(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
    }
}

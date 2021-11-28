package com.br.juliomoraes.listatarefas.service;

import com.br.juliomoraes.listatarefas.dao.ITarefaDAO;
import com.br.juliomoraes.listatarefas.entidades.Tarefa;
import com.br.juliomoraes.listatarefas.entidades.TarefaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TarefaService implements ITarefaService {

    @Autowired
    private ITarefaDAO tarefaDAO;

    @Override
    public void novaTarefa(TarefaDTO dto) {

        try {

            Tarefa tarefa = new Tarefa();
            tarefa.setTitulo(dto.getTitulo());
            tarefa.setData(Instant.now());
            tarefa.setDescricao(dto.getDescricao());

            this.tarefaDAO.save(tarefa);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void excluirTarefa(Long id) {

        try {
            Tarefa tarefa = Optional.ofNullable(this.tarefaDAO.findById(id)).orElseThrow(RuntimeException::new).get();
            this.tarefaDAO.delete(tarefa);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void atualizarTarefa(TarefaDTO dto, Long id) {

        try {
            Tarefa result = this.tarefaDAO.getById(id);

            result.setTitulo(dto.getTitulo());
            result.setData(Instant.now());
            result.setDescricao(dto.getDescricao());

            this.tarefaDAO.save(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<TarefaDTO> tarefas() {

        try {
            List<Tarefa> tarefas = this.tarefaDAO.findAll();
            return tarefas.stream().map(TarefaDTO::new).collect(Collectors.toList());
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    @Override
    public TarefaDTO tarefa(Long id) {

        try {
            Tarefa tarefa = Optional.ofNullable(this.tarefaDAO.findById(id)).orElseThrow(RuntimeException::new).get();
            return new TarefaDTO(tarefa);
        } catch (Exception e) {
            return null;
        }
    }
}

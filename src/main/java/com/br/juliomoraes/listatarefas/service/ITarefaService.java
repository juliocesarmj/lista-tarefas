package com.br.juliomoraes.listatarefas.service;

import com.br.juliomoraes.listatarefas.entidades.Tarefa;
import com.br.juliomoraes.listatarefas.entidades.TarefaDTO;

import java.util.List;

public interface ITarefaService {

    void novaTarefa(TarefaDTO dto);

    void excluirTarefa(Long id);

    void atualizarTarefa(TarefaDTO dto, Long id);

    List<TarefaDTO> tarefas();

    TarefaDTO tarefa(Long id);

    Tarefa consultarTarefa(Long id);
}

package com.br.juliomoraes.listatarefas.dao;

import com.br.juliomoraes.listatarefas.entidades.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITarefaDAO extends JpaRepository<Tarefa, Long> {
}

package com.br.juliomoraes.listatarefas.entidades;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@Entity
@Table(name = "tb_tarefa")
public class Tarefa implements Serializable {
    private static final long serialVersionUID = -3291852767366329591L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private Instant data;
    private String descricao;

    public Tarefa() {
    }

    public Tarefa(Long id, String titulo, Instant data, String descricao) {
        this.id = id;
        this.titulo = titulo;
        this.data = data;
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Instant getData() {
        return Instant.now();
    }

    public void setData(Instant data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

package com.br.juliomoraes.listatarefas.entidades;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.time.Instant;

@Data
@NoArgsConstructor
public class TarefaDTO implements Serializable {
    private static final long serialVersionUID = 5952335925064130822L;

    private Long id;

    @NotBlank(message = "Informe um título")
    private String titulo;
    private Instant data;

    @NotBlank(message = "Informe uma descrição.")
    private String descricao;

    public TarefaDTO(Tarefa entidade) {
        id = entidade.getId();
        titulo = entidade.getTitulo();
        data = entidade.getData();
        descricao = entidade.getDescricao();
    }
}

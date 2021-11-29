package com.br.juliomoraes.listatarefas.dto;

import com.br.juliomoraes.listatarefas.entidades.Perfil;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PerfilDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String autorizacao;

    public PerfilDTO(Perfil entidade) {
        id = entidade.getId();
        autorizacao = entidade.getAutorizacao();
    }
}

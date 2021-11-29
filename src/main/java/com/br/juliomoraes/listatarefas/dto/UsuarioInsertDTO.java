package com.br.juliomoraes.listatarefas.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class UsuarioInsertDTO extends UsuarioDTO{
    private static final long serialVersionUID = 1391318474156654402L;

    private String senha;

    public UsuarioInsertDTO() {
        super();
    }
}

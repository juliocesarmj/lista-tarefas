package com.br.juliomoraes.listatarefas.dto;

import com.br.juliomoraes.listatarefas.entidades.Usuario;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class UsuarioDTO implements Serializable {
    private static final long serialVersionUID = 4875023603046134322L;

    private Long id;

    @NotBlank(message = "Nome não pode ser vazio.")
    private String nome;
    private String sobrenome;

    @NotBlank(message = "Email não pode ser vazio.")
    @Email(message = "Preencha um email válido.")
    private String email;

    private Set<PerfilDTO> perfis = new HashSet<>();

    public UsuarioDTO(Usuario entidade) {
        id = entidade.getId();
        nome = entidade.getNome();
        sobrenome = entidade.getSobrenome();
        entidade.getPerfis().forEach(x -> this.perfis.add(new PerfilDTO(x)));
    }
}

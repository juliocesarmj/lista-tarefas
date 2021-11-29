package com.br.juliomoraes.listatarefas.dao;

import com.br.juliomoraes.listatarefas.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioDAO extends JpaRepository<Usuario, Long> {

    Usuario findByEmail(String email);
}

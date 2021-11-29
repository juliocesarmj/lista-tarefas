package com.br.juliomoraes.listatarefas.dao;

import com.br.juliomoraes.listatarefas.entidades.Perfil;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPerfilDAO extends JpaRepository<Perfil, Long> {
}

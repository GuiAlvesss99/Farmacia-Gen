package com.generation.farmacia.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.farmacia.model.Usuario;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

    public Optional<Usuario> findByUsuario(String usuario);
}
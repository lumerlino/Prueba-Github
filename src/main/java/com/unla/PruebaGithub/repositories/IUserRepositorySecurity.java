package com.unla.PruebaGithub.repositories;


import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.unla.PruebaGithub.entities.Usuario;


@Repository
public interface IUserRepositorySecurity extends CrudRepository<Usuario, Long>  {
    public Optional<Usuario> findByUsername(String username);
}
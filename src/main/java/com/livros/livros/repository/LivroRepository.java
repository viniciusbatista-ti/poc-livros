package com.livros.livros.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.livros.livros.models.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {

}

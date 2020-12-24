package com.livros.livros.controllers;

import java.net.URI;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.livros.livros.models.Livro;
import com.livros.livros.repository.LivroRepository;

@RestController
@RequestMapping("/livros")
public class LivroController {

	@Autowired
	private LivroRepository livroRepository;
	
	@GetMapping
	public List<Livro> listar(){
		return (List<Livro>) livroRepository.findAll();
	}
	
	@PostMapping
	public ResponseEntity<Livro> cadastrar(@RequestBody Livro livro, UriComponentsBuilder uriBuilder){
		livroRepository.save(livro);
		
		URI uri = uriBuilder.path("/livros/{id}").buildAndExpand(livro.getId()).toUri();
		return ResponseEntity.created(uri).body(livro);
	}
	
	@PutMapping("/{id}")
	@Transactional
	public ResponseEntity<Livro> atualizar(@PathVariable Long id, @RequestBody Livro livro){
		Livro livroRetornado = livroRepository.getOne(id);
		livroRetornado.setAutor(livro.getAutor());
		livroRetornado.setGenero(livro.getGenero());
		livroRetornado.setTitulo(livro.getTitulo());
		
		return ResponseEntity.ok().build();
	}
	
	@DeleteMapping("/{id}")
	@Transactional
	public ResponseEntity<?> deletar(@PathVariable Long id){
		livroRepository.deleteById(id);
		return ResponseEntity.ok().build();
	}
}

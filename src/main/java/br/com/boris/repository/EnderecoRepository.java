package br.com.boris.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.boris.modelo.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long>{
	
	}


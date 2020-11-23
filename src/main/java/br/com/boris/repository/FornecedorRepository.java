package br.com.boris.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.boris.modelo.Fornecedor;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Long>{
	
	}


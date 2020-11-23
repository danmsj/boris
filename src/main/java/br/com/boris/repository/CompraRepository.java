package br.com.boris.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.boris.modelo.Compra;

public interface CompraRepository extends JpaRepository<Compra, Long>{
	
	}


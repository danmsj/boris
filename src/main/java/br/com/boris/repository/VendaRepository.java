package br.com.boris.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.boris.modelo.Venda;

public interface VendaRepository extends JpaRepository<Venda, Long>{
	
	}


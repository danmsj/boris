package br.com.boris.controller;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.boris.modelo.Fornecedor;

public interface FornecedorController extends JpaRepository<Fornecedor, Long> {

	Fornecedor findByNome(String nome);

}

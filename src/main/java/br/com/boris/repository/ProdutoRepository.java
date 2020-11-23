package br.com.boris.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.boris.modelo.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	List<Produto> findByFornecedorNome(String fornecedorNome);
	}


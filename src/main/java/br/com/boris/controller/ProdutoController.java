package br.com.boris.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.boris.modelo.Produto;
import br.com.boris.repository.FornecedorRepository;
import br.com.boris.repository.ProdutoRepository;
import br.com.boris.vo.ProdutoVo;

public class ProdutoController {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private FornecedorRepository fornecedorRepository;
	
	
	@GetMapping
	@Cacheable(value = "listaDeProdutos")
	public ProdutoVo lista(@RequestParam(required = false) String nomeFornecedor) {
		
		if (nomeFornecedor == null) {
			List<Produto> produtos = produtoRepository.findAll();
			return ProdutoVo.converter(produtos);
		} else {
			List<Produto> produtos = produtoRepository.findByFornecedorNome(nomeFornecedor);
			return ProdutoVo.converter(produtos);
		}
	}
}

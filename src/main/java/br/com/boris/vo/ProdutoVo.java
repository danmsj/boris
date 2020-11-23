package br.com.boris.vo;

import java.time.LocalDateTime;
import java.util.List;

import br.com.boris.modelo.CorDoProduto;
import br.com.boris.modelo.Fornecedor;
import br.com.boris.modelo.Produto;
import br.com.boris.modelo.StatusDeDisponibilidadeProduto;
import br.com.boris.modelo.TamanhoDoProduto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoVo {

	private Long id;
	private String nome;
	private List<CorDoProduto> corDoProduto;
	private List<TamanhoDoProduto> tamanhoDoProduto;
	private double valorCompra;
	private double valorVenda;
	private Fornecedor fornecedor;
	private StatusDeDisponibilidadeProduto status;
	private String localAtual;
	private String localAnterior;
	private LocalDateTime dataAtualizacao;
	
	public static ProdutoVo converter(Produto produtos) {
		return produtos.map(ProdutoVo::new);
	}
}

package br.com.boris.modelo;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Produto {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private List<CorDoProduto> corDoProduto;
	private List<TamanhoDoProduto> tamanhoDoProduto;
	private double valorCompra;
	private double valorVenda;
	private Fornecedor fornecedor;
	@Enumerated(EnumType.STRING)
	private StatusDeDisponibilidadeProduto status;
	private String localAtual;
	private String localAnterior;
	private LocalDateTime dataAtualizacao;
		
}

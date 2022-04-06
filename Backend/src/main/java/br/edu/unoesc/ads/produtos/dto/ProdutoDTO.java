package br.edu.unoesc.ads.produtos.dto;

import java.math.BigDecimal;

import br.edu.unoesc.ads.produtos.entities.Produto;

public class ProdutoDTO {
	private Long id;
	private String nome;
	private int idade;
	private String profissao;
	private BigDecimal salario;

	public ProdutoDTO() {
	}

	public ProdutoDTO(Long id, String nome, int idade, String profissao, BigDecimal salario) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.profissao = profissao;
		this.salario = salario;
		
	}

	
	public ProdutoDTO(Produto produto) {
		this.id = produto.getId();
		this.nome = produto.getNome();
		this.idade = produto.getIdade();
		this.profissao = produto.getProfissao();
		this.salario = produto.getSalario();
		}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}



}
package br.pro.delfino.drogaria.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
public class Produto extends GenericDomain {
	@Column(length = 80, nullable = false)
	private String descricao;
	
	@Column(nullable = false)
	private Short quantidade;
	
	@Column(nullable = false, precision = 6, scale = 2)
	private BigDecimal preco;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Fabricante fabricante;

	public String getDescricao() {return descricao;}
	public Short getQuantidade() {return quantidade;}
	public BigDecimal getPreco() {return preco;}
	public Fabricante getFabricante() {return fabricante;}
	
	
	public void setDescricao(String descricao)  	 {this.descricao = descricao;}
	public void setQuantidade(Short quantidade) 	 {this.quantidade = quantidade;}
	public void setPreco(BigDecimal preco)           {this.preco = preco;}
	public void setFabricante(Fabricante fabricante) {this.fabricante = fabricante;}

	
}
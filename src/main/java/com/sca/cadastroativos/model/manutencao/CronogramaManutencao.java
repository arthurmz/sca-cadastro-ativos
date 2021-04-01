package com.sca.cadastroativos.model.manutencao;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Especifica uma lista de atividades de manutenção programadas para o ano.
 * O cronograma é definido pela equipe de engenharia à partir da periodicidade de manutenção de diferentes ativos.
 * @author arthur
 *
 */
@Entity
@Table(schema="sca_cadastro_ativos")
public class CronogramaManutencao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="ano")
	private Integer ano;
	
	@Column(name="data_cadastro")
	private LocalDateTime dataCadastro;
	
	@OneToMany(mappedBy = "cronograma", cascade=CascadeType.ALL)
	private List<ExecucaoManutencaoAtivo> manutencoes;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public List<ExecucaoManutencaoAtivo> getManutencoes() {
		return manutencoes;
	}

	public void setManutencoes(List<ExecucaoManutencaoAtivo> manutencoes) {
		this.manutencoes = manutencoes;
	}

	public LocalDateTime getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDateTime dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	
}

package com.sca.cadastroativos.model.manutencao;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sca.cadastroativos.model.ativo.Ativo;
import com.sca.cadastroativos.model.ativo.TipoComponenteManutencaoAtivo;

@Entity
@Table(schema="sca_cadastro_ativos")
public class ExecucaoManutencaoAtivo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="data_cadastro")
	private LocalDateTime dataCadastro;
	
	@Column(name="data_manutencao")
	private LocalDate dataManutencao;
	
	@ManyToOne
	@JoinColumn(name="id_ativo")
	private Ativo ativo;
	
	@ManyToOne
	@JoinColumn(name="id_componente_ativo")
	private TipoComponenteManutencaoAtivo componenteAtivo;
	
	@ManyToOne
	@JoinColumn(name = "id_cronograma")
	private CronogramaManutencao cronograma;
	
	@Enumerated(EnumType.STRING)
	private TipoManutencaoAtivo tipo;
	
	@Enumerated(EnumType.STRING)
	private SituacaoManutencaoAtivo situacao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDateTime dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public LocalDate getDataManutencao() {
		return dataManutencao;
	}

	public void setDataManutencao(LocalDate dataManutencao) {
		this.dataManutencao = dataManutencao;
	}

	public Ativo getAtivo() {
		return ativo;
	}

	public void setAtivo(Ativo ativo) {
		this.ativo = ativo;
	}

	public TipoComponenteManutencaoAtivo getComponenteAtivo() {
		return componenteAtivo;
	}

	public void setComponenteAtivo(TipoComponenteManutencaoAtivo componenteAtivo) {
		this.componenteAtivo = componenteAtivo;
	}

	public TipoManutencaoAtivo getTipo() {
		return tipo;
	}

	public void setTipo(TipoManutencaoAtivo tipo) {
		this.tipo = tipo;
	}

	public SituacaoManutencaoAtivo getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoManutencaoAtivo situacao) {
		this.situacao = situacao;
	}

	public CronogramaManutencao getCronograma() {
		return cronograma;
	}

	public void setCronograma(CronogramaManutencao cronograma) {
		this.cronograma = cronograma;
	}

}

package com.sca.cadastroativos.model.ativo;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**Ativo é todo objeto, equipamento e instalação passível de reutilização e manutenção.
 * Geralmente são máquinas, ferramentas elétricas, veículos.*/
@Entity
@Table(schema="sca_cadastro_ativos")
public class Ativo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="id_tipo_ativo")
	private TipoAtivo tipo;
	
	@Column(name="numero_serie")
	private String numeroSerie;
	
	@Column(name="data_cadastro")
	private LocalDateTime dataCadastro;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TipoAtivo getTipo() {
		return tipo;
	}

	public void setTipo(TipoAtivo tipo) {
		this.tipo = tipo;
	}

	public String getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	public LocalDateTime getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDateTime dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	

}

package com.sca.cadastroativos.ativo.manutencao.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.sca.cadastroativos.ativo.model.TipoComponenteManutencaoAtivo;

/**
 * Informa o periodo de tempo associado a cada componente de ativo passível de manutenção.
 * Exemplo: Uma escavadeira possui tempos de manutenção distintos na troca de óleo e troca dos pneus.
 * @author arthur
 *
 */
@Entity
@Table(schema="sca_cadastro_ativos")
public class PeriodicidadeManutencaoAtivo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="dias")
	private Integer dias;
	
	@Column(name="data_cadastro")
	private LocalDateTime dataCadastro;
	
	@OneToOne
	@JoinColumn(name="id_tipo_componente")
	private TipoComponenteManutencaoAtivo tipoComponente;

	public Integer getDias() {
		return dias;
	}

	public void setDias(Integer dias) {
		this.dias = dias;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TipoComponenteManutencaoAtivo getTipoComponente() {
		return tipoComponente;
	}

	public void setTipoComponente(TipoComponenteManutencaoAtivo tipoComponente) {
		this.tipoComponente = tipoComponente;
	}

	public LocalDateTime getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDateTime dataCadastro) {
		this.dataCadastro = dataCadastro;
	}



}

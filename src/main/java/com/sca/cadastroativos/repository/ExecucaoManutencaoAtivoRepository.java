package com.sca.cadastroativos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sca.cadastroativos.model.manutencao.ExecucaoManutencaoAtivo;

@Repository
public interface ExecucaoManutencaoAtivoRepository extends JpaRepository<ExecucaoManutencaoAtivo, Long>{

}

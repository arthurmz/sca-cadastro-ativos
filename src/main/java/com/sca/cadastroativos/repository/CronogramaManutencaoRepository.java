package com.sca.cadastroativos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sca.cadastroativos.model.manutencao.CronogramaManutencao;

@Repository
public interface CronogramaManutencaoRepository extends JpaRepository<CronogramaManutencao, Long>{

}

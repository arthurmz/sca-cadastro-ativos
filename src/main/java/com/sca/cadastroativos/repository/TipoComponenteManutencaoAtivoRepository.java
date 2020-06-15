package com.sca.cadastroativos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sca.cadastroativos.ativo.model.TipoComponenteManutencaoAtivo;

@Repository
public interface TipoComponenteManutencaoAtivoRepository extends JpaRepository<TipoComponenteManutencaoAtivo, Long>{

}

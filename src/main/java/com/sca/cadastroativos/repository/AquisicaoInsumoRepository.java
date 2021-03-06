package com.sca.cadastroativos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sca.cadastroativos.model.aquisicao.AquisicaoInsumo;

@Repository
public interface AquisicaoInsumoRepository extends JpaRepository<AquisicaoInsumo, Long>{

}

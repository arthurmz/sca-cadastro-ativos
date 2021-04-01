package com.sca.cadastroativos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sca.cadastroativos.model.insumo.InsumoDisponivel;

@Repository
public interface InsumoDisponivelRepository extends JpaRepository<InsumoDisponivel, Long>{

}

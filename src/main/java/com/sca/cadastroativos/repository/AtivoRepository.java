package com.sca.cadastroativos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sca.cadastroativos.model.ativo.Ativo;

@Repository
public interface AtivoRepository extends JpaRepository<Ativo, Long>{

}

package com.sca.cadastroativos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sca.cadastroativos.model.insumo.TipoInsumo;

@Repository
public interface TipoInsumoRepository extends JpaRepository<TipoInsumo, Long>{

}

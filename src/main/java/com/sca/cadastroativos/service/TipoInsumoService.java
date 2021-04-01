package com.sca.cadastroativos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sca.cadastroativos.model.insumo.TipoInsumo;
import com.sca.cadastroativos.repository.TipoInsumoRepository;

@Service
public class TipoInsumoService {
	
	@Autowired
	private TipoInsumoRepository tipoInsumoRepository;
	
	@Transactional
	public TipoInsumo saveTipoInsumo(TipoInsumo tipoInsumo) {
		 TipoInsumo a = tipoInsumoRepository.save(tipoInsumo);
		 return a;
	}
	
	public List<TipoInsumo> findAll() {
		return tipoInsumoRepository.findAll();
	}

}

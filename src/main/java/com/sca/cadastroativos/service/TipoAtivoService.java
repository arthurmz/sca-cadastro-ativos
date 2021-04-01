package com.sca.cadastroativos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sca.cadastroativos.model.ativo.TipoAtivo;
import com.sca.cadastroativos.repository.TipoAtivoRepository;

@Service
public class TipoAtivoService {
	
	@Autowired
	private TipoAtivoRepository tipoAtivoRepository;
	
	@Transactional
	public TipoAtivo saveTipoAtivo(TipoAtivo ativo) {
		 TipoAtivo a = tipoAtivoRepository.save(ativo);
		 return a;
	}
	
	public List<TipoAtivo> findAll() {
		return tipoAtivoRepository.findAll();
	}

}

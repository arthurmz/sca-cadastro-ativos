package com.sca.cadastroativos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sca.cadastroativos.model.ativo.TipoComponenteManutencaoAtivo;
import com.sca.cadastroativos.repository.TipoComponenteManutencaoAtivoRepository;



@Service
public class TipoComponenteManutencaoAtivoService {
	
	@Autowired
	private TipoComponenteManutencaoAtivoRepository tipoComponenteAtivoRepository;
	
	@Transactional
	public TipoComponenteManutencaoAtivo saveTipoComponenteManutencaoAtivo(TipoComponenteManutencaoAtivo componenteAtivo) {
		 TipoComponenteManutencaoAtivo a = tipoComponenteAtivoRepository.save(componenteAtivo);
		 return a;
	}
	
	public List<TipoComponenteManutencaoAtivo> findAll() {
		return tipoComponenteAtivoRepository.findAll();
	}

}

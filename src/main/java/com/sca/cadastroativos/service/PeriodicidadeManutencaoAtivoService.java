package com.sca.cadastroativos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sca.cadastroativos.model.manutencao.PeriodicidadeManutencaoAtivo;
import com.sca.cadastroativos.repository.PeriodicidadeManutencaoAtivoRepository;

@Service
public class PeriodicidadeManutencaoAtivoService {
	
	@Autowired
	private PeriodicidadeManutencaoAtivoRepository periodicidadeManutencaoAtivoRepository;
	
	@Transactional
	public PeriodicidadeManutencaoAtivo savePeriodicidadeManutencaoAtivo(PeriodicidadeManutencaoAtivo periodicidadeManutencaoAtivo) {
		 PeriodicidadeManutencaoAtivo a = periodicidadeManutencaoAtivoRepository.save(periodicidadeManutencaoAtivo);
		 return a;
	}
	
	public List<PeriodicidadeManutencaoAtivo> findAll() {
		return periodicidadeManutencaoAtivoRepository.findAll();
	}

}

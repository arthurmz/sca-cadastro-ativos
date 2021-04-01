package com.sca.cadastroativos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sca.cadastroativos.model.manutencao.ExecucaoManutencaoAtivo;
import com.sca.cadastroativos.repository.ExecucaoManutencaoAtivoRepository;

@Service
public class ExecucaoManutencaoAtivoService {
	
	@Autowired
	private ExecucaoManutencaoAtivoRepository manutencaoAtivoRepository;
	
	@Transactional
	public ExecucaoManutencaoAtivo saveExecucaoManutencaoAtivo(ExecucaoManutencaoAtivo manutencaoAtivo) {
		 ExecucaoManutencaoAtivo a = manutencaoAtivoRepository.save(manutencaoAtivo);
		 return a;
	}
	
	public List<ExecucaoManutencaoAtivo> findAll() {
		return manutencaoAtivoRepository.findAll();
	}

}

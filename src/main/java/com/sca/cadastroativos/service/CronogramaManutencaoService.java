package com.sca.cadastroativos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sca.cadastroativos.model.manutencao.CronogramaManutencao;
import com.sca.cadastroativos.repository.CronogramaManutencaoRepository;

@Service
public class CronogramaManutencaoService {
	
	@Autowired
	private CronogramaManutencaoRepository cronogramaManutencaoRepository;
	
	@Transactional
	public CronogramaManutencao saveCronogramaManutencao(CronogramaManutencao cronogramaManutencao) {
		 CronogramaManutencao a = cronogramaManutencaoRepository.save(cronogramaManutencao);
		 return a;
	}
	
	public List<CronogramaManutencao> findAll() {
		return cronogramaManutencaoRepository.findAll();
	}

}

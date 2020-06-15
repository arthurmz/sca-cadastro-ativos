package com.sca.cadastroativos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sca.cadastroativos.ativo.model.Ativo;
import com.sca.cadastroativos.repository.AtivoRepository;

@Service
public class AtivoService {
	
	@Autowired
	private AtivoRepository ativoRepository;
	
	@Transactional
	public Ativo saveAtivo(Ativo ativo) {
		 Ativo a = ativoRepository.save(ativo);
		 return a;
	}
	
	public List<Ativo> findAll() {
		return ativoRepository.findAll();
	}

}

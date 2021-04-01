package com.sca.cadastroativos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sca.cadastroativos.model.insumo.InsumoDisponivel;
import com.sca.cadastroativos.repository.InsumoDisponivelRepository;

@Service
public class InsumoDisponivelService {
	
	@Autowired
	private InsumoDisponivelRepository insumoRepository;
	
	@Transactional
	public InsumoDisponivel saveInsumoDisponivel(InsumoDisponivel insumo) {
		 InsumoDisponivel a = insumoRepository.save(insumo);
		 return a;
	}
	
	public List<InsumoDisponivel> findAll() {
		return insumoRepository.findAll();
	}

}

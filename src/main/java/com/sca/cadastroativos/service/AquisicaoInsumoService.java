package com.sca.cadastroativos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sca.cadastroativos.insumo.aquisicao.AquisicaoInsumo;
import com.sca.cadastroativos.repository.AquisicaoInsumoRepository;

@Service
public class AquisicaoInsumoService {
	
	@Autowired
	private AquisicaoInsumoRepository aquisicaoInsumoRepository;
	
	@Transactional
	public AquisicaoInsumo saveAquisicaoInsumo(AquisicaoInsumo aquisicaoInsumo) {
		 AquisicaoInsumo a = aquisicaoInsumoRepository.save(aquisicaoInsumo);
		 return a;
	}
	
	public List<AquisicaoInsumo> findAll() {
		return aquisicaoInsumoRepository.findAll();
	}

}

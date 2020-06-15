package com.sca.cadastroativos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sca.cadastroativos.insumo.aquisicao.ConsumoInsumo;
import com.sca.cadastroativos.repository.ConsumoInsumoRepository;

@Service
public class ConsumoInsumoService {
	
	@Autowired
	private ConsumoInsumoRepository consumoInsumoRepository;
	
	@Transactional
	public ConsumoInsumo saveConsumoInsumo(ConsumoInsumo consumoInsumo) {
		 ConsumoInsumo a = consumoInsumoRepository.save(consumoInsumo);
		 return a;
	}
	
	public List<ConsumoInsumo> findAll() {
		return consumoInsumoRepository.findAll();
	}

}

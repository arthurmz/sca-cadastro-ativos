package com.sca.cadastroativos.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sca.cadastroativos.model.aquisicao.ConsumoInsumo;
import com.sca.cadastroativos.repository.ConsumoInsumoRepository;
import com.sca.cadastroativos.service.ConsumoInsumoService;

@RestController
@RequestMapping("/consumoInsumos")
public class ConsumoInsumoController {
	
	@Autowired
	private ConsumoInsumoService consumoInsumoService;
	
	@Autowired
	private ConsumoInsumoRepository consumoInsumoRepository;
	
	@GetMapping
	public List<ConsumoInsumo> getAllConsumoInsumos(){
		return consumoInsumoService.findAll();
	}
	
	@GetMapping("{id}")
	public ConsumoInsumo getConsumoInsumo(@PathVariable Long id) {
		return consumoInsumoRepository.getOne(id);
	}
	
	@PostMapping()
	public ConsumoInsumo saveConsumoInsumo(@RequestBody ConsumoInsumo consumoInsumo) throws Exception {
		return consumoInsumoService.saveConsumoInsumo(consumoInsumo);
	}
	
	@PutMapping()
	public ConsumoInsumo alteraConsumoInsumo(@RequestBody ConsumoInsumo consumoInsumo) throws Exception {
		return consumoInsumoService.saveConsumoInsumo(consumoInsumo);
	}

}

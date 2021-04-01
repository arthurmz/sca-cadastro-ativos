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

import com.sca.cadastroativos.model.aquisicao.AquisicaoInsumo;
import com.sca.cadastroativos.repository.AquisicaoInsumoRepository;
import com.sca.cadastroativos.service.AquisicaoInsumoService;

@RestController
@RequestMapping("/aquisicaoinsumos")
public class AquisicaoInsumoController {
	
	@Autowired
	private AquisicaoInsumoService aquisicaoInsumoService;
	
	@Autowired
	private AquisicaoInsumoRepository aquisicaoInsumoRepository;
	
	@GetMapping
	public List<AquisicaoInsumo> getAllAquisicaoInsumos(){
		return aquisicaoInsumoService.findAll();
	}
	
	@GetMapping("{id}")
	public AquisicaoInsumo getAquisicaoInsumo(@PathVariable Long id) {
		return aquisicaoInsumoRepository.getOne(id);
	}
	
	@PostMapping()
	public AquisicaoInsumo saveAquisicaoInsumo(@RequestBody AquisicaoInsumo aquisicaoInsumo) throws Exception {
		return aquisicaoInsumoService.saveAquisicaoInsumo(aquisicaoInsumo);
	}
	
	@PutMapping()
	public AquisicaoInsumo alteraAquisicaoInsumo(@RequestBody AquisicaoInsumo aquisicaoInsumo) throws Exception {
		return aquisicaoInsumoService.saveAquisicaoInsumo(aquisicaoInsumo);
	}

}

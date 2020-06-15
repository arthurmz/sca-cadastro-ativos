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

import com.sca.cadastroativos.insumo.model.InsumoDisponivel;
import com.sca.cadastroativos.repository.InsumoDisponivelRepository;
import com.sca.cadastroativos.service.InsumoDisponivelService;

@RestController
@RequestMapping("/insumoDisponiveis")
public class InsumoDisponivelController {
	
	@Autowired
	private InsumoDisponivelService insumoDisponivelService;
	
	@Autowired
	private InsumoDisponivelRepository insumoDisponivelRepository;
	
	@GetMapping
	public List<InsumoDisponivel> getAllInsumoDisponiveis(){
		return insumoDisponivelService.findAll();
	}
	
	@GetMapping("{id}")
	public InsumoDisponivel getInsumoDisponivel(@PathVariable Long id) {
		return insumoDisponivelRepository.getOne(id);
	}
	
	@PostMapping()
	public InsumoDisponivel saveInsumoDisponivel(@RequestBody InsumoDisponivel insumoDisponivel) throws Exception {
		return insumoDisponivelService.saveInsumoDisponivel(insumoDisponivel);
	}
	
	@PutMapping()
	public InsumoDisponivel alteraInsumoDisponivel(@RequestBody InsumoDisponivel insumoDisponivel) throws Exception {
		return insumoDisponivelService.saveInsumoDisponivel(insumoDisponivel);
	}

}

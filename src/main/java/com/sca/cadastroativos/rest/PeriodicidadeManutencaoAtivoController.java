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

import com.sca.cadastroativos.model.manutencao.PeriodicidadeManutencaoAtivo;
import com.sca.cadastroativos.repository.PeriodicidadeManutencaoAtivoRepository;
import com.sca.cadastroativos.service.PeriodicidadeManutencaoAtivoService;

@RestController
@RequestMapping("/periodicidadeManutencaoAtivos")
public class PeriodicidadeManutencaoAtivoController {
	
	@Autowired
	private PeriodicidadeManutencaoAtivoService periodicidadeManutencaoAtivoService;
	
	@Autowired
	private PeriodicidadeManutencaoAtivoRepository periodicidadeManutencaoAtivoRepository;
	
	@GetMapping
	public List<PeriodicidadeManutencaoAtivo> getAllPeriodicidadeManutencaoAtivos(){
		return periodicidadeManutencaoAtivoService.findAll();
	}
	
	@GetMapping("{id}")
	public PeriodicidadeManutencaoAtivo getPeriodicidadeManutencaoAtivo(@PathVariable Long id) {
		return periodicidadeManutencaoAtivoRepository.getOne(id);
	}
	
	@PostMapping()
	public PeriodicidadeManutencaoAtivo savePeriodicidadeManutencaoAtivo(@RequestBody PeriodicidadeManutencaoAtivo periodicidadeManutencaoAtivo) throws Exception {
		return periodicidadeManutencaoAtivoService.savePeriodicidadeManutencaoAtivo(periodicidadeManutencaoAtivo);
	}
	
	@PutMapping()
	public PeriodicidadeManutencaoAtivo alteraPeriodicidadeManutencaoAtivo(@RequestBody PeriodicidadeManutencaoAtivo periodicidadeManutencaoAtivo) throws Exception {
		return periodicidadeManutencaoAtivoService.savePeriodicidadeManutencaoAtivo(periodicidadeManutencaoAtivo);
	}

}

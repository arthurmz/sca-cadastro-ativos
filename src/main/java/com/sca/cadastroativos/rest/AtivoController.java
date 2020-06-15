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

import com.sca.cadastroativos.ativo.model.Ativo;
import com.sca.cadastroativos.repository.AtivoRepository;
import com.sca.cadastroativos.service.AtivoService;

@RestController
@RequestMapping("/ativos")
public class AtivoController {
	
	@Autowired
	private AtivoService ativoService;
	
	@Autowired
	private AtivoRepository ativoRepository;
	
	@GetMapping
	public List<Ativo> getAllAtivos(){
		return ativoService.findAll();
	}
	
	@GetMapping("{id}")
	public Ativo getAtivo(@PathVariable Long id) {
		return ativoRepository.getOne(id);
	}
	
	@PostMapping()
	public Ativo saveAtivo(@RequestBody Ativo ativo) throws Exception {
		return ativoService.saveAtivo(ativo);
	}
	
	@PutMapping()
	public Ativo alteraAtivo(@RequestBody Ativo ativo) throws Exception {
		return ativoService.saveAtivo(ativo);
	}

}

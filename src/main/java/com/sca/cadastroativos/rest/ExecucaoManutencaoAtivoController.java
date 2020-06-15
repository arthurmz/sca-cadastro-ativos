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

import com.sca.cadastroativos.ativo.manutencao.model.ExecucaoManutencaoAtivo;
import com.sca.cadastroativos.repository.ExecucaoManutencaoAtivoRepository;
import com.sca.cadastroativos.service.ExecucaoManutencaoAtivoService;

@RestController
@RequestMapping("/execucaoManutencaoAtivos")
public class ExecucaoManutencaoAtivoController {
	
	@Autowired
	private ExecucaoManutencaoAtivoService execucaoManutencaoAtivoService;
	
	@Autowired
	private ExecucaoManutencaoAtivoRepository execucaoManutencaoAtivoRepository;
	
	@GetMapping
	public List<ExecucaoManutencaoAtivo> getAllExecucaoManutencaoAtivos(){
		return execucaoManutencaoAtivoService.findAll();
	}
	
	@GetMapping("{id}")
	public ExecucaoManutencaoAtivo getExecucaoManutencaoAtivo(@PathVariable Long id) {
		return execucaoManutencaoAtivoRepository.getOne(id);
	}
	
	@PostMapping()
	public ExecucaoManutencaoAtivo saveExecucaoManutencaoAtivo(@RequestBody ExecucaoManutencaoAtivo execucaoManutencaoAtivo) throws Exception {
		return execucaoManutencaoAtivoService.saveExecucaoManutencaoAtivo(execucaoManutencaoAtivo);
	}
	
	@PutMapping()
	public ExecucaoManutencaoAtivo alteraExecucaoManutencaoAtivo(@RequestBody ExecucaoManutencaoAtivo execucaoManutencaoAtivo) throws Exception {
		return execucaoManutencaoAtivoService.saveExecucaoManutencaoAtivo(execucaoManutencaoAtivo);
	}

}

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

import com.sca.cadastroativos.model.manutencao.CronogramaManutencao;
import com.sca.cadastroativos.repository.CronogramaManutencaoRepository;
import com.sca.cadastroativos.service.CronogramaManutencaoService;

@RestController
@RequestMapping("/cronogramaManutencoes")
public class CronogramaManutencaoController {
	
	@Autowired
	private CronogramaManutencaoService cronogramaManutencaoService;

	@Autowired
	private CronogramaManutencaoRepository cronogramaManutencaoRepository;
	
	@GetMapping
	public List<CronogramaManutencao> getAllCronogramaManutencaos(){
		return cronogramaManutencaoService.findAll();
	}
	
	@GetMapping("{id}")
	public CronogramaManutencao getCronogramaManutencao(@PathVariable Long id) {
		return cronogramaManutencaoRepository.getOne(id);
	}
	
	@PostMapping()
	public CronogramaManutencao saveCronogramaManutencao(@RequestBody CronogramaManutencao cronogramaManutencao) throws Exception {
		return cronogramaManutencaoService.saveCronogramaManutencao(cronogramaManutencao);
	}
	
	@PutMapping()
	public CronogramaManutencao alteraCronogramaManutencao(@RequestBody CronogramaManutencao cronogramaManutencao) throws Exception {
		return cronogramaManutencaoService.saveCronogramaManutencao(cronogramaManutencao);
	}

}

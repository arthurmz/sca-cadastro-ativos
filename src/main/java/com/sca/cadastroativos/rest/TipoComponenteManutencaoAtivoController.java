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

import com.sca.cadastroativos.model.ativo.TipoComponenteManutencaoAtivo;
import com.sca.cadastroativos.repository.TipoComponenteManutencaoAtivoRepository;
import com.sca.cadastroativos.service.TipoComponenteManutencaoAtivoService;

@RestController
@RequestMapping("/tipoComponenteManutencaoAtivo")
public class TipoComponenteManutencaoAtivoController {
	
	@Autowired
	private TipoComponenteManutencaoAtivoService tipoComponenteAtivoService;
	
	@Autowired
	private TipoComponenteManutencaoAtivoRepository tipoComponenteAtivoRepository;
	
	@GetMapping
	public List<TipoComponenteManutencaoAtivo> getAllTipoComponenteManutencaoAtivos(){
		return tipoComponenteAtivoService.findAll();
	}
	
	@GetMapping("{id}")
	public TipoComponenteManutencaoAtivo getTipoComponenteManutencaoAtivo(@PathVariable Long id) {
		return tipoComponenteAtivoRepository.getOne(id);
	}
	
	@PostMapping()
	public TipoComponenteManutencaoAtivo saveTipoComponenteManutencaoAtivo(@RequestBody TipoComponenteManutencaoAtivo tipoComponenteAtivo) throws Exception {
		return tipoComponenteAtivoService.saveTipoComponenteManutencaoAtivo(tipoComponenteAtivo);
	}
	
	@PutMapping()
	public TipoComponenteManutencaoAtivo alteraTipoComponenteManutencaoAtivo(@RequestBody TipoComponenteManutencaoAtivo tipoComponenteAtivo) throws Exception {
		return tipoComponenteAtivoService.saveTipoComponenteManutencaoAtivo(tipoComponenteAtivo);
	}

}

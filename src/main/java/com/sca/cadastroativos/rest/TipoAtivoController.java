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

import com.sca.cadastroativos.ativo.model.TipoAtivo;
import com.sca.cadastroativos.repository.TipoAtivoRepository;
import com.sca.cadastroativos.service.TipoAtivoService;

@RestController
@RequestMapping("/tipoAtivos")
public class TipoAtivoController {
	
	@Autowired
	private TipoAtivoService tipoAtivoService;
	
	@Autowired
	private TipoAtivoRepository tipoAtivoRepository;
	
	@GetMapping
	public List<TipoAtivo> getAllTipoAtivos(){
		return tipoAtivoService.findAll();
	}
	
	@GetMapping("{id}")
	public TipoAtivo getTipoAtivo(@PathVariable Long id) {
		return tipoAtivoRepository.getOne(id);
	}
	
	@PostMapping()
	public TipoAtivo saveTipoAtivo(@RequestBody TipoAtivo tipoAtivo) throws Exception {
		return tipoAtivoService.saveTipoAtivo(tipoAtivo);
	}
	
	@PutMapping()
	public TipoAtivo alteraTipoAtivo(@RequestBody TipoAtivo tipoAtivo) throws Exception {
		return tipoAtivoService.saveTipoAtivo(tipoAtivo);
	}

}

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

import com.sca.cadastroativos.insumo.model.TipoInsumo;
import com.sca.cadastroativos.repository.TipoInsumoRepository;
import com.sca.cadastroativos.service.TipoInsumoService;

@RestController
@RequestMapping("/tipoInsumos")
public class TipoInsumoController {
	
	@Autowired
	private TipoInsumoService tipoInsumoService;
	
	@Autowired
	private TipoInsumoRepository tipoInsumoRepository;
	
	@GetMapping
	public List<TipoInsumo> getAllTipoInsumos(){
		return tipoInsumoService.findAll();
	}
	
	@GetMapping("{id}")
	public TipoInsumo getTipoInsumo(@PathVariable Long id) {
		return tipoInsumoRepository.getOne(id);
	}
	
	@PostMapping()
	public TipoInsumo saveTipoInsumo(@RequestBody TipoInsumo tipoInsumo) throws Exception {
		return tipoInsumoService.saveTipoInsumo(tipoInsumo);
	}
	
	@PutMapping()
	public TipoInsumo alteraTipoInsumo(@RequestBody TipoInsumo tipoInsumo) throws Exception {
		return tipoInsumoService.saveTipoInsumo(tipoInsumo);
	}

}

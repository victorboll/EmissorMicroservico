package br.senac.rj.victor.emissor.microservice.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.senac.rj.victor.emissor.microservice.dot.McDonaldsDTO;
import br.senac.rj.victor.emissor.microservice.service.McDonaldsService;


@RestController
@RequestMapping("/api/pedido")
public class McDonaldsController {
	
	private final McDonaldsService mcDonaldsService;
	
	public McDonaldsController(McDonaldsService mcDonaldsService) {
		this.mcDonaldsService = mcDonaldsService;
	}
	
	@GetMapping
	public void getPedidosAtivos(){
		mcDonaldsService.getPedidos();
	}

}

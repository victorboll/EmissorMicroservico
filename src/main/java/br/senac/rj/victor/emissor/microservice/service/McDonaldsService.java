package br.senac.rj.victor.emissor.microservice.service;

import java.util.List;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class McDonaldsService {
	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	public void getPedidos(){
		String mensagem = "mensagem";
		rabbitTemplate.convertAndSend("fila-av2", mensagem);
	}
	
}

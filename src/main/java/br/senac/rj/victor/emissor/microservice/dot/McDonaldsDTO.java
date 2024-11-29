package br.senac.rj.victor.emissor.microservice.dot;

import java.io.Serializable;
import java.time.LocalDateTime;

public class McDonaldsDTO implements Serializable{
	private int id;
	private LocalDateTime dataCriacao;
	private int status;
	private long usuarioId;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(LocalDateTime dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public long getUsuarioId() {
		return usuarioId;
	}
	public void setUsuarioId(long usuarioId) {
		this.usuarioId = usuarioId;
	}
	
	
}

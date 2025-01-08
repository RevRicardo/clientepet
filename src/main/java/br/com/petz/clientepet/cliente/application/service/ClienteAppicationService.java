package br.com.petz.clientepet.cliente.application.service;

import org.springframework.stereotype.Service;

import br.com.petz.clientepet.cliente.application.api.ClienteRequest;
import br.com.petz.clientepet.cliente.application.api.ClienteResponse;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class ClienteAppicationService implements ClienteService {

	@Override
	public ClienteResponse criaCliente(ClienteRequest clienteRequest) {
		log.info("[inicia] ClienteAppicationService criaCliente");
		log.info("[finaliza] ClienteAppicationService criaCliente");
		return null;
	}

}

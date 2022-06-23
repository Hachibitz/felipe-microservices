package br.com.example.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.example.response.Cambio;

//substitui a estrutura "REST template" e consegue extrair os dados de forma dinâmica
@FeignClient(name = "cambio-service", url = "localhost:8000")
public interface CambioProxy {
	
	@GetMapping(value = "/cambio-service/{amount}/{from}/{to}")
	public Cambio getCambio(
			@PathVariable("amount") Double amount, 
			@PathVariable("from") String from, 
			@PathVariable("to") String to);
}

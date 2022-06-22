package br.com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.example.model.Cambio;

public interface CambioRepository extends JpaRepository<Cambio, Long> {
	//consegue usar o findby usando a coluna from e to, isso é feito pelo spring data
	Cambio findByFromAndTo(String from, String to);
}

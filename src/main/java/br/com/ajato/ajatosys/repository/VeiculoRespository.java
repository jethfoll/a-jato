package br.com.ajato.ajatosys.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;

import br.com.ajato.ajatosys.model.Veiculo;

public interface VeiculoRespository extends JpaRepository<Veiculo, Long>{

	Veiculo findByPlaca(String placa);

	void deleteByPlaca(String placa);

}

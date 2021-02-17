package br.com.ajato.ajatosys.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ajato.ajatosys.model.Veiculo;
import br.com.ajato.ajatosys.repository.VeiculoRespository;
@RestController
@RequestMapping(value="/ajato")
public class VeiculoResource {

	@Autowired
	VeiculoRespository veiculoRespository;
	
	@GetMapping("/veiculo")
	public List<Veiculo> listarVeiculos(){
		return veiculoRespository.findAll();
	}
	
	@PostMapping("/veiculo")
	public void adicionarVeiculo(@RequestBody Veiculo veiculo) {
		veiculoRespository.save(veiculo);
	}
}

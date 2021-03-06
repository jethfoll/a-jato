package br.com.ajato.ajatosys.resources;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
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
	
	@GetMapping("/veiculo/{placa}")
	public Veiculo listarVeiculo(@PathParam(value="placa") String placa) {
		return veiculoRespository.findByPlaca(placa);
	}
	
	@PostMapping("/veiculo")
	public void adicionarVeiculo(@RequestBody Veiculo veiculo) {
		veiculoRespository.save(veiculo);
	}
	
	@DeleteMapping("/veiculo/{placa}")
	public void deletarCarro(@PathParam(value="placa") String placa) {
		veiculoRespository.deleteByPlaca(placa);
	}
}

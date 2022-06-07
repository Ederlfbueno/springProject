package exemplo.app2.controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import exemplo.app2.modelo.ColaboradorModelo;
import exemplo.app2.modelo.RespostaModelo;
import exemplo.app2.repositorio.ColaboradorRepositorio;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("api")
public class ColaboradorControle {
	@Autowired
	ColaboradorRepositorio colaboradorRepositorio;
	
	@RequestMapping(value="/colaborador", method = RequestMethod.GET)
	public @ResponseBody List<ColaboradorModelo> consultar() {
		return this.colaboradorRepositorio.findAll();
	}
	
	@RequestMapping(value="/colaborador/{codigo}", method = RequestMethod.GET)
	public @ResponseBody ColaboradorModelo buscar(@PathVariable("codigo") Integer codigo) {
		return this.colaboradorRepositorio.findByCodigo(codigo);
	}
	
	@RequestMapping(value="/colaborador", method = RequestMethod.POST)
	public @ResponseBody RespostaModelo salvar(@RequestBody ColaboradorModelo colaborador) {
		try { 
			this.colaboradorRepositorio.save(colaborador);
			return new RespostaModelo("Registro salvo com sucesso!"); 
		} catch (Exception e) {
			return new RespostaModelo(e.getMessage());
		}
	}
	
	@RequestMapping(value="/colaborador", method = RequestMethod.PUT)
	public @ResponseBody RespostaModelo atualizar(@RequestBody ColaboradorModelo colaborador){
		try {
			this.colaboradorRepositorio.save(colaborador);
			return new RespostaModelo("Registro alterado com sucesso!"); 
		} catch (Exception e) {
			return new RespostaModelo(e.getMessage()); 
		}
	}
	
	@RequestMapping(value="/colaborador/{codigo}", method = RequestMethod.DELETE)
	public @ResponseBody RespostaModelo excluir(@PathVariable("codigo") Integer codigo){
		ColaboradorModelo colaboradorModelo = this.colaboradorRepositorio.findByCodigo(codigo);
		
		try {
			this.colaboradorRepositorio.delete(colaboradorModelo);
			return new RespostaModelo("Registro excluido com sucesso!"); 
		} catch (Exception e) {
			return new RespostaModelo(e.getMessage()); 
		}
	}
}	


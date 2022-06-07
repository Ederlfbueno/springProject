package exemplo.app2.repositorio;

import java.util.List;

import org.springframework.data.repository.Repository;

import exemplo.app2.modelo.ColaboradorModelo;

public interface ColaboradorRepositorio extends Repository<ColaboradorModelo, Integer>{
	
	// Métodos CRUD
	void save(ColaboradorModelo colaborador); 
	List<ColaboradorModelo> findAll(); 
	ColaboradorModelo findByCodigo(Integer codigo);
	void delete(ColaboradorModelo colaborador);
}

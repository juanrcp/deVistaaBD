package edu.deVistaaBD.aplicacion.dal;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//Fijamos el servicio repositorio
//Gracias a esta herencia podremos realizar todas las funciones del CRUD
@Repository
public interface UsuarioInterfaz extends CrudRepository<Usuarios, Long> {

	
}

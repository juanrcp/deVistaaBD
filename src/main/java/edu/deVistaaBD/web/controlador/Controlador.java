package edu.deVistaaBD.web.controlador;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import edu.deVistaaBD.aplicacion.dal.UsuarioInterfaz;
import edu.deVistaaBD.aplicacion.dal.Usuarios;

//Controlador de la vista
@Controller
public class Controlador {
	
	protected final Log logger = LogFactory.getLog(getClass());

	//Lista de Usuarios
	List<Usuarios> listaUsuarios = new ArrayList<Usuarios>();
	
	//Creacion de modelo
	Map<String, Object> miModelo = new HashMap<String, Object>();
	
	//Inyectamos interfaz
	@Autowired
	UsuarioInterfaz usuarioInterfaz;
	
	
	//Metodo post para añadir un nuevo usuario a la BBDD y lo manda a la vista de resultados 
	@RequestMapping(value="/pruebaPost", method = RequestMethod.POST)
	public ModelAndView pruebaPOST(@ModelAttribute("UsuarioNuevo") Usuarios nuevoUsuario) {	
		
		listaUsuarios.add(usuarioInterfaz.save(nuevoUsuario));
		
		miModelo.put("listaUsuarios", listaUsuarios);

			
		return new ModelAndView("resultado", "miModelo", miModelo);
	}
	 
	//Controlador de navegacion al formulario en el que introducimos un modelo con un nuevo usuario vacio
	 @RequestMapping(value="/navegacionFormulario")
	 public String navegacionFormulario(Model modelo) {
	        logger.info("Navegamos al formulario");
	        Usuarios nuevoUsuario = new Usuarios();
 	        modelo.addAttribute("UsuarioNuevo", nuevoUsuario);
	        return "formulario";
	    } 
	
}

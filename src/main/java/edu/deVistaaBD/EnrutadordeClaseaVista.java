package edu.deVistaaBD;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import edu.deVistaaBD.aplicacion.AplicacionConfiguracionContexto;
import edu.deVistaaBD.web.WebConfiguracionContexto;

//Mapea y gestiona las rutas
public class EnrutadordeClaseaVista extends AbstractAnnotationConfigDispatcherServletInitializer{

	//Carga la configuracion de la aplicacion
	@Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] { AplicacionConfiguracionContexto.class };
    }

	//Carga la configuracion de la web
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] { WebConfiguracionContexto.class };
    }

    //Gestiona la contruccion de la array que forma la ruta URL
    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }

}

package com.layala.gitdata.aplicativos;

import com.layala.gitdata.entidades.Incidencia;
import com.layala.gitdata.entidades.Repositorio;
import com.layala.gitdata.excepciones.GitDataIncidenciaExcepcion;
import com.layala.gitdata.excepciones.GitDataRepositorioExcepcion;
import com.layala.gitdata.servicios.IncidenciaSrv;
import com.layala.gitdata.servicios.RepositorioSrv;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.*;
 
/**
 * Aplicación de prueba de concepto
 * 
 * @author Luis Ayala
 */
public class App {
    private static final Logger LOGGER = LogManager.getLogger(App.class);
    
    public static void main(String... args) throws IOException {
        try {
            LOGGER.trace("Entrando en la aplicación");
            
            RepositorioSrv repoSrv = new RepositorioSrv();
            List<Repositorio> repositorios = repoSrv.getRepositorios();
            
            IncidenciaSrv incidenciaSrv = new IncidenciaSrv();
            List<Incidencia> incidencias = new ArrayList<>();
            
            List<Incidencia> lista = null;
            List<Incidencia> lista2 = null;
            for (Repositorio repositorio : repositorios) {
                lista = incidenciaSrv.getIncidenciasPorRepositorio(repositorio);
                lista2 = incidenciaSrv.getIncidenciasCerradasPorRepositorio(repositorio);
                
                incidencias.addAll(lista);
                incidencias.addAll(lista2);
            }
            incidenciaSrv.insertarIncidencia(incidencias);
        } catch (GitDataIncidenciaExcepcion | GitDataRepositorioExcepcion ex) {
            LOGGER.error(ex);
        }
    }
}

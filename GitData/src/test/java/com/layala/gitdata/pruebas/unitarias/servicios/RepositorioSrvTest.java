package com.layala.gitdata.pruebas.unitarias.servicios;

import com.layala.gitdata.entidades.Repositorio;
import com.layala.gitdata.excepciones.GitDataConfigExcepcion;
import com.layala.gitdata.excepciones.GitDataRepositorioExcepcion;
import com.layala.gitdata.servicios.RepositorioSrv;
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

/**
 *
 * @author Luis Ayala
 * @version 1.0
 * @since 1.0
 */
public class RepositorioSrvTest {
    private static final Logger LOGGER = LogManager.getLogger(RepositorioSrvTest.class);
    
    @Rule
    public ExpectedException excepcion = ExpectedException.none();
    
    public RepositorioSrvTest() {
    }
    
    @Test
    public void actualizarRepositorioExcepcionTest() throws GitDataRepositorioExcepcion, GitDataConfigExcepcion {
        LOGGER.info("Entrando al método actualizarRepositorioExcepcionTest.");
        
        RepositorioSrv servicio = new RepositorioSrv();
        final List<Repositorio> repositorios = null;
        
        excepcion.expect(GitDataRepositorioExcepcion.class);
        excepcion.expectMessage("La lista no puede ser nula");
        
        servicio.actualizarRepositorio(repositorios);
        LOGGER.info("Método actualizarRepositorioExcepcionTest finalizado.");
    }
    
    @Test
    public void actualizarRepositorioExitoTest() throws GitDataRepositorioExcepcion, GitDataConfigExcepcion {
        LOGGER.info("Entrando al método actualizarRepositorioExitoTest.");
        
        RepositorioSrv servicio = new RepositorioSrv();
        final List<Repositorio> repositorios = new ArrayList<>();
        
        
        servicio.actualizarRepositorio(repositorios);
        LOGGER.info("Método actualizarRepositorioExitoTest finalizado.");
    }
    
    @Test
    public void actualizarRepositorioFalloTest() throws GitDataRepositorioExcepcion, GitDataConfigExcepcion {
        LOGGER.info("Entrando al método actualizarRepositorioFalloTest.");
        
        RepositorioSrv servicio = new RepositorioSrv();
        final List<Repositorio> repositorios = new ArrayList<>();
        
        
        servicio.actualizarRepositorio(repositorios);
        LOGGER.info("Método actualizarRepositorioFalloTest finalizado.");
    }
}

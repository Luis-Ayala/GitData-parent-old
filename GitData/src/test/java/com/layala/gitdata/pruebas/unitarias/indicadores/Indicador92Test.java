package com.layala.gitdata.pruebas.unitarias.indicadores;

import com.layala.gitdata.entidades.Incidencia;
import com.layala.gitdata.indicadores.Indicador92;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Luis
 */
public class Indicador92Test {
    
    public Indicador92Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getTiempoRespuestaInicial method, of class Indicador92.
     */
    @Test
    public void testGetTiempoRespuestaInicial() throws Exception {
        System.out.println("getTiempoRespuestaInicial");
        List<Incidencia> incidencias = null;
        Indicador92 instance = new Indicador92();
        List<Incidencia> expResult = null;
        List<Incidencia> result = instance.getTiempoRespuestaInicial(incidencias);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

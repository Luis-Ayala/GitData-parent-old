package com.layala.gitdata.pruebas.unitarias.indicadores;

import com.layala.gitdata.entidades.Incidencia;
import com.layala.gitdata.indicadores.Indicador93;
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
public class Indicador93Test {
    
    public Indicador93Test() {
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
     * Test of getTiempoResolucion method, of class Indicador93.
     */
    @Test
    public void testGetTiempoResolucion() throws Exception {
        System.out.println("getTiempoResolucion");
        List<Incidencia> incidencias = null;
        Indicador93 instance = new Indicador93();
        List<Incidencia> expResult = null;
        List<Incidencia> result = instance.getTiempoResolucion(incidencias);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

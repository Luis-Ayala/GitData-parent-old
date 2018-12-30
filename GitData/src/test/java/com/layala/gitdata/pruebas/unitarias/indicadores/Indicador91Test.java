package com.layala.gitdata.pruebas.unitarias.indicadores;

import com.layala.gitdata.entidades.Incidencia;
import com.layala.gitdata.indicadores.Indicador91;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Luis Ayala
 */
public class Indicador91Test {
    private static final Logger LOGGER = LogManager.getLogger(Indicador91Test.class);
    
    public Indicador91Test() {
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
     * Test of getIndicenciasNoResueltas method, of class Indicador91.
     * @throws java.lang.Exception
     */
    @Test
    public void testGetIndicenciasNoResueltas() throws Exception {
        System.out.println("getIndicenciasNoResueltas");
        List<Incidencia> incidencias = null;
        Indicador91 instance = new Indicador91();
        List<Incidencia> expResult = null;
        List<Incidencia> result = instance.getIndicenciasNoResueltas(incidencias);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

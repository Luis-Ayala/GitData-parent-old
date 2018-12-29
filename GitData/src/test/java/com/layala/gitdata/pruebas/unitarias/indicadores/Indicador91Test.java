/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.layala.gitdata.pruebas.unitarias.indicadores;

import com.layala.gitdata.entidades.Incidencia;
import com.layala.gitdata.indicadores.Indicador91;
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
public class Indicador91Test {
    
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
     */
    @Test
    public void testGetIndicenciasNoResueltas() {
        System.out.println("getIndicenciasNoResueltas");
        Indicador91 instance = new Indicador91();
        List<Incidencia> expResult = null;
        List<Incidencia> result = instance.getIndicenciasNoResueltas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

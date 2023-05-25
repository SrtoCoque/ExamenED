/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package TestEmpleados;

import GestionEmpleados.Main;
import GestionEmpleados.EmpleadoComision;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ENVY
 */
public class EmpleadoComisionIT {
    
    public EmpleadoComisionIT() {
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
     * Test of getNombre method, of class Comision.
     */
    @Test
    public void testSueldo() {
        System.out.println("Sueldo");
        EmpleadoComision comision = new EmpleadoComision();
        comision.setTarifaComision(10);
        comision.setVentasBrutas(3000);
        double expResult = 300.0;
        double result = comision.sueldo();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of comprobarSSComision method, of class Comision.
     */
    @Test
    public void testComprobarSSComision() {
        System.out.println("comprobarSSComision");
        EmpleadoComision comision1 = new EmpleadoComision();
        comision1.setNumeroSeguroSocial(123456789);
        EmpleadoComision comision2 = new EmpleadoComision();
        comision2.setNumeroSeguroSocial(987654321);
        
        Main.arrayEmpleadoComision.add(comision1);
        Main.arrayEmpleadoComision.add(comision2);
        
        
        assertTrue(EmpleadoComision.comprobarSSComision(123456789));
        assertTrue(EmpleadoComision.comprobarSSComision(987654321));
        assertFalse(EmpleadoComision.comprobarSSComision(55555555));
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

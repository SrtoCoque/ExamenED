/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package TestEmpleados;

import GestionEmpleados.Main;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import GestionEmpleados.EmpleadoHoras;
import java.util.ArrayList;

/**
 *
 * @author ENVY
 */
public class EmpleadoHorasIT {
    
    public EmpleadoHorasIT() {
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
     * Test of sueldo method, of class Empleado.
     */
    @Test
    public void testSueldo() {
        System.out.println("Sueldo");
        EmpleadoHoras empleado = new EmpleadoHoras();
        empleado.setHoras(20);
        empleado.setPrecioHora(10);
        double expResult = 200.0;
        double result = empleado.sueldo();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testComprobarSSEmpleado() {
        EmpleadoHoras empleado1 = new EmpleadoHoras();
        empleado1.setNumeroSeguroSocial(123456789);
        EmpleadoHoras empleado2 = new EmpleadoHoras();
        empleado2.setNumeroSeguroSocial(987654321);
        
        Main.arrayEmpleadoHoras.add(empleado1);
        Main.arrayEmpleadoHoras.add(empleado2);
        
        assertTrue(EmpleadoHoras.comprobarSSEmpleado(123456789));
        assertTrue(EmpleadoHoras.comprobarSSEmpleado(987654321));
        assertFalse(EmpleadoHoras.comprobarSSEmpleado(555555555));
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

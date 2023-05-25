/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package empleado;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import empleado.Empleado;
import java.util.ArrayList;

/**
 *
 * @author ENVY
 */
public class EmpleadoIT {
    
    public EmpleadoIT() {
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
        Empleado empleado = new Empleado();
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
        Empleado empleado1 = new Empleado();
        empleado1.setNumeroSeguroSocial(123456789);
        Empleado empleado2 = new Empleado();
        empleado2.setNumeroSeguroSocial(987654321);
        
        Main.arrayEmpleado.add(empleado1);
        Main.arrayEmpleado.add(empleado2);
        
        assertTrue(Empleado.comprobarSSEmpleado(123456789));
        assertTrue(Empleado.comprobarSSEmpleado(987654321));
        assertFalse(Empleado.comprobarSSEmpleado(555555555));
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

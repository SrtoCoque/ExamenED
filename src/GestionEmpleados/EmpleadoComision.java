
package GestionEmpleados;

import java.util.Scanner;

/**
 * Clase EmpleadoHoras que hereda de la clase Empleado y representa a un empleado que cobra por horas trabajadas.
 * <ul>
 * <li>El valor ventasBrutas double recoge la cantidad total de ventas del empleado introducido por el usuario.</li>
 * <li>El valor ratifaComision double recoge el % de comisión del empleado introducido por el usuario.</li>
 * </ul>
 * @see #getNombre() 
 * @see #setNombre(String) 
 * @see #getApellidos() 
 * @see #setApellidos(String)
 * @see #getNumeroSeguroSocial() 
 * @see #setNumeroSeguroSocial(int) 
 * @see #getVentasBrutas() 
 * @see #setVentasBrutas(double) 
 * @see #getTarifaComision() 
 * @see #setTarifaComision(double) 
 * @see #toString() 
 * @see #sueldo() 
 * @see #comprobarSSComision(int) 
 * @see #aniadirEmpleadoComision() 
 * @see #modificarEmpleadoComisionNombre(GestionEmpleados.EmpleadoComision, Scanner) 
 * @see #modificarEmpleadoComisionApellidos(GestionEmpleados.EmpleadoComision, Scanner) 
 * @see #modificarEmpleadoComisionSS(GestionEmpleados.EmpleadoComision, Scanner) 
 * @see #modificarEmpleadoComisionTarifaComision(GestionEmpleados.EmpleadoComision, Scanner) 
 * @see #modificarEmpleadoVentasBrutas(GestionEmpleados.EmpleadoComision, Scanner) 
 * @see #buscarSSEmpleadoComision(int, Scanner) 
 * @author Alvaro Lopez Jimenez.
 */
public class EmpleadoComision extends Empleado{
    /**
     * El atributo ventasBrutas double recoge las ventas Brutas de los productos vendidos por el empleado, que es introducido por el usuario.
     */
    private double ventasBrutas;
    /**
     * El atributo tarifaComsion double recoge el % cobra el empleado de sus <code>ventasBrutas</code>, que es introducido por el usuario.
     */
    private double tarifaComision;
    /**
     * Constructor de la Clase vacio.
     */
    public EmpleadoComision () {
    } 
    /**
     * Devuelve el nombre del empleado por comision
     * @return String que representa el <code>nombre del empleado</code>
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Establece el nombre del empleado por comisión
     * @param nombre String que representa el nombre que se desea establecer al empleado por comisión.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Devuelve los apellidos del empleado por comisión
     * @return String que representa los <code>apellidos del empleado</code> por comision
     */
    public String getApellidos() {
        return apellidos;
    }
    /**
     * Establece los apellidos del empleado por comision
     * @param apellidos String que representa los apellidos que se desea establecer al empleado por comisión.
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    /**
     * Devuelve el número de la Seguridad Social del empleado por comision
     * @return int que representa el <code>Número de la Seguridad Social</code> del empleado por comision
     */
    public int getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }
    /**
     * Establece el número de la Seguridad Socia del empleado por comisión
     * @param numeroSeguroSocial int que representa el número de la seguridad social
     * que se desea establecer al empleado por comisión.
     */
    public void setNumeroSeguroSocial(int numeroSeguroSocial) {
        this.numeroSeguroSocial = numeroSeguroSocial;
    }
    /**
     * Devuelve las ventas Brutas del empleado por comisión
     * @return double que representa las <code>Ventas Brutas</code> que ha realizado el empleado por comision.
     */
    public double getVentasBrutas() {
        return ventasBrutas;
    }
    /**
     * Establece las ventas brutas del empleado por comision
     * @param ventasBrutas double que representa las ventas brutas
     * que se desea establecer al empleado por comisión.
     */
    public void setVentasBrutas(double ventasBrutas) {
        this.ventasBrutas = ventasBrutas;
    }
    /**
     * Devuelve el % de la Comisión que cobra por venta del empleado por comisión
     * @return double que representa el <code>% que cobra</code> por las ventas Brutas realizadas por el empleado por comision.
     */
    public double getTarifaComision() {
        return tarifaComision;
    }
    /**
     * Establece % de comisión que cobra el empleado por comision
     * @param tarifaComision double que representa el % de comision
     * que se desea establecer al empleado por comisión.
     */
    public void setTarifaComision(double tarifaComision) {
        this.tarifaComision = tarifaComision;
    }
    /**
     * Devuelve una cadena de texto que representa al empleado por comision con su nombre, apellidos, número de Seguridad Social,
     * ventas Brutas, Comisión y sueldo.
     */
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", numeroSeguroSocial=" + numeroSeguroSocial + ", Ventas Brutas: " + ventasBrutas + ", Comisión: " + tarifaComision + ", sueldo: " + sueldo() + '}';
    }
    /**
     * Calcula y devuelve el sueldo correspondiente al empleado en función de las ventas brutas y el % de comisión.
     * @return double que representa el sueldo del empleado.
     */
    @Override
    public double sueldo () {
        
        double sueldo = getVentasBrutas() * (getTarifaComision()/100);
        return sueldo;
    }
    /**
     * Comprueba si existe un empleado con el número de Seguridad Social introducido 
     * por el usuario en el arrayEmpleadosComision de la clase Main.
     * @param sS int que representa el número de Seguridad Social a comprobar.
     * @return boolean que indica si existe o no un empleado con ese número de Seguridad Social.
     */
    public static boolean comprobarSSComision(int sS) {
        EmpleadoHoras empleado = new EmpleadoHoras();
        
        int num = 0;
        boolean booleano;
        for (EmpleadoComision comisionarray : Main.arrayEmpleadoComision) {
            if (comisionarray.getNumeroSeguroSocial() == sS) {
                num++;
            }
        }
        if (num > 0) {
            booleano = true;
        } else {
            booleano = false;
        }
        return booleano;
    }
    /**
     * Añade un nuevo empleado por comisión al arrayEmpleadosComsion de la clase Main.
     */
    public static void aniadirEmpleadoComision() {
        Scanner teclado = new Scanner(System.in);
        String nombre;
        String apellidos;
        int numeroSeguridadSocial;
        double ventasBrutas;
        double tarifaComision;
        EmpleadoComision comision = new EmpleadoComision();
        System.out.println("¿Cuál es su nombre?");
        nombre = teclado.nextLine();
        comision.setNombre(nombre);
        System.out.println("¿Cuáles son sus apellidos?");
        apellidos = teclado.nextLine();
        comision.setApellidos(apellidos);
        System.out.println("¿Cual es su número de la Seguridad Social?");
        numeroSeguridadSocial = teclado.nextInt();
        comision.setNumeroSeguroSocial(numeroSeguridadSocial);
        System.out.println("¿Cuales han sido sus ventas Brutas?");
        ventasBrutas = teclado.nextDouble();
        comision.setVentasBrutas(ventasBrutas);
        System.out.println("¿Cual es su porcentaje de comisión?");
        tarifaComision = teclado.nextDouble();
        comision.setTarifaComision(tarifaComision);
        Main.arrayEmpleadoComision.add(comision);
    }
    /**
     * Modifica el % de la comision del empleado dado.
     * @param comision EmpleadoComision al que se desea modificar el % de la comisión.
     * @param teclado Scanner para leer la entrada el usuario.
     */    
    public static void modificarEmpleadoComisionTarifaComision(EmpleadoComision comision, Scanner teclado) {
        double tarifaComision;
        System.out.println("Su comisión es de " + comision.getTarifaComision() + "%, quieres modificarla por:");
        tarifaComision = teclado.nextDouble();
        comision.setTarifaComision(tarifaComision);
    }
    /**
     * Modifica los apellidos del empleado dado.
     * @param comision EmpleadoComision al que se desea modificar el los apellidos.
     * @param teclado Scanner para leer la entrada el usuario.
     */
    public static void modificarEmpleadoComisionApellidos(EmpleadoComision comision, Scanner teclado) {
        String apellidos;
        System.out.println("Quieres modificar " + comision.getApellidos() + " ¿Por?:");
        apellidos = teclado.nextLine();
        comision.setApellidos(apellidos);
    }
    /**
     * Modifica el nombre del empleado dado.
     * @param comision EmpleadoComision al que se desea modificar el nombre.
     * @param teclado Scanner para leer la entrada el usuario.
     */
    public static void modificarEmpleadoComisionNombre(EmpleadoComision comision, Scanner teclado) {
        System.out.println("Quieres modificar " + comision.getNombre() + " ¿Por?:");
        String newNombre = teclado.nextLine();
        comision.setNombre(newNombre);
    }
    /**
     * Modifica el número de Seguridad Social del empleado dado.
     * @param comision EmpleadoComision al que se desea modificar el número de Seguridad Social.
     * @param teclado Scanner para leer la entrada el usuario.
     */
    public static void modificarEmpleadoComisionSS(EmpleadoComision comision, Scanner teclado) {
        int numeroSeguridadSocial;
        System.out.println("Quieres modificar " + comision.getNumeroSeguroSocial() + " ¿Por?:");
        numeroSeguridadSocial = teclado.nextInt();
        comision.setNumeroSeguroSocial(numeroSeguridadSocial);
    }
    /**
     * Modifica las ventas brutas del empleado dado.
     * @param comision EmpleadoComision al que se desea modificar las ventas brutas.
     * @param teclado Scanner para leer la entrada el usuario.
     */
    public static void modificarEmpleadoVentasBrutas(EmpleadoComision comision, Scanner teclado) {
        double ventasBrutas;
        System.out.println("Sus ventas brutas son de: " + comision.getVentasBrutas() + ", quieres modificarlas por:");
        ventasBrutas = teclado.nextDouble();
        comision.setVentasBrutas(ventasBrutas);
    }
    /**
     * Busca un empleado de horas por su número de Seguridad Social en el arrayEmpleadosComision de la clase Main.
     * @param num2 int que representa el número de veces que se ha intentado buscar el empleado sin éxito.
     * @param teclado Scanner para leer la entrada del usuario.
     * @return int que representa el número de Seguridad Social del empleado buscado, que introduce el usuario.
     */
    public static int buscarSSEmpleadoComision(int num2, Scanner teclado) {
        int numeroSeguridadSocial;
        do {
            if (num2 > 0) {
                System.out.println("*********************************");
                System.out.println("Empleado no encontrado, prueba otra vez");
            }
            num2++;
            System.out.println("¿Cual es su numero de la seguridad Social del empleado?");
            numeroSeguridadSocial = teclado.nextInt();
        } while (!EmpleadoComision.comprobarSSComision(numeroSeguridadSocial));
        return numeroSeguridadSocial;
    }
    
}

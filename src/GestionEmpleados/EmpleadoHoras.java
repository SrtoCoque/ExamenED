
package GestionEmpleados;

import java.util.Scanner;
/**
 * Clase EmpleadoHoras que hereda de la clase Empleado y representa a un empleado que cobra por horas trabajadas.
 * <ul>
 * <li>El valor precioHora double recoge el precio por Hora trabajada del empleado introducido por el usuario.</li>
 * <li>El valor horas double recoge las horas trabajadas del empleado introducido por el usuario.</li>
 * </ul>
 * @see #getNombre() 
 * @see #setNombre(String) 
 * @see #getApellidos() 
 * @see #setApellidos(String)
 * @see #getNumeroSeguroSocial() 
 * @see #setNumeroSeguroSocial(int) 
 * @see #getPrecioHora() 
 * @see #setPrecioHora(double) 
 * @see #getHoras() 
 * @see #setHoras(double) 
 * @see #toString() 
 * @see #sueldo() 
 * @see #comprobarSSEmpleado(int) 
 * @see #aniadirEmpleadoHoras() 
 * @see #modificarEmpleadoHorasNombre(GestionEmpleados.EmpleadoHoras, Scanner) 
 * @see #modificarEmpleadoHorasApellido(GestionEmpleados.EmpleadoHoras, Scanner) 
 * @see #modificarEmpleadoHorasSS(GestionEmpleados.EmpleadoHoras, Scanner) 
 * @see #modificarEmpleadoHorasPrecioHora(GestionEmpleados.EmpleadoHoras, Scanner) 
 * @see #modificarEmpleadoHoraHoras(GestionEmpleados.EmpleadoHoras, Scanner) 
 * @see #buscarSSEmpleadoHoras(int, Scanner) 
 * @author Alvaro Lopez Jimenez.
 */
public class EmpleadoHoras extends Empleado {
    /**
     * El atributo precioHora double recoge el Precio por hora que cobra el empleado, que es introducido por el usuario.
     */
    private double precioHora;
    /**
     * El atributo horas double recoge las horas de trabajo del empleado, que es introducido por el usuario.
     */
    private double horas;
    /**
     * Constructor de la Clase vacio.
     */
    public EmpleadoHoras () {
    } 
    /**
     * Devuelve el nombre del empleado por horas
     * @return String que representa el <code>nombre del empleado</code>
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Establece el nombre del empleado por horas
     * @param nombre String que representa el nombre que se desea establecer al empleado por horas.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Devuelve los apellidos del empleado por horas
     * @return String que representa los <code>apellidos del empleado</code>
     */
    public String getApellidos() {
        return apellidos;
    }
    /**
     * Establece los apellidos del empleado por horas
     * @param apellidos String que representa los apellidos que se desea establecer al empleado por horas.
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    /**
     * Devuelve el número de la Seguridad Social del empleado por horas
     * @return int que representa el <code>Número de la Seguridad Social</code> del empleado por horas
     */
    public int getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }
    /**
     * Establece el número de la Seguridad Socia del empleado por horas
     * @param numeroSeguroSocial int que representa el número de la seguridad social
     * que se desea establecer al empleado por horas.
     */
    public void setNumeroSeguroSocial(int numeroSeguroSocial) {
        this.numeroSeguroSocial = numeroSeguroSocial;
    }
    /**
     * Devuelve el precio por Hora del empleado por horas
     * @return double que representa el <code>Precio por hora</code> que cobra el empleado por horas
     */
    public double getPrecioHora() {
        return precioHora;
    }
    /**
     * Establece el precio por Hora del empleado por horas
     * @param precioHora double que representa el precio por hora
     * que se desea establecer al empleado por horas.
     */
    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }
    /**
     * Devuelve las horas trabajadas del empleado por horas
     * @return double que representa el <code>Número de horas</code> que ha trabajado el empleado por horas
     */
    public double getHoras() {
        return horas;
    }
    /**
     * Establece las horas trabajadas del empleado por horas
     * @param horas double que representa las horas trabajadas
     * que se desea establecer al empleado por horas.
     */
    public void setHoras(double horas) {
        this.horas = horas;
    }
    /**
     * Devuelve una cadena de texto que representa al empleado por horas con su nombre, apellidos, número de Seguridad Social,
     * precio por hora, número de horas trabajadas y sueldo.
     */
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", numeroSeguroSocial=" + numeroSeguroSocial + ", Precio Hora= " + precioHora + ", Horas: " + horas +", sueldo: " + sueldo() + '}';
    }
    /**
     * Calcula y devuelve el sueldo correspondiente al empleado en función de las horas trabajadas y el precio por hora.
     * @return double que representa el sueldo del empleado.
     */
    @Override
    public double sueldo () {
        
        double sueldo = getHoras() * getPrecioHora();
        return sueldo;
    }
    /**
     * Comprueba si existe un empleado con el número de Seguridad Social introducido 
     * por el usuario en el arrayEmpleadosHoras de la clase Main.
     * @param sS int que representa el número de Seguridad Social a comprobar.
     * @return boolean que indica si existe o no un empleado con ese número de Seguridad Social.
     */
    public static boolean comprobarSSEmpleado(int sS) {
        int num = 0;
        boolean booleano;
        for (EmpleadoHoras empleadoarray : Main.arrayEmpleadoHoras) {
            if (empleadoarray.getNumeroSeguroSocial() == sS) {
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
     * Añade un nuevo empleado de horas al arrayEmpleadosHoras de la clase Main.
     */    
    public static void aniadirEmpleadoHoras() {
        Scanner teclado = new Scanner(System.in);
        String nombre;
        String apellidos;
        int numeroSeguridadSocial;
        double precioHora;
        double horas;
        EmpleadoHoras empleado = new EmpleadoHoras();
        System.out.println("¿Cuál es su nombre?");
        nombre = teclado.nextLine();
        empleado.setNombre(nombre);
        System.out.println("¿Cuales son sus apellidos?");
        apellidos = teclado.nextLine();
        empleado.setApellidos(apellidos);
        System.out.println("¿Cual es su n\u00famero de la Seguridad Social?");
        numeroSeguridadSocial = teclado.nextInt();
        empleado.setNumeroSeguroSocial(numeroSeguridadSocial);
        System.out.println("¿Cuánto cobra por hora?");
        precioHora = teclado.nextDouble();
        empleado.setPrecioHora(precioHora);
        System.out.println("¿Cuántas horas ha echado de trabajo?");
        horas = teclado.nextDouble();
        empleado.setHoras(horas);
        Main.arrayEmpleadoHoras.add(empleado);
    }
    /**
     * Modifica el número de Seguridad Social del empleado dado.
     * @param empleado3 EmpleadoHoras al que se desea modificar el número de Seguridad Social.
     * @param teclado Scanner para leer la entrada el usuario.
     */
    public static void modificarEmpleadoHorasSS(EmpleadoHoras empleado3, Scanner teclado) {
        int numeroSeguridadSocial;
        System.out.println("Quieres modificar " + empleado3.getNumeroSeguroSocial() + "¿Por?:");
        teclado.nextLine();
        numeroSeguridadSocial = teclado.nextInt();
        empleado3.setNumeroSeguroSocial(numeroSeguridadSocial);
    }
    /**
     * Modifica el precio por hora del empleado dado.
     * @param empleado3 EmpleadoHoras al que se desea modificar el precio por hora.
     * @param teclado Scanner para leer la entrada del usuario.
     */
    public static void modificarEmpleadoHorasPrecioHora(EmpleadoHoras empleado3, Scanner teclado) {
        double precioHora;
        System.out.println("El precio por hora está en: " + empleado3.getPrecioHora() + ", quieres modificarlo por:");
        precioHora = teclado.nextDouble();
        empleado3.setPrecioHora(precioHora);
    }
    /**
     * Modifica el nombre del empleado dado.
     * @param empleado3 EmpleadoHoras al que se desea modificar el nombre.
     * @param teclado Scanner para leer la entrada del usuario.
     */
    public static void modificarEmpleadoHorasNombre(EmpleadoHoras empleado3, Scanner teclado) {
        System.out.println("Quieres modificar " + empleado3.getNombre() + " ¿Por?:");
        String newNombre = teclado.nextLine();
        empleado3.setNombre(newNombre);
    }
    /**
     * Modifica los apellidos del empleado dado.
     * @param empleado3 EmpleadoHoras al que se desea modificar los apellidos.
     * @param teclado Scanner para leer la entrada del usuario.
     */
    public static void modificarEmpleadoHorasApellido(EmpleadoHoras empleado3, Scanner teclado) {
        String apellidos;
        System.out.println("Quieres modificar " + empleado3.getApellidos() + " ¿Por?:");
        apellidos = teclado.nextLine();
        empleado3.setApellidos(apellidos);
    }
    /**
     * Modifica el número de horas trabajadas del empleado dado.
     * @param empleado3 EmpleadoHoras al que se desea modificar el número de horas trabajadas.
     * @param teclado Scanner para leer la entrada del usuario.
     */
    public static void modificarEmpleadoHoraHoras(EmpleadoHoras empleado3, Scanner teclado) {
        double horas;
        System.out.println("Tiene acumuladas " + empleado3.getHoras() + "horas, quieres modificarlo por:");
        horas = teclado.nextDouble();
        empleado3.setHoras(horas);
    }
    /**
     * Busca un empleado de horas por su número de Seguridad Social en el arrayEmpleadosHoras de la clase Main.
     * @param num2 int que representa el número de veces que se ha intentado buscar el empleado sin éxito.
     * @param teclado Scanner para leer la entrada del usuario.
     * @return int que representa el número de Seguridad Social del empleado buscado, que introduce el usuario.
     */
    public static int buscarSSEmpleadoHoras(int num2, Scanner teclado) {
        int numeroSeguridadSocial;
        do {
            if (num2 > 0) {
                System.out.println("*********************************");
                System.out.println("Empleado no encontrado, prueba otra vez");
            }
            num2++;
            System.out.println("¿Cual es su numero de la seguridad Social del empleado?");
            numeroSeguridadSocial = teclado.nextInt();
        } while (!EmpleadoHoras.comprobarSSEmpleado(numeroSeguridadSocial));
        return numeroSeguridadSocial;
    }
    
    
}

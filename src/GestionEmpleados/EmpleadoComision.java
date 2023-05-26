
package GestionEmpleados;

import java.util.Scanner;


public class EmpleadoComision extends Empleado{
    
    private double ventasBrutas;
    private double tarifaComision;
    
    public EmpleadoComision () {
    } 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    public void setNumeroSeguroSocial(int numeroSeguroSocial) {
        this.numeroSeguroSocial = numeroSeguroSocial;
    }

    public double getVentasBrutas() {
        return ventasBrutas;
    }

    public void setVentasBrutas(double ventasBrutas) {
        this.ventasBrutas = ventasBrutas;
    }

    public double getTarifaComision() {
        return tarifaComision;
    }

    public void setTarifaComision(double tarifaComision) {
        this.tarifaComision = tarifaComision;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", numeroSeguroSocial=" + numeroSeguroSocial + ", Ventas Brutas: " + ventasBrutas + ", Comisión: " + tarifaComision + ", sueldo: " + sueldo() + '}';
    }
    @Override
    public double sueldo () {
        
        double sueldo = getVentasBrutas() * (getTarifaComision()/100);
        return sueldo;
    }
    
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
        System.out.println("¿Cual es su n\u00famero de la Seguridad Social?");
        numeroSeguridadSocial = teclado.nextInt();
        comision.setNumeroSeguroSocial(numeroSeguridadSocial);
        System.out.println("¿Cuales han sido sus ventas Brutas?");
        ventasBrutas = teclado.nextDouble();
        comision.setVentasBrutas(ventasBrutas);
        System.out.println("¿Cual es su porcentaje de comisi\u00f3n?");
        tarifaComision = teclado.nextDouble();
        comision.setTarifaComision(tarifaComision);
        Main.arrayEmpleadoComision.add(comision);
    }
        
    public static void modificarEmpleadoComisionTarifaComision(EmpleadoComision comision, Scanner teclado) {
        double tarifaComision;
        System.out.println("Su comisi\u00f3n es de " + comision.getTarifaComision() + "%, quieres modificarla por:");
        tarifaComision = teclado.nextDouble();
        comision.setTarifaComision(tarifaComision);
    }

    public static void modificarEmpleadoComisionApellidos(EmpleadoComision comision, Scanner teclado) {
        String apellidos;
        System.out.println("Quieres modificar " + comision.getApellidos() + " \u00bfPor?:");
        teclado.nextLine();
        apellidos = teclado.nextLine();
        comision.setApellidos(apellidos);
    }

    public static void modificarEmpleadoComisionNombre(EmpleadoComision comision, Scanner teclado) {
        System.out.println("Quieres modificar " + comision.getNombre() + " \u00bfPor?:");
        teclado.nextLine();
        String newNombre = teclado.nextLine();
        comision.setNombre(newNombre);
    }

    public static int modificarEmpleadoComisionSS(EmpleadoComision comision, Scanner teclado, int numeroSeguridadSocial) {
        System.out.println("Quieres modificar " + comision.getNumeroSeguroSocial() + " \u00bfPor?:");
        teclado.nextLine();
        numeroSeguridadSocial = teclado.nextInt();
        comision.setNumeroSeguroSocial(numeroSeguridadSocial);
        return numeroSeguridadSocial;
    }

    public static void modificarEmpleadoComisionVentas(EmpleadoComision comision, Scanner teclado) {
        double ventasBrutas;
        System.out.println("Sus ventas brutas son de: " + comision.getVentasBrutas() + ", quieres modificarlas por:");
        ventasBrutas = teclado.nextDouble();
        comision.setVentasBrutas(ventasBrutas);
    }
    
    public static int buscarSSEmpleadoComision(int num2, Scanner teclado) {
        int numeroSeguridadSocial;
        do {
            if (num2 > 0) {
                System.out.println("*********************************");
                System.out.println("Empleado no encontrado, prueba otra vez");
            }
            num2++;
            System.out.println("\u00bfCual es su numero de la seguridad Social del empleado?");
            numeroSeguridadSocial = teclado.nextInt();
        } while (!EmpleadoComision.comprobarSSComision(numeroSeguridadSocial));
        return numeroSeguridadSocial;
    }
    
}

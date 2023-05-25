
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
    
}

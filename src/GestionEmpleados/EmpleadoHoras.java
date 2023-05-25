
package GestionEmpleados;

import java.util.Scanner;

public class EmpleadoHoras extends Empleado {
    
    private double precioHora;
    private double horas;
    
    public EmpleadoHoras () {
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

    public double getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", numeroSeguroSocial=" + numeroSeguroSocial + ", Precio Hora= " + precioHora + ", Horas: " + horas +", sueldo: " + sueldo() + '}';
    }
    
    @Override
    public double sueldo () {
        
        double sueldo = getHoras() * getPrecioHora();
        return sueldo;
    }
    
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
    
    
}


package GestionEmpleados;


public abstract class Empleado {
    
    
    protected String nombre;
    protected String apellidos;
    protected int numeroSeguroSocial;

    public Empleado() {
    }

    public abstract double sueldo();
    
    @Override
    public abstract String toString();
    
}

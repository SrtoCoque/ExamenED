
package GestionEmpleados;

/**
 * La clase Empleado es una superclase de la que heredan los siguientes atributos y métodos
 * todas las subclases que extiendan de esta:
 * <ul>
 * <li>El valor nombre String recoge el nombre del empleado introducido por el usuario</li>
 * <li>El valor apellidos String recoge los apellidos del empleado introducido por el usuario</li>
 * <li>El valor numeroSeguridadSocial int recoge el numero de la Seguridad Social del empleado introducido por el usuario</li>
 * </ul>
 * @see #toString() 
 * @see #sueldo() 
 * @author Alvaro Lopez Jimenez.
 */
public abstract class Empleado {
    
    /**
     * El atributo nombre recoge el nombre del empleado introducido por el usuario.
     * Este atributo está protegido para que solo pueda acceder las sublcases que exteinden de esta clase Empleado.
     */
    protected String nombre;
    /**
     * El atributoapellidos recoge los apellidos del empleado introducido por el usuario.
     * Este atributo está protegido para que solo pueda acceder las sublcases que exteinden de esta clase Empleado.
     */
    protected String apellidos;
    /**
     * El atributo numeroSeguroSocial recoge el número de la Seguridad Social del empleado introducido por el usuario.
     * Este atributo está protegido para que solo pueda acceder las sublcases que exteinden de esta clase Empleado.
     */
    protected int numeroSeguroSocial;
    /**
     * Constructor de la Clase vacio.
     */
    public Empleado() {
    }
    /**
     * Este método abstracto calcula el sueldo del empleado.
     * Cada sublcase debe implementar este método para definir cómo se calcula el sueldo según el tipo de empleado.
     * @return un valor double que representa el sueldo del empleado
     */
    public abstract double sueldo();
    /**
     * Este método abstracto devuelve una cadena de caracteres con la información del empleado.
     * Cada sublcase debe implementar este método para definir cómo se calcula el sueldo según el tipo de empleado.
     */
    @Override
    public abstract String toString();
    
}


package GestionEmpleados;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * Gestión de los Empleados 
 * <ul>
 * <li>El arrayList arrayEmpleadoHoras recoge objetos de la clase EmpleadoHoras</li>
 * <li>El arrayList arrayEmpleadoComision recoge objetos de la clase EmpleadoComision</li>
 * <li>El valor nombre String recoge el nombre del empleado introducido por el usuario</li>
 * <li>El valor apellidos String recoge los apellidos del empleado introducido por el usuario</li>
 * <li>El valor numeroSeguridadSocial int recoge el numero de la Seguridad Social del empleado introducido por el usuario</li>
 * <li>El valor precioHora double recoge el precio hora que cobra el Empleado por hora que es introducido por el usuario</li>
 * <li>El valor horas double recoge las horas que ha trabajado el empleado que es introducido por el usuario</li>
 * <li>El valor ventasBrutas double recoge las ventas brutas de un Empleado que es introducido por el usuario</li>
 * <li>El valor tarifaComision double recoge el % de comision que se lleva el Empleado que es introducido por el usuario</li>
 * <li>El valor repeticionBucle boolean recoge true o false</li>
 * <li>El valor opcion int recoge la opción del menú principal que desea escoger el usuario.</li>
 * </ul>
 * @author Alvaro Lopez Jimenez.
 */
public class Main {
    /**
    * ArrayList que contiene objetos de tipo EmpleadoHoras, utilizado para almacenar
    * los empleados que reciben un pago por horas trabajadas.
    */
    public static ArrayList<EmpleadoHoras> arrayEmpleadoHoras = new ArrayList<EmpleadoHoras>();
    /**
    * ArrayList que contiene objetos de tipo EmpleadoComision, utilizado para almacenar
    * los empleados que reciben un pago por comisión por ventas realizadas.
    */
    public static ArrayList<EmpleadoComision> arrayEmpleadoComision = new ArrayList<EmpleadoComision>();
    /**
    * Este método es el punto de entrada principal para la aplicación.
    * Recibe una serie de argumentos en la línea de comandos y los procesa
    * para realizar una tarea determinada.
    *
    * @param args los argumentos proporcionados en la línea de comandos.
    */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        String nombre,apellidos;
        int numeroSeguridadSocial,opcion,opcion2,opcion3, opcion4, opcion5, opcion6;
        double precioHora, horas, ventasBrutas, tarifaComision;
        boolean repeticionBucle = true;
        
        do {
        System.out.println("Eligue una opcion");
        System.out.println("1. Añadir Empleado");
        System.out.println("2. Modificar datos de un Empleado");
        System.out.println("3. Mostrar un Empleado");
        System.out.println("4. Mostrar todos los Empleados de");
        System.out.println("5. Salir");
        opcion = teclado.nextInt();
        teclado.nextLine();
        
        switch(opcion) {
            case 1:
                System.out.println("¿Que empleado quieres añadir?");
                System.out.println("1. Empleado por Horas");
                System.out.println("2. Empleado por Comision");
                opcion = teclado.nextInt();
                teclado.nextLine();
                
                switch (opcion) {
                    
                    case 1: 
                        /**
                         * Añadir Empleado por horas
                         * @see EmpleadoHoras#aniadirEmpleadoHoras()
                         */
                        EmpleadoHoras.aniadirEmpleadoHoras();
                        break;
                    case 2:
                        /**
                         * Añadir Empleado por Comisión
                         * @see EmpleadoComision#aniadirEmpleadoComision()
                         */
                        EmpleadoComision.aniadirEmpleadoComision();
                        break;
                }
                break;
            case 2: 
                System.out.println("¿Que tipo de empleado queires modificar?");
                System.out.println("1. Empleado por Horas");
                System.out.println("2. Empleado por Comision");
                opcion = teclado.nextInt();  
                teclado.nextLine();
                
                switch (opcion) {
                    
                    case 1:
                       int num2 = 0;
                       System.out.println("¿Que datos quieres modificar?");
                       System.out.println("1. Nombre");
                       System.out.println("2. Apellidos");
                       System.out.println("3. Número Seguridad Social");
                       System.out.println("4. Precio por Hora");
                       System.out.println("5. Horas trabajadas");
                       opcion = teclado.nextInt();
                       teclado.nextLine();
                    /**
                     * Introducir y comprobar que el número de la Seguridad Social
                     * introducito por el usuario existe
                     * @see EmpleadoHoras#buscarSSEmpleadoHoras(num2, teclado)
                     */    
                    numeroSeguridadSocial = EmpleadoHoras.buscarSSEmpleadoHoras(num2, teclado);
                       
                       for (EmpleadoHoras empleado3: arrayEmpleadoHoras) {
                           if (empleado3.getNumeroSeguroSocial() == numeroSeguridadSocial) {
                           switch (opcion) {
                           case 1:
                               /**
                                * Modificar nombre de un Empleado por horas
                                * @see EmpleadoHoras#modificarEmpleadoHorasNombre(empleado3, teclado)
                                */
                                EmpleadoHoras.modificarEmpleadoHorasNombre(empleado3, teclado);
                              break;
                           case 2:
                               /**
                                * Modificar apellidos de un Empleado por horas
                                * @see EmpleadoHoras#modificarEmpleadoHorasApellidos(empleado3, teclado)
                                */
                                EmpleadoHoras.modificarEmpleadoHorasApellido(empleado3, teclado);
                              break;
                            
                           case 3:
                               /**
                                * Modificar número de la Seguridad Social de un Empleado por horas
                                * @see EmpleadoHoras#modificarEmpleadoHorasSS(empleado3, teclado)
                                */
                                EmpleadoHoras.modificarEmpleadoHorasSS(empleado3, teclado);
                              break;
                            
                           case 4:
                               /**
                                * Modificar el precio por hora de un Empleado por horas
                                * @see EmpleadoHoras#modificarEmpleadoHorasHora(empleado3, teclado)
                                */
                                EmpleadoHoras.modificarEmpleadoHorasPrecioHora(empleado3, teclado);
                              break;
                           case 5:
                               /**
                                * Modificar las horas trabajadas de un Empleado por horas
                                * @see EmpleadoHoras#modificarEmpleadoHoraHoras(empleado3, teclado)
                                */
                                EmpleadoHoras.modificarEmpleadoHoraHoras(empleado3, teclado);
                              break;
                            }
                        break;   
                       }
                       }    
                    break;   
                    case 2: 
                       num2 = 0;
                       System.out.println("¿Que datos quieres modificar?");
                       System.out.println("1. Nombre");
                       System.out.println("2. Apellidos");
                       System.out.println("3. Número Seguridad Social");
                       System.out.println("4. Ventas Brutas");
                       System.out.println("5. Comisión");
                       opcion = teclado.nextInt();
                       teclado.nextLine();
                    /**
                     * Introducir y comprobar que el número de la Seguridad Social
                     * introducito por el usuario existe
                     * @see EmpleadoComision#buscarSSEmpleadoComision (num2, teclado)
                     */   
                    numeroSeguridadSocial = EmpleadoComision.buscarSSEmpleadoComision(num2, teclado);
                       
                       for (EmpleadoComision comision: arrayEmpleadoComision) {
                           if (comision.getNumeroSeguroSocial() == numeroSeguridadSocial) {
                           switch (opcion) {
                           case 1: 
                               /**
                                * Modificar el nombre de un Empleado por Comsion
                                * @see EmpleadoComision#modificarEmpleadoComisionNombre(empleado3, teclado)
                                */
                                EmpleadoComision.modificarEmpleadoComisionNombre(comision, teclado);
                              break;
                           case 2:
                               /**
                                * Modificar el apellidos de un Empleado por Comsion
                                * @see EmpleadoComision#modificarEmpleadoComisionApellidos(empleado3, teclado)
                                */
                                EmpleadoComision.modificarEmpleadoComisionApellidos(comision, teclado);
                              break;
                            
                           case 3:
                               /**
                                * Modificar el número de la Seguridad Social de un Empleado por Comsion
                                * @see EmpleadoComision#modificarEmpleadoComisionSS(empleado3, teclado)
                                */
                                EmpleadoComision.modificarEmpleadoComisionSS(comision, teclado);
                              break;
                            
                           case 4:
                               /**
                                * Modificar el total de las ventas de un Empleado por Comsion
                                * @see EmpleadoComision#modificarEmpleadoComisionVentas(empleado3, teclado)
                                */
                                EmpleadoComision.modificarEmpleadoVentasBrutas(comision, teclado);
                              break;
                           case 5:
                               /**
                                * Modificar la comisión por venta de un Empleado por Comsion
                                * @see EmpleadoComision#modificarEmpleadoComisionTarifaComision(empleado3, teclado)
                                */
                                EmpleadoComision.modificarEmpleadoComisionTarifaComision(comision, teclado);
                              break;
                            }
                        break;   
                       }  
                       }    
                }
            break;    
                
            case 3:
                
                System.out.println("¿Que empleado quieres mostrar?");
                System.out.println("1. Empleado por Horas");
                System.out.println("2. Empleado por Comision");
                opcion = teclado.nextInt();
                teclado.nextLine();
                
                switch(opcion)  {
                
              
                        case 1:
                            int num3 = 0;
                            /**
                            * Introducir y comprobar que el número de la Seguridad Social
                            * introducito por el usuario existe
                            * @see EmpleadoHoras#buscarSSEmpleadoHoras(num3, teclado)
                            */
                            numeroSeguridadSocial = EmpleadoHoras.buscarSSEmpleadoHoras(num3, teclado);
                
                        for (EmpleadoHoras empleadoarray : arrayEmpleadoHoras) {
                            if (empleadoarray.getNumeroSeguroSocial() == numeroSeguridadSocial) {
                                /**
                                 * Mostrar el valor de los atributos que contiene EmpleadoHoras
                                 * @see EmpleadoHoras#toString()
                                 */
                                System.out.println(empleadoarray.toString());
                            }
                        }
                    break;
                    
                    case 2:
                        int num4 = 0;
                        /**
                        * Introducir y comprobar que el número de la Seguridad Social
                        * introducito por el usuario existe
                        * @see EmpleadoComision#buscarSSEmpleadoComision (num4, teclado)
                        */
                        numeroSeguridadSocial = EmpleadoComision.buscarSSEmpleadoComision(num4, teclado);
                
                        for (EmpleadoComision comisionarray : arrayEmpleadoComision) {
                            if (comisionarray.getNumeroSeguroSocial() == numeroSeguridadSocial) {
                                /**
                                 * Mostrar el valor de los atributos que contiene EmpleadoHoras
                                 * @see EmpleadoComision#toString()
                                 */
                                System.out.println(comisionarray.toString());
                            }
                        }
                    break;
                }
            break;
            
            case 4:
                System.out.println("¿Que empleado quieres mostrar?");
                System.out.println("1. Empleado por Horas");
                System.out.println("2. Empleado por Comision");
                opcion = teclado.nextInt();
                teclado.nextLine();
                
                switch (opcion) {
                    case 1:
                        for (EmpleadoHoras empleadoarray2 : arrayEmpleadoHoras) {
                        /**
                        * Mostrar el valor de los atributos que contiene EmpleadoHoras
                        * @see EmpleadoHoras#toString()
                        */    
                        System.out.println(empleadoarray2.toString());
                        }
                    break;
                    case 2:
                        for (EmpleadoComision comisionarray2 : arrayEmpleadoComision) {
                        /**
                        * Mostrar el valor de los atributos que contiene EmpleadoHoras
                        * @see EmpleadoComision#toString()
                        */    
                        System.out.println(comisionarray2.toString());
                        }
                    break;
                }
                
           break;  
           case 5:
               
            System.out.println("Saliendo del programa...");
            repeticionBucle=false;
            teclado.close();
            break;
                
        }       
        } while (repeticionBucle);
        
    }
  
}

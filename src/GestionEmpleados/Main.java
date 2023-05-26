
package GestionEmpleados;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static ArrayList<EmpleadoHoras> arrayEmpleadoHoras = new ArrayList<EmpleadoHoras>();
    public static ArrayList<EmpleadoComision> arrayEmpleadoComision = new ArrayList<EmpleadoComision>();
    
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
                opcion2 = teclado.nextInt();
                teclado.nextLine();
                
                switch (opcion2) {
                    
                    case 1: 

                        EmpleadoHoras.aniadirEmpleadoHoras();
                        break;
                    case 2:

                        EmpleadoComision.aniadirEmpleadoComision();
                        break;
                }
                break;
            case 2: 
                System.out.println("¿Que tipo de empleado queires modificar?");
                System.out.println("1. Empleado por Horas");
                System.out.println("2. Empleado por Comision");
                opcion3 = teclado.nextInt();  
                teclado.nextLine();
                
                switch (opcion3) {
                    
                    case 1:
                       int num2 = 0;
                       System.out.println("¿Que datos quieres modificar?");
                       System.out.println("1. Nombre");
                       System.out.println("2. Apellidos");
                       System.out.println("3. Número Seguridad Social");
                       System.out.println("4. Precio por Hora");
                       System.out.println("5. Horas trabajadas");
                       opcion4 = teclado.nextInt();
                       teclado.nextLine();
                       
                    numeroSeguridadSocial = EmpleadoHoras.buscarSSEmpleadoHoras(num2, teclado);
                       
                       for (EmpleadoHoras empleado3: arrayEmpleadoHoras) {
                           if (empleado3.getNumeroSeguroSocial() == numeroSeguridadSocial) {
                           switch (opcion4) {
                           case 1:
                               
                                EmpleadoHoras.modificarEmpleadoHorasNombre(empleado3, teclado);
                              break;
                           case 2:
                                EmpleadoHoras.modificarEmpleadoHorasApellido(empleado3, teclado);
                              break;
                            
                           case 3:
                                numeroSeguridadSocial = EmpleadoHoras.modificarEmpleadoHorasSS(empleado3, teclado, numeroSeguridadSocial);
                              break;
                            
                           case 4:
                                EmpleadoHoras.modificarEmpleadoHorasPrecioHora(empleado3, teclado);
                              break;
                           case 5:
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
                       opcion4 = teclado.nextInt();
                       teclado.nextLine();
                       
                    numeroSeguridadSocial = EmpleadoComision.buscarSSEmpleadoComision(num2, teclado);
                       
                       for (EmpleadoComision comision: arrayEmpleadoComision) {
                           if (comision.getNumeroSeguroSocial() == numeroSeguridadSocial) {
                           switch (opcion4) {
                           case 1:                               
                                EmpleadoComision.modificarEmpleadoComisionNombre(comision, teclado);
                              break;
                           case 2:
                                EmpleadoComision.modificarEmpleadoComisionApellidos(comision, teclado);
                              break;
                            
                           case 3:
                                numeroSeguridadSocial = EmpleadoComision.modificarEmpleadoComisionSS(comision, teclado, numeroSeguridadSocial);
                              break;
                            
                           case 4:
                                EmpleadoComision.modificarEmpleadoComisionVentas(comision, teclado);
                              break;
                           case 5:
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
                opcion5 = teclado.nextInt();
                teclado.nextLine();
                
                switch(opcion5)  {
                
              
                        case 1:
                            int num3 = 0;
                            numeroSeguridadSocial = EmpleadoHoras.buscarSSEmpleadoHoras(num3, teclado);
                
                        for (EmpleadoHoras empleadoarray : arrayEmpleadoHoras) {
                            if (empleadoarray.getNumeroSeguroSocial() == numeroSeguridadSocial) {
         
                                System.out.println(empleadoarray.toString());
                            }
                        }
                    break;
                    
                    case 2:
                        int num4 = 0;
                        numeroSeguridadSocial = EmpleadoComision.buscarSSEmpleadoComision(num4, teclado);
                
                        for (EmpleadoComision comisionarray : arrayEmpleadoComision) {
                            if (comisionarray.getNumeroSeguroSocial() == numeroSeguridadSocial) {
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
                opcion6 = teclado.nextInt();
                teclado.nextLine();
                
                switch (opcion6) {
                    case 1:
                        for (EmpleadoHoras empleadoarray2 : arrayEmpleadoHoras) {
                        System.out.println(empleadoarray2.toString());
                        }
                    break;
                    case 2:
                        for (EmpleadoComision comisionarray2 : arrayEmpleadoComision) {
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

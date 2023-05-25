
package empleado;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static ArrayList<Empleado> arrayEmpleado = new ArrayList<Empleado>();
    public static ArrayList<Comision> arrayComision = new ArrayList<Comision>();
    
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

                        Empleado empleado = new Empleado ();
                        System.out.println("¿Cuál es su nombre?");
                        nombre = teclado.nextLine();
                        empleado.setNombre(nombre);
                        System.out.println("¿Cuáles son sus apellidos?");
                        apellidos = teclado.nextLine();
                        empleado.setApellidos(apellidos);
                        System.out.println("¿Cual es su número de la Seguridad Social?");
                        numeroSeguridadSocial = teclado.nextInt();
                        empleado.setNumeroSeguroSocial(numeroSeguridadSocial);
                        System.out.println("¿Cuánto cobra por hora?");
                        precioHora = teclado.nextDouble();
                        empleado.setPrecioHora(precioHora);
                        System.out.println("¿Cuántas horas ha echado de trabajo?");
                        horas = teclado.nextDouble();
                        empleado.setHoras(horas);

                        arrayEmpleado.add(empleado);
                        break;
                    case 2:

                        Comision comision = new Comision ();

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

                        arrayComision.add(comision);
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
                       
                       do {
                       if (num2 >0) {
                           System.out.println("*********************************");
                           System.out.println("Empleado no encontrado, prueba otra vez");
                       }
                       num2++;
                       
                       System.out.println("¿Cual es su numero de la seguridad Social del empleado?");
                       numeroSeguridadSocial = teclado.nextInt();
                       } while (!Empleado.comprobarSSEmpleado(numeroSeguridadSocial));
                       
                       for (Empleado empleado3: arrayEmpleado) {
                           if (empleado3.getNumeroSeguroSocial() == numeroSeguridadSocial) {
                           switch (opcion4) {
                           case 1:
                               
                              System.out.println("Quieres modificar " + empleado3.getNombre()+ " ¿Por?:");
                              teclado.nextLine();
                              String newNombre = teclado.nextLine();
                              empleado3.setNombre(newNombre);
                              break;
                           case 2:
                              System.out.println("Quieres modificar " + empleado3.getApellidos() + " ¿Por?:");
                              teclado.nextLine();
                              apellidos = teclado.nextLine();
                              empleado3.setApellidos(apellidos);
                              break;
                            
                           case 3:
                              System.out.println("Quieres modificar " + empleado3.getNumeroSeguroSocial() + " ¿Por?:");
                              teclado.nextLine();
                              numeroSeguridadSocial = teclado.nextInt();
                              empleado3.setNumeroSeguroSocial(numeroSeguridadSocial);
                              break;
                            
                           case 4:
                              System.out.println("El precio por hora está en: " + empleado3.getPrecioHora() + ", quieres modificarlo por:");
                              precioHora = teclado.nextDouble();
                              empleado3.setPrecioHora(precioHora);
                              break;
                           case 5:
                              System.out.println("Tiene acumuladas " + empleado3.getHoras() + "horas, quieres modificarlo por:");
                              horas = teclado.nextDouble();
                              empleado3.setHoras(horas);
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
                       
                       do {
                       if (num2 >0) {
                           System.out.println("*********************************");
                           System.out.println("Empleado no encontrado, prueba otra vez");
                       }
                       num2++;
                       
                       System.out.println("¿Cual es su numero de la seguridad Social del empleado?");
                       numeroSeguridadSocial = teclado.nextInt();
                       } while (!Comision.comprobarSSComision(numeroSeguridadSocial));
                       
                       for (Comision comision: arrayComision) {
                           if (comision.getNumeroSeguroSocial() == numeroSeguridadSocial) {
                           switch (opcion4) {
                           case 1:
                               
                              System.out.println("Quieres modificar " + comision.getNombre()+ " ¿Por?:");
                              teclado.nextLine();
                              String newNombre = teclado.nextLine();
                              comision.setNombre(newNombre);
                              break;
                           case 2:
                              System.out.println("Quieres modificar " + comision.getApellidos() + " ¿Por?:");
                              teclado.nextLine();
                              apellidos = teclado.nextLine();
                              comision.setApellidos(apellidos);
                              break;
                            
                           case 3:
                              System.out.println("Quieres modificar " + comision.getNumeroSeguroSocial() + " ¿Por?:");
                              teclado.nextLine();
                              numeroSeguridadSocial = teclado.nextInt();
                              comision.setNumeroSeguroSocial(numeroSeguridadSocial);
                              break;
                            
                           case 4:
                              System.out.println("Sus ventas brutas son de: " + comision.getVentasBrutas() + ", quieres modificarlas por:");
                              ventasBrutas = teclado.nextDouble();
                              comision.setVentasBrutas(ventasBrutas);
                              break;
                           case 5:
                              System.out.println("Su comisión es de " + comision.getTarifaComision() + "%, quieres modificarla por:");
                              tarifaComision = teclado.nextDouble();
                              comision.setTarifaComision(tarifaComision);
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
                
                int num3 = 0;
                do {
                       if (num3 >0) {
                           System.out.println("*********************************");
                           System.out.println("Empleado no encontrado, prueba otra vez");
                       }
                       num3++;
                       
                       System.out.println("¿Cual es su numero de la seguridad Social del empleado?");
                       numeroSeguridadSocial = teclado.nextInt();
                } while (!Comision.comprobarSSComision(numeroSeguridadSocial));
                
                switch(opcion5)  {
                
              
                    case 1:
                
                        for (Empleado empleadoarray : arrayEmpleado) {
                            if (empleadoarray.getNumeroSeguroSocial() == numeroSeguridadSocial) {
                                System.out.println(empleadoarray.toString());
                            }
                        }
                    break;
                    
                    case 2:
                        for (Comision comisionarray : arrayComision) {
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
                        for (Empleado empleadoarray2 : arrayEmpleado) {
                        System.out.println(empleadoarray2.toString());
                        }
                    break;
                    case 2:
                        for (Comision comisionarray2 : arrayComision) {
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

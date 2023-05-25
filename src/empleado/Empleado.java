
package empleado;

public class Empleado {
    
    private String nombre;
    private String apellidos;
    private int numeroSeguroSocial;
    private double precioHora;
    private double horas;
    
    public Empleado () {
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
    
    public double sueldo () {
        
        double sueldo = getHoras() * getPrecioHora();
        return sueldo;
    }
    
    public static boolean comprobarSSEmpleado(int sS) {
        int num = 0;
        boolean booleano;
        for (Empleado empleadoarray : Main.arrayEmpleado) {
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
    
    
    
}

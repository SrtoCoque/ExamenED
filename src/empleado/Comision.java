
package empleado;


public class Comision {
    
    private String nombre;
    private String apellidos;
    private int numeroSeguroSocial;
    private double ventasBrutas;
    private double tarifaComision;
    
    public Comision () {
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
    
    public double sueldo () {
        
        double sueldo = getVentasBrutas() * (getTarifaComision()/100);
        return sueldo;
    }
    
    public static boolean comprobarSSComision(int sS) {
        Empleado empleado = new Empleado();
        
        int num = 0;
        boolean booleano;
        for (Comision comisionarray : Main.arrayComision) {
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
    
}

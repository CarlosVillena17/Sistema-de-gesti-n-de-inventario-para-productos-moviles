
package Modelo;

public class ClienteComprador{
     private String username;
     private String DNI; 
     private String nombre; 
     private String apellido; 
     private double ventas;

    public ClienteComprador(String DNI, String nombre, String apellido, double ventas) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ventas = ventas;
    }

     

    public ClienteComprador(String username, String DNI, String nombre, String apellido, double ventas) {
        this.username = username;
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ventas = ventas;
    }

    public ClienteComprador() {
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getVentas() {
        return ventas;
    }

    public void setVentas(double ventas) {
        this.ventas = ventas;
    }
    

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "ClienteComprador{" + "username=" + username + ", DNI=" + DNI + ", nombre=" + nombre + ", apellido=" + apellido + ", ventas=" + ventas + '}';
    }
    
     
}

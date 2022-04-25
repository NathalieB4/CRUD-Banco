package Codigo;

import java.io.*;

public class Asociado {
    
    private String nombre;
    private String tel;
    private String email;
    private String identificacion;
    private String contraseña;
    private int ahorro;
    private int prestamos;
    private int montoPrestamoDisponible;
    private int salario;

    public Asociado(String nombre, String tel, String email, String identificacion, String contraseña, int ahorro, int prestamos, int montoPrestamoDisponible, int salario) {
        this.nombre = nombre;
        this.tel = tel;
        this.email = email;
        this.identificacion = identificacion;
        this.contraseña = contraseña;
        this.ahorro = ahorro;
        this.prestamos = prestamos;
        this.montoPrestamoDisponible = montoPrestamoDisponible;
        this.salario = salario;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
        TodosAsociados.guardar();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel){
        this.tel = tel;
        TodosAsociados.guardar();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email){
        this.email = email;
        TodosAsociados.guardar();
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion){
        this.identificacion = identificacion;
        TodosAsociados.guardar();
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña){
        this.contraseña = contraseña;
        TodosAsociados.guardar();
    }

    public int getAhorro() {
        return ahorro;
    }

    public void setAhorro(int ahorro){
        this.ahorro = ahorro;
        TodosAsociados.guardar();
    }

    public int getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(int prestamos){
        this.prestamos = prestamos;
        TodosAsociados.guardar();
    }

    public int getMontoPrestamoDisponible() {
        return montoPrestamoDisponible;
    }

    public void setMontoPrestamoDisponible(int montoPrestamoDisponible) {
        this.montoPrestamoDisponible = montoPrestamoDisponible;
        TodosAsociados.guardar();
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
        TodosAsociados.guardar();
    } 
    
    //Método para leer el archivo de texto y luego escribir la información en el Array
    public static Asociado leer(BufferedReader lector){
        try {
            String nombre = lector.readLine();
            String tel = lector.readLine();
            String email = lector.readLine();
            String identificacion = lector.readLine();
            String contraseña = lector.readLine();
            String ahorroString = lector.readLine();
            String prestamosString = lector.readLine();
            String montoPrestamo = lector.readLine();
            String salarioString = lector.readLine();
            
            if(nombre == null || tel == null || email == null || identificacion == null || contraseña == null || ahorroString == null || prestamosString == null || montoPrestamo == null){
                return null;
            }
            
            int ahorro = Integer.parseInt(ahorroString);
            int prestamos = Integer.parseInt(prestamosString);
            int montoPrestamoDisponible = Integer.parseInt(prestamosString);
            int salario = Integer.parseInt(salarioString);
            Asociado asociado = new Asociado(nombre, tel, email, identificacion, contraseña, ahorro, prestamos, montoPrestamoDisponible, salario);
            return asociado;
            
        } catch (IOException ex) {
            //change it later
            System.out.println(ex);
            return null;
        }
    }
    
    //Método para escribir en el archivo de texto
    public void escribir(PrintWriter imprimir){
        imprimir.println(nombre);
        imprimir.println(tel);
        imprimir.println(email);
        imprimir.println(identificacion);
        imprimir.println(contraseña);
        imprimir.println(ahorro);
        imprimir.println(prestamos);
        imprimir.println(montoPrestamoDisponible);
        imprimir.println(salario);
    }
    
    //Este método vuelve nulos los Strings y se pone el valor mínimo en el integer
    public void despuesEliminado(){
        nombre = null;
        tel = null;
        email = null;
        identificacion = null;
        contraseña = null;
        ahorro = Integer.MIN_VALUE;
        prestamos = Integer.MIN_VALUE;
        montoPrestamoDisponible = Integer.MIN_VALUE;
        salario = Integer.MIN_VALUE;
    }
}

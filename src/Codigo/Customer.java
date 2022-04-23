package Codigo;

import java.io.*;

public class Customer {
    
    private String name;
    private String tel;
    private String email;
    private String username;
    private String password;
    private String balance;
    private String loans;

    public Customer(String name, String tel, String email, String username, String password, String balance, String loans) {
        this.name = name;
        this.tel = tel;
        this.email = email;
        this.username = username;
        this.password = password;
        this.balance = balance;
        this.loans = loans;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
        AllCustomers.save();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel){
        this.tel = tel;
        AllCustomers.save();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email){
        this.email = email;
        AllCustomers.save();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username){
        this.username = username;
        AllCustomers.save();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password){
        this.password = password;
        AllCustomers.save();
    }

    public String getAhorro() {
        return balance;
    }

    public void setAhorro(String balance){
        this.balance = balance;
        AllCustomers.save();
    }

    public String getPrestamos() {
        return loans;
    }

    public void setPrestamos(String loans){
        this.loans = loans;
        AllCustomers.save();
    }
    
    //Método para leer el archivo de texto y luego escribir la información en el Array
    public static Customer read(BufferedReader reader){
        try {
            String name = reader.readLine();
            String tel = reader.readLine();
            String email = reader.readLine();
            String username = reader.readLine();
            String password = reader.readLine();
            String balance = reader.readLine();
            String loans = reader.readLine();
            
            Customer customer = new Customer(name, tel, email, username, password, balance, loans);
            
            if(name == null || tel == null || email == null || username == null || password == null || balance == null || loans == null){
                return null;
            }
            return customer;
            
        } catch (IOException ex) {
            //change it later
            System.out.println(ex);
            return null;
        }
    }
    
    //Método para escribir en el archivo de texto
    public void write(PrintWriter printer){
        printer.println(name);
        printer.println(tel);
        printer.println(email);
        printer.println(username);
        printer.println(password);
        printer.println(balance);
        printer.println(loans);
    }
    
    public void afterDelete(){
        name = null;
        tel = null;
        email = null;
        username = null;
        password = null;
        balance = null;
        loans = null;
    }
}

package Codigo;

import java.io.*;

public class AllCustomers {
    
    //Se crea el Array junto con su contador
    private static Customer[] customers = new Customer[20];
    private static int counter = 0;

    static {

    }

    public static void customer() {

    }
    
    //Método privado que se encargará automáticamente en incrementar el tamaño del Array cuando sea necesario
    private static void expandSize() {
        int addSize = 0;
        addSize = customers.length + 20;

        Customer[] customersAdd = new Customer[addSize];

        for(int i = 0; i < counter; i++) {
            customersAdd[i] = customers[i];
        }

        customers = customersAdd;

    }
    
    //Método para ya pasar la información del archivo al Array
    public static void load() {
        try {
            //Se crea al lector y lee el arhivo
            BufferedReader reader = new BufferedReader(new FileReader("C:\\DataBase\\Customer"));
            //Se pone el contador en 0 porque el Array debe estar vacío para poder pasar toda la información
            counter = 0;
            
            Customer customer;
            while ((customer = Customer.read(reader)) != null) {
                //Se llama al método que está abajo de este
                add(customer);
            }
            
            //Se cierra el archivo
            reader.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
    
    //Método encargado de agregar al asociados y trabaja en conjunto con el método anterior
    public static void add(Customer customer){
        /*Verifica el tamaño del contador con el Array
        Recordar que para agregar la información desde el archivo de texto al Array, el Array está vacío
        -> Por lo que cuando el contador esté en 20 y el tamaño del Array haya llegado a su máxima capacidad que es igual 20
        se llama al método para expandir el tamaño del Array
        */
        if(customers.length == counter){
            expandSize();
        }
        customers[counter] = customer;
        counter++;
    }
    
    //Método para guardar el Array en el archivo de texto
    public static void save() {
        try {
            //Se abre el archivo con el "printer"
            PrintWriter printer = new PrintWriter("C:\\DataBase\\Customer");
            
            //Por cada cosa que haya en el Array
            for (int i = 0; i < counter; i++) {
                //Se escribe esa cosa en el archivo
                Customer customer = customers[i];
                customer.write(printer);
            }   
            //Se cierra el archivo
            printer.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
    }
}

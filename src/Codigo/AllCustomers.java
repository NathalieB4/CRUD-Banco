package Codigo;

import java.io.*;
import javax.swing.JList;

public class AllCustomers {
    
    //Se crea el Array junto con su contador
    private static Customer[] customers = new Customer[20];
    private static int counter = 0;
    
    static {
        AllCustomers.load();
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
    private static void load() {
        try {
            //Se crea al lector y lee el arhivo
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Database\\Customers.txt"));
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
            System.out.println(ex + "the error is here");
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
        new File("C:\\Database").mkdirs();
        try {
            //Se abre el archivo con el "printer"
            PrintWriter printer = new PrintWriter("C:\\Database\\Customers.txt");
            
            //Por cada cosa que haya en el Array
            for (int i = 0; i < counter; i++) {
                //Se escribe esa cosa en el archivo
                Customer customer = customers[i];
                customer.write(printer);
            }   
            //Se cierra el archivo
            printer.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex + "hi, the error is here");
        }
    }
    
    /*Método para conseguir al Asociado con el ID que se escribió en el JPanel de Inicio de sesión
    Por lo que sí, ese "String username = EscribirIdentificacion.getText();" pasa la información hasta acá
    Y si nos damos cuenta, este método es de tipo Customer, no un void*/
    public static Customer get(String username){
        //Se hace un loop por el Array por medio del contador
        for(int i = 0; i < counter; i++){
            //Se crea un objeto tipo "customer" (que luego lo cambiaré a asociado) que será equivalente al índice i del Array
            Customer customer = customers[i];
            //Y se crea una variable tipo String para conseguir el get del ID (que de momento se llama Username)
            String thisUsername = customer.getUsername();
            
            //Si el ID es igual al ID que se escribió en el espacio al intentar iniciar sesión
            if(username.equals(thisUsername)){
                //Retorna un asociado (que de momento se llama customer )
                return customer;
            }
        }
        //Si no se encuentra coincidencias, se retorna null
        return null;
    }
    
    //Método para eliminar un asociado
    public static void delete(String username){
        //Se hace un loop por el Array por medio del contador
        for(int i = 0; i < counter; i++){
            //Se encuentra el índice del Array
            Customer customer = customers[i];
            //Llamamos al getter del ID
            String thisUsername = customer.getUsername();
            //Si el ID que ingresaron es igual al ID que se consiguió por el getter, se elimina el asociado
            if(username.equals(thisUsername)){
               //Se crea la variable para conseguir el último objeto almacenado en el Array para así moverlo
               Customer lastCustomer = customers[counter - 1];
               /*El hueco en el array que se hace al eliminar un elemento, se llenará moviendo la última cosa
               que esté almacenada en el arreglo al hueco. 
               */
               customers[i] = lastCustomer;
               //Se le baja un número al contador para que actualice cuántos asociados hay registrados
               counter--;
               //Se guarda en el archivo de texto el cambio
               AllCustomers.save();
               //Por si acaso, todos los valores de ese usuario se vuelven null
               customer.afterDelete();
               //Se retorna para salir del método
               return;
            }
            /* Nota extra, diferencia entre un break; y un return; (así solo)
            -> break es para romper un loop
            -> return es para salir de un método
            */
        }
    }
    
    public static void dividends(JList listDividends){
        
    }
}

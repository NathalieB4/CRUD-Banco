package Codigo;

import java.io.*;
import javax.swing.JTable;

public class TodosAsociados {

    //Se crea el Array junto con su contador
    private static Asociado[] asociados = new Asociado[20];
    private static int contador = 0;

    static {
        TodosAsociados.cargar();
    }

    public static void asociado() {

    }

    //Método privado que se encargará automáticamente en incrementar el tamaño del Array cuando sea necesario
    private static void expandirTamaño() {
        int añadirTamaño = 0;
        añadirTamaño = asociados.length + 20;

        Asociado[] asociadosAñadir = new Asociado[añadirTamaño];

        for (int i = 0; i < contador; i++) {
            asociadosAñadir[i] = asociados[i];
        }

        asociados = asociadosAñadir;

    }

    //Método para ya pasar la información del archivo al Array
    private static void cargar() {
        try {
            //Se crea al lector y lee el arhivo
            BufferedReader lector = new BufferedReader(new FileReader("C:\\Database\\Customers.txt"));
            //Se pone el contador en 0 porque el Array debe estar vacío para poder pasar toda la información
            contador = 0;

            Asociado asociado;
            //Primero se llena la variable asociado y luego se verifica si no es nulo
            while ((asociado = Asociado.leer(lector)) != null) {
                //Se llama al método que está abajo de este
                añadir(asociado);
            }

            //Se cierra el archivo
            lector.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    //Método encargado de agregar al asociados y trabaja en conjunto con el método anterior
    public static void añadir(Asociado asociado) {
        /*Verifica el tamaño del contador con el Array
        Recordar que para agregar la información desde el archivo de texto al Array, el Array está vacío
        -> Por lo que cuando el contador esté en 20 y el tamaño del Array haya llegado a su máxima capacidad que es igual 20
        se llama al método para expandir el tamaño del Array
         */
        if (asociados.length == contador) {
            expandirTamaño();
        }
        //asociado se guardará en el arreglo
        asociados[contador] = asociado;
        //se suma el contador con base a la cantidad de asociados que se añaden
        contador++;
    }

    //Método para guardar el Array en el archivo de texto
    public static void guardar() {
        //Se crea la carpeta donde se guardará el archivo de texto
        new File("C:\\Database").mkdirs();
        try {
            //Se abre el archivo con el "printer"
            PrintWriter imprimir = new PrintWriter("C:\\Database\\Customers.txt");

            //Por cada cosa que haya en el Array
            for (int i = 0; i < contador; i++) {
                //Se escribe esa cosa en el archivo
                Asociado asociado = asociados[i];
                asociado.escribir(imprimir);
            }
            //Se cierra el archivo
            imprimir.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
    }

    /*Método para conseguir al Asociado con el ID que se escribió en el JPanel de Inicio de sesión
    Por lo que sí, ese "String username = EscribirIdentificacion.getText();" pasa la información hasta acá
    Y si nos damos cuenta, este método es de tipo Customer, no un void*/
    public static Asociado get(String identificacion) {
        //Se hace un loop por el Array por medio del contador
        for (int i = 0; i < contador; i++) {
            //Se crea un objeto tipo "asociado" que será equivalente al índice i del Array
            Asociado asociado = asociados[i];
            //Y se crea una variable tipo String para conseguir el get del ID
            String thisIdentificacion = asociado.getIdentificacion();

            //Si el ID es igual al ID que se escribió en el espacio al intentar iniciar sesión
            if (identificacion.equals(thisIdentificacion)) {
                //Retorna un asociado
                return asociado;
            }
        }
        //Si no se encuentra coincidencias, se retorna null
        return null;
    }

    //Método para eliminar un asociado
    public static void borrar(String identificacion) {
        //Se hace un loop por el Array por medio del contador
        for (int i = 0; i < contador; i++) {
            //Se encuentra el índice del Array
            Asociado asociado = asociados[i];
            //Llamamos al getter del ID
            String thisIdentificacion = asociado.getIdentificacion();
            //Si el ID que ingresaron es igual al ID que se consiguió por el getter, se elimina el asociado
            if (identificacion.equals(thisIdentificacion)) {
                //Se crea la variable para conseguir el último objeto almacenado en el Array para así moverlo
                Asociado ultimoAsociado = asociados[contador - 1];
                /*El hueco en el array que se hace al eliminar un elemento, se llenará moviendo la última cosa
               que esté almacenada en el arreglo al hueco. 
                 */
                asociados[i] = ultimoAsociado;
                //Se le baja un número al contador para que actualice cuántos asociados hay registrados
                contador--;
                //Se guarda en el archivo de texto el cambio
                TodosAsociados.guardar();
                //Por si acaso, todos los valores de ese usuario se vuelven null
                asociado.despuesEliminado();
                //Se retorna para salir del método
                return;
            }
            /* Nota extra, diferencia entre un break; y un return; (así solo)
            -> break es para romper un loop
            -> return es para salir de un método
             */
        }
    }
    
    public static int getAhorros(){
        int getLosAhorros = 0;
        
        for(int i = 0; i < contador; i++){
            Asociado asociado = asociados[i];
            getLosAhorros = getLosAhorros + asociado.getAhorro();
        }
        return getLosAhorros;
    }
    
    public static int getGananciasPrestamos(){
        int getLosPrestamos = 0;
        
        for(int i = 0; i < contador; i++){
            Asociado asociado = asociados[i];
            getLosPrestamos = getLosPrestamos + asociado.getGananciasPrestamos();
        }
        return getLosPrestamos;
    }
    
    public static String getNombres(){
        String getLosNombres = "";
        
        for(int i = 0; i < contador; i++){
            Asociado asociado = asociados[i];
            getLosNombres = asociado.getNombre();
            
        }
        return getLosNombres;
    }
    
    public Object[][] dividendosTabla(){
        
        Object[][] resultadoTabla = new Object[contador][4];
        
        return resultadoTabla;
        
    }
}

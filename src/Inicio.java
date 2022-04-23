import Codigo.AllCustomers;
import Codigo.Customer;
import java.awt.BorderLayout;
import java.awt.Color;
import java.io.*;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Inicio extends javax.swing.JPanel {
    
    Asociado menuDentroAsociados = new Asociado();


    public Inicio() {
        initComponents();
        //Hay un panel nuevo que cubre todo el menú de iniciar sesión, por lo que este se pone invisible hasta ser necesitado
        contenido.setVisible(false);
        //El botón de salir será invisible hasta que el contenido (la línea de código arriba de este texto) sea visible
        salirFondo.setVisible(false);
        salirBoton.setVisible(false);
        /*En caso de que se cierre el programa, y ya haya un archivo de texto con información y al mismo tiempo
        necesitar hacer inicio de sesión inmediatamente,
        con esta línea de código, nos encargamos de que todo lo que está en el archivo de texto, al Array
        */
        AllCustomers.load();
    }
    
    //Método para configurar el JPanel que luego aparecerá
    private void ShowPanel(JPanel p){
        p.setSize(570, 440);
        p.setLocation(0, 0);

        contenido.removeAll();
        contenido.add(p, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        salirFondo = new javax.swing.JPanel();
        salirBoton = new javax.swing.JLabel();
        contenido = new javax.swing.JPanel();
        TextoPrincipal = new javax.swing.JLabel();
        TextoClave = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        EscribirClave = new javax.swing.JTextField();
        TextoIdentificacion = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        FondoInicio = new javax.swing.JPanel();
        loginBtn = new javax.swing.JLabel();
        EscribirIdentificacion = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        salirFondo.setBackground(new java.awt.Color(0, 102, 102));

        salirBoton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        salirBoton.setForeground(new java.awt.Color(255, 255, 255));
        salirBoton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salirBoton.setText("Salir");
        salirBoton.setToolTipText("Salir al menú de Inicio de Sesión");
        salirBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salirBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirBotonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salirBotonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salirBotonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout salirFondoLayout = new javax.swing.GroupLayout(salirFondo);
        salirFondo.setLayout(salirFondoLayout);
        salirFondoLayout.setHorizontalGroup(
            salirFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(salirBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );
        salirFondoLayout.setVerticalGroup(
            salirFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(salirBoton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        add(salirFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 440, 70, 30));

        contenido.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        add(contenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 440));

        TextoPrincipal.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        TextoPrincipal.setForeground(new java.awt.Color(0, 0, 0));
        TextoPrincipal.setText("INICIAR SESIÓN COMO ASOCIADO");
        add(TextoPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, -1));

        TextoClave.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        TextoClave.setForeground(new java.awt.Color(0, 0, 0));
        TextoClave.setText("Clave:");
        add(TextoClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 230, 10));

        EscribirClave.setBackground(new java.awt.Color(255, 255, 255));
        EscribirClave.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        EscribirClave.setForeground(new java.awt.Color(102, 102, 102));
        EscribirClave.setText("Ingrese su Clave");
        EscribirClave.setBorder(null);
        EscribirClave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EscribirClaveMousePressed(evt);
            }
        });
        add(EscribirClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 230, -1));

        TextoIdentificacion.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        TextoIdentificacion.setForeground(new java.awt.Color(0, 0, 0));
        TextoIdentificacion.setText("Identificación:");
        add(TextoIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, -1));

        jSeparator3.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator3.setForeground(new java.awt.Color(102, 102, 102));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 230, 10));

        FondoInicio.setBackground(new java.awt.Color(0, 153, 153));

        loginBtn.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(0, 0, 0));
        loginBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginBtn.setText("INICIAR SESIÓN");
        loginBtn.setToolTipText("Iniciar Sesión");
        loginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginBtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout FondoInicioLayout = new javax.swing.GroupLayout(FondoInicio);
        FondoInicio.setLayout(FondoInicioLayout);
        FondoInicioLayout.setHorizontalGroup(
            FondoInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        FondoInicioLayout.setVerticalGroup(
            FondoInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        add(FondoInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, 150, 50));

        EscribirIdentificacion.setBackground(new java.awt.Color(255, 255, 255));
        EscribirIdentificacion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        EscribirIdentificacion.setForeground(new java.awt.Color(102, 102, 102));
        EscribirIdentificacion.setText("Ingrese su Identificación");
        EscribirIdentificacion.setBorder(null);
        EscribirIdentificacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EscribirIdentificacionMousePressed(evt);
            }
        });
        add(EscribirIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 230, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void EscribirClaveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EscribirClaveMousePressed
        //Si el texto en el espacio para escribir la clave es igual al predeterminado, se vacía y se pone la fuente color negro
        if (EscribirClave.getText().equals("Ingrese su Clave")) {
            EscribirClave.setText("");
            EscribirClave.setForeground(Color.black);
        }
        //Si se dejó el espacio para escribir la ID está vacío se rellena con el texto por defecto
        if (EscribirIdentificacion.getText().isEmpty()) {
            EscribirIdentificacion.setText("Ingrese su Identificación");
            EscribirIdentificacion.setForeground(new Color(102, 102, 102));
        }
    }//GEN-LAST:event_EscribirClaveMousePressed

    private void EscribirIdentificacionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EscribirIdentificacionMousePressed
        //Si el texto en el espacio para escribir la ID es igual al predeterminado, se vacía y se pone la fuente color negro
        if (EscribirIdentificacion.getText().equals("Ingrese su Identificación")) {
            EscribirIdentificacion.setText("");
            EscribirIdentificacion.setForeground(Color.black);
        }
        //Si se dejó el espacio para escribir la clave está vacío se rellena con el texto por defecto
        if (EscribirClave.getText().isEmpty()) {
            EscribirClave.setText("Ingrese su Clave");
            EscribirClave.setForeground(new Color(102, 102, 102));
        }
    }//GEN-LAST:event_EscribirIdentificacionMousePressed

    private void loginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseClicked
        String username = EscribirIdentificacion.getText();
        String password = EscribirClave.getText();
        
        //Se llama al método get creado en la clase de AllCustomers
        Customer customer = AllCustomers.get(username);
        
        //Si lo que retorna el método de get es igual a null
        if(customer == null){
            //Se le indica a la persona que el mensaje a continuación
            JOptionPane.showMessageDialog(null, "Identificación o contraseña incorrectas");
            //Se vuelven a colocar los espacios para escribir con su texto por defecto
            EscribirIdentificacion.setText("Ingrese su Identificación");
            EscribirClave.setText("Ingrese su Clave");
        }else{
            //Si no retorna null, se verifica ahora la clave por medio del getter
            String verifyPass = customer.getPassword();
            
            /*Si la información dentro de la variable password que se creó arriba que se creó arriba
            es igual que lo que se obtiene del getter
            */ 
            if(password.equals(verifyPass)){
               //Se enseña al panel del menú de asociados ya habiendo iniciado la sesión
               ShowPanel(menuDentroAsociados);
               //El botón para ingresar se vuelve invisible (esto porque me seguía apareciendo ahí)
               FondoInicio.setVisible(false);
               loginBtn.setVisible(false);
               //Y se hace visible el panel en blanco que agregué para utilizarlo como "pizarra" para el nuevo menú
               contenido.setVisible(true);
               salirFondo.setVisible(true);
               salirBoton.setVisible(true);
               
            //De no ser igual la información escrita por la persona en password con el getter   
            }else{
                //Se vuelve a indicar que la identificación o contraseña es incorrecta
                JOptionPane.showMessageDialog(null, "Identificación o contraseña incorrectas");
                //Se vuelve a colocar los espacios para escribir con su texto por defecto
                EscribirIdentificacion.setText("Ingrese su Identificación");
                EscribirClave.setText("Ingrese su Clave");
            }
        }
        
        //En cualquiera de los dos casos (si el inicio de sesión es exitoso o no) se pondrán por defecto los textos por defecto
        EscribirIdentificacion.setText("Ingrese su Identificación");
        EscribirIdentificacion.setForeground(new Color(102, 102, 102));
        EscribirClave.setText("Ingrese su Clave");
        EscribirClave.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_loginBtnMouseClicked

    private void loginBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseEntered
        //Solamente es línea de código para cambiar el color del botón para ingresar cuando se entra
        FondoInicio.setBackground(new Color(0, 204, 204));
    }//GEN-LAST:event_loginBtnMouseEntered

    private void loginBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseExited
        //Solamente es línea de código para cambiar el color del botón para ingresar cuando se sale
        FondoInicio.setBackground(new Color(0, 153, 153));
    }//GEN-LAST:event_loginBtnMouseExited

    private void salirBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirBotonMouseEntered
        //Solamente es línea de código para cambiar el color del botón para salir cuando se entra
        salirFondo.setBackground(new Color(0, 153, 153));
    }//GEN-LAST:event_salirBotonMouseEntered

    private void salirBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirBotonMouseExited
        //Solamente es línea de código para cambiar el color del botón para salir cuando se sale
        salirFondo.setBackground(new Color(0, 102, 102));
    }//GEN-LAST:event_salirBotonMouseExited

    private void salirBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirBotonMouseClicked
        //En caso de darle click al botón de salir, se pondrán invisibles la pizarra y el propio botón de salir
        contenido.setVisible(false);
        salirFondo.setVisible(false);
        salirBoton.setVisible(false);
        
        //Vuelve a ponerse visible el botón de Inicio
        FondoInicio.setVisible(true);
        loginBtn.setVisible(true);
        
    }//GEN-LAST:event_salirBotonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EscribirClave;
    private javax.swing.JTextField EscribirIdentificacion;
    private javax.swing.JPanel FondoInicio;
    private javax.swing.JLabel TextoClave;
    private javax.swing.JLabel TextoIdentificacion;
    private javax.swing.JLabel TextoPrincipal;
    private javax.swing.JPanel contenido;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel loginBtn;
    private javax.swing.JLabel salirBoton;
    private javax.swing.JPanel salirFondo;
    // End of variables declaration//GEN-END:variables
}

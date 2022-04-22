import Codigo.AllCustomers;
import static Codigo.AllCustomers.customer;
import Codigo.Customer;
import Codigo.Customer;
import java.awt.Color;
import java.io.*;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;

public class Registro extends javax.swing.JPanel {    
    public Registro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TextoPrincipal = new javax.swing.JLabel();
        TextoIdentificacion = new javax.swing.JLabel();
        TextoAhorro = new javax.swing.JLabel();
        TextoNombre = new javax.swing.JLabel();
        TextoCorreo = new javax.swing.JLabel();
        TextoTelefono = new javax.swing.JLabel();
        TextoMensaje = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        balanceField = new javax.swing.JTextField();
        FondoGuardar = new javax.swing.JPanel();
        saveBtn = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        telField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TextoPrincipal.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        TextoPrincipal.setForeground(new java.awt.Color(0, 0, 0));
        TextoPrincipal.setText("REGÍSTRESE COMO ASOCIADO");
        add(TextoPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        TextoIdentificacion.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        TextoIdentificacion.setForeground(new java.awt.Color(0, 0, 0));
        TextoIdentificacion.setText("Identificación:");
        add(TextoIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, -1, -1));

        TextoAhorro.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        TextoAhorro.setForeground(new java.awt.Color(0, 0, 0));
        TextoAhorro.setText("Ahorro Inicial:");
        add(TextoAhorro, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, -1, -1));

        TextoNombre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        TextoNombre.setForeground(new java.awt.Color(0, 0, 0));
        TextoNombre.setText("Nombre:");
        add(TextoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        TextoCorreo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        TextoCorreo.setForeground(new java.awt.Color(0, 0, 0));
        TextoCorreo.setText("Correo:");
        add(TextoCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        TextoTelefono.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        TextoTelefono.setForeground(new java.awt.Color(0, 0, 0));
        TextoTelefono.setText("Teléfono:");
        add(TextoTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        TextoMensaje.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TextoMensaje.setForeground(new java.awt.Color(153, 153, 153));
        TextoMensaje.setText("* Debe ser mayor de 10,000 CRC");
        add(TextoMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 220, -1));

        usernameField.setBackground(new java.awt.Color(255, 255, 255));
        usernameField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        usernameField.setForeground(new java.awt.Color(102, 102, 102));
        usernameField.setText("Ingrese su Identificación");
        usernameField.setBorder(null);
        usernameField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                usernameFieldMousePressed(evt);
            }
        });
        add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 230, -1));

        nameField.setBackground(new java.awt.Color(255, 255, 255));
        nameField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nameField.setForeground(new java.awt.Color(102, 102, 102));
        nameField.setText("Ingrese su Nombre");
        nameField.setBorder(null);
        nameField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nameFieldMousePressed(evt);
            }
        });
        add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 230, -1));

        balanceField.setBackground(new java.awt.Color(255, 255, 255));
        balanceField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        balanceField.setForeground(new java.awt.Color(102, 102, 102));
        balanceField.setText("Ingrese su monto de ahorro inicial");
        balanceField.setBorder(null);
        balanceField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                balanceFieldMousePressed(evt);
            }
        });
        add(balanceField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 230, -1));

        FondoGuardar.setBackground(new java.awt.Color(0, 153, 153));

        saveBtn.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        saveBtn.setForeground(new java.awt.Color(0, 0, 0));
        saveBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        saveBtn.setText("GUARDAR");
        saveBtn.setToolTipText("Guardar información");
        saveBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saveBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                saveBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                saveBtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout FondoGuardarLayout = new javax.swing.GroupLayout(FondoGuardar);
        FondoGuardar.setLayout(FondoGuardarLayout);
        FondoGuardarLayout.setHorizontalGroup(
            FondoGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(saveBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        FondoGuardarLayout.setVerticalGroup(
            FondoGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(saveBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        add(FondoGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, 150, 50));

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 230, 10));

        jSeparator2.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 230, 10));

        jSeparator3.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator3.setForeground(new java.awt.Color(102, 102, 102));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 230, 10));

        jSeparator4.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator4.setForeground(new java.awt.Color(102, 102, 102));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 230, 10));

        jSeparator5.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator5.setForeground(new java.awt.Color(102, 102, 102));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 230, 10));

        telField.setBackground(new java.awt.Color(255, 255, 255));
        telField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        telField.setForeground(new java.awt.Color(102, 102, 102));
        telField.setText("Ingrese su número de Teléfono");
        telField.setBorder(null);
        telField.setPreferredSize(new java.awt.Dimension(120, 17));
        telField.setSelectionEnd(17);
        telField.setSelectionStart(17);
        telField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                telFieldMousePressed(evt);
            }
        });
        add(telField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 230, -1));

        emailField.setBackground(new java.awt.Color(255, 255, 255));
        emailField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        emailField.setForeground(new java.awt.Color(102, 102, 102));
        emailField.setText("Ingrese su dirección de Correo");
        emailField.setBorder(null);
        emailField.setPreferredSize(new java.awt.Dimension(120, 17));
        emailField.setSelectionEnd(17);
        emailField.setSelectionStart(17);
        emailField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                emailFieldMousePressed(evt);
            }
        });
        add(emailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 230, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void saveBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveBtnMouseClicked
        //Se declaran las variables
        String name = nameField.getText();
        String tel = telField.getText();
        String email = emailField.getText();
        String username = usernameField.getText();
        int pass = ThreadLocalRandom.current().nextInt(100, 999 + 1);
        String password = String.valueOf(pass);
        String balance = balanceField.getText();
        
        //Esta igual se sigue declarando porque el constructor lo requiere, se puede dejar vacío y luego rellenarlo
        String loans = "";
        //Para hacer update de la información de una cosa en específico es customer.setLoans(loans);
        
        //Se llama al constructor para guardar la información
        Customer customer = new Customer(name, tel, email, username, password, balance, loans);
        
        //Se llaman a los métodos para agregar la información al Array y al archivo de texto
        AllCustomers.add(customer);
        AllCustomers.save();
    }//GEN-LAST:event_saveBtnMouseClicked

    private void saveBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveBtnMouseEntered
        //Se cambia el color cuando el mouse entra
        FondoGuardar.setBackground(new Color(0, 204, 204));
    }//GEN-LAST:event_saveBtnMouseEntered

    private void saveBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveBtnMouseExited
        //Se cambia el color cuando el mouse sale
        FondoGuardar.setBackground(new Color(0, 153, 153));
    }//GEN-LAST:event_saveBtnMouseExited

    private void nameFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameFieldMousePressed
        /*Se verifica si el texto que será manipulado tiene el texto por defecto, en dado caso, se borra el mensaje
        para que la persona pueda escribir*/
        if (nameField.getText().equals("Ingrese su Nombre")) {
            nameField.setText("");
            nameField.setForeground(Color.black);
        }
        //En estos otros cuatro se verifica si se dejó algún texto vacío, en dado caso, se rellena con el texto por defecto
        if (usernameField.getText().isEmpty()) {
            usernameField.setText("Ingrese su Identificación");
            usernameField.setForeground(new Color(102, 102, 102));
        }
        if (balanceField.getText().isEmpty()) {
            balanceField.setText("Ingrese su monto de ahorro inicial");
            balanceField.setForeground(new Color(102, 102, 102));
        }
        if(telField.getText().isEmpty()){
           telField.setText("Ingrese su número de Teléfono");
           telField.setForeground(new Color(102, 102, 102));
        }
        if(emailField.getText().isEmpty()){
           emailField.setText("Ingrese su dirección de Correo");
           emailField.setForeground(new Color(102, 102, 102));
        }
    }//GEN-LAST:event_nameFieldMousePressed

    private void usernameFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameFieldMousePressed
        /*Se verifica si el texto que será manipulado tiene el texto por defecto, en dado caso, se borra el mensaje
        para que la persona pueda escribir*/
        if (usernameField.getText().equals("Ingrese su Identificación")) {
            usernameField.setText("");
            usernameField.setForeground(Color.black);
        }
        //En estos otros cuatro se verifica si se dejó algún texto vacío, en dado caso, se rellena con el texto por defecto
        if (nameField.getText().isEmpty()) {
            nameField.setText("Ingrese su Nombre");
            nameField.setForeground(new Color(102, 102, 102));
        }
        if (balanceField.getText().isEmpty()) {
            balanceField.setText("Ingrese su monto de ahorro inicial");
            balanceField.setForeground(new Color(102, 102, 102));
        }
        if(telField.getText().isEmpty()){
           telField.setText("Ingrese su número de Teléfono");
           telField.setForeground(new Color(102, 102, 102));
        }
        if(emailField.getText().isEmpty()){
           emailField.setText("Ingrese su dirección de Correo");
           emailField.setForeground(new Color(102, 102, 102));
        }
    }//GEN-LAST:event_usernameFieldMousePressed

    private void balanceFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_balanceFieldMousePressed
        /*Se verifica si el texto que será manipulado tiene el texto por defecto, en dado caso, se borra el mensaje
        para que la persona pueda escribir*/
        if (balanceField.getText().equals("Ingrese su monto de ahorro inicial")) {
            balanceField.setText("");
            balanceField.setForeground(Color.black);
        }
        //En estos otros cuatro se verifica si se dejó algún texto vacío, en dado caso, se rellena con el texto por defecto
        if (nameField.getText().isEmpty()) {
            nameField.setText("Ingrese su Nombre");
            nameField.setForeground(new Color(102, 102, 102));
        }
        if (usernameField.getText().isEmpty()) {
            usernameField.setText("Ingrese su Identificación");
            usernameField.setForeground(new Color(102, 102, 102));
        }
        if(telField.getText().isEmpty()){
           telField.setText("Ingrese su número de Teléfono");
           telField.setForeground(new Color(102, 102, 102));
        }
        if(emailField.getText().isEmpty()){
           emailField.setText("Ingrese su dirección de Correo");
           emailField.setForeground(new Color(102, 102, 102));
        }
    }//GEN-LAST:event_balanceFieldMousePressed

    private void telFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telFieldMousePressed
        /*Se verifica si el texto que será manipulado tiene el texto por defecto, en dado caso, se borra el mensaje
        para que la persona pueda escribir*/
        if(telField.getText().equals("Ingrese su número de Teléfono")){
           telField.setText("");
           telField.setForeground(Color.black);
        }
        //En estos otros cuatro se verifica si se dejó algún texto vacío, en dado caso, se rellena con el texto por defecto
        if (nameField.getText().isEmpty()) {
            nameField.setText("Ingrese su Nombre");
            nameField.setForeground(new Color(102, 102, 102));
        }
        if (usernameField.getText().isEmpty()) {
            usernameField.setText("Ingrese su Identificación");
            usernameField.setForeground(new Color(102, 102, 102));
        }
        if (balanceField.getText().isEmpty()) {
            balanceField.setText("Ingrese su monto de ahorro inicial");
            balanceField.setForeground(new Color(102, 102, 102));
        }
        if(emailField.getText().isEmpty()) {
           emailField.setText("Ingrese su dirección de Correo");
           emailField.setForeground(new Color(102, 102, 102));
        }
    }//GEN-LAST:event_telFieldMousePressed

    private void emailFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailFieldMousePressed
        /*Se verifica si el texto que será manipulado tiene el texto por defecto, en dado caso, se borra el mensaje
        para que la persona pueda escribir*/
        if(emailField.getText().equals("Ingrese su dirección de Correo")){
           emailField.setText("");
           emailField.setForeground(Color.black);
        }
        //En estos otros cuatro se verifica si se dejó algún texto vacío, en dado caso, se rellena con el texto por defecto
        if (nameField.getText().isEmpty()) {
            nameField.setText("Ingrese su Nombre");
            nameField.setForeground(new Color(102, 102, 102));
        }
        if (usernameField.getText().isEmpty()) {
            usernameField.setText("Ingrese su Identificación");
            usernameField.setForeground(new Color(102, 102, 102));
        }
        if (balanceField.getText().isEmpty()) {
            balanceField.setText("Ingrese su monto de ahorro inicial");
            balanceField.setForeground(new Color(102, 102, 102));
        }
        if(telField.getText().isEmpty()){
           telField.setText("Ingrese su número de Teléfono");
           telField.setForeground(new Color(102, 102, 102));
        }
    }//GEN-LAST:event_emailFieldMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FondoGuardar;
    private javax.swing.JLabel TextoAhorro;
    private javax.swing.JLabel TextoCorreo;
    private javax.swing.JLabel TextoIdentificacion;
    private javax.swing.JLabel TextoMensaje;
    private javax.swing.JLabel TextoNombre;
    private javax.swing.JLabel TextoPrincipal;
    private javax.swing.JLabel TextoTelefono;
    private javax.swing.JTextField balanceField;
    private javax.swing.JTextField emailField;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel saveBtn;
    private javax.swing.JTextField telField;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}

import Codigo.TodosAsociados;
import Codigo.Asociado;
import java.awt.Color;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;

public class Registro extends javax.swing.JPanel {

    public Registro(Paneles paneles) {
        super();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TextoPrincipal = new javax.swing.JLabel();
        TextoIdentificacion = new javax.swing.JLabel();
        TextoPuesto = new javax.swing.JLabel();
        TextoNombre = new javax.swing.JLabel();
        TextoCorreo = new javax.swing.JLabel();
        TextoTelefono = new javax.swing.JLabel();
        escribirIdentificacion = new javax.swing.JTextField();
        escribirNombre = new javax.swing.JTextField();
        escribirPuesto = new javax.swing.JTextField();
        FondoGuardar = new javax.swing.JPanel();
        saveBtn = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        escribirTel = new javax.swing.JTextField();
        escribirEmail = new javax.swing.JTextField();
        verFondo = new javax.swing.JPanel();
        verBoton = new javax.swing.JLabel();

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

        TextoPuesto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        TextoPuesto.setForeground(new java.awt.Color(0, 0, 0));
        TextoPuesto.setText("Puesto de trabajo:");
        add(TextoPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, -1, -1));

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

        escribirIdentificacion.setBackground(new java.awt.Color(255, 255, 255));
        escribirIdentificacion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        escribirIdentificacion.setForeground(new java.awt.Color(102, 102, 102));
        escribirIdentificacion.setText("Ingrese su Identificación");
        escribirIdentificacion.setBorder(null);
        escribirIdentificacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                escribirIdentificacionMousePressed(evt);
            }
        });
        add(escribirIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 230, -1));

        escribirNombre.setBackground(new java.awt.Color(255, 255, 255));
        escribirNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        escribirNombre.setForeground(new java.awt.Color(102, 102, 102));
        escribirNombre.setText("Ingrese su Nombre");
        escribirNombre.setBorder(null);
        escribirNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                escribirNombreMousePressed(evt);
            }
        });
        add(escribirNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 230, -1));

        escribirPuesto.setBackground(new java.awt.Color(255, 255, 255));
        escribirPuesto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        escribirPuesto.setForeground(new java.awt.Color(102, 102, 102));
        escribirPuesto.setText("Ingrese su puesto de trabajo");
        escribirPuesto.setBorder(null);
        escribirPuesto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                escribirPuestoMousePressed(evt);
            }
        });
        add(escribirPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 230, -1));

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

        escribirTel.setBackground(new java.awt.Color(255, 255, 255));
        escribirTel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        escribirTel.setForeground(new java.awt.Color(102, 102, 102));
        escribirTel.setText("Ingrese su número de Teléfono");
        escribirTel.setBorder(null);
        escribirTel.setPreferredSize(new java.awt.Dimension(120, 17));
        escribirTel.setSelectionEnd(17);
        escribirTel.setSelectionStart(17);
        escribirTel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                escribirTelMousePressed(evt);
            }
        });
        add(escribirTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 230, -1));

        escribirEmail.setBackground(new java.awt.Color(255, 255, 255));
        escribirEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        escribirEmail.setForeground(new java.awt.Color(102, 102, 102));
        escribirEmail.setText("Ingrese su dirección de Correo");
        escribirEmail.setBorder(null);
        escribirEmail.setPreferredSize(new java.awt.Dimension(120, 17));
        escribirEmail.setSelectionEnd(17);
        escribirEmail.setSelectionStart(17);
        escribirEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                escribirEmailMousePressed(evt);
            }
        });
        add(escribirEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 230, -1));

        verFondo.setBackground(new java.awt.Color(0, 102, 102));

        verBoton.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        verBoton.setForeground(new java.awt.Color(255, 255, 255));
        verBoton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        verBoton.setText("VER PUESTOS");
        verBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        verBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verBotonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                verBotonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                verBotonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout verFondoLayout = new javax.swing.GroupLayout(verFondo);
        verFondo.setLayout(verFondoLayout);
        verFondoLayout.setHorizontalGroup(
            verFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(verBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        verFondoLayout.setVerticalGroup(
            verFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(verBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        add(verFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 120, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void saveBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveBtnMouseClicked
        //Se declaran las variables
        String nombre = escribirNombre.getText();
        String tel = escribirTel.getText();
        String email = escribirEmail.getText();
        String identificacion = escribirIdentificacion.getText();
        int clave = ThreadLocalRandom.current().nextInt(100, 999 + 1);
        String contraseña = String.valueOf(clave);
        int ahorro = Integer.parseInt(escribirPuesto.getText());
        String ahorroString = String.valueOf(ahorro);
        int prestamos = 0;
        int montoPrestamoDisponible = ahorro;
        int salario = Integer.parseInt(escribirPuesto.getText());
        
        if(salario == 1){
           
        }
        
        
        int ahorroMin = 10000;

        //Se llama al constructor para guardar la información
        Asociado customer = new Asociado(nombre, tel, email, identificacion, contraseña, ahorro, prestamos, montoPrestamoDisponible, salario);
        Asociado verificarID = TodosAsociados.get(identificacion);

        //Se verifican que no se queden espacios en blanco o con textos por defecto
        if (verificarID == null) {
            if (!nombre.equals("Ingrese su Nombre") && !nombre.isEmpty() && !tel.equals("Ingrese su número de Teléfono") && !tel.isEmpty()) {
                if (!email.equals("Ingrese su dirección de Correo") && !email.isEmpty() && !identificacion.equals("Ingrese su Identificación") && !identificacion.isEmpty()) {
                    if (!ahorroString.equals("Ingrese un monto de ahorro inicial") && !ahorroString.isEmpty()) {
                        //Si el ahorro es menor que ahorroMin
                        if (ahorro < ahorroMin) {
                            //Se le dice que el monto debe ser mayor que 10 mil
                            JOptionPane.showMessageDialog(null, "El monto del ahorro debe ser mayor que 10,000 CRC");
                        } else {
                            //Si el ahorro es mayor que ahorroMin, se termina de realizar el registro
                            //Y se llaman a los métodos para agregar la información al Array y al archivo de texto
                            TodosAsociados.añadir(customer);
                            TodosAsociados.guardar();
                            JOptionPane.showMessageDialog(null, "El registro ha sido exitoso \nSu clave como Asociado será: " + clave);

                            //Se vuelven a poner los textos por defecto junto con el color
                            escribirIdentificacion.setText("Ingrese su Identificación");
                            escribirPuesto.setText("Ingrese un monto de ahorro inicial");
                            escribirTel.setText("Ingrese su número de Teléfono");
                            escribirEmail.setText("Ingrese su dirección de Correo");
                            escribirNombre.setText("Ingrese su Nombre");
                            escribirIdentificacion.setForeground(new Color(102, 102, 102));
                            escribirPuesto.setForeground(new Color(102, 102, 102));
                            escribirTel.setForeground(new Color(102, 102, 102));
                            escribirEmail.setForeground(new Color(102, 102, 102));
                            escribirNombre.setForeground(new Color(102, 102, 102));
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Por favor no deje ningún espacio sin rellenar");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor no deje ningún espacio sin rellenar");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor no deje ningún espacio sin rellenar");
            }
        }else{
            JOptionPane.showMessageDialog(null, "La identificación ya se encuentra registrada");
        }
    }//GEN-LAST:event_saveBtnMouseClicked

    private void saveBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveBtnMouseEntered
        //Se cambia el color cuando el mouse entra
        FondoGuardar.setBackground(new Color(0, 204, 204));
    }//GEN-LAST:event_saveBtnMouseEntered

    private void saveBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveBtnMouseExited
        //Se cambia el color cuando el mouse sale
        FondoGuardar.setBackground(new Color(0, 153, 153));
    }//GEN-LAST:event_saveBtnMouseExited

    private void escribirNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escribirNombreMousePressed
        /*Se verifica si el texto que será manipulado tiene el texto por defecto, en dado caso, se borra el mensaje
        para que la persona pueda escribir*/
        if (escribirNombre.getText().equals("Ingrese su Nombre")) {
            escribirNombre.setText("");
            escribirNombre.setForeground(Color.black);
        }
        //En estos otros cuatro se verifica si se dejó algún texto vacío, en dado caso, se rellena con el texto por defecto
        if (escribirIdentificacion.getText().isEmpty()) {
            escribirIdentificacion.setText("Ingrese su Identificación");
            escribirIdentificacion.setForeground(new Color(102, 102, 102));
        }
        if (escribirPuesto.getText().isEmpty()) {
            escribirPuesto.setText("Ingrese un monto de ahorro inicial");
            escribirPuesto.setForeground(new Color(102, 102, 102));
        }
        if (escribirTel.getText().isEmpty()) {
            escribirTel.setText("Ingrese su número de Teléfono");
            escribirTel.setForeground(new Color(102, 102, 102));
        }
        if (escribirEmail.getText().isEmpty()) {
            escribirEmail.setText("Ingrese su dirección de Correo");
            escribirEmail.setForeground(new Color(102, 102, 102));
        }
    }//GEN-LAST:event_escribirNombreMousePressed

    private void escribirIdentificacionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escribirIdentificacionMousePressed
        /*Se verifica si el texto que será manipulado tiene el texto por defecto, en dado caso, se borra el mensaje
        para que la persona pueda escribir*/
        if (escribirIdentificacion.getText().equals("Ingrese su Identificación")) {
            escribirIdentificacion.setText("");
            escribirIdentificacion.setForeground(Color.black);
        }
        //En estos otros cuatro se verifica si se dejó algún texto vacío, en dado caso, se rellena con el texto por defecto
        if (escribirNombre.getText().isEmpty()) {
            escribirNombre.setText("Ingrese su Nombre");
            escribirNombre.setForeground(new Color(102, 102, 102));
        }
        if (escribirPuesto.getText().isEmpty()) {
            escribirPuesto.setText("Ingrese un monto de ahorro inicial");
            escribirPuesto.setForeground(new Color(102, 102, 102));
        }
        if (escribirTel.getText().isEmpty()) {
            escribirTel.setText("Ingrese su número de Teléfono");
            escribirTel.setForeground(new Color(102, 102, 102));
        }
        if (escribirEmail.getText().isEmpty()) {
            escribirEmail.setText("Ingrese su dirección de Correo");
            escribirEmail.setForeground(new Color(102, 102, 102));
        }
    }//GEN-LAST:event_escribirIdentificacionMousePressed

    private void escribirPuestoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escribirPuestoMousePressed
        /*Se verifica si el texto que será manipulado tiene el texto por defecto, en dado caso, se borra el mensaje
        para que la persona pueda escribir*/
        if (escribirPuesto.getText().equals("Ingrese un monto de ahorro inicial")) {
            escribirPuesto.setText("");
            escribirPuesto.setForeground(Color.black);
        }
        //En estos otros cuatro se verifica si se dejó algún texto vacío, en dado caso, se rellena con el texto por defecto
        if (escribirNombre.getText().isEmpty()) {
            escribirNombre.setText("Ingrese su Nombre");
            escribirNombre.setForeground(new Color(102, 102, 102));
        }
        if (escribirIdentificacion.getText().isEmpty()) {
            escribirIdentificacion.setText("Ingrese su Identificación");
            escribirIdentificacion.setForeground(new Color(102, 102, 102));
        }
        if (escribirTel.getText().isEmpty()) {
            escribirTel.setText("Ingrese su número de Teléfono");
            escribirTel.setForeground(new Color(102, 102, 102));
        }
        if (escribirEmail.getText().isEmpty()) {
            escribirEmail.setText("Ingrese su dirección de Correo");
            escribirEmail.setForeground(new Color(102, 102, 102));
        }
    }//GEN-LAST:event_escribirPuestoMousePressed

    private void escribirTelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escribirTelMousePressed
        /*Se verifica si el texto que será manipulado tiene el texto por defecto, en dado caso, se borra el mensaje
        para que la persona pueda escribir*/
        if (escribirTel.getText().equals("Ingrese su número de Teléfono")) {
            escribirTel.setText("");
            escribirTel.setForeground(Color.black);
        }
        //En estos otros cuatro se verifica si se dejó algún texto vacío, en dado caso, se rellena con el texto por defecto
        if (escribirNombre.getText().isEmpty()) {
            escribirNombre.setText("Ingrese su Nombre");
            escribirNombre.setForeground(new Color(102, 102, 102));
        }
        if (escribirIdentificacion.getText().isEmpty()) {
            escribirIdentificacion.setText("Ingrese su Identificación");
            escribirIdentificacion.setForeground(new Color(102, 102, 102));
        }
        if (escribirPuesto.getText().isEmpty()) {
            escribirPuesto.setText("Ingrese un monto de ahorro inicial");
            escribirPuesto.setForeground(new Color(102, 102, 102));
        }
        if (escribirEmail.getText().isEmpty()) {
            escribirEmail.setText("Ingrese su dirección de Correo");
            escribirEmail.setForeground(new Color(102, 102, 102));
        }
    }//GEN-LAST:event_escribirTelMousePressed

    private void escribirEmailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escribirEmailMousePressed
        /*Se verifica si el texto que será manipulado tiene el texto por defecto, en dado caso, se borra el mensaje
        para que la persona pueda escribir*/
        if (escribirEmail.getText().equals("Ingrese su dirección de Correo")) {
            escribirEmail.setText("");
            escribirEmail.setForeground(Color.black);
        }
        //En estos otros cuatro se verifica si se dejó algún texto vacío, en dado caso, se rellena con el texto por defecto
        if (escribirNombre.getText().isEmpty()) {
            escribirNombre.setText("Ingrese su Nombre");
            escribirNombre.setForeground(new Color(102, 102, 102));
        }
        if (escribirIdentificacion.getText().isEmpty()) {
            escribirIdentificacion.setText("Ingrese su Identificación");
            escribirIdentificacion.setForeground(new Color(102, 102, 102));
        }
        if (escribirPuesto.getText().isEmpty()) {
            escribirPuesto.setText("Ingrese su monto de ahorro inicial");
            escribirPuesto.setForeground(new Color(102, 102, 102));
        }
        if (escribirTel.getText().isEmpty()) {
            escribirTel.setText("Ingrese su número de Teléfono");
            escribirTel.setForeground(new Color(102, 102, 102));
        }
    }//GEN-LAST:event_escribirEmailMousePressed

    private void verBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verBotonMouseEntered
        verFondo.setBackground(new Color(0, 153, 153));
    }//GEN-LAST:event_verBotonMouseEntered

    private void verBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verBotonMouseExited
        verFondo.setBackground(new Color(0, 102, 102));
    }//GEN-LAST:event_verBotonMouseExited

    private void verBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verBotonMouseClicked
        JOptionPane.showMessageDialog(null, "Puestos de los asociados en la Empresa: \n");
    }//GEN-LAST:event_verBotonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FondoGuardar;
    private javax.swing.JLabel TextoCorreo;
    private javax.swing.JLabel TextoIdentificacion;
    private javax.swing.JLabel TextoNombre;
    private javax.swing.JLabel TextoPrincipal;
    private javax.swing.JLabel TextoPuesto;
    private javax.swing.JLabel TextoTelefono;
    private javax.swing.JTextField escribirEmail;
    private javax.swing.JTextField escribirIdentificacion;
    private javax.swing.JTextField escribirNombre;
    private javax.swing.JTextField escribirPuesto;
    private javax.swing.JTextField escribirTel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel saveBtn;
    private javax.swing.JLabel verBoton;
    private javax.swing.JPanel verFondo;
    // End of variables declaration//GEN-END:variables
}

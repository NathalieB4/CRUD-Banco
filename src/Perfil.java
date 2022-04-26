import Codigo.Asociado;
import java.awt.Color;
import javax.swing.JOptionPane;



public class Perfil extends javax.swing.JPanel {

    Paneles paneles;

    public Perfil(Paneles paneles) {
        super();
        initComponents();
        this.paneles = paneles;
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TextoPrincipal = new javax.swing.JLabel();
        textoTelefono = new javax.swing.JLabel();
        EscribirNombre = new javax.swing.JTextField();
        textoNombre = new javax.swing.JLabel();
        EscribirTelefono = new javax.swing.JTextField();
        textoClave = new javax.swing.JLabel();
        EscribirCorreo = new javax.swing.JTextField();
        textoCorreo = new javax.swing.JLabel();
        EscribirClave = new javax.swing.JTextField();
        guardarFondo = new javax.swing.JPanel();
        guardarBoton = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TextoPrincipal.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        TextoPrincipal.setForeground(new java.awt.Color(0, 0, 0));
        TextoPrincipal.setText("EDITE SU INFORMACIÓN");
        add(TextoPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        textoTelefono.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        textoTelefono.setForeground(new java.awt.Color(0, 0, 0));
        textoTelefono.setText("Teléfono:");
        add(textoTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        EscribirNombre.setBackground(new java.awt.Color(255, 255, 255));
        EscribirNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        EscribirNombre.setForeground(new java.awt.Color(102, 102, 102));
        EscribirNombre.setText("Ingrese un nuevo Nombre");
        EscribirNombre.setBorder(null);
        EscribirNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EscribirNombreMousePressed(evt);
            }
        });
        add(EscribirNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 200, -1));

        textoNombre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        textoNombre.setForeground(new java.awt.Color(0, 0, 0));
        textoNombre.setText("Nombre:");
        add(textoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        EscribirTelefono.setBackground(new java.awt.Color(255, 255, 255));
        EscribirTelefono.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        EscribirTelefono.setForeground(new java.awt.Color(102, 102, 102));
        EscribirTelefono.setText("Ingrese un nuevo Teléfono");
        EscribirTelefono.setBorder(null);
        EscribirTelefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EscribirTelefonoMousePressed(evt);
            }
        });
        add(EscribirTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 200, -1));

        textoClave.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        textoClave.setForeground(new java.awt.Color(0, 0, 0));
        textoClave.setText("Clave:");
        add(textoClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, -1, -1));

        EscribirCorreo.setBackground(new java.awt.Color(255, 255, 255));
        EscribirCorreo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        EscribirCorreo.setForeground(new java.awt.Color(102, 102, 102));
        EscribirCorreo.setText("Ingrese un nuevo Correo");
        EscribirCorreo.setBorder(null);
        EscribirCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EscribirCorreoMousePressed(evt);
            }
        });
        add(EscribirCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 200, -1));

        textoCorreo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        textoCorreo.setForeground(new java.awt.Color(0, 0, 0));
        textoCorreo.setText("Correo:");
        add(textoCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, -1, -1));

        EscribirClave.setBackground(new java.awt.Color(255, 255, 255));
        EscribirClave.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        EscribirClave.setForeground(new java.awt.Color(102, 102, 102));
        EscribirClave.setText("Ingrese una nueva Clave");
        EscribirClave.setBorder(null);
        EscribirClave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EscribirClaveMousePressed(evt);
            }
        });
        add(EscribirClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 200, -1));

        guardarFondo.setBackground(new java.awt.Color(0, 153, 153));
        guardarFondo.setForeground(new java.awt.Color(0, 153, 153));

        guardarBoton.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        guardarBoton.setForeground(new java.awt.Color(255, 255, 255));
        guardarBoton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guardarBoton.setText("GUARDAR");
        guardarBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardarBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardarBotonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                guardarBotonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                guardarBotonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout guardarFondoLayout = new javax.swing.GroupLayout(guardarFondo);
        guardarFondo.setLayout(guardarFondoLayout);
        guardarFondoLayout.setHorizontalGroup(
            guardarFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(guardarBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        guardarFondoLayout.setVerticalGroup(
            guardarFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(guardarBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        add(guardarFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 110, 40));

        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 200, 30));

        jSeparator2.setForeground(new java.awt.Color(153, 153, 153));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 200, 30));

        jSeparator3.setForeground(new java.awt.Color(153, 153, 153));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 200, 30));

        jSeparator4.setForeground(new java.awt.Color(153, 153, 153));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 200, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void guardarBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarBotonMouseEntered
        guardarFondo.setBackground(new Color(0, 204, 204));
    }//GEN-LAST:event_guardarBotonMouseEntered

    private void guardarBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarBotonMouseExited
        guardarFondo.setBackground(new Color(0, 153, 153));
    }//GEN-LAST:event_guardarBotonMouseExited

    private void guardarBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarBotonMouseClicked
        Asociado asociado = paneles.getInicioSesion().getSesion();
        
        String nombre = EscribirNombre.getText();
        String tel = EscribirTelefono.getText();
        String email = EscribirCorreo.getText();
        String contraseña = EscribirClave.getText();
        
        if(!nombre.equals("Ingrese un nuevo Nombre") && !nombre.isEmpty() && !tel.equals("Ingrese un nuevo Teléfono") && !tel.isEmpty()){
            if(!email.equals("Ingrese un nuevo Correo") && !email.isEmpty() && !contraseña.equals("Ingrese una nueva Clave") && !contraseña.isEmpty()){
                asociado.setNombre(nombre);
                asociado.setTel(tel);
                asociado.setEmail(email);
                asociado.setContraseña(contraseña);
                
                EscribirNombre.setText("Ingrese un nuevo Nombre");
                EscribirTelefono.setText("Ingrese un nuevo Teléfono");
                EscribirCorreo.setText("Ingrese un nuevo Correo");
                EscribirClave.setText("Ingrese una nueva Clave");
                EscribirNombre.setForeground(new Color(102, 102, 102));
                EscribirTelefono.setForeground(new Color(102, 102, 102));
                EscribirCorreo.setForeground(new Color(102, 102, 102));
                EscribirClave.setForeground(new Color(102, 102 ,102));
            }else{
                JOptionPane.showMessageDialog(null, "Por favor, no deje espacios en blanco");                
            }
        }else{
            JOptionPane.showMessageDialog(null, "Por favor, no deje espacios en blanco");
        }
    }//GEN-LAST:event_guardarBotonMouseClicked

    private void EscribirNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EscribirNombreMousePressed
        if(EscribirNombre.getText().equals("Ingrese un nuevo Nombre")){
           EscribirNombre.setText("");
           EscribirNombre.setForeground(Color.black);
        }
        if(EscribirTelefono.getText().isEmpty()){
           EscribirTelefono.setText("Ingrese un nuevo Teléfono");
           EscribirTelefono.setForeground(new Color(102, 102, 102));
        }
        if(EscribirCorreo.getText().isEmpty()){
           EscribirCorreo.setText("Ingrese un nuevo Correo");
           EscribirCorreo.setForeground(new Color(102, 102, 102));
        }
        if(EscribirClave.getText().isEmpty()){
           EscribirClave.setText("Ingrese una nueva Clave");
           EscribirClave.setForeground(new Color(102, 102 ,102));
        }
    }//GEN-LAST:event_EscribirNombreMousePressed

    private void EscribirTelefonoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EscribirTelefonoMousePressed
        if(EscribirTelefono.getText().equals("Ingrese un nuevo Teléfono")){
           EscribirTelefono.setText("");
           EscribirTelefono.setForeground(Color.black);
        }
        if(EscribirNombre.getText().isEmpty()){
           EscribirNombre.setText("Ingrese un nuevo Nombre");
           EscribirNombre.setForeground(new Color(102, 102, 102));
        }
        if(EscribirCorreo.getText().isEmpty()){
           EscribirCorreo.setText("Ingrese un nuevo Correo");
           EscribirCorreo.setForeground(new Color(102, 102, 102));
        }
        if(EscribirClave.getText().isEmpty()){
           EscribirClave.setText("Ingrese una nueva Clave");
           EscribirClave.setForeground(new Color(102, 102 ,102));
        }
    }//GEN-LAST:event_EscribirTelefonoMousePressed

    private void EscribirCorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EscribirCorreoMousePressed
        if(EscribirCorreo.getText().equals("Ingrese un nuevo Correo")){
           EscribirCorreo.setText("");
           EscribirCorreo.setForeground(Color.black);
        }
        if(EscribirNombre.getText().isEmpty()){
           EscribirNombre.setText("Ingrese un nuevo Nombre");
           EscribirNombre.setForeground(new Color(102, 102, 102));
        }
        if(EscribirTelefono.getText().isEmpty()){
           EscribirTelefono.setText("Ingrese un nuevo Teléfono");
           EscribirTelefono.setForeground(new Color(102, 102, 102));
        }
        if(EscribirClave.getText().isEmpty()){
           EscribirClave.setText("Ingrese una nueva Clave");
           EscribirClave.setForeground(new Color(102, 102 ,102));
        }
    }//GEN-LAST:event_EscribirCorreoMousePressed

    private void EscribirClaveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EscribirClaveMousePressed
        if(EscribirClave.getText().equals("Ingrese una nueva Clave")){
           EscribirClave.setText("");
           EscribirClave.setForeground(Color.black);
        }
        if(EscribirNombre.getText().isEmpty()){
           EscribirNombre.setText("Ingrese un nuevo Nombre");
           EscribirNombre.setForeground(new Color(102, 102, 102));
        }
        if(EscribirTelefono.getText().isEmpty()){
           EscribirTelefono.setText("Ingrese un nuevo Teléfono");
           EscribirTelefono.setForeground(new Color(102, 102, 102));
        }
        if(EscribirCorreo.getText().isEmpty()){
           EscribirCorreo.setText("Ingrese un nuevo Correo");
           EscribirCorreo.setForeground(new Color(102, 102, 102));
        }
    }//GEN-LAST:event_EscribirClaveMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EscribirClave;
    private javax.swing.JTextField EscribirCorreo;
    private javax.swing.JTextField EscribirNombre;
    private javax.swing.JTextField EscribirTelefono;
    private javax.swing.JLabel TextoPrincipal;
    private javax.swing.JLabel guardarBoton;
    private javax.swing.JPanel guardarFondo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel textoClave;
    private javax.swing.JLabel textoCorreo;
    private javax.swing.JLabel textoNombre;
    private javax.swing.JLabel textoTelefono;
    // End of variables declaration//GEN-END:variables
}

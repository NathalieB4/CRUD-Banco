
import Codigo.TodosAsociados;
import Codigo.Asociado;
import java.awt.Color;
import javax.swing.JOptionPane;


public class Eliminar extends javax.swing.JPanel {

    public Eliminar(Paneles paneles) {
        super();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TextoPrincipal = new javax.swing.JLabel();
        TextoClave = new javax.swing.JLabel();
        TextoIdentificación = new javax.swing.JLabel();
        EscribirClave = new javax.swing.JTextField();
        EscribirIdentificacion = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        eliminarFondo = new javax.swing.JPanel();
        eliminarBoton = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TextoPrincipal.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        TextoPrincipal.setForeground(new java.awt.Color(0, 0, 0));
        TextoPrincipal.setText("ELIMINAR REGISTRO COMO ASOCIADO");
        add(TextoPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        TextoClave.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        TextoClave.setForeground(new java.awt.Color(0, 0, 0));
        TextoClave.setText("Clave:");
        add(TextoClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, -1));

        TextoIdentificación.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        TextoIdentificación.setForeground(new java.awt.Color(0, 0, 0));
        TextoIdentificación.setText("Identificación:");
        add(TextoIdentificación, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, -1, -1));

        EscribirClave.setBackground(new java.awt.Color(255, 255, 255));
        EscribirClave.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        EscribirClave.setForeground(new java.awt.Color(102, 102, 102));
        EscribirClave.setText("Ingrese su Clave");
        EscribirClave.setToolTipText("");
        EscribirClave.setBorder(null);
        EscribirClave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EscribirClaveMousePressed(evt);
            }
        });
        add(EscribirClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 230, -1));

        EscribirIdentificacion.setBackground(new java.awt.Color(255, 255, 255));
        EscribirIdentificacion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        EscribirIdentificacion.setForeground(new java.awt.Color(102, 102, 102));
        EscribirIdentificacion.setText("Ingrese su Identificación");
        EscribirIdentificacion.setToolTipText("");
        EscribirIdentificacion.setBorder(null);
        EscribirIdentificacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EscribirIdentificacionMousePressed(evt);
            }
        });
        add(EscribirIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 230, -1));

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 230, 30));

        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 230, 30));

        eliminarFondo.setBackground(new java.awt.Color(0, 153, 153));

        eliminarBoton.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        eliminarBoton.setForeground(new java.awt.Color(0, 0, 0));
        eliminarBoton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eliminarBoton.setText("ELIMINAR");
        eliminarBoton.setToolTipText("Eliminar Registro");
        eliminarBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminarBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarBotonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                eliminarBotonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                eliminarBotonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout eliminarFondoLayout = new javax.swing.GroupLayout(eliminarFondo);
        eliminarFondo.setLayout(eliminarFondoLayout);
        eliminarFondoLayout.setHorizontalGroup(
            eliminarFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(eliminarBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        eliminarFondoLayout.setVerticalGroup(
            eliminarFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(eliminarBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        add(eliminarFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, 150, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void EscribirIdentificacionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EscribirIdentificacionMousePressed
        if(EscribirIdentificacion.getText().equals("Ingrese su Identificación")){
           EscribirIdentificacion.setText("");
           EscribirIdentificacion.setForeground(Color.black);
        }
        if(EscribirClave.getText().isEmpty()){
           EscribirClave.setText("Ingrese su Clave");
           EscribirClave.setForeground(new Color(102, 102, 102)); 
        }
    }//GEN-LAST:event_EscribirIdentificacionMousePressed

    private void EscribirClaveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EscribirClaveMousePressed
        if(EscribirClave.getText().equals("Ingrese su Clave")){
           EscribirClave.setText("");
           EscribirClave.setForeground(Color.black);
        }
        if(EscribirIdentificacion.getText().isEmpty()){
           EscribirIdentificacion.setText("Ingrese su Identificación");
           EscribirIdentificacion.setForeground(new Color(102, 102, 102)); 
        }
    }//GEN-LAST:event_EscribirClaveMousePressed

    private void eliminarBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarBotonMouseEntered
        eliminarFondo.setBackground(new Color(0, 204, 204));
    }//GEN-LAST:event_eliminarBotonMouseEntered

    private void eliminarBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarBotonMouseExited
        eliminarFondo.setBackground(new Color(0, 153, 153));
    }//GEN-LAST:event_eliminarBotonMouseExited

    private void eliminarBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarBotonMouseClicked
        String username = EscribirIdentificacion.getText();
        String password = EscribirClave.getText();
        
        /*Se llama al método del getter de usuario con tal de buscar coincidencias
        Tal y como se pudo observar en el código de Iniciar sesión
        */
        Asociado customer = TodosAsociados.get(username);
        
        if(customer == null){
            //Si se retorna nulo, enseñará un mensaje de error
            JOptionPane.showMessageDialog(null, "Asociado no registrado");
        }else{
            //Se crea la variable para verificar contraseñas
            String verifyPass = customer.getContraseña();
            if(password.equals(verifyPass)){
                //Se llama al método para eliminar la información correspondiente junto con el Asociado
                TodosAsociados.borrar(username);
                JOptionPane.showMessageDialog(null, "Registro eliminado exitosamente");
                //Se vuelven a poner los textos por defecto
                EscribirIdentificacion.setText("Ingrese su Identificación");
                EscribirClave.setText("Ingrese su Clave");
                EscribirIdentificacion.setForeground(new Color(102, 102, 102));
                EscribirClave.setForeground(new Color(102, 102, 102)); 
            }else{
                //Si las contraseñas no son iguales, enseñará un mensaje de error
                JOptionPane.showMessageDialog(null, "Asociado no registrado");
            }
        }
    }//GEN-LAST:event_eliminarBotonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EscribirClave;
    private javax.swing.JTextField EscribirIdentificacion;
    private javax.swing.JLabel TextoClave;
    private javax.swing.JLabel TextoIdentificación;
    private javax.swing.JLabel TextoPrincipal;
    private javax.swing.JLabel eliminarBoton;
    private javax.swing.JPanel eliminarFondo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}

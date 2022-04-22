import Codigo.Customer;
import java.awt.Color;
import java.io.*;

public class Inicio extends javax.swing.JPanel {

    Registro userpass = new Registro();
    int amount;
    //then:

    FileReader lee;
    BufferedReader lectorNum1;
    BufferedReader lectorNum2;

    public Inicio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TextoPrincipal = new javax.swing.JLabel();
        TextoClave = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        EscribirClave = new javax.swing.JTextField();
        TextoIdentificacion = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        FondoInicio = new javax.swing.JPanel();
        BotonInicio = new javax.swing.JLabel();
        EscribirIdentificacion = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        BotonInicio.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        BotonInicio.setForeground(new java.awt.Color(0, 0, 0));
        BotonInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BotonInicio.setText("INICIAR SESIÓN");
        BotonInicio.setToolTipText("Iniciar Sesión");
        BotonInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonInicioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonInicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonInicioMouseExited(evt);
            }
        });

        javax.swing.GroupLayout FondoInicioLayout = new javax.swing.GroupLayout(FondoInicio);
        FondoInicio.setLayout(FondoInicioLayout);
        FondoInicioLayout.setHorizontalGroup(
            FondoInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BotonInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        FondoInicioLayout.setVerticalGroup(
            FondoInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BotonInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
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
        if (EscribirClave.getText().equals("Ingrese su Clave")) {
            EscribirClave.setText("");
            EscribirClave.setForeground(Color.black);
        }
        if (EscribirIdentificacion.getText().isEmpty()) {
            EscribirIdentificacion.setText("Ingrese su Identificación");
            EscribirIdentificacion.setForeground(new Color(102, 102, 102));
        }
    }//GEN-LAST:event_EscribirClaveMousePressed

    private void EscribirIdentificacionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EscribirIdentificacionMousePressed
        if (EscribirIdentificacion.getText().equals("Ingrese su Identificación")) {
            EscribirIdentificacion.setText("");
            EscribirIdentificacion.setForeground(Color.black);
        }
        if (EscribirClave.getText().isEmpty()) {
            EscribirClave.setText("Ingrese su Clave");
            EscribirClave.setForeground(new Color(102, 102, 102));
        }
    }//GEN-LAST:event_EscribirIdentificacionMousePressed

    private void BotonInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonInicioMouseClicked
        
    }//GEN-LAST:event_BotonInicioMouseClicked

    private void BotonInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonInicioMouseEntered
        FondoInicio.setBackground(new Color(0, 204, 204));
    }//GEN-LAST:event_BotonInicioMouseEntered

    private void BotonInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonInicioMouseExited
        FondoInicio.setBackground(new Color(0, 153, 153));
    }//GEN-LAST:event_BotonInicioMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BotonInicio;
    private javax.swing.JTextField EscribirClave;
    private javax.swing.JTextField EscribirIdentificacion;
    private javax.swing.JPanel FondoInicio;
    private javax.swing.JLabel TextoClave;
    private javax.swing.JLabel TextoIdentificacion;
    private javax.swing.JLabel TextoPrincipal;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}

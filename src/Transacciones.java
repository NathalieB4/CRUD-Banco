import Codigo.Asociado;
import java.awt.Color;
import javax.swing.JOptionPane;

public class Transacciones extends javax.swing.JPanel {
    
    Paneles paneles;

    public Transacciones(Paneles paneles) {
        super();
        initComponents();
        this.paneles = paneles;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        TextoAhorroPredeterminado = new javax.swing.JLabel();
        TextoPrestamoPrincipal = new javax.swing.JLabel();
        TextoPrestamo = new javax.swing.JLabel();
        TextoTelefono = new javax.swing.JLabel();
        EscribirAhorro = new javax.swing.JTextField();
        EscribirPrestamo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        verPrestamoFondo = new javax.swing.JPanel();
        verPrestamoBoton = new javax.swing.JLabel();
        verAhorroFondo = new javax.swing.JPanel();
        verAhorroBoton = new javax.swing.JLabel();
        textoVerAhorro = new javax.swing.JLabel();
        textoVerPrestamo = new javax.swing.JLabel();
        pedirFondo = new javax.swing.JPanel();
        pedirBoton = new javax.swing.JLabel();
        añadirFondo = new javax.swing.JPanel();
        añadirBoton = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();

        jPasswordField1.setText("jPasswordField1");

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TextoAhorroPredeterminado.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        TextoAhorroPredeterminado.setForeground(new java.awt.Color(0, 0, 0));
        TextoAhorroPredeterminado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextoAhorroPredeterminado.setText("AÑADIR AHORROS");
        add(TextoAhorroPredeterminado, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 200, -1));

        TextoPrestamoPrincipal.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        TextoPrestamoPrincipal.setForeground(new java.awt.Color(0, 0, 0));
        TextoPrestamoPrincipal.setText("SOLICITAR PRÉSTAMO");
        add(TextoPrestamoPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        TextoPrestamo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        TextoPrestamo.setForeground(new java.awt.Color(0, 0, 0));
        TextoPrestamo.setText("Monto del préstamo:");
        add(TextoPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        TextoTelefono.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        TextoTelefono.setForeground(new java.awt.Color(0, 0, 0));
        TextoTelefono.setText("Monto para el ahorro:");
        add(TextoTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        EscribirAhorro.setBackground(new java.awt.Color(255, 255, 255));
        EscribirAhorro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        EscribirAhorro.setForeground(new java.awt.Color(102, 102, 102));
        EscribirAhorro.setText("Monto a añadir");
        EscribirAhorro.setBorder(null);
        EscribirAhorro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EscribirAhorroMousePressed(evt);
            }
        });
        add(EscribirAhorro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 240, -1));

        EscribirPrestamo.setBackground(new java.awt.Color(255, 255, 255));
        EscribirPrestamo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        EscribirPrestamo.setForeground(new java.awt.Color(102, 102, 102));
        EscribirPrestamo.setText("Monto a solicitar");
        EscribirPrestamo.setBorder(null);
        EscribirPrestamo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EscribirPrestamoMousePressed(evt);
            }
        });
        add(EscribirPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 240, -1));

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 240, 20));

        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 240, 20));

        verPrestamoFondo.setBackground(new java.awt.Color(0, 102, 102));
        verPrestamoFondo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        verPrestamoBoton.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        verPrestamoBoton.setForeground(new java.awt.Color(255, 255, 255));
        verPrestamoBoton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        verPrestamoBoton.setText("VER");
        verPrestamoBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        verPrestamoBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verPrestamoBotonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                verPrestamoBotonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                verPrestamoBotonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout verPrestamoFondoLayout = new javax.swing.GroupLayout(verPrestamoFondo);
        verPrestamoFondo.setLayout(verPrestamoFondoLayout);
        verPrestamoFondoLayout.setHorizontalGroup(
            verPrestamoFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(verPrestamoBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        verPrestamoFondoLayout.setVerticalGroup(
            verPrestamoFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(verPrestamoBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        add(verPrestamoFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 90, 40));

        verAhorroFondo.setBackground(new java.awt.Color(0, 102, 102));
        verAhorroFondo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        verAhorroBoton.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        verAhorroBoton.setForeground(new java.awt.Color(255, 255, 255));
        verAhorroBoton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        verAhorroBoton.setText("VER");
        verAhorroBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verAhorroBotonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                verAhorroBotonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                verAhorroBotonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout verAhorroFondoLayout = new javax.swing.GroupLayout(verAhorroFondo);
        verAhorroFondo.setLayout(verAhorroFondoLayout);
        verAhorroFondoLayout.setHorizontalGroup(
            verAhorroFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(verAhorroBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        verAhorroFondoLayout.setVerticalGroup(
            verAhorroFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(verAhorroBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        add(verAhorroFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 90, 40));

        textoVerAhorro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textoVerAhorro.setForeground(new java.awt.Color(153, 153, 153));
        textoVerAhorro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoVerAhorro.setText("Monto ahorro acumulado:");
        add(textoVerAhorro, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 170, 20));

        textoVerPrestamo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textoVerPrestamo.setForeground(new java.awt.Color(153, 153, 153));
        textoVerPrestamo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoVerPrestamo.setText("Monto préstamos acumulados:");
        add(textoVerPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 200, 20));

        pedirFondo.setBackground(new java.awt.Color(0, 153, 153));

        pedirBoton.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        pedirBoton.setForeground(new java.awt.Color(0, 0, 0));
        pedirBoton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pedirBoton.setText("SOLICITAR");
        pedirBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pedirBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pedirBotonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pedirBotonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pedirBotonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pedirFondoLayout = new javax.swing.GroupLayout(pedirFondo);
        pedirFondo.setLayout(pedirFondoLayout);
        pedirFondoLayout.setHorizontalGroup(
            pedirFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pedirBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        pedirFondoLayout.setVerticalGroup(
            pedirFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pedirBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        add(pedirFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 100, 40));

        añadirFondo.setBackground(new java.awt.Color(0, 153, 153));

        añadirBoton.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        añadirBoton.setForeground(new java.awt.Color(0, 0, 0));
        añadirBoton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        añadirBoton.setText("AÑADIR");
        añadirBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        añadirBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                añadirBotonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                añadirBotonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                añadirBotonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout añadirFondoLayout = new javax.swing.GroupLayout(añadirFondo);
        añadirFondo.setLayout(añadirFondoLayout);
        añadirFondoLayout.setHorizontalGroup(
            añadirFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(añadirBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        añadirFondoLayout.setVerticalGroup(
            añadirFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(añadirBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        add(añadirFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 100, 40));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 550, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void verPrestamoBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verPrestamoBotonMouseEntered
        verPrestamoFondo.setBackground(new Color(0, 153, 153));
    }//GEN-LAST:event_verPrestamoBotonMouseEntered

    private void verPrestamoBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verPrestamoBotonMouseExited
        verPrestamoFondo.setBackground(new Color(0, 102, 102));
    }//GEN-LAST:event_verPrestamoBotonMouseExited

    private void verPrestamoBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verPrestamoBotonMouseClicked
        Asociado customer = paneles.getInicioSesion().getSesion();
        JOptionPane.showMessageDialog(null, "₡" + customer.getPrestamos());
    }//GEN-LAST:event_verPrestamoBotonMouseClicked

    private void verAhorroBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verAhorroBotonMouseEntered
        verAhorroFondo.setBackground(new Color(0, 153, 153));
    }//GEN-LAST:event_verAhorroBotonMouseEntered

    private void verAhorroBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verAhorroBotonMouseExited
        verAhorroFondo.setBackground(new Color(0, 102, 102));
    }//GEN-LAST:event_verAhorroBotonMouseExited

    private void verAhorroBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verAhorroBotonMouseClicked
        Asociado customer = paneles.getInicioSesion().getSesion();
        JOptionPane.showMessageDialog(null,"₡" + customer.getAhorro());
    }//GEN-LAST:event_verAhorroBotonMouseClicked

    private void pedirBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pedirBotonMouseEntered
        pedirFondo.setBackground(new Color(0, 204, 204));
    }//GEN-LAST:event_pedirBotonMouseEntered

    private void pedirBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pedirBotonMouseExited
        pedirFondo.setBackground(new Color(0, 153, 153));
    }//GEN-LAST:event_pedirBotonMouseExited

    private void pedirBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pedirBotonMouseClicked
        Asociado asociado = paneles.getInicioSesion().getSesion();
        int prestamo = Integer.parseInt(EscribirPrestamo.getText());
        String texto = String.valueOf(prestamo);
        
        if(!texto.equals("Monto a pedir") && !texto.isEmpty()){
            if(prestamo != 0){
                if(prestamo <= asociado.getAhorro()){
                    asociado.setPrestamos(asociado.getPrestamos() + prestamo);
                    asociado.setMontoPrestamoDisponible(asociado.getMontoPrestamoDisponible() - prestamo);
                    JOptionPane.showMessageDialog(null, "Préstamo completado exitosamente");
                    
                    EscribirPrestamo.setText("Monto a pedir");
                    EscribirPrestamo.setForeground(new Color(102, 102, 102));
                }else{
                    JOptionPane.showMessageDialog(null, "Su préstamo no puede exceder su ahorro");
                }
            }else{
                JOptionPane.showMessageDialog(null, "No puede pedir un préstamo de ₡0");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un préstamo");
        }
        
    }//GEN-LAST:event_pedirBotonMouseClicked

    private void añadirBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_añadirBotonMouseEntered
        añadirFondo.setBackground(new Color(0, 204, 204));
    }//GEN-LAST:event_añadirBotonMouseEntered

    private void añadirBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_añadirBotonMouseExited
        añadirFondo.setBackground(new Color(0, 153, 153));
    }//GEN-LAST:event_añadirBotonMouseExited

    private void añadirBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_añadirBotonMouseClicked
        Asociado asociado = paneles.getInicioSesion().getSesion();
        int ahorro = Integer.parseInt(EscribirAhorro.getText());
        String texto = String.valueOf(ahorro);
        
        if(!texto.equals("Monto a solicitar") && !texto.isEmpty()){
           if(ahorro != 0){
               asociado.setAhorro(asociado.getAhorro() + ahorro);
               JOptionPane.showMessageDialog(null, "Monto añadido exitosamente");
               
               EscribirAhorro.setText("Monto a solicitar");
               EscribirAhorro.setForeground(new Color(102, 102, 102));
               
               if(ahorro > asociado.getPrestamos()){
                   asociado.setPrestamos(0);
               }else{
                   asociado.setPrestamos(asociado.getPrestamos() - ahorro);
               }
               
           }else{
               JOptionPane.showMessageDialog(null, "No puede añadir un monto a su ahorro de ₡0");
           }
        }else{
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un préstamo");
        }
    }//GEN-LAST:event_añadirBotonMouseClicked

    private void EscribirPrestamoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EscribirPrestamoMousePressed
        if(EscribirPrestamo.getText().equals("Monto a solicitar")){
           EscribirPrestamo.setText("");
           EscribirPrestamo.setForeground(Color.black);
        }
        if(EscribirAhorro.getText().isEmpty()){
           EscribirAhorro.setText("Monto a añadir");
           EscribirAhorro.setForeground(new Color(102, 102, 102));
        }
    }//GEN-LAST:event_EscribirPrestamoMousePressed

    private void EscribirAhorroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EscribirAhorroMousePressed
        if(EscribirAhorro.getText().equals("Monto a añadir")){
           EscribirAhorro.setText("");
           EscribirAhorro.setForeground(Color.black);
        }
        if(EscribirPrestamo.getText().isEmpty()){
           EscribirPrestamo.setText("Monto a solicitar");
           EscribirPrestamo.setForeground(new Color(102, 102, 102));
        }
    }//GEN-LAST:event_EscribirAhorroMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EscribirAhorro;
    private javax.swing.JTextField EscribirPrestamo;
    private javax.swing.JLabel TextoAhorroPredeterminado;
    private javax.swing.JLabel TextoPrestamo;
    private javax.swing.JLabel TextoPrestamoPrincipal;
    private javax.swing.JLabel TextoTelefono;
    private javax.swing.JLabel añadirBoton;
    private javax.swing.JPanel añadirFondo;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel pedirBoton;
    private javax.swing.JPanel pedirFondo;
    private javax.swing.JLabel textoVerAhorro;
    private javax.swing.JLabel textoVerPrestamo;
    private javax.swing.JLabel verAhorroBoton;
    private javax.swing.JPanel verAhorroFondo;
    private javax.swing.JLabel verPrestamoBoton;
    private javax.swing.JPanel verPrestamoFondo;
    // End of variables declaration//GEN-END:variables
}

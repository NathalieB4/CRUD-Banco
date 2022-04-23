
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;

public class Asociado extends javax.swing.JPanel {
    
    Perfil menuPerfil = new Perfil();
    Transacciones menuTransacciones = new Transacciones();
    Dividendos menuDividendos = new Dividendos();

    public Asociado() {
        initComponents();
    }
    
    private void ShowPanel(JPanel p){
        p.setSize(570, 380);
        p.setLocation(0, 0);
        
        contenido.removeAll();
        contenido.add(p, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        perfilFondo = new javax.swing.JPanel();
        perfilBoton = new javax.swing.JLabel();
        transaccionesFondo = new javax.swing.JPanel();
        transaccionesBoton = new javax.swing.JLabel();
        dividendosFondo = new javax.swing.JPanel();
        dividendosBoton = new javax.swing.JLabel();
        contenido = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        perfilFondo.setBackground(new java.awt.Color(0, 102, 102));

        perfilBoton.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        perfilBoton.setForeground(new java.awt.Color(255, 255, 255));
        perfilBoton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        perfilBoton.setText("Perfil Asociado");
        perfilBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        perfilBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                perfilBotonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                perfilBotonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                perfilBotonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout perfilFondoLayout = new javax.swing.GroupLayout(perfilFondo);
        perfilFondo.setLayout(perfilFondoLayout);
        perfilFondoLayout.setHorizontalGroup(
            perfilFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(perfilBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        perfilFondoLayout.setVerticalGroup(
            perfilFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(perfilBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        add(perfilFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 160, 50));

        transaccionesFondo.setBackground(new java.awt.Color(0, 102, 102));

        transaccionesBoton.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        transaccionesBoton.setForeground(new java.awt.Color(255, 255, 255));
        transaccionesBoton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        transaccionesBoton.setText("Transacciones");
        transaccionesBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        transaccionesBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transaccionesBotonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                transaccionesBotonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                transaccionesBotonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout transaccionesFondoLayout = new javax.swing.GroupLayout(transaccionesFondo);
        transaccionesFondo.setLayout(transaccionesFondoLayout);
        transaccionesFondoLayout.setHorizontalGroup(
            transaccionesFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(transaccionesBoton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        transaccionesFondoLayout.setVerticalGroup(
            transaccionesFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(transaccionesBoton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        add(transaccionesFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 160, 50));

        dividendosFondo.setBackground(new java.awt.Color(0, 102, 102));

        dividendosBoton.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        dividendosBoton.setForeground(new java.awt.Color(255, 255, 255));
        dividendosBoton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dividendosBoton.setText("Dividendos");
        dividendosBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dividendosBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dividendosBotonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dividendosBotonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dividendosBotonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout dividendosFondoLayout = new javax.swing.GroupLayout(dividendosFondo);
        dividendosFondo.setLayout(dividendosFondoLayout);
        dividendosFondoLayout.setHorizontalGroup(
            dividendosFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dividendosBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        dividendosFondoLayout.setVerticalGroup(
            dividendosFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dividendosBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        add(dividendosFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 160, 50));

        contenido.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        add(contenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 570, 380));
    }// </editor-fold>//GEN-END:initComponents

    private void perfilBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_perfilBotonMouseEntered
        perfilFondo.setBackground(new Color(0, 153, 153));
    }//GEN-LAST:event_perfilBotonMouseEntered

    private void perfilBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_perfilBotonMouseExited
         perfilFondo.setBackground(new Color(0, 102, 102));
    }//GEN-LAST:event_perfilBotonMouseExited

    private void transaccionesBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transaccionesBotonMouseEntered
        transaccionesFondo.setBackground(new Color(0, 153, 153));
    }//GEN-LAST:event_transaccionesBotonMouseEntered

    private void transaccionesBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transaccionesBotonMouseExited
        transaccionesFondo.setBackground(new Color(0, 102, 102));
    }//GEN-LAST:event_transaccionesBotonMouseExited

    private void dividendosBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dividendosBotonMouseEntered
        dividendosFondo.setBackground(new Color(0, 153, 153));
    }//GEN-LAST:event_dividendosBotonMouseEntered

    private void dividendosBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dividendosBotonMouseExited
        dividendosFondo.setBackground(new Color(0, 102, 102));
    }//GEN-LAST:event_dividendosBotonMouseExited

    private void perfilBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_perfilBotonMouseClicked
        ShowPanel(menuPerfil);
    }//GEN-LAST:event_perfilBotonMouseClicked

    private void transaccionesBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transaccionesBotonMouseClicked
        ShowPanel(menuTransacciones);
    }//GEN-LAST:event_transaccionesBotonMouseClicked

    private void dividendosBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dividendosBotonMouseClicked
        ShowPanel(menuDividendos);
    }//GEN-LAST:event_dividendosBotonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenido;
    private javax.swing.JLabel dividendosBoton;
    private javax.swing.JPanel dividendosFondo;
    private javax.swing.JLabel perfilBoton;
    private javax.swing.JPanel perfilFondo;
    private javax.swing.JLabel transaccionesBoton;
    private javax.swing.JPanel transaccionesFondo;
    // End of variables declaration//GEN-END:variables
}

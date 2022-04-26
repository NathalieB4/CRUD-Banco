import Codigo.TodosAsociados;
import java.awt.Color;
import javax.swing.JOptionPane;

public class Dividendos extends javax.swing.JPanel {
   
    public Dividendos(Paneles paneles) {
        super();
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        dividendosFondo = new javax.swing.JPanel();
        dividendosBoton = new javax.swing.JLabel();
        textoDividendos = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 550, 30));

        dividendosFondo.setBackground(new java.awt.Color(0, 102, 102));

        dividendosBoton.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        dividendosBoton.setForeground(new java.awt.Color(255, 255, 255));
        dividendosBoton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dividendosBoton.setText("DIVIDENDOS");
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
            .addComponent(dividendosBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        dividendosFondoLayout.setVerticalGroup(
            dividendosFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dividendosBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        add(dividendosFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 170, 60));

        textoDividendos.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        textoDividendos.setForeground(new java.awt.Color(0, 0, 0));
        textoDividendos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoDividendos.setText("VER DIVIDENDOS DE LOS ASOCIADOS");
        add(textoDividendos, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 400, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void dividendosBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dividendosBotonMouseEntered
        dividendosFondo.setBackground(new Color(0, 153, 153));
        dividendosBoton.setForeground(Color.black);
    }//GEN-LAST:event_dividendosBotonMouseEntered

    private void dividendosBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dividendosBotonMouseExited
        dividendosFondo.setBackground(new Color(0, 102, 102));
        dividendosBoton.setForeground(Color.white);
    }//GEN-LAST:event_dividendosBotonMouseExited

    private void dividendosBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dividendosBotonMouseClicked
        JOptionPane.showMessageDialog(null, TodosAsociados.getNombres());
    }//GEN-LAST:event_dividendosBotonMouseClicked
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dividendosBoton;
    private javax.swing.JPanel dividendosFondo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel textoDividendos;
    // End of variables declaration//GEN-END:variables
}

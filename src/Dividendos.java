
public class Dividendos extends javax.swing.JPanel {

    public Dividendos(Paneles panel) {
        super();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollDividendos = new javax.swing.JScrollPane();
        dividendosTabla = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        recargarFondo = new javax.swing.JPanel();
        recargarBoton = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dividendosTabla.setBackground(new java.awt.Color(255, 255, 255));
        dividendosTabla.setForeground(new java.awt.Color(255, 255, 255));
        dividendosTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Ahorro", "Ganancias", "Dividendos"
            }
        ));
        scrollDividendos.setViewportView(dividendosTabla);

        add(scrollDividendos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, 180));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 550, 50));

        recargarFondo.setBackground(new java.awt.Color(0, 102, 102));

        recargarBoton.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        recargarBoton.setForeground(new java.awt.Color(255, 255, 255));
        recargarBoton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        recargarBoton.setText("RECARGAR");
        recargarBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout recargarFondoLayout = new javax.swing.GroupLayout(recargarFondo);
        recargarFondo.setLayout(recargarFondoLayout);
        recargarFondoLayout.setHorizontalGroup(
            recargarFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(recargarBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        recargarFondoLayout.setVerticalGroup(
            recargarFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(recargarBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        add(recargarFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 130, 40));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable dividendosTabla;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel recargarBoton;
    private javax.swing.JPanel recargarFondo;
    private javax.swing.JScrollPane scrollDividendos;
    // End of variables declaration//GEN-END:variables
}

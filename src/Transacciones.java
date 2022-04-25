
public class Transacciones extends javax.swing.JPanel {

    public Transacciones(Paneles panel) {
        super();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TextoPrincipal = new javax.swing.JLabel();
        TextoPrincipal1 = new javax.swing.JLabel();
        textoNombre = new javax.swing.JLabel();
        textoTelefono = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TextoPrincipal.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        TextoPrincipal.setForeground(new java.awt.Color(0, 0, 0));
        TextoPrincipal.setText("AÑADIR AHORROS");
        add(TextoPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, -1, -1));

        TextoPrincipal1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        TextoPrincipal1.setForeground(new java.awt.Color(0, 0, 0));
        TextoPrincipal1.setText("PEDIR PRÉSTAMOS");
        add(TextoPrincipal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));

        textoNombre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        textoNombre.setForeground(new java.awt.Color(0, 0, 0));
        textoNombre.setText("Nombre:");
        add(textoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, -1, -1));

        textoTelefono.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        textoTelefono.setForeground(new java.awt.Color(0, 0, 0));
        textoTelefono.setText("Teléfono:");
        add(textoTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, -1, -1));

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(102, 102, 102));
        jTextField1.setText("jTextField1");
        jTextField1.setBorder(null);
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 240, -1));

        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(102, 102, 102));
        jTextField2.setText("jTextField1");
        jTextField2.setBorder(null);
        add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 240, -1));

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 240, 20));

        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 240, 20));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TextoPrincipal;
    private javax.swing.JLabel TextoPrincipal1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel textoNombre;
    private javax.swing.JLabel textoTelefono;
    // End of variables declaration//GEN-END:variables
}

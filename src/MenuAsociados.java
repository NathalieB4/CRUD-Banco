
import Codigo.TodosAsociados;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;


public class MenuAsociados extends javax.swing.JFrame {
    
    Paneles paneles;
    int xMouse, yMouse;

    public MenuAsociados(Paneles paneles) {
        super();
        initComponents();
        this.paneles = paneles;

        this.setLocationRelativeTo(null);
    }
        
    public void showPanel(JPanel p){
        p.setSize(570, 470);
        p.setLocation(0, 0);
        
        contenido.removeAll();
        contenido.add(p, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        contenido = new javax.swing.JPanel();
        BarraArriba = new javax.swing.JPanel();
        FondoSalir = new javax.swing.JPanel();
        BotonSalir = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        FondoRegistrarse = new javax.swing.JPanel();
        BotonRegistrarse = new javax.swing.JLabel();
        FondoEliminar = new javax.swing.JPanel();
        BotonEliminar = new javax.swing.JLabel();
        FondoInicio = new javax.swing.JPanel();
        BotonInicio = new javax.swing.JLabel();
        FondoPrincipal = new javax.swing.JPanel();
        BotonPrincipal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        fondo.setBackground(new java.awt.Color(0, 102, 102));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contenido.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        fondo.add(contenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 570, 470));

        BarraArriba.setBackground(new java.awt.Color(0, 153, 153));
        BarraArriba.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BarraArribaMouseDragged(evt);
            }
        });
        BarraArriba.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BarraArribaMousePressed(evt);
            }
        });

        FondoSalir.setBackground(new java.awt.Color(0, 204, 204));
        FondoSalir.setForeground(new java.awt.Color(0, 204, 204));

        BotonSalir.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        BotonSalir.setForeground(new java.awt.Color(0, 0, 0));
        BotonSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BotonSalir.setText("x");
        BotonSalir.setToolTipText("Cerrar");
        BotonSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonSalirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout FondoSalirLayout = new javax.swing.GroupLayout(FondoSalir);
        FondoSalir.setLayout(FondoSalirLayout);
        FondoSalirLayout.setHorizontalGroup(
            FondoSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BotonSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        FondoSalirLayout.setVerticalGroup(
            FondoSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoSalirLayout.createSequentialGroup()
                .addComponent(BotonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("SERVICIOS DE PROGRAMACIÓN");

        javax.swing.GroupLayout BarraArribaLayout = new javax.swing.GroupLayout(BarraArriba);
        BarraArriba.setLayout(BarraArribaLayout);
        BarraArribaLayout.setHorizontalGroup(
            BarraArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BarraArribaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 352, Short.MAX_VALUE)
                .addComponent(FondoSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BarraArribaLayout.setVerticalGroup(
            BarraArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraArribaLayout.createSequentialGroup()
                .addComponent(FondoSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BarraArribaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        fondo.add(BarraArriba, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 30));

        FondoRegistrarse.setBackground(new java.awt.Color(0, 153, 153));

        BotonRegistrarse.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        BotonRegistrarse.setForeground(new java.awt.Color(0, 0, 0));
        BotonRegistrarse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BotonRegistrarse.setText("Registrarse");
        BotonRegistrarse.setToolTipText("Registrarse");
        BotonRegistrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonRegistrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonRegistrarseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonRegistrarseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonRegistrarseMouseExited(evt);
            }
        });

        javax.swing.GroupLayout FondoRegistrarseLayout = new javax.swing.GroupLayout(FondoRegistrarse);
        FondoRegistrarse.setLayout(FondoRegistrarseLayout);
        FondoRegistrarseLayout.setHorizontalGroup(
            FondoRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BotonRegistrarse, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        FondoRegistrarseLayout.setVerticalGroup(
            FondoRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BotonRegistrarse, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        fondo.add(FondoRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 130, 50));

        FondoEliminar.setBackground(new java.awt.Color(0, 153, 153));

        BotonEliminar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        BotonEliminar.setForeground(new java.awt.Color(0, 0, 0));
        BotonEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BotonEliminar.setText("Eliminar Registro");
        BotonEliminar.setToolTipText("Eliminar Registro");
        BotonEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonEliminarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonEliminarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout FondoEliminarLayout = new javax.swing.GroupLayout(FondoEliminar);
        FondoEliminar.setLayout(FondoEliminarLayout);
        FondoEliminarLayout.setHorizontalGroup(
            FondoEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BotonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        FondoEliminarLayout.setVerticalGroup(
            FondoEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BotonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        fondo.add(FondoEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, -1, -1));

        FondoInicio.setBackground(new java.awt.Color(0, 153, 153));

        BotonInicio.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        BotonInicio.setForeground(new java.awt.Color(0, 0, 0));
        BotonInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BotonInicio.setText("Iniciar Sesión");
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
            .addComponent(BotonInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        FondoInicioLayout.setVerticalGroup(
            FondoInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BotonInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        fondo.add(FondoInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, -1, -1));

        FondoPrincipal.setBackground(new java.awt.Color(0, 153, 153));
        FondoPrincipal.setPreferredSize(new java.awt.Dimension(130, 50));

        BotonPrincipal.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        BotonPrincipal.setForeground(new java.awt.Color(0, 0, 0));
        BotonPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BotonPrincipal.setText("Pantalla Principal");
        BotonPrincipal.setToolTipText("Pantalla Principal");
        BotonPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonPrincipalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonPrincipalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonPrincipalMouseExited(evt);
            }
        });

        javax.swing.GroupLayout FondoPrincipalLayout = new javax.swing.GroupLayout(FondoPrincipal);
        FondoPrincipal.setLayout(FondoPrincipalLayout);
        FondoPrincipalLayout.setHorizontalGroup(
            FondoPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BotonPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        FondoPrincipalLayout.setVerticalGroup(
            FondoPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BotonPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        fondo.add(FondoPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonPrincipalMouseClicked
        MenuAsociados menuAso = paneles.getMenuAso();
        Principal menuPrin = paneles.getMenuPrincipal();
        menuAso.showPanel(menuPrin);
        System.out.println(TodosAsociados.getAhorros() + " " + TodosAsociados.getGananciasPrestamos());
    }//GEN-LAST:event_BotonPrincipalMouseClicked

    private void BotonRegistrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegistrarseMouseClicked
        MenuAsociados menuAso = paneles.getMenuAso();
        Registro registrarse = paneles.getRegistrarse();
        menuAso.showPanel(registrarse);
    }//GEN-LAST:event_BotonRegistrarseMouseClicked

    private void BotonInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonInicioMouseClicked
        MenuAsociados menuAso = paneles.getMenuAso();
        Inicio iniciar = paneles.getInicioSesion();
        menuAso.showPanel(iniciar);
    }//GEN-LAST:event_BotonInicioMouseClicked

    private void BotonEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonEliminarMouseClicked
        MenuAsociados menuAso = paneles.getMenuAso();
        Eliminar elimina = paneles.getEliminarAsociado();
        menuAso.showPanel(elimina);
    }//GEN-LAST:event_BotonEliminarMouseClicked

    private void BotonSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_BotonSalirMouseClicked

    private void BotonSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonSalirMouseEntered
        FondoSalir.setBackground(Color.red);
        BotonSalir.setForeground(Color.white);
    }//GEN-LAST:event_BotonSalirMouseEntered

    private void BotonSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonSalirMouseExited
        FondoSalir.setBackground(new Color(0, 204, 204));
        BotonSalir.setForeground(Color.black);
    }//GEN-LAST:event_BotonSalirMouseExited

    private void BotonPrincipalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonPrincipalMouseEntered
        FondoPrincipal.setBackground(new Color(0, 204, 204));
    }//GEN-LAST:event_BotonPrincipalMouseEntered

    private void BotonPrincipalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonPrincipalMouseExited
        FondoPrincipal.setBackground(new Color(0, 153, 153));
    }//GEN-LAST:event_BotonPrincipalMouseExited

    private void BotonRegistrarseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegistrarseMouseEntered
        FondoRegistrarse.setBackground(new Color(0, 204, 204));
    }//GEN-LAST:event_BotonRegistrarseMouseEntered

    private void BotonRegistrarseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegistrarseMouseExited
        FondoRegistrarse.setBackground(new Color(0, 153, 153));
    }//GEN-LAST:event_BotonRegistrarseMouseExited

    private void BotonInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonInicioMouseEntered
        FondoInicio.setBackground(new Color(0, 204, 204));
    }//GEN-LAST:event_BotonInicioMouseEntered

    private void BotonInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonInicioMouseExited
        FondoInicio.setBackground(new Color(0, 153, 153));
    }//GEN-LAST:event_BotonInicioMouseExited

    private void BotonEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonEliminarMouseEntered
        FondoEliminar.setBackground(new Color(0, 204, 204));
    }//GEN-LAST:event_BotonEliminarMouseEntered

    private void BotonEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonEliminarMouseExited
        FondoEliminar.setBackground(new Color(0, 153, 153));
    }//GEN-LAST:event_BotonEliminarMouseExited

    private void BarraArribaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraArribaMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_BarraArribaMousePressed

    private void BarraArribaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraArribaMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_BarraArribaMouseDragged

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuAsociados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAsociados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAsociados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAsociados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Paneles();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarraArriba;
    private javax.swing.JLabel BotonEliminar;
    private javax.swing.JLabel BotonInicio;
    private javax.swing.JLabel BotonPrincipal;
    private javax.swing.JLabel BotonRegistrarse;
    private javax.swing.JLabel BotonSalir;
    private javax.swing.JPanel FondoEliminar;
    private javax.swing.JPanel FondoInicio;
    private javax.swing.JPanel FondoPrincipal;
    private javax.swing.JPanel FondoRegistrarse;
    private javax.swing.JPanel FondoSalir;
    private javax.swing.JPanel contenido;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

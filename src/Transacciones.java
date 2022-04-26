
import Codigo.Asociado;
import java.awt.Color;
import javax.swing.JOptionPane;

public class Transacciones extends javax.swing.JPanel {

    Paneles paneles;
    int tasaInteres;

    public Transacciones(Paneles paneles) {
        super();
        initComponents();
        this.paneles = paneles;
    }
    
    public int tasaInteres(){
        return tasaInteres;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        TextoAhorroPredeterminado = new javax.swing.JLabel();
        TextoPrestamoPrincipal = new javax.swing.JLabel();
        textoCancelar = new javax.swing.JLabel();
        TextoTelefono = new javax.swing.JLabel();
        EscribirAhorro = new javax.swing.JTextField();
        EscribirPrestamo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        verPrestamoFondo = new javax.swing.JPanel();
        verPrestamoBoton = new javax.swing.JLabel();
        verAhorroFondo = new javax.swing.JPanel();
        verAhorroBoton = new javax.swing.JLabel();
        textoVerAhorros = new javax.swing.JLabel();
        pedirFondo = new javax.swing.JPanel();
        pedirBoton = new javax.swing.JLabel();
        añadirFondo = new javax.swing.JPanel();
        añadirBoton = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        informacionFondo = new javax.swing.JPanel();
        informacionBoton = new javax.swing.JLabel();
        textoVerPrestamo1 = new javax.swing.JLabel();
        TextoPrestamo1 = new javax.swing.JLabel();
        escribirCancelar = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        cancelarFondo = new javax.swing.JPanel();
        cancelarBoton = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TextoAhorroPredeterminado.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        TextoAhorroPredeterminado.setForeground(new java.awt.Color(0, 0, 0));
        TextoAhorroPredeterminado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextoAhorroPredeterminado.setText("AÑADIR AHORROS");
        add(TextoAhorroPredeterminado, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 200, -1));

        TextoPrestamoPrincipal.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        TextoPrestamoPrincipal.setForeground(new java.awt.Color(0, 0, 0));
        TextoPrestamoPrincipal.setText("SOLICITAR Y CANCELAR PRÉSTAMOS");
        add(TextoPrestamoPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        textoCancelar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        textoCancelar.setForeground(new java.awt.Color(0, 0, 0));
        textoCancelar.setText("Monto a cancelar:");
        add(textoCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, -1, -1));

        TextoTelefono.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        TextoTelefono.setForeground(new java.awt.Color(0, 0, 0));
        TextoTelefono.setText("Monto para el ahorro:");
        add(TextoTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, -1, -1));

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
        add(EscribirAhorro, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 240, -1));

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
        add(EscribirPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 240, -1));

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 240, 20));

        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 240, 20));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, verPrestamoFondoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(verPrestamoBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        verPrestamoFondoLayout.setVerticalGroup(
            verPrestamoFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, verPrestamoFondoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(verPrestamoBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(verPrestamoFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 60, 30));

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
            .addComponent(verAhorroBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );
        verAhorroFondoLayout.setVerticalGroup(
            verAhorroFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(verAhorroBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(verAhorroFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 60, 30));

        textoVerAhorros.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textoVerAhorros.setForeground(new java.awt.Color(153, 153, 153));
        textoVerAhorros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoVerAhorros.setText("* Acumulados");
        add(textoVerAhorros, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 90, 20));

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

        add(pedirFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 100, 40));

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

        add(añadirFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 100, 40));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 520, 10));

        informacionFondo.setBackground(new java.awt.Color(0, 153, 153));

        informacionBoton.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        informacionBoton.setForeground(new java.awt.Color(0, 0, 0));
        informacionBoton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        informacionBoton.setText("INFORMACIÓN");
        informacionBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        informacionBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                informacionBotonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                informacionBotonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                informacionBotonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout informacionFondoLayout = new javax.swing.GroupLayout(informacionFondo);
        informacionFondo.setLayout(informacionFondoLayout);
        informacionFondoLayout.setHorizontalGroup(
            informacionFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(informacionBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        informacionFondoLayout.setVerticalGroup(
            informacionFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, informacionFondoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(informacionBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(informacionFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 100, -1));

        textoVerPrestamo1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textoVerPrestamo1.setForeground(new java.awt.Color(153, 153, 153));
        textoVerPrestamo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoVerPrestamo1.setText("* Acumulados");
        add(textoVerPrestamo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 90, 20));

        TextoPrestamo1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        TextoPrestamo1.setForeground(new java.awt.Color(0, 0, 0));
        TextoPrestamo1.setText("Monto del préstamo:");
        add(TextoPrestamo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        escribirCancelar.setBackground(new java.awt.Color(255, 255, 255));
        escribirCancelar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        escribirCancelar.setForeground(new java.awt.Color(102, 102, 102));
        escribirCancelar.setText("Monto a cancelar");
        escribirCancelar.setBorder(null);
        escribirCancelar.setPreferredSize(new java.awt.Dimension(104, 17));
        escribirCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                escribirCancelarMousePressed(evt);
            }
        });
        add(escribirCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 240, -1));

        jSeparator4.setForeground(new java.awt.Color(102, 102, 102));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 240, 20));

        cancelarFondo.setBackground(new java.awt.Color(0, 153, 153));

        cancelarBoton.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        cancelarBoton.setForeground(new java.awt.Color(0, 0, 0));
        cancelarBoton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cancelarBoton.setText("CANCELAR");
        cancelarBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelarBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarBotonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelarBotonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelarBotonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout cancelarFondoLayout = new javax.swing.GroupLayout(cancelarFondo);
        cancelarFondo.setLayout(cancelarFondoLayout);
        cancelarFondoLayout.setHorizontalGroup(
            cancelarFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(cancelarFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cancelarFondoLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(cancelarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        cancelarFondoLayout.setVerticalGroup(
            cancelarFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(cancelarFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cancelarFondoLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(cancelarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        add(cancelarFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, -1, -1));
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
        JOptionPane.showMessageDialog(null, "₡" + customer.getAhorro());
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
        tasaInteres = 0;

        if (!texto.equals("Monto a solicitar") && !texto.isEmpty()) {
            if (prestamo != 0) {
                if (prestamo < asociado.getAhorro()) {
                    if (prestamo < asociado.getMontoPrestamoDisponible()) {
                        tasaInteres = (tasaInteres + (int) ((0.05 * prestamo))); //-> Literalmente el resultado es el mismo sin esto: / (1 - Math.pow(1 + 0.05, -12)));
                        asociado.setMontoPrestamoDisponible(asociado.getAhorro() - prestamo);
                        asociado.setPrestamos(asociado.getPrestamos() + (tasaInteres + prestamo));
                        JOptionPane.showMessageDialog(null, "Préstamo completado exitosamente \nSu tasa de interés es de ₡" + tasaInteres);

                        EscribirPrestamo.setText("Monto a solicitar");
                        EscribirPrestamo.setForeground(new Color(102, 102, 102));
                    } else {
                        JOptionPane.showMessageDialog(null, "No puede completarse el préstamo porque su monto acumulado excede su ahorro");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Su préstamo no puede exceder su ahorro");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No puede pedir un préstamo de ₡0");
            }
        } else {
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

        if (!texto.equals("Monto a añadir") && !texto.isEmpty()) {
            if (ahorro != 0) {
                asociado.setAhorro(asociado.getAhorro() + ahorro);
                asociado.setMontoPrestamoDisponible(asociado.getAhorro() - asociado.getPrestamos());
                JOptionPane.showMessageDialog(null, "Monto añadido exitosamente");

                EscribirAhorro.setText("Monto a añadir");
                EscribirAhorro.setForeground(new Color(102, 102, 102));

            } else {
                JOptionPane.showMessageDialog(null, "No puede añadir un monto a su ahorro de ₡0");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un préstamo");
        }
    }//GEN-LAST:event_añadirBotonMouseClicked

    private void EscribirPrestamoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EscribirPrestamoMousePressed
        if (EscribirPrestamo.getText().equals("Monto a solicitar")) {
            EscribirPrestamo.setText("");
            EscribirPrestamo.setForeground(Color.black);
        }
        if (EscribirAhorro.getText().isEmpty()) {
            EscribirAhorro.setText("Monto a añadir");
            EscribirAhorro.setForeground(new Color(102, 102, 102));
        }
        if (escribirCancelar.getText().isEmpty()) {
            escribirCancelar.setText("Monto a cancelar");
            escribirCancelar.setForeground(new Color(102, 102, 102));
        }
    }//GEN-LAST:event_EscribirPrestamoMousePressed

    private void EscribirAhorroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EscribirAhorroMousePressed
        if (EscribirAhorro.getText().equals("Monto a añadir")) {
            EscribirAhorro.setText("");
            EscribirAhorro.setForeground(Color.black);
        }
        if (EscribirPrestamo.getText().isEmpty()) {
            EscribirPrestamo.setText("Monto a solicitar");
            EscribirPrestamo.setForeground(new Color(102, 102, 102));
        }
        if (escribirCancelar.getText().isEmpty()) {
            escribirCancelar.setText("Monto a cancelar");
            escribirCancelar.setForeground(new Color(102, 102, 102));
        }
    }//GEN-LAST:event_EscribirAhorroMousePressed

    private void informacionBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_informacionBotonMouseClicked
        JOptionPane.showMessageDialog(null, "Para pedir un préstamo no debe exceder de la cantidad de su ahorro. \nLa tasa de interés por préstamo es del 5%. \nPodrá cancelar el préstamo en una cuota de 12 meses.");
    }//GEN-LAST:event_informacionBotonMouseClicked

    private void informacionBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_informacionBotonMouseEntered
        informacionFondo.setBackground(new Color(0, 102, 102));
        informacionBoton.setForeground(Color.black);
    }//GEN-LAST:event_informacionBotonMouseEntered

    private void informacionBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_informacionBotonMouseExited
        informacionFondo.setBackground(new Color(0, 153, 153));
        informacionBoton.setForeground(Color.black);
    }//GEN-LAST:event_informacionBotonMouseExited

    private void escribirCancelarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escribirCancelarMousePressed
        if (escribirCancelar.getText().equals("Monto a cancelar")) {
            Asociado asociado = paneles.getInicioSesion().getSesion();
            JOptionPane.showMessageDialog(null, "Recuerde que debe cancelar el monto completo del préstamo más los interes \nUsted debe cancelar un total de: ₡" + asociado.getPrestamos());
            escribirCancelar.setText("");
            escribirCancelar.setForeground(Color.black);
        }
        if (EscribirPrestamo.getText().isEmpty()) {
            EscribirPrestamo.setText("Monto a solicitar");
            EscribirPrestamo.setForeground(new Color(102, 102, 102));
        }
        if (EscribirAhorro.getText().isEmpty()) {
            EscribirAhorro.setText("Monto a añadir");
            EscribirAhorro.setForeground(new Color(102, 102, 102));
        }
    }//GEN-LAST:event_escribirCancelarMousePressed

    private void cancelarBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarBotonMouseEntered
        cancelarFondo.setBackground(new Color(0, 204, 204));
    }//GEN-LAST:event_cancelarBotonMouseEntered

    private void cancelarBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarBotonMouseExited
        cancelarFondo.setBackground(new Color(0, 153, 153));
    }//GEN-LAST:event_cancelarBotonMouseExited

    private void cancelarBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarBotonMouseClicked
        Asociado asociado = paneles.getInicioSesion().getSesion();
        int montoCancelar = Integer.parseInt(escribirCancelar.getText());

        
        if (montoCancelar != asociado.getPrestamos()) {
            JOptionPane.showMessageDialog(null, "Usted debe cancelar el monto completo");
        } else {
            asociado.setPrestamos(0);
            asociado.setMontoPrestamoDisponible(asociado.getAhorro());
            asociado.setGananciasPrestamos(asociado.getGananciasPrestamos() + tasaInteres);
            JOptionPane.showMessageDialog(null, "Cancelo completado exitosamente");

            escribirCancelar.setText("Monto a cancelar");
            escribirCancelar.setForeground(new Color(102, 102, 102));
        }
    }//GEN-LAST:event_cancelarBotonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EscribirAhorro;
    private javax.swing.JTextField EscribirPrestamo;
    private javax.swing.JLabel TextoAhorroPredeterminado;
    private javax.swing.JLabel TextoPrestamo1;
    private javax.swing.JLabel TextoPrestamoPrincipal;
    private javax.swing.JLabel TextoTelefono;
    private javax.swing.JLabel añadirBoton;
    private javax.swing.JPanel añadirFondo;
    private javax.swing.JLabel cancelarBoton;
    private javax.swing.JPanel cancelarFondo;
    private javax.swing.JTextField escribirCancelar;
    private javax.swing.JLabel informacionBoton;
    private javax.swing.JPanel informacionFondo;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel pedirBoton;
    private javax.swing.JPanel pedirFondo;
    private javax.swing.JLabel textoCancelar;
    private javax.swing.JLabel textoVerAhorros;
    private javax.swing.JLabel textoVerPrestamo1;
    private javax.swing.JLabel verAhorroBoton;
    private javax.swing.JPanel verAhorroFondo;
    private javax.swing.JLabel verPrestamoBoton;
    private javax.swing.JPanel verPrestamoFondo;
    // End of variables declaration//GEN-END:variables
}

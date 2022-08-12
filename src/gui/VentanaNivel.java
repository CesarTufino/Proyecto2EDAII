/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Queue;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import laberinto.*;

/**
 *
 * @author Nicolás B, Jhon M, César T
 */
public class VentanaNivel extends javax.swing.JFrame {

    Laberinto laberinto;
    JLabel[][] lbElementos;
    private ImageIcon imagenSuelo = null;
    private ImageIcon imagenCreador = null;
    private ImageIcon imagenPared = null;
    private ImageIcon imagenMeta = null;
    private ImageIcon imagenJugador = null;
    private int nivel = 1;
    private int puntaje = 4000;
    private Queue<Direccion> rutaAlgoritmo;

    /**
     * Creates new form VentanaNivel
     */
    public VentanaNivel() {
        initComponents();
        setTitle("Sonic Laberinto");
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        try {
            imagenSuelo = new ImageIcon(ImageIO.read(new File("recursos/suelo.png")));
            imagenCreador = new ImageIcon(ImageIO.read(new File("recursos/creador.png")));
            imagenPared = new ImageIcon(ImageIO.read(new File("recursos/pared.png")));
            imagenMeta = new ImageIcon(ImageIO.read(new File("recursos/meta.png")));
            imagenJugador = new ImageIcon(ImageIO.read(new File("recursos/jugador.png")));
            btnAvanzar.setVisible(false);
            cargarPantallaDeNuevoNivel();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        pnlPantalla.setFocusable(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlPantalla = new javax.swing.JPanel();
        lblPuntajeConteo = new javax.swing.JLabel();
        lblNivelConteo = new javax.swing.JLabel();
        lblPuntaje = new javax.swing.JLabel();
        lblNIvel = new javax.swing.JLabel();
        btnSolucionar = new javax.swing.JButton();
        btnAvanzar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(59, 104, 204));

        pnlPantalla.setBackground(new java.awt.Color(59, 137, 56));
        pnlPantalla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pnlPantallaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout pnlPantallaLayout = new javax.swing.GroupLayout(pnlPantalla);
        pnlPantalla.setLayout(pnlPantallaLayout);
        pnlPantallaLayout.setHorizontalGroup(
            pnlPantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 502, Short.MAX_VALUE)
        );
        pnlPantallaLayout.setVerticalGroup(
            pnlPantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );

        lblPuntajeConteo.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 18)); // NOI18N
        lblPuntajeConteo.setForeground(new java.awt.Color(255, 255, 255));
        lblPuntajeConteo.setText("4000");

        lblNivelConteo.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 18)); // NOI18N
        lblNivelConteo.setForeground(new java.awt.Color(255, 255, 255));
        lblNivelConteo.setText("1");

        lblPuntaje.setBackground(new java.awt.Color(204, 204, 255));
        lblPuntaje.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 18)); // NOI18N
        lblPuntaje.setForeground(new java.awt.Color(255, 255, 0));
        lblPuntaje.setText("Puntaje");

        lblNIvel.setBackground(new java.awt.Color(204, 204, 255));
        lblNIvel.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 18)); // NOI18N
        lblNIvel.setForeground(new java.awt.Color(255, 255, 0));
        lblNIvel.setText("Nivel");

        btnSolucionar.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 12)); // NOI18N
        btnSolucionar.setText("Solucionar");
        btnSolucionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolucionarActionPerformed(evt);
            }
        });

        btnAvanzar.setBackground(new java.awt.Color(255, 255, 0));
        btnAvanzar.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 12)); // NOI18N
        btnAvanzar.setText("Avanzar");
        btnAvanzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvanzarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(btnSolucionar)
                        .addGap(46, 46, 46)
                        .addComponent(btnAvanzar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(lblNIvel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNivelConteo)
                        .addGap(145, 145, 145)
                        .addComponent(lblPuntaje)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblPuntajeConteo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(pnlPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNIvel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNivelConteo)
                    .addComponent(lblPuntaje)
                    .addComponent(lblPuntajeConteo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAvanzar)
                    .addComponent(btnSolucionar))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Ejecuta acciones de movimiento.
     */
    private void pnlPantallaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pnlPantallaKeyPressed
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_W:
                laberinto.moverJugador(Direccion.ARRIBA);
                break;
            case KeyEvent.VK_S:
                laberinto.moverJugador(Direccion.ABAJO);
                break;
            case KeyEvent.VK_A:
                laberinto.moverJugador(Direccion.IZQUIERDA);
                break;
            case KeyEvent.VK_D:
                laberinto.moverJugador(Direccion.DERECHA);
                break;
        }
        actualizarPantalla(laberinto.getLaberintoCaracteres());
        laberinto.imprimirLaberinto();
        actualizarPuntaje();
        cambiarNivel();
    }//GEN-LAST:event_pnlPantallaKeyPressed

    private void btnSolucionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolucionarActionPerformed
        // TODO add your handling code here:
        //btnSolucionar.transferFocus();
        btnAvanzar.setVisible(true);
        solucionar();
    }//GEN-LAST:event_btnSolucionarActionPerformed

    private void btnAvanzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvanzarActionPerformed
        // TODO add your handling code here:

        Direccion direccion = rutaAlgoritmo.poll();
        System.out.println(direccion);
        laberinto.moverJugador(direccion);
        actualizarPantalla(laberinto.getLaberintoCaracteres());
        cambiarNivel();
    }//GEN-LAST:event_btnAvanzarActionPerformed
    
    /**
     * Crea y asigna las componentes al iniciar un nivel.
     */
    private void cargarPantallaDeNuevoNivel() throws IOException {
        iniciarPantalla();
        actualizarPantalla(laberinto.getLaberintoCaracteres());
    }


    /**
     * Crear un Laberinto y los elementos de la pantalla.
     */
    private void iniciarPantalla() {
        int dimensionCeldas = 5;
        laberinto = new Laberinto(dimensionCeldas);
        int dimensionLaberinto = laberinto.getDimensionLaberinto();
        pnlPantalla.setLayout(new GridLayout(dimensionLaberinto, dimensionLaberinto));
        lbElementos = new JLabel[dimensionLaberinto][dimensionLaberinto];
        ajustarTamañoDeVentana();
        for (int i = 0; i < lbElementos.length; i++) {
            for (int j = 0; j < lbElementos[0].length; j++) {
                lbElementos[i][j] = new JLabel();
                pnlPantalla.add(lbElementos[i][j]);
            }
        }
        laberinto.crearNuevoLaberinto();
    }

    /**
     * Ajusta el tamaño de la ventana.
     */
    private void ajustarTamañoDeVentana() {
        int tamañoHorizontalParaLaVentana = lbElementos[0].length * 50 + 80;
        int tamañoVerticalParaLaVentana = lbElementos.length * 50 + 110;
        setSize(tamañoHorizontalParaLaVentana, tamañoVerticalParaLaVentana);
        setLocationRelativeTo(null);
    }

    /**
     * Quita los elementos de la pantalla.
     */
    private void borrarPantalla() {
        for (JLabel[] lbElemento : lbElementos) {
            for (int j = 0; j < lbElementos[0].length; j++) {
                pnlPantalla.remove(lbElemento[j]);
            }
        }
    }

    /**
     * Quita las imágenes de los elementos.
     */
    private void reiniciarPantalla() {
        for (JLabel[] lbElemento : lbElementos) {
            for (int j = 0; j < lbElementos[0].length; j++) {
                lbElemento[j].setIcon(null);
            }
        }
    }

    /**
     * Asigna las imágenes a los elementos.
     */
    private void actualizarPantalla(char[][] laberintoCaracteres) {
        reiniciarPantalla();
        ImageIcon imagen;
        for (int i = 0; i < lbElementos.length; i++) {
            for (int j = 0; j < lbElementos[0].length; j++) {
                imagen = imagenSuelo;
                switch (laberintoCaracteres[i][j]) {
                    case 'P':
                        imagen = imagenPared;
                        break;
                    case 'M':
                        imagen = imagenMeta;
                        break;
                    case 'J':
                        imagen = imagenJugador;
                        break;
                    case 'C':
                        imagen = imagenCreador;
                        break;
                }
                lbElementos[i][j].setIcon(imagen);
            }
        }
    }

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(VentanaNivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaNivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaNivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaNivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaNivel().setVisible(true);
            }
        });
    }
    
     public void cambiarNivel() {
        if (laberinto.getPosicionJugadorI() == laberinto.getPosicionMetaI() & laberinto.getPosicionJugadorJ() == laberinto.getPosicionMetaJ()) {
            nivel++;
            if (nivel < 3) {
                int respuesta = JOptionPane.showConfirmDialog(this, "¿Deseas continuar con el siguiente nivel?", 
                        "Fin del nivel", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if(respuesta == JOptionPane.NO_OPTION){
                    VentanaMenu ventanaMenu = new VentanaMenu();
                    ventanaMenu.setVisible(true);
                    this.setVisible(false);
                    
                }
                lblNivelConteo.setText(String.valueOf(nivel));
                borrarPantalla();
                iniciarPantalla();
                actualizarPantalla(laberinto.getLaberintoCaracteres());
                btnAvanzar.setVisible(false);

            } else {
                VentanaFinJuego ventanaFinJuego = new VentanaFinJuego();
                ventanaFinJuego.setPuntaje(puntaje);
                ventanaFinJuego.setVisible(true);
                this.setVisible(false);
            }
        }

    }

    public void actualizarPuntaje() {
        puntaje -= 10;
        lblPuntajeConteo.setText(String.valueOf(puntaje));
    }
    

    public void solucionar() {
        rutaAlgoritmo = laberinto.imprimirSolucion();
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvanzar;
    private javax.swing.JButton btnSolucionar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblNIvel;
    private javax.swing.JLabel lblNivelConteo;
    private javax.swing.JLabel lblPuntaje;
    private javax.swing.JLabel lblPuntajeConteo;
    private javax.swing.JPanel pnlPantalla;
    // End of variables declaration//GEN-END:variables
}

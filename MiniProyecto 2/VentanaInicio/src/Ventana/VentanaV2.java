package Ventana;

import java.awt.Color;
import java.awt.Dimension;
import java.util.Timer;
import java.util.TimerTask;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author JHOIMAR
 */
public class VentanaV2 extends javax.swing.JFrame {

    Random ram = new Random();
    String NombreJugador, URL;
    int cantidad, IDimagen;
    VentanaV1 pestaña = new VentanaV1();
    VentanaV1 inicio = new VentanaV1();
    Timer timer = new Timer();
    String imagen;
    int puntos;
    int vidas = 3;
    java.util.List<JButton> boton = new ArrayList<>();
    java.util.List<Integer> listaImagenes = new ArrayList<>();
    java.util.List<JButton> badivinados = new ArrayList<>();
    java.util.List<Integer> elegidos = new ArrayList<>();
    java.util.List<JButton> escogidos = new ArrayList<>();
    String figuraAdivinar;
    int randomfigura;

//public static JButton boton[]= new JButton[9];
    public String ColocarImagen() {
        while(true){
            cantidad = 8;
            IDimagen = ram.nextInt(cantidad)+1;
            imagen = "/Ventana/" + IDimagen + ".png";
            
            if (listaImagenes.indexOf(IDimagen)==-1) {
                listaImagenes.add(IDimagen);
                System.out.println(listaImagenes);
                break;
            }
        }
return imagen;
    }

    public void ControlBotones(java.awt.event.ActionEvent evt) {
        if (evt.getSource() == escogidos.get(0)) {
            System.out.println("true");
            (escogidos.get(0)).setIcon(new javax.swing.ImageIcon(getClass().getResource(figuraAdivinar)));
            puntos += 100;
            jLabel3.setText(String.valueOf(puntos));
            (escogidos.get(0)).setEnabled(false);
        } else {
            System.out.println("false");
            vidas = vidas - 1;
            jLabel4.setText(String.valueOf(vidas));
            if (vidas == 0) {
                JOptionPane.showMessageDialog(null, "Cole perdiste");
                setVisible(false);
                inicio.setVisible(true);

            }
        }
    }

    public String FiguraAdivinar() {
        randomfigura = ram.nextInt(listaImagenes.size());
        figuraAdivinar = "/Ventana/" + listaImagenes.get(randomfigura) + ".png";
        escogidos.add(badivinados.get(randomfigura));
        System.out.println(figuraAdivinar);
        return figuraAdivinar;
    }

    public VentanaV2() {

        System.out.println(NombreJugador);
        initComponents();
        setSize(725, 470);
        setLocationRelativeTo(null);
        setResizable(false);
        setMinimumSize(new Dimension(200, 200));
        this.getContentPane().setBackground(Color.MAGENTA);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //System.out.println(NombreJugador);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        NombreJugador = pestaña.MostrarNombre();
        Nombre = new javax.swing.JLabel(NombreJugador);
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setLayout(null);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventana/reversa.png"))); // NOI18N

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(40, 80, 60, 80);
        boton.add(jButton1);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventana/reversa.png"))); // NOI18N
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(530, 80, 60, 80);
        boton.add(jButton3);

        Nombre.setText(NombreJugador);
        jPanel1.add(Nombre);
        Nombre.setBounds(130, 0, 380, 30);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventana/reversa.png"))); // NOI18N
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setOpaque(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(40, 170, 60, 80);
        boton.add(jButton2);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventana/reversa.png"))); // NOI18N
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setName(""); // NOI18N
        jPanel1.add(jButton4);
        jButton4.setBounds(40, 260, 60, 80);
        boton.add(jButton4);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventana/reversa.png"))); // NOI18N
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(110, 80, 60, 80);
        boton.add(jButton5);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventana/reversa.png"))); // NOI18N
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(110, 170, 60, 80);
        boton.add(jButton6);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventana/reversa.png"))); // NOI18N
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(110, 260, 60, 80);
        boton.add(jButton7);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventana/reversa.png"))); // NOI18N
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);
        jButton8.setBounds(180, 260, 60, 80);
        boton.add(jButton8);

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventana/reversa.png"))); // NOI18N
        jButton9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9);
        jButton9.setBounds(180, 170, 60, 80);
        boton.add(jButton9);

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventana/reversa.png")));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventana/reversa.png"))); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10);
        jButton10.setBounds(610, 340, 60, 80);

        timer.scheduleAtFixedRate(new TimerTask() {
            int i = 5;

            public void run() {

                jLabel2.setText("Time left: " + i);
                i--;

                if (i < 0) {
                    timer.cancel();
                    jLabel2.setText("Time Over");
                    jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventana/reversa.png")));
                    jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventana/reversa.png")));
                    jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventana/reversa.png")));
                    jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventana/reversa.png")));
                    jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventana/reversa.png")));
                    jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventana/reversa.png")));
                    jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventana/reversa.png")));
                    jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventana/reversa.png")));
                    jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventana/reversa.png")));
                    jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventana/reversa.png")));
                    jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventana/reversa.png")));
                    jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventana/reversa.png")));
                    jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventana/reversa.png")));
                    jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventana/reversa.png")));
                    jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventana/reversa.png")));
                    jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventana/reversa.png")));
                    jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventana/reversa.png")));
                    jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventana/reversa.png")));
                    jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventana/reversa.png")));
                    jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventana/reversa.png")));
                    jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventana/reversa.png")));
                    jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventana/reversa.png")));
                    jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventana/reversa.png")));
                    jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventana/reversa.png")));
                    jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource(FiguraAdivinar())));
                }
            }
        }, 0, 1000);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(480, 40, 120, 20);

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventana/reversa.png"))); // NOI18N
        jButton12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12);
        jButton12.setBounds(250, 80, 60, 80);
        boton.add(jButton12);

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventana/reversa.png"))); // NOI18N
        jButton13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton13);
        jButton13.setBounds(250, 170, 60, 80);
        boton.add(jButton13);

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventana/reversa.png"))); // NOI18N
        jButton11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11);
        jButton11.setBounds(180, 80, 60, 80);
        boton.add(jButton11);

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventana/reversa.png"))); // NOI18N
        jButton14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton14);
        jButton14.setBounds(250, 260, 60, 80);
        boton.add(jButton14);

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventana/reversa.png"))); // NOI18N
        jButton15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton15);
        jButton15.setBounds(320, 80, 60, 80);
        boton.add(jButton15);

        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventana/reversa.png"))); // NOI18N
        jButton16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton16);
        jButton16.setBounds(320, 170, 60, 80);
        boton.add(jButton16);

        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventana/reversa.png"))); // NOI18N
        jButton17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton17);
        jButton17.setBounds(320, 260, 60, 80);
        boton.add(jButton17);

        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventana/reversa.png"))); // NOI18N
        jButton18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton18);
        jButton18.setBounds(390, 260, 60, 80);
        boton.add(jButton18);

        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventana/reversa.png"))); // NOI18N
        jButton19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton19);
        jButton19.setBounds(390, 170, 60, 80);
        boton.add(jButton19);

        jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventana/reversa.png"))); // NOI18N
        jButton22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton22);
        jButton22.setBounds(460, 170, 60, 80);
        boton.add(jButton22);

        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventana/reversa.png"))); // NOI18N
        jButton20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton20);
        jButton20.setBounds(390, 80, 60, 80);
        boton.add(jButton20);

        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventana/reversa.png"))); // NOI18N
        jButton21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton21);
        jButton21.setBounds(460, 80, 60, 80);
        boton.add(jButton21);

        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventana/reversa.png"))); // NOI18N
        jButton23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton23);
        jButton23.setBounds(460, 260, 60, 80);
        boton.add(jButton23);

        jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventana/reversa.png"))); // NOI18N
        jButton24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton24);
        jButton24.setBounds(530, 260, 60, 80);
        boton.add(jButton24);

        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventana/reversa.png"))); // NOI18N
        jButton25.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton25);
        jButton25.setBounds(530, 170, 60, 80);
        boton.add(jButton25);

        jLabel3.setText(String.valueOf(puntos));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(190, 40, 80, 20);

        jLabel4.setText(String.valueOf(vidas));
        jPanel1.add(jLabel4);
        jLabel4.setBounds(620, 10, 90, 10);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventana/VentanaJuego (3).png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 700, 420);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 700, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //List<Integer> figurasHallar = Arrays.asList(contador,contador2);
    //int contadorfigura = ram.nextInt(contador,contador2);
    public void MostrarBoton() {
        int nivel = 2;
        for(int i = 0; i<=nivel; i++) {
             int contador = ram.nextInt(24);
            while(true){
                
                 if(elegidos.indexOf(contador)==-1){
             (boton.get(contador)).setIcon(new javax.swing.ImageIcon(getClass().getResource(ColocarImagen())));
             badivinados.add(boton.get(contador));
             elegidos.add(contador);
             break;
              }
           }
        }
    }


    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ControlBotones(evt);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ControlBotones(evt);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ControlBotones(evt);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        ControlBotones(evt);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        ControlBotones(evt);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        ControlBotones(evt);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        ControlBotones(evt);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        ControlBotones(evt);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        ControlBotones(evt);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        ControlBotones(evt);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        ControlBotones(evt);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        ControlBotones(evt);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        ControlBotones(evt);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        ControlBotones(evt);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        ControlBotones(evt);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        ControlBotones(evt);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        ControlBotones(evt);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        ControlBotones(evt);
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        ControlBotones(evt);
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        ControlBotones(evt);
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        ControlBotones(evt);
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        ControlBotones(evt);
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        ControlBotones(evt);
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        ControlBotones(evt);
    }//GEN-LAST:event_jButton25ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaV2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Nombre;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
/*boton.add(new JButton("Hola"));
      boton[1]=jButton2; 
      boton[2]=jButton3;
      boton[3]=jButton4; boton[4]=jButton5; boton[5]=jButton6; 
      boton[6]=jButton7; boton[7]=jButton8; boton[8]=jButton9;*/
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package retofinal;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.JOptionPane;

/**
 *
 * @author dam117
 */
public class LlaveDificil extends javax.swing.JFrame {

    /**
     * Creates new form LlaveMedio
     */
    
    private int acu = 0;
    private int salas = 0;
    private List<Icon> imagenRandom;
    private Random random = new Random();
    
    public LlaveDificil() {
        initComponents();
        actualizarLabel();
    }
    
    private void actualizarLabel() {
        Random random = new Random();
        int num1 = random.nextInt(50) + 1;
        int num2 = random.nextInt(50) + 1;
        int num3 = random.nextInt(50) + 1;
        int num4 = random.nextInt(15) + 1;
        int num5;
        do {
            num5 = random.nextInt(20) + 1;
        } while (num4 % num5 != 0); 

        jLabelDivisor1.setText(num1 + "x^2 +");
        jLabelDivisor2.setText(num2 + "x +");
        jLabelDivisor3.setText(String.valueOf(num3));
        jLabelDividendo1.setText(num4 + "x +");
        jLabelDividendo.setText(String.valueOf(num5));
        
        int[] currentDividendo = new int[]{num3, num2, num1};
            int[] currentDivisor = new int[]{num5, num4};
    }

    private int[] divisionPolinomios(int[] dividend, int[] divisor) {
        int divisorDegree = divisor.length - 1;
        int dividendoDegree = dividend.length - 1;
        int[] quotient = new int[dividendoDegree - divisorDegree + 1];
        int[] remainder = Arrays.copyOf(dividend, dividend.length);

        for (int i = dividendoDegree; i >= divisorDegree; i--) {
            int coeficiente = remainder[i] / divisor[divisorDegree];
            quotient[i - divisorDegree] = coeficiente;
            for (int j = 0; j <= divisorDegree; j++) {
                remainder[i - j] -= coeficiente * divisor[divisorDegree - j];
            }
        }
        return quotient;
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
        jLabelDivisor1 = new javax.swing.JLabel();
        jLabelSigno1 = new javax.swing.JLabel();
        jLabelDivisor2 = new javax.swing.JLabel();
        jLabelsigno2 = new javax.swing.JLabel();
        jLabelDivisor3 = new javax.swing.JLabel();
        jLabelSigno3 = new javax.swing.JLabel();
        jTextFieldResultado1 = new javax.swing.JTextField();
        jLabelDividendo1 = new javax.swing.JLabel();
        jLabelSigno4 = new javax.swing.JLabel();
        jLabelDividendo = new javax.swing.JLabel();
        jButtonInsertarDificil = new javax.swing.JButton();
        jLabelBarrasBajas = new javax.swing.JLabel();
        jLabelFondoLlaveDificil = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelDivisor1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabelDivisor1.setForeground(new java.awt.Color(240, 240, 240));
        jLabelDivisor1.setText("6");
        jPanel1.add(jLabelDivisor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 40, 50));

        jLabelSigno1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabelSigno1.setForeground(new java.awt.Color(240, 240, 240));
        jLabelSigno1.setText("+");
        jPanel1.add(jLabelSigno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 30, 40));

        jLabelDivisor2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabelDivisor2.setForeground(new java.awt.Color(240, 240, 240));
        jLabelDivisor2.setText("3x");
        jPanel1.add(jLabelDivisor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 40, 50));

        jLabelsigno2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabelsigno2.setForeground(new java.awt.Color(240, 240, 240));
        jLabelsigno2.setText("-");
        jPanel1.add(jLabelsigno2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 30, 40));

        jLabelDivisor3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabelDivisor3.setForeground(new java.awt.Color(240, 240, 240));
        jLabelDivisor3.setText("9");
        jPanel1.add(jLabelDivisor3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 30, 50));

        jLabelSigno3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabelSigno3.setForeground(new java.awt.Color(240, 240, 240));
        jLabelSigno3.setText("=");
        jPanel1.add(jLabelSigno3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 30, 50));

        jTextFieldResultado1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jTextFieldResultado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldResultado1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldResultado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 40, 60));

        jLabelDividendo1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabelDividendo1.setForeground(new java.awt.Color(240, 240, 240));
        jLabelDividendo1.setText("5x");
        jPanel1.add(jLabelDividendo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 50, -1));

        jLabelSigno4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabelSigno4.setForeground(new java.awt.Color(240, 240, 240));
        jLabelSigno4.setText("+");
        jPanel1.add(jLabelSigno4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));

        jLabelDividendo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabelDividendo.setForeground(new java.awt.Color(240, 240, 240));
        jLabelDividendo.setText("2");
        jPanel1.add(jLabelDividendo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, -1));

        jButtonInsertarDificil.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonInsertarDificil.setText("Insertar");
        jButtonInsertarDificil.setBorder(null);
        jButtonInsertarDificil.setBorderPainted(false);
        jButtonInsertarDificil.setContentAreaFilled(false);
        jButtonInsertarDificil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertarDificilActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonInsertarDificil, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 160, 160));

        jLabelBarrasBajas.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelBarrasBajas.setForeground(new java.awt.Color(240, 240, 240));
        jLabelBarrasBajas.setText("___________________");
        jPanel1.add(jLabelBarrasBajas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 190, -1));

        jLabelFondoLlaveDificil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LlaveNivelDificil7.png"))); // NOI18N
        jPanel1.add(jLabelFondoLlaveDificil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonInsertarDificilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertarDificilActionPerformed
        try {
            int[] dividendo = {Integer.parseInt(jLabelDivisor3.getText()), 
                              Integer.parseInt(jLabelDivisor2.getText().split("x")[0]),
                              Integer.parseInt(jLabelDivisor1.getText().split("x")[0])};
            int[] divisor = {Integer.parseInt(jLabelDividendo.getText()), 
                             Integer.parseInt(jLabelDividendo1.getText().split("x")[0])};

            int[] quotient = divisionPolinomios(dividendo, divisor);

            int respuestaUsuario = Integer.parseInt(jTextFieldResultado1.getText());
            int respuestaCorrecta = quotient[0];  // Solo consideramos el término líder del cociente

            if (respuestaUsuario == respuestaCorrecta) {
                JOptionPane.showMessageDialog(this, "Respuesta correcta");
                actualizarLabel();
                salas+=1;
                setVisible(false);
                new PuertaDificil().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Respuesta Incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
                acu++;
                if (acu == 3) {
                    setVisible(false);
                    new FinPartida().setVisible(true);
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor ingresa solo números válidos.", "Error de Formato", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonInsertarDificilActionPerformed

    private void jTextFieldResultado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldResultado1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldResultado1ActionPerformed

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
            java.util.logging.Logger.getLogger(LlaveDificil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LlaveDificil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LlaveDificil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LlaveDificil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LlaveDificil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonInsertarDificil;
    private javax.swing.JLabel jLabelBarrasBajas;
    private javax.swing.JLabel jLabelDividendo;
    private javax.swing.JLabel jLabelDividendo1;
    private javax.swing.JLabel jLabelDivisor1;
    private javax.swing.JLabel jLabelDivisor2;
    private javax.swing.JLabel jLabelDivisor3;
    private javax.swing.JLabel jLabelFondoLlaveDificil;
    private javax.swing.JLabel jLabelSigno1;
    private javax.swing.JLabel jLabelSigno3;
    private javax.swing.JLabel jLabelSigno4;
    private javax.swing.JLabel jLabelsigno2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldResultado1;
    // End of variables declaration//GEN-END:variables
}

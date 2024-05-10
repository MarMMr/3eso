/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package retofinal;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author dam126
 */
public class PuertaMedio extends javax.swing.JFrame {

    /**
     * Creates new form Preguntas
     */
    private PreguntasMedio p = new PreguntasMedio();
    //Datos primera pregunta
    private String numero1 = "√" + p.getNum1();
    private String numero2 = "√" + p.getNum2();
    private String numero3 = "√" + p.getNum3();
    private String numero4 = "√" + p.getNum4();
    
    //Datos segunda pregunta1w2
    private String numero5 = "√" + p.getNum5();
    private String numero6 = "√" + p.getNum6();
    
    //Datos tercera pregunta
    private String numero7 = "√" + p.getNum7();
    private String numero8 = "√" + p.getNum8();
    
    private int acu = 0;

    public PuertaMedio() {
        initComponents();
        iniciarLabel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonAceptarPreguntas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldRespuestaRaizSola2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldRespuestaMulti = new javax.swing.JTextField();
        signo2 = new javax.swing.JLabel();
        igual6 = new javax.swing.JLabel();
        jTextFieldRespuestaSuma = new javax.swing.JTextField();
        signo1 = new javax.swing.JLabel();
        igual5 = new javax.swing.JLabel();
        jLabelPrimeraRaizSuma = new javax.swing.JLabel();
        jLabelSegundaRaizSuma = new javax.swing.JLabel();
        jLabelPrimeraRaizMulti = new javax.swing.JLabel();
        jLabelSegundaRaizMulti = new javax.swing.JLabel();
        jLabelRaizSola1 = new javax.swing.JLabel();
        igual1 = new javax.swing.JLabel();
        jTextFieldRespuestaRaizSola1 = new javax.swing.JTextField();
        jLabelRaizSola2 = new javax.swing.JLabel();
        igual3 = new javax.swing.JLabel();
        jTextFieldRespuestaRaizSola3 = new javax.swing.JTextField();
        jLabelRaizSola3 = new javax.swing.JLabel();
        igual4 = new javax.swing.JLabel();
        jTextFieldRespuestaRaizSola4 = new javax.swing.JTextField();
        jLabelRaizSola4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CalculESO - Facil");
        setBackground(new java.awt.Color(204, 255, 204));

        jButtonAceptarPreguntas.setText("Aceptar");
        jButtonAceptarPreguntas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarPreguntasActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Operaciones:");

        jTextFieldRespuestaRaizSola2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldRespuestaRaizSola2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRespuestaRaizSola2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setText("=");

        jTextFieldRespuestaMulti.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldRespuestaMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRespuestaMultiActionPerformed(evt);
            }
        });

        signo2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        signo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signo2.setText("*");

        igual6.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        igual6.setText("=");

        jTextFieldRespuestaSuma.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldRespuestaSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRespuestaSumaActionPerformed(evt);
            }
        });

        signo1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        signo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signo1.setText("+");

        igual5.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        igual5.setText("=");

        jLabelPrimeraRaizSuma.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabelSegundaRaizSuma.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabelPrimeraRaizMulti.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabelSegundaRaizMulti.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabelRaizSola1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        igual1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        igual1.setText("=");

        jTextFieldRespuestaRaizSola1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldRespuestaRaizSola1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRespuestaRaizSola1ActionPerformed(evt);
            }
        });

        jLabelRaizSola2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        igual3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        igual3.setText("=");

        jTextFieldRespuestaRaizSola3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldRespuestaRaizSola3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRespuestaRaizSola3ActionPerformed(evt);
            }
        });

        jLabelRaizSola3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        igual4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        igual4.setText("=");

        jTextFieldRespuestaRaizSola4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldRespuestaRaizSola4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRespuestaRaizSola4ActionPerformed(evt);
            }
        });

        jLabelRaizSola4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(jTextFieldRespuestaRaizSola1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelRaizSola1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(igual1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(150, 150, 150)
                        .addComponent(jLabelRaizSola2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldRespuestaRaizSola2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelPrimeraRaizMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(signo2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabelSegundaRaizMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(igual6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jTextFieldRespuestaMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jLabelRaizSola4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(igual4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelPrimeraRaizSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(signo1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabelSegundaRaizSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(igual5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldRespuestaSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(50, 50, 50)
                                        .addComponent(jLabelRaizSola3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(igual3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldRespuestaRaizSola3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldRespuestaRaizSola4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(jButtonAceptarPreguntas)
                .addGap(175, 175, 175))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldRespuestaRaizSola2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelRaizSola2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(igual1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldRespuestaRaizSola1, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabelRaizSola1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(signo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelPrimeraRaizSuma, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelSegundaRaizSuma, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(igual3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelRaizSola3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldRespuestaRaizSola3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jTextFieldRespuestaSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPrimeraRaizMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(signo2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabelSegundaRaizMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(igual5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(igual6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(igual4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelRaizSola4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldRespuestaMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldRespuestaRaizSola4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)))))
                .addGap(40, 40, 40)
                .addComponent(jButtonAceptarPreguntas)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iniciarLabel() {
        jLabelRaizSola1.setText(numero1);
        jLabelRaizSola2.setText(numero2);
        jLabelRaizSola3.setText(numero3);
        jLabelRaizSola4.setText(numero4);

        jLabelPrimeraRaizSuma.setText(numero5);
        jLabelSegundaRaizSuma.setText(numero6);

        jLabelPrimeraRaizMulti.setText(numero7);
        jLabelSegundaRaizMulti.setText(numero8);
        

    }

    private void jButtonAceptarPreguntasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarPreguntasActionPerformed
        String result1Usu = jTextFieldRespuestaRaizSola1.getText();
        String result2Usu = jTextFieldRespuestaRaizSola2.getText();
        String result3Usu = jTextFieldRespuestaRaizSola3.getText();
        String result4Usu = jTextFieldRespuestaRaizSola4.getText();
        String result5Usu = jTextFieldRespuestaSuma.getText();
        String result6Usu = jTextFieldRespuestaMulti.getText();

        //para obtener el result1Usu aleatorio
        String label1 = jLabelRaizSola1.getText();
        String label2 = jLabelRaizSola2.getText();
        String label3 = jLabelRaizSola3.getText();
        String label4 = jLabelRaizSola4.getText();
        
        String label5 = jLabelPrimeraRaizSuma.getText();
        String label6 = jLabelSegundaRaizSuma.getText();

        String label7 = jLabelPrimeraRaizMulti.getText();
        String label8 = jLabelSegundaRaizMulti.getText();

        //string a entero
        // Raices solas
        int p1 = Integer.parseInt(quitarSimboloRaiz(label1));
        int p2 = Integer.parseInt(quitarSimboloRaiz(label2));
        int p3 = Integer.parseInt(quitarSimboloRaiz(label3));
        int p4 = Integer.parseInt(quitarSimboloRaiz(label4));
        // Raices suma
        int p5 = Integer.parseInt(quitarSimboloRaiz(label5));
        int p6 = Integer.parseInt(quitarSimboloRaiz(label6));
        // Raices multiplicacion
        int p7 = Integer.parseInt(quitarSimboloRaiz(label7));
        int p8 = Integer.parseInt(quitarSimboloRaiz(label8));

        //obtener respuesta1Usuario
        // respuestas raices solas
        int respuesta1Usuario = Integer.parseInt(result1Usu);
        int respuesta2Usuario = Integer.parseInt(result2Usu);
        int respuesta3Usuario = Integer.parseInt(result3Usu);
        int respuesta4Usuario = Integer.parseInt(result1Usu);
        // Respuestas operaciones
        int respuesta5Usuario = Integer.parseInt(result2Usu);
        int respuesta6Usuario = Integer.parseInt(result3Usu);

        //Calcular las respuestas correctas
        int respCorrecta1 = (int) Math.sqrt(p1);
        int respCorrecta2 = (int) Math.sqrt(p2);
        int respCorrecta3 = (int) Math.sqrt(p3);
        int respCorrecta4 = (int) Math.sqrt(p4);
        int respCorrecta5 = (int) Math.sqrt(p5) + (int) Math.sqrt(p6);
        int respCorrecta6 = (int) Math.sqrt(p7) * (int) Math.sqrt(p8);

        if (respuesta1Usuario == respCorrecta1 && respuesta2Usuario == 
                respCorrecta2 && respuesta3Usuario == respCorrecta3 && 
                respuesta4Usuario == respCorrecta4 && respuesta5Usuario == 
                respCorrecta5 && respuesta6Usuario == respCorrecta6) {
            JOptionPane.showMessageDialog(this, "respuesta correcta");
            actualizarLabel();
        } else {
            JOptionPane.showMessageDialog(this, "Respuesta "
                    + "Incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
            acu++;
            if (acu == 3) {
                actualizarLabel();
                acu = 0;
                
            }
            
        }
        
    }//GEN-LAST:event_jButtonAceptarPreguntasActionPerformed

    private void actualizarLabel() {
        Random r1 = new Random();
        
        //primera raiz
        int num1 = generaRaiz(50, r1.nextInt(250) + 1);
        int num2 = generaRaiz(30, r1.nextInt(230) + 1);
        int num3 = generaRaiz(40, r1.nextInt(240) + 1);
        int num4 = generaRaiz(20, r1.nextInt(210) + 1);
        String label1 = "√" + num1;
        String label2 = "√" + num2;
        String label3 = "√" + num2;
        String label4 = "√" + num4;
        
        int num5 = generaRaiz(45, r1.nextInt(220) + 1);
        int num6 = generaRaiz(40, r1.nextInt(215) + 1);
        String label5 = "√" + num5;
        String label6 = "√" + num6;
        
        int num7 = generaRaiz(36, r1.nextInt(100) + 1);
        int num8 = generaRaiz(25, r1.nextInt(140) + 1);
        String label7 = "√" + num7;
        String label8 = "√" + num8;
        
        //coversion de los label
        //primera raiz sola
        jLabelRaizSola1.setText(label1);
        //segunda raiz sola
        jLabelRaizSola2.setText(label2);
        //tercera raiz sola
        jLabelRaizSola3.setText(label3);
        //cuarta raiz sola
        jLabelRaizSola4.setText(label4);
        
        // suma
        jLabelPrimeraRaizSuma.setText(label5);
        jLabelSegundaRaizSuma.setText(label6);
        
        // multiplicacion
        jLabelPrimeraRaizMulti.setText(label7);
        jLabelSegundaRaizMulti.setText(label8);
        
    }
    
    public static String quitarSimboloRaiz(String s) {
        if (s.startsWith("√")) {
            return s.substring(1);
        } else {
            return s;
        }
        
    }
    
    private static int generaRaiz(int min, int max) {
        Random rand = new Random();
        int numRand;
        int raizExacta = 0;

        do {
            numRand = rand.nextInt(max - min + 1) + min;
            if (esRaizExacta(numRand)) {
                            raizExacta = numRand;
            }
        } while (raizExacta == 0);

        return raizExacta;
            
    }

    private static boolean esRaizExacta(int n) {
        int sqrt = (int) Math.sqrt(n);
        return sqrt * sqrt == n;
    }

    private void jTextFieldRespuestaRaizSola2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRespuestaRaizSola2ActionPerformed


    }//GEN-LAST:event_jTextFieldRespuestaRaizSola2ActionPerformed

    private void jTextFieldRespuestaMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRespuestaMultiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRespuestaMultiActionPerformed

    private void jTextFieldRespuestaSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRespuestaSumaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRespuestaSumaActionPerformed

    private void jTextFieldRespuestaRaizSola1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRespuestaRaizSola1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRespuestaRaizSola1ActionPerformed

    private void jTextFieldRespuestaRaizSola3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRespuestaRaizSola3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRespuestaRaizSola3ActionPerformed

    private void jTextFieldRespuestaRaizSola4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRespuestaRaizSola4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRespuestaRaizSola4ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel igual1;
    private javax.swing.JLabel igual3;
    private javax.swing.JLabel igual4;
    private javax.swing.JLabel igual5;
    private javax.swing.JLabel igual6;
    private javax.swing.JButton jButtonAceptarPreguntas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelPrimeraRaizMulti;
    private javax.swing.JLabel jLabelPrimeraRaizSuma;
    private javax.swing.JLabel jLabelRaizSola1;
    private javax.swing.JLabel jLabelRaizSola2;
    private javax.swing.JLabel jLabelRaizSola3;
    private javax.swing.JLabel jLabelRaizSola4;
    private javax.swing.JLabel jLabelSegundaRaizMulti;
    private javax.swing.JLabel jLabelSegundaRaizSuma;
    private javax.swing.JTextField jTextFieldRespuestaMulti;
    private javax.swing.JTextField jTextFieldRespuestaRaizSola1;
    private javax.swing.JTextField jTextFieldRespuestaRaizSola2;
    private javax.swing.JTextField jTextFieldRespuestaRaizSola3;
    private javax.swing.JTextField jTextFieldRespuestaRaizSola4;
    private javax.swing.JTextField jTextFieldRespuestaSuma;
    private javax.swing.JLabel signo1;
    private javax.swing.JLabel signo2;
    // End of variables declaration//GEN-END:variables
}
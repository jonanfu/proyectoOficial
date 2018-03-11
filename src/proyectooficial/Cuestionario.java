/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectooficial;

import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan
 */
public class Cuestionario extends javax.swing.JPanel {

    /**
     * Creates new form Cuestionario
     */
    private int correctas = 0;
    private int incorrectas = 0;
    private int posicion = 0;
    //private int[] numerosAleatorios = new int[10];
    //private int limite = 4;
    private int aleatorio = 0;
    private Preguntas preguntas = new Preguntas();
    public Cuestionario() {
        initComponents();
//         numerosAleatorios[0] = (int) (Math.random() * limite) + 1;
//        for(int i = 1; i < 10; i++){
//            numerosAleatorios[i] = (int) (Math.random() * limite) + 1; 
//            for (int j = 0;j < i; j++){
//                if(numerosAleatorios[i] == numerosAleatorios[j]){
//                    numerosAleatorios[i] = (int) (Math.random() * limite) + 1;
//                    j = -1;
//                }
//            }
//         }
        aleatorio = (int) ((Math.random()*4) + 1);
        jPanel1.setComponentZOrder(opc3, 1);
        //System.out.println(jPanel1.setComponentZOrder(opc3,3));
        numeroPregunta.setText("Pregunta N°" + (posicion+1));
        tituloPregunta.setText(preguntas.pregunta(posicion));
        opc1.setText(preguntas.opcion1(posicion));
        opc2.setText(preguntas.opcion2(posicion));
        opc3.setText(preguntas.opcion3(posicion));
        opc4.setText(preguntas.opcion4(posicion));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        numeroPregunta = new javax.swing.JLabel();
        tituloPregunta = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        atras = new javax.swing.JButton();
        siguiente = new javax.swing.JButton();
        terminarExamen = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        opc1 = new javax.swing.JRadioButton();
        opc2 = new javax.swing.JRadioButton();
        opc3 = new javax.swing.JRadioButton();
        opc4 = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(74, 129, 155));
        setBorder(javax.swing.BorderFactory.createTitledBorder("Cuestionario"));

        numeroPregunta.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        numeroPregunta.setText("Pregunta");

        tituloPregunta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tituloPregunta.setText("¿Pregunta 1?");

        jButton1.setText("Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        atras.setText("Atras");
        atras.setEnabled(false);
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });

        siguiente.setText("Siguiente");
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });

        terminarExamen.setText("Terminar examenn");
        terminarExamen.setEnabled(false);
        terminarExamen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terminarExamenActionPerformed(evt);
            }
        });

        opc1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(opc1);
        opc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc1ActionPerformed(evt);
            }
        });

        opc2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(opc2);
        opc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc2ActionPerformed(evt);
            }
        });

        opc3.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(opc3);
        opc3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc3ActionPerformed(evt);
            }
        });

        opc4.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(opc4);
        opc4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(opc4)
                    .addComponent(opc3)
                    .addComponent(opc2)
                    .addComponent(opc1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(opc1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(opc2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(opc3)
                .addGap(33, 33, 33)
                .addComponent(opc4)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(278, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(atras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(siguiente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(terminarExamen)
                .addGap(51, 51, 51))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tituloPregunta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(numeroPregunta)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(34, 34, 34))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(numeroPregunta)
                .addGap(18, 18, 18)
                .addComponent(tituloPregunta)
                .addGap(9, 9, 9)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(atras)
                    .addComponent(siguiente)
                    .addComponent(terminarExamen)
                    .addComponent(jButton1))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       Inicio.jPanel2.setVisible(true);
       Inicio.jPanel1.setVisible(true);
       setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
         if(posicion == 0){
            atras.setEnabled(false);
        }
        
        if(posicion > 0){
            posicion--;
            siguiente.setEnabled(true);
            // sirve para borrar las selecciones de los radio button
            numeroPregunta.setText("Pregunta N°" + (posicion+1));
            tituloPregunta.setText(preguntas.pregunta(posicion));
        opc1.setText(preguntas.opcion1(posicion));
        opc2.setText(preguntas.opcion2(posicion));
        opc3.setText(preguntas.opcion3(posicion));
        opc4.setText(preguntas.opcion4(posicion));
        }else{
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_atrasActionPerformed

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
        // TODO add your handling code here:
         if(posicion == 3){
            siguiente.setEnabled(false);
            terminarExamen.setEnabled(true);
        }
        
        if(posicion < 5){
            atras.setEnabled(true);
            posicion++;
            buttonGroup1.clearSelection(); // sirve para borrar las selecciones de los radio button
            numeroPregunta.setText("Pregunta N°" + (posicion+1));
           tituloPregunta.setText(preguntas.pregunta(posicion));
        opc1.setText(preguntas.opcion1(posicion));
        opc2.setText(preguntas.opcion2(posicion));
        opc3.setText(preguntas.opcion3(posicion));
        opc4.setText(preguntas.opcion4(posicion));
        }
        if(posicion == 4){
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_siguienteActionPerformed

    private void opc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc1ActionPerformed
        correctas++;
    }//GEN-LAST:event_opc1ActionPerformed

    private void opc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc2ActionPerformed
        incorrectas--;
    }//GEN-LAST:event_opc2ActionPerformed

    private void opc3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc3ActionPerformed
       incorrectas--;
    }//GEN-LAST:event_opc3ActionPerformed

    private void opc4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc4ActionPerformed
        incorrectas--;
    }//GEN-LAST:event_opc4ActionPerformed

    private void terminarExamenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terminarExamenActionPerformed
        JOptionPane.showMessageDialog(null,"Las respuestas correctas Son: " + correctas + "\n Las respuestas incorrectas son: " + incorrectas);
                
    }//GEN-LAST:event_terminarExamenActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atras;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel numeroPregunta;
    private javax.swing.JRadioButton opc1;
    private javax.swing.JRadioButton opc2;
    private javax.swing.JRadioButton opc3;
    private javax.swing.JRadioButton opc4;
    private javax.swing.JButton siguiente;
    private javax.swing.JButton terminarExamen;
    private javax.swing.JLabel tituloPregunta;
    // End of variables declaration//GEN-END:variables
}

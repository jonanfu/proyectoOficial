package proyectooficial;

/*import static hm20master.d;*/
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;




/**
 *
 * @author Jonathan
 */
public class Reproductor extends javax.swing.JPanel {

    /**
     * Creates new form Reproductor
     */
    private Image image;
    private boolean cambia = false;
    private boolean cambiaVolumen = false;
    private int volumen = 0;
    //private v = "C:\\Users\\Jonathan\\Documents\\NetBeansProjects\\proyectoOficial\\src\\Videos\\vida republicana del Ecuador..wmv ( 480 X 640 ).mp4"
    
    Video video = new Video("C:\\Users\\Jonathan\\Documents\\NetBeansProjects\\proyectoOficial\\src\\Videos\\7  El Nacimiento de la República ( 480 X 854 ).mp4");
    
    
    
    public Reproductor() {
        
         initComponents();
        
        pantalla.setLayout(new BorderLayout());
        pantalla.add(video, BorderLayout.CENTER);
        
        
       
       //jTextPane1.setText("Hola");
       System.out.println(video.getWidth());
    }
    
    public void ImagePanel(Image image){
        this.image = image;
        Dimension dimension = new Dimension(image.getWidth(null),image.getHeight(null));
        this.setPreferredSize(dimension);
        this.setMaximumSize(dimension);
        // si falla poenr la linea de maximunsize
        this.setSize(dimension);
        this.setLayout(null);
        
    }
    
   

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        playPausa = new javax.swing.JLabel();
        pantalla = new javax.swing.JPanel();
        silenciar = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(61, 88, 163));
        setToolTipText("");
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(710, 560));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        playPausa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/boton-de-reproduccion2.png"))); // NOI18N
        playPausa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        playPausa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playPausaMouseClicked(evt);
            }
        });
        add(playPausa, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, -1, -1));
        playPausa.getAccessibleContext().setAccessibleName("playPause");

        pantalla.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout pantallaLayout = new javax.swing.GroupLayout(pantalla);
        pantalla.setLayout(pantallaLayout);
        pantallaLayout.setHorizontalGroup(
            pantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        pantallaLayout.setVerticalGroup(
            pantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );

        add(pantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 640, 340));

        silenciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/volumen2.png"))); // NOI18N
        silenciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        silenciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                silenciarMouseClicked(evt);
            }
        });
        add(silenciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7  El Nacimiento de la República", "vida republicana del Ecuador", "Item 4" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 240, 30));

        jButton1.setText("Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondoReproductor.jpg"))); // NOI18N
        jLabel1.setToolTipText("");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 600));
    }// </editor-fold>//GEN-END:initComponents

    private void playPausaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playPausaMouseClicked
        // TODO add your handling code here:
               
        if(cambia == true)
        {
            //File file = new File("C:\\Users\\Jonathan\\Videos\\6 Cuentos para REFLEXIONAR ( 360 X 640 ).mp4");
                
                playPausa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/pausa2.png")));
                video.pausa();
                cambia = false;  
        } 
        else 
        {
            playPausa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/boton-de-reproduccion2.png")));
            video.play();
            cambia = true;
            
        }
    }//GEN-LAST:event_playPausaMouseClicked

    private void silenciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_silenciarMouseClicked
        if(cambiaVolumen == true)
        {
            silenciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/silenciar.png")));
            cambiaVolumen = false;
            video.sonido();
       
        } 
        else 
        {
            silenciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/volumen.png")));
            cambiaVolumen = true;
            video.silencio();
        }
    }//GEN-LAST:event_silenciarMouseClicked

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        if(jComboBox1.getSelectedIndex()== 1 ){
            video.setVideo("C:\\Users\\Jonathan\\Documents\\NetBeansProjects\\proyectoOficial\\src\\Videos\\7  El Nacimiento de la República ( 480 X 854 ).mp4");
        }
        if(jComboBox1.getSelectedIndex()== 2 ){
            video.setVideo("C:\\Users\\Jonathan\\Documents\\NetBeansProjects\\proyectoOficial\\src\\Videos\\vida republicana del Ecuador..wmv ( 480 X 640 ).mp4");
        }
        if(jComboBox1.getSelectedIndex()== 3 ){
            video.setVideo("C:\\Users\\Jonathan\\Documents\\NetBeansProjects\\proyectoOficial\\src\\Videos\\7  El Nacimiento de la República ( 480 X 854 ).mp4");
        }
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       setVisible(false);
       Inicio.jPanel2.setVisible(true);
       Inicio.jPanel1.setVisible(true);
       

        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel pantalla;
    private javax.swing.JLabel playPausa;
    private javax.swing.JLabel silenciar;
    // End of variables declaration//GEN-END:variables

   
}

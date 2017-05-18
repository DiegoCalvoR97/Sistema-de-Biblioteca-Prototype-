package Package;

import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author Diego Calvo R
 */
public class Ventana extends JFrame {

    /**
     * Creates new form Ventana
     */
    public static Ventana V = new Ventana();
    public Thread movieLoop;
    public static Image icon;
    public AudioClip sound;
    Date date = new Date();
    Node PTR1, PTR2, PTR3;
    private int pordondeva = 1005;
    Dimension dpanel = new Dimension(400,300);
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat hourFormat = new SimpleDateFormat("HH:mm aa");
    String fecha = dateFormat.format(date);
    String hora = hourFormat.format(date);
    static long startTime;
    static long currentTime = 0;
    
    
    
    
    public Ventana() {
        initComponents();
        icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/sources/bookicon.png"));
        setLocationRelativeTo(null);
        setIconImage(icon);
        setResizable(false); 
        startTime = System.currentTimeMillis();
        currentTime=0;
        this.Afiliarb.setVisible(false);
        this.Prestarb.setVisible(false);
        this.Recibirb.setVisible(false);
        this.Verificarb.setVisible(false);
        this.ejemplarNewb.setVisible(false);        
        this.Iniciob.setAlignmentX(163);
        this.Iniciob.setAlignmentY(126);
    }
    

     
    
    public void setDate(String _fecha){
        _fecha= dateFormat.format(date);
        jLabel2.setText(fecha);
    }
    
    public String getDate(String _fecha){
        return _fecha;
    }

    public void setHour(String _hora){
        _hora= hourFormat.format(date);
        jLabel3.setText(_hora);        
    }
    
    public String getHour(String _hora){
        return _hora;
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Iniciob = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Afiliarb = new javax.swing.JButton();
        ejemplarNewb = new javax.swing.JButton();
        Prestarb = new javax.swing.JButton();
        Recibirb = new javax.swing.JButton();
        Verificarb = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BIBLIO-SYSTEM");
        setBackground(new java.awt.Color(0, 204, 204));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Iniciob.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sources/bUTTON.png"))); // NOI18N
        Iniciob.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Iniciob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciobActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jLabel1.setText("BIENVENIDO");

        jLabel2.setFont(new java.awt.Font("Myanmar Text", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Myanmar Text", 0, 18)); // NOI18N

        Afiliarb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sources/handsicon.png"))); // NOI18N
        Afiliarb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Afiliarb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AfiliarbActionPerformed(evt);
            }
        });

        ejemplarNewb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sources/AGREGAR BOOK.jpg"))); // NOI18N
        ejemplarNewb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ejemplarNewb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ejemplarNewbActionPerformed(evt);
            }
        });

        Prestarb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sources/pretarBOOK.png"))); // NOI18N
        Prestarb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Prestarb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrestarbActionPerformed(evt);
            }
        });

        Recibirb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sources/recibir libro.png"))); // NOI18N
        Recibirb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Verificarb.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        Verificarb.setText("VERIFICAR FECHAS DE ENTREGA");
        Verificarb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel4.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel4.setText("BIBLIOTECA DEPARTAMENTAL");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Afiliarb, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Prestarb, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(Iniciob, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Recibirb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ejemplarNewb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))))
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(Verificarb)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(Afiliarb)
                        .addGap(18, 18, 18)
                        .addComponent(Prestarb)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 19, Short.MAX_VALUE)
                                .addComponent(ejemplarNewb)
                                .addGap(18, 18, 18)
                                .addComponent(Recibirb)
                                .addGap(66, 66, 66))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Iniciob)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Verificarb)
                                .addContainerGap())))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IniciobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciobActionPerformed
        
        try {
            listCreator.multilistAL(PTR1);
            listCreator.multilistAE(PTR2);
            listCreator.doublelistE(PTR3);
        } catch (ParseException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.Iniciob.setVisible(false);
        this.jLabel1.setVisible(false);
        this.Afiliarb.setVisible(true);
        this.Prestarb.setVisible(true);
        this.Recibirb.setVisible(true);
        this.Verificarb.setVisible(true);
        this.ejemplarNewb.setVisible(true);        
    }//GEN-LAST:event_IniciobActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        currentTime=System.currentTimeMillis()-startTime;
        
            startTime=System.currentTimeMillis();
            fecha = dateFormat.format(date);
            hora = hourFormat.format(date);
            getDate(fecha);
            getHour(hora);
            setDate(fecha);
            setHour(hora);
        
        
    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
    }//GEN-LAST:event_formWindowActivated

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
            fecha = dateFormat.format(date);
            hora = hourFormat.format(date);
            getDate(fecha);
            getHour(hora);
            setDate(fecha);
            setHour(hora);
    }//GEN-LAST:event_formMouseReleased

    private void AfiliarbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AfiliarbActionPerformed
        
        pordondeva = Afiliar.pordonde();
        Afiliar A = new Afiliar(pordondeva,PTR2);
        A.setVisible(true);
        V.setEnabled(false);
        
                
    }//GEN-LAST:event_AfiliarbActionPerformed

    private void PrestarbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrestarbActionPerformed
        
        prestarBook P = new prestarBook(PTR2,PTR3);
        P.setVisible(true);
        V.setEnabled(false);
        
    }//GEN-LAST:event_PrestarbActionPerformed

    private void ejemplarNewbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ejemplarNewbActionPerformed
        
        
        
    }//GEN-LAST:event_ejemplarNewbActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                
                V.setVisible(true);      
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Afiliarb;
    private javax.swing.JButton Iniciob;
    private javax.swing.JButton Prestarb;
    private javax.swing.JButton Recibirb;
    private javax.swing.JButton Verificarb;
    private javax.swing.JButton ejemplarNewb;
    private javax.swing.JLabel jLabel1;
    private static javax.swing.JLabel jLabel2;
    private static javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}

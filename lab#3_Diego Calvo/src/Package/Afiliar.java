package Package;

import javax.swing.JFrame;

/**
 *
 * @author Diego Calvo R
 */
public class Afiliar extends JFrame {

    static int pordondeva= 1005;
    Node PTR;
    
    public Afiliar(int _pordondeva, Node _PTR) {
        initComponents();
        setLocationRelativeTo(null);
        pordondeva = _pordondeva;
        PTR = _PTR;
    }
    
    public void search(int _pordondeva, Node _PTR){
        
        Node q,n = null;
        Node antp= _PTR, p = _PTR;        
        String namep = nameTextF.getText(), codi;
        
        codi = Integer.toString(_pordondeva);
        
        try{
            while(p != null){
                antp = p;
                p = p.getLink3();
                if(p == null){
                    q = new Node(namep, _pordondeva, 0, n, n);
                    antp.setLink3(q);
                }
            }        
            
        }catch(Exception ex){
            System.out.println("y volo... y yo vole... y vole hasta la arbolada");
        }
        
        
        codLabel.setText("EL CODIGO DEL REGISTRADO ES:   "+codi);
        
        
    }
    
    public static int pordonde(){
        
        return pordondeva;
        
    }
    
 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameTextF = new javax.swing.JTextField();
        signB = new javax.swing.JButton();
        backB = new javax.swing.JButton();
        codLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));
        setUndecorated(true);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jLabel1.setText("Afiliar Usuario");

        jLabel2.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        jLabel2.setText("DIGITE EL NOMBRE DE LA PERSONA A REGISTRAR:");

        signB.setText("SIGN IN");
        signB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signBActionPerformed(evt);
            }
        });

        backB.setText("BACK");
        backB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBActionPerformed(evt);
            }
        });

        codLabel.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        codLabel.setText("EL CODIGO DEL REGISTRADO ES:   ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nameTextF)
                                    .addComponent(codLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE))))
                        .addContainerGap(16, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(129, 129, 129))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backB)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(signB)
                .addGap(161, 161, 161))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(nameTextF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(signB, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(codLabel)
                .addGap(37, 37, 37)
                .addComponent(backB)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBActionPerformed
        
        Ventana.V.setEnabled(true);
        this.dispose();
        
    }//GEN-LAST:event_backBActionPerformed

    private void signBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signBActionPerformed
        
        search(pordondeva,PTR);
        pordondeva += 1;
    }//GEN-LAST:event_signBActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backB;
    private javax.swing.JLabel codLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField nameTextF;
    private javax.swing.JButton signB;
    // End of variables declaration//GEN-END:variables
}

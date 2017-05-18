package Package;

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
public class prestarBook extends JFrame {

    Node PTR2, PTR3;
    Node p,c,n = null;
    Node q,nuevo;
    Node antp = p;
    Node antq = q;
    int codp, permiso = 0, diahoy;
    String codb, diaString, mesString,fechaString;
    boolean sw;
    Date dia,mes, fecha;
    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat Dia = new SimpleDateFormat("dd");
    SimpleDateFormat Mes = new SimpleDateFormat("MM");
    String[] dias = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
    
    public prestarBook(Node _PTR2, Node _PTR3) {
        initComponents();
        PTR2 = _PTR2;
        PTR3 = _PTR3;
        p = PTR2;
        q = PTR3;
        setLocationRelativeTo(null);
        
    }
    
    public void prestar() throws ParseException{
        
        codb = codTextF.getText();
        try{
            codp = Integer.parseInt(personaTextF.getText());
            permiso+=1;
        }catch (NumberFormatException ex){
            sepudoLabel.setText("Digite Numeros Por Favor! ");
        }
        if(permiso == 1){
            while(p != null || permiso == 1){
                if(p.getCodp() == codp ){
                    permiso+=1;
                }else{
                    sepudoLabel.setText("Este Afiliado NO esta en el Sistema ");
                }
                antp = p;
                p = p.getLink3();
            }
            if(permiso==2){
                
                while(q != null || permiso == 2){
                    
                    if(codb.equals(q.getCodb())){
                        
                        permiso+=1;
                        if(q.isPrst() == true){
                            sepudoLabel.setText("YA esta Prestado");
                        }else {
                            q.setPrst(true);  
                            c = antp.getLink4();
                            if(c == null){
                                
                                diaString = Dia.format(dia);
                                mesString = Mes.format(mes);
                                diahoy = Integer.valueOf(diaString);
                                diahoy+=3;
                                if(diahoy>31){
                                    diahoy-=31;
                                }
                                diaString = dias[diahoy];
                                fechaString = diaString+ "/" + mesString + "/" + "2017";
                                fecha = format.parse(fechaString);
                                c = new Node(q.getNameb(),q.getNamea(),q.getCodb(),fecha,n);  
                                sepudoLabel.setText("Entregue el Libro al Afiliado");
                                        
                            }
                            while(c != null){
                                c = c.getLink4();
                                if(c == null){
                                    diaString = Dia.format(dia);
                                    mesString = Mes.format(mes);
                                    diahoy = Integer.valueOf(diaString);
                                    diahoy+=3;
                                    if(diahoy>31){
                                        diahoy-=31;
                                    }
                                    diaString = dias[diahoy];
                                    fechaString = diaString+ "/" + mesString + "/" + "2017";
                                    fecha = format.parse(fechaString);
                                    c = new Node(q.getNameb(),q.getNamea(),q.getCodb(),fecha,n);
                                    sepudoLabel.setText("Entregue el Libro al Afiliado");
                                    
                                }
                            }
                        }                        
                    }
                    antq = q;
                    q = q.getRight();
                }
            }
        }
        
    }   
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        codTextF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        personaTextF = new javax.swing.JTextField();
        prestarB = new javax.swing.JButton();
        backB = new javax.swing.JButton();
        sepudoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jLabel1.setText("PRESTAR LIBRO");

        jLabel2.setFont(new java.awt.Font("Century Schoolbook", 0, 12)); // NOI18N
        jLabel2.setText("DIGITE EL CODIGO DEL LIBRO A PRESTAR:");

        jLabel3.setFont(new java.awt.Font("Century Schoolbook", 0, 12)); // NOI18N
        jLabel3.setText("DIGITE EL CODIGO DE LA PERSONA AFILIADA:");

        prestarB.setText("PRESTAR");
        prestarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prestarBActionPerformed(evt);
            }
        });

        backB.setText("BACK");
        backB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBActionPerformed(evt);
            }
        });

        sepudoLabel.setFont(new java.awt.Font("Century Schoolbook", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(personaTextF, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(backB)
                            .addComponent(sepudoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(prestarB))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(codTextF, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)))
                        .addGap(0, 97, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(56, 56, 56)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(codTextF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(personaTextF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sepudoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backB)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(prestarB, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prestarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prestarBActionPerformed
        
        try {
            prestar();
        } catch (ParseException ex) {
            Logger.getLogger(prestarBook.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Exploto prestar manito, arregla esa vaina");
        }
        
    }//GEN-LAST:event_prestarBActionPerformed

    private void backBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBActionPerformed
        Ventana.V.setEnabled(true);
        this.dispose();
        
    }//GEN-LAST:event_backBActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backB;
    private javax.swing.JTextField codTextF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField personaTextF;
    private javax.swing.JButton prestarB;
    private javax.swing.JLabel sepudoLabel;
    // End of variables declaration//GEN-END:variables
}

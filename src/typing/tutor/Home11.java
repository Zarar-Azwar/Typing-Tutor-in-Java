/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typing.tutor;

/**
 *
 * @author Zarar bhai
 */
public class Home11 extends javax.swing.JPanel {
    String s1="This typing tutor is the samester Project. This typing tutor helps to increase the speed of typing. This typing tutor contains 10 basic lesson which include both alphabets and numbers. There are 10 also 10 Tests. first 7 test are basic and other 3 are high level. It also contain one game. this is especially thanks to Mr. RAO WAKEEL AHMAD for great effort.";
    
    /**
     * Creates new form Home11
     */
    public Home11() {
        initComponents();
        
        jEditorPane1.setText(s1);
        
        //jEditorPane1.setEditable(false);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();

        jPanel1.setBackground(new java.awt.Color(0, 51, 0));
        jPanel1.setForeground(new java.awt.Color(0, 51, 0));

        jEditorPane1.setBackground(new java.awt.Color(0, 51, 0));
        jEditorPane1.setBorder(null);
        jEditorPane1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jEditorPane1.setText("This typing tutor is the samester Project. This typing tutor helps to increase the speed of typing. This typing tutor contains 10 basic lesson which include both alphabets and numbers. There are 10 also 10 Tests. first 7 test are basic and other 3 are high level. It also contain one game. this is especially thanks to Mr. RAO WAKEEL AHMAD for great effort.");
        jScrollPane1.setViewportView(jEditorPane1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

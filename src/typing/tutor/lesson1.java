package typing.tutor;

//import AppPackage.AnimationClass.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Zarar bhai
 */
public class lesson1 extends javax.swing.JFrame {
    static int seconds=0;
    static int minutes=0;
    static int hours=0;
    static int miliseconds=0;
    
    static boolean state=true;
    /**
     * Creates new form lesson1
     */
    public lesson1() {
        initComponents();
    }
    int x=50;
    int y=200;
    public void paint(Graphics g)
    {
        int i = 0;
        FileInputStream fin = null;
        try {
            fin= new FileInputStream(directory);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(lesson1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        super.paint(g);
        Graphics2D g2=(Graphics2D)g;
        Font font = new Font("Times new roman",Font.BOLD+Font.PLAIN,40);
        g2.setFont(font);
        do{
            try {
                i=fin.read();
            } catch (IOException ex) {
                Logger.getLogger(lesson1.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(i!=-1){
                String s=String.valueOf((char)i);
                g2.drawString(s,x,y);
                System.out.print((char)i);
            }
        }while(i!=-1);
        
        g2.setColor(Color.WHITE);
        try{
            Thread.sleep(1000);
        }
        catch(Exception ex)
        {
        }
        x+=10;
        if(x>this.getWidth())
        {
            x=0;
        }
        repaint();
    }
    static String directory;
    public static void file_creation() throws IOException{
        File obj=new File("ffile1.txt");
        obj.createNewFile();
        System.out.println("is exist: "+obj.exists());
        System.out.println("is exist: "+obj.getAbsolutePath());
        directory=obj.getAbsolutePath();
    }
    public static void file_writing() throws FileNotFoundException, IOException{
    int i;
    FileWriter fout;
    fout=new FileWriter(directory,true);
    Scanner input= new Scanner(System.in);
    String s=input.nextLine();
    char ch[]=s.toCharArray();
    for(i=0;i<s.length();i++){
        fout.write(ch[i]);
        }
    
   // fout.write(s);
    fout.close();
}
    public static void file_reading() throws FileNotFoundException, IOException{
        int i;
        FileInputStream fin;
        fin= new FileInputStream(directory);
        do{
            i=fin.read();
            if(i!=-1){
                System.out.print((char)i);
            }
        }while(fin.read()!=-1);
        fin.close();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(946, 580));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.setForeground(new java.awt.Color(102, 102, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(871, 584));
        jPanel1.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Zarar bhai\\Pictures\\tempsnip.png")); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 330, 849, 234);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Zarar bhai\\Downloads\\speed3.jpg")); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(732, 0, 128, 108);

        jTextField1.setBackground(new java.awt.Color(0, 0, 255));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField1.setText("00");
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(534, 29, 45, 39);

        jTextField2.setBackground(new java.awt.Color(0, 0, 255));
        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField2.setText(":00");
        jTextField2.setBorder(null);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(585, 29, 45, 39);

        jTextField3.setBackground(new java.awt.Color(0, 0, 255));
        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField3.setText(":00");
        jTextField3.setBorder(null);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(636, 29, 45, 39);

        jTextField4.setBackground(new java.awt.Color(0, 0, 255));
        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField4.setText("00");
        jTextField4.setBorder(null);
        jPanel1.add(jTextField4);
        jTextField4.setBounds(687, 40, 35, 28);

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(33, 32, 89, 42);

        jButton2.setBackground(new java.awt.Color(0, 0, 255));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Zarar bhai\\Downloads\\24x24_free_application_icons_icons_pack_120732\\gif\\24x24\\Play.gif")); // NOI18N
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(132, 32, 41, 42);

        jButton3.setBackground(new java.awt.Color(0, 0, 255));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Zarar bhai\\Downloads\\24x24_free_application_icons_icons_pack_120732\\gif\\24x24\\Pause.gif")); // NOI18N
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(179, 32, 41, 42);

        jButton4.setBackground(new java.awt.Color(0, 0, 255));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Zarar bhai\\Downloads\\24x24_free_application_icons_icons_pack_120732\\gif\\24x24\\Stop.gif")); // NOI18N
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(226, 32, 41, 42);

        jTextField5.setBackground(new java.awt.Color(51, 51, 255));
        jTextField5.setFont(new java.awt.Font("Times New Roman", 0, 40)); // NOI18N
        jTextField5.setBorder(null);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField5KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField5);
        jTextField5.setBounds(30, 240, 830, 70);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 900, 584);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
                
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        state=true;
             Thread t=new Thread()
             {
                public void run()
                {
                    for(;;)
                    {
                       if(state==true)
                        {
                          try
                          {
                              sleep(1);
                              miliseconds++;
                              if(miliseconds>1000)
                              {
                                  seconds++;
                                  miliseconds=0;
                              }
                              if(seconds>59){
                                  seconds=0;
                                  minutes++;
                              }
                              if(minutes>59)
                              {
                                  seconds=0;
                                  hours++;
                              }
                              jTextField4.setText(""+miliseconds);
                              jTextField1.setText(""+hours);
                              jTextField2.setText(":"+minutes);
                              jTextField3.setText(":"+seconds);
                              
                              
                          }
                          catch(Exception e)
                          {
                              
                          }
                        } 
                       else
                       {
                          break;   
                       }
                    }
                    
                }
             };
             t.start();
                                           

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5KeyPressed

    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyTyped
        // TODO add your handling code here:
        state = true;
    }//GEN-LAST:event_jTextField5KeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException {
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
            java.util.logging.Logger.getLogger(lesson1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lesson1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lesson1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lesson1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        file_creation();
        //file_writing();
        file_reading();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lesson1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}

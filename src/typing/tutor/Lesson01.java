/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typing.tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static typing.tutor.Lesson01.directory;
import static typing.tutor.lesson1.directory;
import static typing.tutor.lesson1.state;

/**
 *
 * @author Zarar bhai
 */

public class Lesson01 extends javax.swing.JFrame {
     String q;
    private java.util.List<JButton> buttons;
    int currentChar;
    String p;
    private java.util.List<JLabel> label;
    //public String str="abcdef";
    int currentchar;
    int z=0;
    //int currentchar;
    //String p;
    static int error=0;
    //int error;
    /**
     * Creates new form Lesson01
     */
    //Lesson01 ll=new Lesson01();
    static String directory;
    static String lesson1="a s l ; l s a ; s l a  ; a s l ; a s l ; a l ; s ;";
    
    static String str=null;
//File obj=new File("ffile1.txt");
    //char st1[33];
    
    /*public static void file_creation() throws IOException{
        File obj=new File("lesson1.txt");
        obj.createNewFile();
        System.out.println("is exist: "+obj.exists());
        System.out.println("is exist: "+obj.getAbsolutePath());
        //directory=obj.getAbsolutePath();
    }*/
    static int seconds=0;
    static int minutes=0;
    static int hours=0;
    static int miliseconds=0;
    
    static boolean state=true;
    static boolean state2;
    static boolean s=false;
    public Lesson01() throws IOException {
        initComponents();
        //file_creation();
        q="1234567890qwertyuiopasdfghjkl;zxcvbnm, ";
        System.out.println(q.length());
        System.out.println("the length of q is "+q);
        buttons = new ArrayList<JButton>();
        buttons.add(b1);
        buttons.add(b2);
        buttons.add(b3);
        buttons.add(b4);
        buttons.add(b5);
        buttons.add(b6);
        buttons.add(b7);
        buttons.add(b8);
        buttons.add(b9);
        buttons.add(b10);
        buttons.add(b11);
        buttons.add(b12);
        buttons.add(b13);
        buttons.add(b14);
        buttons.add(b15);
        buttons.add(b16);
        buttons.add(b17);
        buttons.add(b18);
        buttons.add(b19);
        buttons.add(b20);
        buttons.add(b21);
        buttons.add(b22);
        buttons.add(b23);
        buttons.add(b24);
        buttons.add(b25);
        buttons.add(b26);
        buttons.add(b27);
        buttons.add(b28);
        buttons.add(b29);
        buttons.add(b30);
        buttons.add(b31);
        buttons.add(b32);
        buttons.add(b33);
        buttons.add(b34);
        buttons.add(b35);
        buttons.add(b36);
        buttons.add(b37);
        buttons.add(b38);
        buttons.add(b39);
        currentChar=0;
        label = new ArrayList<JLabel>();
        label.add(l1);
        label.add(l2);
        label.add(l3);
        label.add(l4);
        label.add(l5);
        label.add(l6);
        label.add(l7);
        label.add(l8);
        label.add(l9);
        label.add(l10);
        label.add(l11);
        label.add(l12);
        label.add(l13);
        label.add(l14);
        label.add(l15);
        label.add(l16);
        label.add(l17);
        label.add(l18);
        label.add(l19);
        label.add(l20);
        label.add(l21);
        label.add(l22);
        label.add(l23);
        label.add(l24);
        label.add(l25);
        label.add(l26);
        label.add(l27);
        label.add(l28);
        label.add(l29);
        label.add(l30);
        label.add(l31);
        label.add(l32);
        label.add(l33);
        label.add(l34);
        label.add(l35);
        label.add(l36);
        label.add(l37);
        label.add(l38);
        label.add(l39);
        label.add(l40);
        label.add(l41);
        label.add(l42);
        label.add(l43);
        label.add(l44);
        label.add(l45);
        label.add(l46);
        label.add(l47);
        label.add(l48);
        label.add(l49);
        label.add(l50);
        
        //l1.setText(Character.toString(str.charAt(0)));
        while(z<50){
            label.get(z).setText(Character.toString(lesson1.charAt(z)));
            z++;
        }
        label.get(currentchar).setBorder(BorderFactory.createLineBorder(Color.BLACK));
       
        min.setEditable(false);
        jTextField4.disable();
        min.disable();
        hour.disable();
        mili.disable();
        hour.setEditable(false);
        jTextField4.setEditable(false);
        mili.setEditable(false);
        jTextField1.setEditable(true);
        jTextField1.enable(true);
        jButton1.setEnabled(false);
        
        
        
       
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b10 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        b11 = new javax.swing.JButton();
        b12 = new javax.swing.JButton();
        b13 = new javax.swing.JButton();
        b14 = new javax.swing.JButton();
        b15 = new javax.swing.JButton();
        b16 = new javax.swing.JButton();
        b17 = new javax.swing.JButton();
        b18 = new javax.swing.JButton();
        b19 = new javax.swing.JButton();
        b20 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        b21 = new javax.swing.JButton();
        b22 = new javax.swing.JButton();
        b23 = new javax.swing.JButton();
        b24 = new javax.swing.JButton();
        b25 = new javax.swing.JButton();
        b26 = new javax.swing.JButton();
        b27 = new javax.swing.JButton();
        b28 = new javax.swing.JButton();
        b29 = new javax.swing.JButton();
        b30 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        b31 = new javax.swing.JButton();
        b32 = new javax.swing.JButton();
        b33 = new javax.swing.JButton();
        b34 = new javax.swing.JButton();
        b35 = new javax.swing.JButton();
        b36 = new javax.swing.JButton();
        b37 = new javax.swing.JButton();
        b38 = new javax.swing.JButton();
        jButton53 = new javax.swing.JButton();
        jButton54 = new javax.swing.JButton();
        jButton55 = new javax.swing.JButton();
        jButton56 = new javax.swing.JButton();
        jButton57 = new javax.swing.JButton();
        jButton58 = new javax.swing.JButton();
        b39 = new javax.swing.JButton();
        jButton60 = new javax.swing.JButton();
        jButton61 = new javax.swing.JButton();
        jButton62 = new javax.swing.JButton();
        jButton63 = new javax.swing.JButton();
        jButton64 = new javax.swing.JButton();
        jButton65 = new javax.swing.JButton();
        jButton66 = new javax.swing.JButton();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        l7 = new javax.swing.JLabel();
        l8 = new javax.swing.JLabel();
        l9 = new javax.swing.JLabel();
        l10 = new javax.swing.JLabel();
        l11 = new javax.swing.JLabel();
        l12 = new javax.swing.JLabel();
        l13 = new javax.swing.JLabel();
        l14 = new javax.swing.JLabel();
        l15 = new javax.swing.JLabel();
        l16 = new javax.swing.JLabel();
        l17 = new javax.swing.JLabel();
        l18 = new javax.swing.JLabel();
        l19 = new javax.swing.JLabel();
        l20 = new javax.swing.JLabel();
        l21 = new javax.swing.JLabel();
        l22 = new javax.swing.JLabel();
        l23 = new javax.swing.JLabel();
        l24 = new javax.swing.JLabel();
        l25 = new javax.swing.JLabel();
        l26 = new javax.swing.JLabel();
        l27 = new javax.swing.JLabel();
        l28 = new javax.swing.JLabel();
        l29 = new javax.swing.JLabel();
        l30 = new javax.swing.JLabel();
        l31 = new javax.swing.JLabel();
        l32 = new javax.swing.JLabel();
        l33 = new javax.swing.JLabel();
        l34 = new javax.swing.JLabel();
        l35 = new javax.swing.JLabel();
        l36 = new javax.swing.JLabel();
        l37 = new javax.swing.JLabel();
        l38 = new javax.swing.JLabel();
        l39 = new javax.swing.JLabel();
        l40 = new javax.swing.JLabel();
        l41 = new javax.swing.JLabel();
        l42 = new javax.swing.JLabel();
        l43 = new javax.swing.JLabel();
        l44 = new javax.swing.JLabel();
        l45 = new javax.swing.JLabel();
        l46 = new javax.swing.JLabel();
        l47 = new javax.swing.JLabel();
        l48 = new javax.swing.JLabel();
        l49 = new javax.swing.JLabel();
        l50 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        hour = new javax.swing.JTextField();
        min = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        mili = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("LEVEL 1");

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton3.setText("~");

        b1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        b1.setText("1");

        b2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        b2.setText("2");

        b3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        b3.setText("3");

        b4.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        b4.setText("4");

        b5.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        b5.setText("5");

        b6.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        b6.setText("6");

        b7.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        b7.setText("7");

        b8.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        b8.setText("8");

        b9.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        b9.setText("9");

        b10.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        b10.setText("0");

        jButton14.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton14.setText("-");

        jButton15.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton15.setText("+");

        jButton16.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton16.setText("Backspace");

        jButton17.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton17.setText("Tab");

        b11.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        b11.setText("Q");

        b12.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        b12.setText("W");

        b13.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        b13.setText("E");

        b14.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        b14.setText("R");

        b15.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        b15.setText("T");

        b16.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        b16.setText("Y");

        b17.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        b17.setText("U");

        b18.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        b18.setText("I");

        b19.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        b19.setText("O");

        b20.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        b20.setText("P");

        jButton28.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton28.setText("{");

        jButton29.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton29.setText("}");

        jButton30.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton30.setText("|");

        jButton31.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton31.setText("CapsLock");

        b21.setBackground(new java.awt.Color(0, 0, 0));
        b21.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        b21.setForeground(new java.awt.Color(255, 255, 255));
        b21.setText("A");

        b22.setBackground(new java.awt.Color(0, 0, 0));
        b22.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        b22.setForeground(new java.awt.Color(255, 255, 255));
        b22.setText("S");

        b23.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        b23.setText("D");

        b24.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        b24.setText("F");

        b25.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        b25.setText("G");

        b26.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        b26.setText("H");

        b27.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        b27.setText("J");

        b28.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        b28.setText("K");

        b29.setBackground(new java.awt.Color(0, 0, 0));
        b29.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        b29.setForeground(new java.awt.Color(255, 255, 255));
        b29.setText("L");

        b30.setBackground(new java.awt.Color(0, 0, 0));
        b30.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        b30.setForeground(new java.awt.Color(255, 255, 255));
        b30.setText(";");

        jButton42.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton42.setText("\"");

        jButton43.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton43.setText("Enter");

        jButton44.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton44.setText("Shift");

        b31.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        b31.setText("Z");

        b32.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        b32.setText("X");

        b33.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        b33.setText("C");
        b33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b33ActionPerformed(evt);
            }
        });

        b34.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        b34.setText("V");

        b35.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        b35.setText("B");

        b36.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        b36.setText("N");

        b37.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        b37.setText("M");

        b38.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        b38.setText(",");

        jButton53.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton53.setText(".");

        jButton54.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton54.setText("/");

        jButton55.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton55.setText("Shift");

        jButton56.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton56.setText("Ctrl");

        jButton57.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton57.setText("Fn");

        jButton58.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/typing/tutor/pics/windows867_24px.png"))); // NOI18N

        b39.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        jButton60.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton60.setText("Fn");

        jButton61.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton61.setText("Alt");

        jButton62.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton62.setText("Ctrl");

        jButton63.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton63.setText("Fn");

        jButton64.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton64.setText("Fn");

        jButton65.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton65.setText("Fn");

        jButton66.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton66.setText("Fn");

        l1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        l2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        l3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        l4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        l5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        l6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        l7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        l8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        l9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        l10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        l11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        l12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        l13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        l14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        l15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        l16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        l17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        l18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        l19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        l20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        l21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        l22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        l23.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        l24.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        l25.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        l26.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        l27.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        l28.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        l29.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        l30.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        l31.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        l32.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        l33.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        l34.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        l35.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        l36.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        l37.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        l38.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        l39.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        l40.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        l41.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        l42.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        l43.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        l44.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        l45.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        l46.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        l47.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        l48.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        l49.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        l50.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jTextField1.setBorder(null);
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        hour.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hour.setBorder(null);

        min.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        min.setBorder(null);

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField4.setBorder(null);

        mili.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mili.setBorder(null);

        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(b1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(b2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(b3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(b4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(b5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(b6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(b7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(b8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(b9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(b10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton15, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton16, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton17, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(b11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(b12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(b13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(b14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(b15, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(b16, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(b17, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(b18, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(b19, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(b20, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton28, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton29, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton30, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton31, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(b21, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(b22, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(b23, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(b24, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(b25, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(b26, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(b27, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(b28, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(b29, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(b30, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton42, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton43, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton44, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(b31, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(b32, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(b33, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(b34, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(b35, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(b36, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(b37, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(b38, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton53, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton54, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton55, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton56, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton57, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton58, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(b39, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton60, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton61, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton62, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton63, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton64, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton65, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton66, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(l1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(l2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(l3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(l4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(l5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(l6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(l7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(l8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(l9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(l10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(l11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(l12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(l13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(l14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(l15, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(l16, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(l17, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(l18, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(l19, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(l20, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(l21, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(l22, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(l23, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(l24, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(l25, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(l26, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(l27, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(l28, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(l29, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(l30, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(l31, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(l32, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(l33, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(l34, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(l35, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(l36, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(l37, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(l38, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(l39, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(l40, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(l41, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(l42, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(l43, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(l44, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(l45, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(l46, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(l47, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(l48, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(l49, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(l50, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(hour, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(min, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTextField4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(mili, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                            .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(b21, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(b22, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(b23, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(b24, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(b25, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(b26, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(b27, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(b28, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(b29, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(b30, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButton43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane1Layout.createSequentialGroup()
                                                    .addComponent(jButton56, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jButton57, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jButton58, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane1Layout.createSequentialGroup()
                                                    .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(b31, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(b32, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(b33, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(b34, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(b35, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(b36, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(b37))
                                                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                                    .addGap(11, 11, 11)
                                                    .addComponent(jButton60)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(b39, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                                    .addComponent(b38, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jButton53, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(7, 7, 7)
                                                    .addComponent(jButton54, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jButton55, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                                    .addComponent(jButton61, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jButton62)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jButton63)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jButton64)
                                                        .addComponent(jButton65))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jButton66, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(b11, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(b12)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(b13, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(b14, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(b15, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(b16, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(b17, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(b18, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(b19, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(b20, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(14, 14, 14)
                                                .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jTextField1)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(b10, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(l3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(l4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(l5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(l6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(l7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(l8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(l9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(l10, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(l11, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(l12, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(l13, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(l14, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(hour)
                                            .addComponent(l15, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(l16, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(min))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(l17, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField4)))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(l19, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l20, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addComponent(l21, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(l22, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(l23, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(l24, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(l25, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(l26, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(l27, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(l28, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(l29, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(l30, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(l31, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(l32, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(l33, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(l34, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(l35, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addComponent(l37, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(l38, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(l39, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(l40, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(l41, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(l42, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(l43, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(l44, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(l45, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(l46, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(l47, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(l48, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(l49, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(l50, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jButton1)
                        .addGap(327, 327, 327)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(l36, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(l18, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(mili))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 39, Short.MAX_VALUE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hour, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(min, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(mili, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l10, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l11, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l12, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l13, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l14, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l15, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l16, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l17, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l18, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l35, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(l19, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(l20, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(l21, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(l22, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(l23, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(l25, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(l26, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(l27, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(l28, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(l29, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(l30, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(l31, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(l32, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(l33, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(l34, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(l24, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(l37, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(l38, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(l39, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(l40, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(l41, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(l42, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(l43, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(l44, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(l45, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(l46, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(l47, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(l48, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(l49, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(l50, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(47, 47, 47)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b24, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b25, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b26, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b27, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b28, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b29, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b30, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b31, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b32, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b33, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b34, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b35, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b36, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b37, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b38, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton53, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton54, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton55, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton56, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton57, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton58, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(b39, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton60, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton61, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton62, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton63, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addComponent(jButton64, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton65, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jButton66, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(l36, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b33ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
        
        if(currentchar==0){
            state=true;
            min.setEnabled(true);
            jTextField4.setEnabled(true);
            hour.setEnabled(true);
            mili.setEnabled(true);
            jButton1.setEnabled(true);
            time();
        }
        if(evt.getKeyChar()==lesson1.charAt(currentchar)){
            label.get(currentchar).setForeground(Color.MAGENTA);
            label.get(currentchar).setBorder(null);
            char ch= evt.getKeyChar();
            int f=q.indexOf(Character.toString(ch));
            setButtonColor(ch,f);
            currentchar++;
            if(currentchar>50){
                jTextField1.setEditable(false);
            }
        }
        else{
            label.get(currentchar).setForeground(Color.RED);
            label.get(currentchar).setBorder(null);
            char ch= evt.getKeyChar();
            int f=q.indexOf(Character.toString(ch));
            setButtonColor(ch,f);
            currentchar++;
            error++;
            if(currentchar>50){
                jTextField1.setEditable(false);
            }
        }
        
    }//GEN-LAST:event_jTextField1KeyPressed
    public void time(){
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
                            mili.setText(""+miliseconds);
                            hour.setText(""+hours);
                            min.setText(":"+minutes);
                            jTextField4.setText(":"+seconds);

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
    }
    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
        int s=q.indexOf(Character.toString(evt.getKeyChar()));
        if(evt.getKeyChar()==lesson1.charAt(currentchar-1)){
            
            buttons.get(s).setBackground(Color.BLACK);
        }
        else{
            buttons.get(s).setBackground(Color.LIGHT_GRAY);
        }
        if(currentchar<=49){
            label.get(currentchar).setBorder(BorderFactory.createLineBorder(Color.BLACK));
        }
        if(currentchar>49){
            state=false;
            jTextField1.setEditable(false);
            results1();
            this.dispose();
        }
        
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Menum m= new Menum();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    public void setButtonColor(char ch,int i){
        if (ch == lesson1.charAt(currentchar)) {
            buttons.get(i).setBackground(Color.green);
            
        }
        else if (ch != lesson1.charAt(currentchar)) {
            buttons.get(i).setBackground(Color.red);
            
            System.out.println("errors are" +error);
            
        }
        
        
        
    }
     public static void results1(){
         int e1=0;
         float s=seconds;
         float t=minutes;
         float tt=t+(s/60);
         System.out.println("the total errors are "+error);
         System.out.println("the total time are "+tt);
         float wpa=50/tt;
         float e2=50-error;
         System.out.println("the total errors are "+error);
         System.out.println("the total time are "+tt);
         System.out.println("the total wpa "+wpa);
         Results r=new Results("LESSON",1,wpa,e2);
         
         r.setVisible(true);
        
         
         
         
         
         
         
     }
    
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
            java.util.logging.Logger.getLogger(Lesson01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lesson01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lesson01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lesson01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Lesson01().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Lesson01.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b10;
    private javax.swing.JButton b11;
    private javax.swing.JButton b12;
    private javax.swing.JButton b13;
    private javax.swing.JButton b14;
    private javax.swing.JButton b15;
    private javax.swing.JButton b16;
    private javax.swing.JButton b17;
    private javax.swing.JButton b18;
    private javax.swing.JButton b19;
    private javax.swing.JButton b2;
    private javax.swing.JButton b20;
    private javax.swing.JButton b21;
    private javax.swing.JButton b22;
    private javax.swing.JButton b23;
    private javax.swing.JButton b24;
    private javax.swing.JButton b25;
    private javax.swing.JButton b26;
    private javax.swing.JButton b27;
    private javax.swing.JButton b28;
    private javax.swing.JButton b29;
    private javax.swing.JButton b3;
    private javax.swing.JButton b30;
    private javax.swing.JButton b31;
    private javax.swing.JButton b32;
    private javax.swing.JButton b33;
    private javax.swing.JButton b34;
    private javax.swing.JButton b35;
    private javax.swing.JButton b36;
    private javax.swing.JButton b37;
    private javax.swing.JButton b38;
    private javax.swing.JButton b39;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JTextField hour;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton55;
    private javax.swing.JButton jButton56;
    private javax.swing.JButton jButton57;
    private javax.swing.JButton jButton58;
    private javax.swing.JButton jButton60;
    private javax.swing.JButton jButton61;
    private javax.swing.JButton jButton62;
    private javax.swing.JButton jButton63;
    private javax.swing.JButton jButton64;
    private javax.swing.JButton jButton65;
    private javax.swing.JButton jButton66;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l10;
    private javax.swing.JLabel l11;
    private javax.swing.JLabel l12;
    private javax.swing.JLabel l13;
    private javax.swing.JLabel l14;
    private javax.swing.JLabel l15;
    private javax.swing.JLabel l16;
    private javax.swing.JLabel l17;
    private javax.swing.JLabel l18;
    private javax.swing.JLabel l19;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l20;
    private javax.swing.JLabel l21;
    private javax.swing.JLabel l22;
    private javax.swing.JLabel l23;
    private javax.swing.JLabel l24;
    private javax.swing.JLabel l25;
    private javax.swing.JLabel l26;
    private javax.swing.JLabel l27;
    private javax.swing.JLabel l28;
    private javax.swing.JLabel l29;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l30;
    private javax.swing.JLabel l31;
    private javax.swing.JLabel l32;
    private javax.swing.JLabel l33;
    private javax.swing.JLabel l34;
    private javax.swing.JLabel l35;
    private javax.swing.JLabel l36;
    private javax.swing.JLabel l37;
    private javax.swing.JLabel l38;
    private javax.swing.JLabel l39;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l40;
    private javax.swing.JLabel l41;
    private javax.swing.JLabel l42;
    private javax.swing.JLabel l43;
    private javax.swing.JLabel l44;
    private javax.swing.JLabel l45;
    private javax.swing.JLabel l46;
    private javax.swing.JLabel l47;
    private javax.swing.JLabel l48;
    private javax.swing.JLabel l49;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l50;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;
    private javax.swing.JLabel l8;
    private javax.swing.JLabel l9;
    private javax.swing.JTextField mili;
    private javax.swing.JTextField min;
    // End of variables declaration//GEN-END:variables
}

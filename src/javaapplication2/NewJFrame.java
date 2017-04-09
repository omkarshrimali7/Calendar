/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication2;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import  java.awt.MouseInfo;
import java.awt.PointerInfo;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.Timer;


/**
 *
 * @author Abhinav
 */
public class NewJFrame extends javax.swing.JFrame {
    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        

initComponents(); 
evntpnl.setVisible(false);
ntspnl.setVisible(false);
jcchpnl.setVisible(false);
jfchpnl.setVisible(false);
stngspnl.setVisible(false);
stngspnl.setVisible(false);
main.setMinimumSize(new java.awt.Dimension (494,600));
main.setVisible(true);   
String a=a1.getText();
String b=a2.getText();
String c=a3.getText();
String d=a4.getText();
String e=a5.getText();
if(a.equals("")&& b.equals("")&& c.equals("") && d.equals("") && e.equals("") ){ a1.setText("<html><font size=4>Add a Program to Fastlane</font></html>");
}

int x = (int) this.getLocation().x;
int y = (int) this.getLocation().y;
main.setBounds(x+18,y+20,0,0);
      jFrame4.setBounds(400,10,625,78);
      jFrame5.setBounds(390,0,646,100);
       javax.swing.Timer t;
            t = new javax.swing.Timer(1000,new ClockListener());
            t.start();
            Color Lcolor=v1.getForeground();
            Color c2=jLabel7.getBackground();
            v2.setForeground(c2.darker());
            v3.setForeground(c2.darker());
            v4.setForeground(c2.darker());
            R = jLabel31.getForeground().getRed();
G = jLabel31.getForeground().getGreen();
B = jLabel31.getForeground().getBlue();

    }

    private void l(int a, String s) {
if(a==1){l1.setText(s);}
if(a==2){l2.setText(s);}
if(a==3){l3.setText(s);}
if(a==4){l4.setText(s);}
if(a==5){l5.setText(s);}
if(a==6){l6.setText(s);}
if(a==7){l7.setText(s);}
if(a==8){l8.setText(s);}
if(a==9){l9.setText(s);}
if(a==10){l10.setText(s);}
if(a==11){l11.setText(s);}
if(a==12){l12.setText(s);}
if(a==13){l13.setText(s);}
if(a==14){l14.setText(s);}
if(a==15){l15.setText(s);}
if(a==16){l16.setText(s);}
if(a==17){l17.setText(s);}
if(a==18){l18.setText(s);}
if(a==19){l19.setText(s);}
if(a==20){l20.setText(s);}
if(a==21){l21.setText(s);}
if(a==22){l22.setText(s);}
if(a==23){l23.setText(s);}
if(a==24){l24.setText(s);}
if(a==25){l25.setText(s);}
if(a==26){l26.setText(s);}
if(a==27){l27.setText(s);}
if(a==28){l28.setText(s);}
if(a==29){l29.setText(s);}
if(a==30){l30.setText(s);}
if(a==31){l31.setText(s);}
if(a==32){l32.setText(s);}
if(a==33){l33.setText(s);}
if(a==34){l34.setText(s);}
if(a==35){l35.setText(s);}
if(a==36){l36.setText(s);}
if(a==37){l37.setText(s);}
if(a==38){l38.setText(s);}
if(a==39){l39.setText(s);}
if(a==40){l40.setText(s);}
if(a==41){l41.setText(s);}
if(a==42){l42.setText(s);}
if(a==36){l36.setText(s);}
if(a==37){l37.setText(s);}
if(a==38){l38.setText(s);}
if(a==39){l39.setText(s);}
if(a==40){l40.setText(s);}
if(a==41){l41.setText(s);}
if(a==42){l42.setText(s);}

        
         //To change body of generated methods, choose Tools | Templates.
    }

    private void set(String l1) {
         l.setText(l1); //To change body of generated methods, choose Tools | Templates.
    }

private void setThemecolor(int bgr, int bgg, int bgb, int fgr, int fgg, int fgb, int frr, int frg, int frb) {
 jCheckBox3.setBackground(new java.awt.Color(bgr,bgg,bgb));
 jCheckBox2.setBackground(new java.awt.Color(bgr,bgg,bgb));
 stngspnl.setBackground(new java.awt.Color(bgr,bgg,bgb));
 bg.setBackground(new java.awt.Color(bgr,bgg,bgb));
 jLabel7.setBackground (new java.awt.Color(bgr,bgg,bgb));nextbtn.setBackground(new java.awt.Color(bgr,bgg,bgb));
 jLabel21.setForeground(new java.awt.Color(fgr,fgg,fgb));v1.setForeground(new java.awt.Color(fgr,fgg,fgb));
 jLabel9.setForeground(new java.awt.Color(fgr,fgg,fgb));jLabel8.setForeground(new java.awt.Color(fgr,fgg,fgb));
 jLabel10.setForeground(new java.awt.Color(fgr,fgg,fgb));jLabel13.setForeground(new java.awt.Color(fgr,fgg,fgb));
 jLabel2.setForeground(new java.awt.Color(fgr,fgg,fgb));jTextField8.setForeground(new java.awt.Color(fgr,fgg,fgb));
 jLabel40.setForeground(new java.awt.Color(fgr,fgg,fgb));prevbtn.setBackground(new java.awt.Color(bgr,bgg,bgb));
  prevbtn.setForeground(new java.awt.Color(fgr,fgg,fgb));nextbtn.setForeground(new java.awt.Color(fgr,fgg,fgb));
    }
 class ClockListener  implements ActionListener{
        public void actionPerformed(ActionEvent e){ 
         Calendar calendar = Calendar.getInstance();
   calendar.setTimeInMillis(System.currentTimeMillis());
           
            int hours = calendar.get(Calendar.HOUR_OF_DAY);
            int minutes = calendar.get(Calendar.MINUTE);
            int seconds = calendar.get(Calendar.SECOND);
            int am_pm=calendar.get(Calendar.AM_PM);
            int date=calendar.get(Calendar.DATE); 
            int month=calendar.get(Calendar.MONTH)+1;
            int year=calendar.get(Calendar.YEAR);
            
         int dom=calendar.get(calendar.DAY_OF_WEEK);

       jLabel13.setText(""+date+":"+month+":"+year); 
String da_y="";
switch(dom){
    case 1:da_y="SUNDAY";break;
case 2:da_y="MONDAY";break;
   case 3:da_y="TUESDAY";break;
   
   case 4:da_y="WEDNESDAY";break;
   case 5:da_y="THURSDAY";break;
           case 7:da_y="SATURDAY";break;
               case 6:da_y="FRIDAY";break;
               }
jLabel8.setText(""+da_y);
String Da__y=da_y.substring(0,3);
 String  tz;
            if(am_pm==1){ tz="PM";}
            else{ tz="AM";}
            if(hours>12){hours=hours-12;
            }
            jLabel22.setText("<html>"+Da__y+"<br>"+date+"</html>");
            
jLabel13.setText(""+hours+":"+minutes+":"+seconds+" "+tz);  
jLabel11.setText("<html>"+date+"th<br> "+month+"</html>");
jLabel12.setText("<html>"+hours+"."+minutes+"<br> "+tz+"</html>");
jLabel10.setText(""+date+"-"+month+"-"+year);
    String d_at=" ";
    switch(month){
        case 1:d_at="January";break;
    case 2:d_at="February";break;
    case 3:d_at="March";break;
    case 4:d_at="April";break;
    case 5:d_at="May";break;
    case 6:d_at="June";break;
    case 7:d_at="July";break;
    case 8:d_at="August";break;
    case 9:d_at="September";break;
    case 10:d_at="October";break;
    case 11:d_at="November";break;
    case 12:d_at="December";break;}
    
      jLabel9.setText(""+d_at);
      

    
    int i= (date)%7;
    int j = i -(i-1);
    int k =0 ;
    if(i-1>=dom) {
        k = 7+dom-(i-1);
    }
    if(i-1<dom){
        k = dom-(i-1);
    }
    String day;
    
  
   

 String  t;
            if(am_pm==1){ t="PM";}
            else{ t="AM";}
            if(hours>12){hours=hours-12;
            }
  
int o=31; int r = 0;
    String d_ate=" ";
    
      
      

    }
 
      

 
    } 
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jL = new javax.swing.JLabel();
        l = new javax.swing.JLabel();
        main = new javax.swing.JFrame();
        hood = new javax.swing.JPanel();
        v5 = new javax.swing.JLabel();
        v2 = new javax.swing.JLabel();
        v3 = new javax.swing.JLabel();
        v4 = new javax.swing.JLabel();
        v1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        a5 = new javax.swing.JLabel();
        clndrpnl = new javax.swing.JPanel();
        jTextField8 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        prevbtn = new javax.swing.JButton();
        nextbtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        l15 = new javax.swing.JLabel();
        l13 = new javax.swing.JLabel();
        l7 = new javax.swing.JLabel();
        l29 = new javax.swing.JLabel();
        l17 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l40 = new javax.swing.JLabel();
        l22 = new javax.swing.JLabel();
        l21 = new javax.swing.JLabel();
        l20 = new javax.swing.JLabel();
        l18 = new javax.swing.JLabel();
        l12 = new javax.swing.JLabel();
        l37 = new javax.swing.JLabel();
        l32 = new javax.swing.JLabel();
        l33 = new javax.swing.JLabel();
        l35 = new javax.swing.JLabel();
        l28 = new javax.swing.JLabel();
        l27 = new javax.swing.JLabel();
        l39 = new javax.swing.JLabel();
        l19 = new javax.swing.JLabel();
        l8 = new javax.swing.JLabel();
        l16 = new javax.swing.JLabel();
        l36 = new javax.swing.JLabel();
        l9 = new javax.swing.JLabel();
        l10 = new javax.swing.JLabel();
        l30 = new javax.swing.JLabel();
        l14 = new javax.swing.JLabel();
        l34 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        l25 = new javax.swing.JLabel();
        l23 = new javax.swing.JLabel();
        l26 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        l41 = new javax.swing.JLabel();
        l24 = new javax.swing.JLabel();
        l42 = new javax.swing.JLabel();
        l31 = new javax.swing.JLabel();
        l38 = new javax.swing.JLabel();
        l11 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        cddpnl = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        evntpnl = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        jTextField5 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox();
        jComboBox5 = new javax.swing.JComboBox();
        jComboBox6 = new javax.swing.JComboBox();
        jLabel19 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox1 = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        addbtn = new javax.swing.JButton();
        ntspnl = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        aadnbtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel24 = new javax.swing.JLabel();
        stngspnl = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel30 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        o1 = new javax.swing.JLabel();
        o2 = new javax.swing.JLabel();
        o3 = new javax.swing.JLabel();
        o4 = new javax.swing.JLabel();
        o5 = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jcchpnl = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jColorChooser2 = new javax.swing.JColorChooser();
        jButton8 = new javax.swing.JButton();
        jfchpnl = new javax.swing.JPanel();
        jFileChooser1 = new javax.swing.JFileChooser();
        jLabel7 = new javax.swing.JLabel();
        jFrame4 = new javax.swing.JFrame();
        a7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        a1 = new javax.swing.JLabel();
        a2 = new javax.swing.JLabel();
        a3 = new javax.swing.JLabel();
        a4 = new javax.swing.JLabel();
        a6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        l129 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();
        jFrame5 = new javax.swing.JFrame();
        l130 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        jTextField1.setText("0");

        jTextField2.setText("0");

        jLabel3.setText("jLabel3");

        jL.setText("0");

        l.setText("0");

        main.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        main.setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        main.setMinimumSize(new java.awt.Dimension(490, 600));
        main.setUndecorated(true);
        main.setOpacity(0.9F);
        main.setPreferredSize(new java.awt.Dimension(483, 600));
        main.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                mainWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                mainWindowOpened(evt);
            }
        });
        main.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hood.setOpaque(false);
        hood.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        v5.setBackground(new java.awt.Color(0, 0, 0));
        v5.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        v5.setForeground(new java.awt.Color(255, 255, 255));
        v5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        v5.setText("<html><font size=6>Fastlane </font></html>");
        v5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        v5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        v5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                v5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                v5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                v5MouseExited(evt);
            }
        });
        v5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                v5MouseMoved(evt);
            }
        });
        hood.add(v5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 110, 27));

        v2.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        v2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        v2.setText("<html><font size=6>Events</font></html>");
        v2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        v2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                v2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                v2MouseExited(evt);
            }
        });
        v2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                v2MouseMoved(evt);
            }
        });
        hood.add(v2, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 103, 110, 27));

        v3.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        v3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        v3.setText("<html><font size=6>Notes</font></html>");
        v3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        v3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                v3MouseMoved(evt);
            }
        });
        v3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                v3MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                v3MouseExited(evt);
            }
        });
        hood.add(v3, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 103, 110, 27));

        v4.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        v4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        v4.setText("<html><font size=6>Setttings</font></html>");
        v4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        v4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                v4MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                v4MouseExited(evt);
            }
        });
        v4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                v4MouseMoved(evt);
            }
        });
        hood.add(v4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 103, 110, 27));

        v1.setBackground(new java.awt.Color(0, 0, 0));
        v1.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        v1.setForeground(new java.awt.Color(255, 255, 255));
        v1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        v1.setText("<html><font size=6>Calender</font></html>");
        v1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(255, 255, 255)));
        v1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        v1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                v1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                v1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                v1MouseExited(evt);
            }
        });
        v1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                v1MouseMoved(evt);
            }
        });
        hood.add(v1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 103, 110, 27));

        jLabel14.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        hood.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 470, 30));

        jLabel21.setBackground(new java.awt.Color(23, 23, 23));
        jLabel21.setFont(new java.awt.Font("Andalus", 0, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Calender");
        jLabel21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        hood.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 350, 40));

        a5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/dd.png"))); // NOI18N
        a5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                a5MouseMoved(evt);
            }
        });
        a5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a5MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                a5MouseExited(evt);
            }
        });
        hood.add(a5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 5, 30, 30));

        main.getContentPane().add(hood, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, -1));

        clndrpnl.setBackground(new java.awt.Color(0, 0, 0));
        clndrpnl.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        clndrpnl.setOpaque(false);
        clndrpnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField8.setBackground(new java.awt.Color(240, 240, 240));
        jTextField8.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(255, 255, 255));
        jTextField8.setText("2015");
        jTextField8.setBorder(null);
        jTextField8.setOpaque(false);
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        clndrpnl.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 50, 20));

        jLabel40.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("January");
        clndrpnl.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 90, 20));

        prevbtn.setBackground(new java.awt.Color(0, 0, 0));
        prevbtn.setFont(new java.awt.Font("Century", 0, 24)); // NOI18N
        prevbtn.setForeground(new java.awt.Color(255, 255, 255));
        prevbtn.setText("«");
        prevbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevbtnActionPerformed(evt);
            }
        });
        clndrpnl.add(prevbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 40, 28));

        nextbtn.setBackground(new java.awt.Color(0, 0, 0));
        nextbtn.setFont(new java.awt.Font("Century", 0, 24)); // NOI18N
        nextbtn.setForeground(new java.awt.Color(255, 255, 255));
        nextbtn.setText("»");
        nextbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextbtnActionPerformed(evt);
            }
        });
        clndrpnl.add(nextbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 40, 28));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), javax.swing.BorderFactory.createTitledBorder("")));
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sun    Mon      Tue     Wed     Thu      Fri      Sat  ");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 410, 30));

        l15.setBackground(new java.awt.Color(0, 0, 0));
        l15.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        l15.setForeground(new java.awt.Color(255, 255, 255));
        l15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l15.setText("1");
        jPanel2.add(l15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 106, 33, 33));

        l13.setBackground(new java.awt.Color(0, 0, 0));
        l13.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        l13.setForeground(new java.awt.Color(255, 255, 255));
        l13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l13.setText("1");
        jPanel2.add(l13, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 73, 33, 33));

        l7.setBackground(new java.awt.Color(0, 0, 0));
        l7.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        l7.setForeground(new java.awt.Color(255, 255, 255));
        l7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l7.setText("0");
        jPanel2.add(l7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 33, 33));

        l29.setBackground(new java.awt.Color(0, 0, 0));
        l29.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        l29.setForeground(new java.awt.Color(255, 255, 255));
        l29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l29.setText("1");
        jPanel2.add(l29, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 172, 33, 33));

        l17.setBackground(new java.awt.Color(0, 0, 0));
        l17.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        l17.setForeground(new java.awt.Color(255, 255, 255));
        l17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l17.setText("1");
        jPanel2.add(l17, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 106, 33, 33));

        l6.setBackground(new java.awt.Color(0, 0, 0));
        l6.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        l6.setForeground(new java.awt.Color(255, 255, 255));
        l6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l6.setText("0");
        jPanel2.add(l6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 33, 33));

        l4.setBackground(new java.awt.Color(0, 0, 0));
        l4.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        l4.setForeground(new java.awt.Color(255, 255, 255));
        l4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l4.setText("0");
        jPanel2.add(l4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 33, 33));

        l40.setBackground(new java.awt.Color(0, 0, 0));
        l40.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        l40.setForeground(new java.awt.Color(255, 255, 255));
        l40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l40.setText("1");
        jPanel2.add(l40, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 205, 33, 33));

        l22.setBackground(new java.awt.Color(0, 0, 0));
        l22.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        l22.setForeground(new java.awt.Color(255, 255, 255));
        l22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l22.setText("1");
        jPanel2.add(l22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 139, 33, 33));

        l21.setBackground(new java.awt.Color(0, 0, 0));
        l21.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        l21.setForeground(new java.awt.Color(255, 255, 255));
        l21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l21.setText("1");
        jPanel2.add(l21, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 106, 33, 33));

        l20.setBackground(new java.awt.Color(0, 0, 0));
        l20.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        l20.setForeground(new java.awt.Color(255, 255, 255));
        l20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l20.setText("1");
        jPanel2.add(l20, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 106, 33, 33));

        l18.setBackground(new java.awt.Color(0, 0, 0));
        l18.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        l18.setForeground(new java.awt.Color(255, 255, 255));
        l18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l18.setText("1");
        jPanel2.add(l18, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 106, 33, 33));

        l12.setBackground(new java.awt.Color(0, 0, 0));
        l12.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        l12.setForeground(new java.awt.Color(255, 255, 255));
        l12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l12.setText("1");
        jPanel2.add(l12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 73, 33, 33));

        l37.setBackground(new java.awt.Color(0, 0, 0));
        l37.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        l37.setForeground(new java.awt.Color(255, 255, 255));
        l37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l37.setText("1");
        jPanel2.add(l37, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 205, 33, 33));

        l32.setBackground(new java.awt.Color(0, 0, 0));
        l32.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        l32.setForeground(new java.awt.Color(255, 255, 255));
        l32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l32.setText("1");
        jPanel2.add(l32, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 172, 33, 33));

        l33.setBackground(new java.awt.Color(0, 0, 0));
        l33.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        l33.setForeground(new java.awt.Color(255, 255, 255));
        l33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l33.setText("1");
        jPanel2.add(l33, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 172, 33, 33));

        l35.setBackground(new java.awt.Color(0, 0, 0));
        l35.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        l35.setForeground(new java.awt.Color(255, 255, 255));
        l35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l35.setText("1");
        jPanel2.add(l35, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 172, 33, 33));

        l28.setBackground(new java.awt.Color(0, 0, 0));
        l28.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        l28.setForeground(new java.awt.Color(255, 255, 255));
        l28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l28.setText("1");
        jPanel2.add(l28, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 139, 33, 33));

        l27.setBackground(new java.awt.Color(0, 0, 0));
        l27.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        l27.setForeground(new java.awt.Color(255, 255, 255));
        l27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l27.setText("1");
        jPanel2.add(l27, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 139, 33, 33));

        l39.setBackground(new java.awt.Color(0, 0, 0));
        l39.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        l39.setForeground(new java.awt.Color(255, 255, 255));
        l39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l39.setText("1");
        jPanel2.add(l39, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 205, 33, 33));

        l19.setBackground(new java.awt.Color(0, 0, 0));
        l19.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        l19.setForeground(new java.awt.Color(255, 255, 255));
        l19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l19.setText("1");
        jPanel2.add(l19, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 106, 33, 33));

        l8.setBackground(new java.awt.Color(0, 0, 0));
        l8.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        l8.setForeground(new java.awt.Color(255, 255, 255));
        l8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l8.setText("1");
        jPanel2.add(l8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 73, 33, 33));

        l16.setBackground(new java.awt.Color(0, 0, 0));
        l16.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        l16.setForeground(new java.awt.Color(255, 255, 255));
        l16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l16.setText("1");
        jPanel2.add(l16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 106, 33, 33));

        l36.setBackground(new java.awt.Color(0, 0, 0));
        l36.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        l36.setForeground(new java.awt.Color(255, 255, 255));
        l36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l36.setText("1");
        jPanel2.add(l36, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 205, 33, 33));

        l9.setBackground(new java.awt.Color(0, 0, 0));
        l9.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        l9.setForeground(new java.awt.Color(255, 255, 255));
        l9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l9.setText("2");
        jPanel2.add(l9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 73, 33, 33));

        l10.setBackground(new java.awt.Color(0, 0, 0));
        l10.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        l10.setForeground(new java.awt.Color(255, 255, 255));
        l10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l10.setText("3");
        jPanel2.add(l10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 73, 33, 33));

        l30.setBackground(new java.awt.Color(0, 0, 0));
        l30.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        l30.setForeground(new java.awt.Color(255, 255, 255));
        l30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l30.setText("1");
        jPanel2.add(l30, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 172, 33, 33));

        l14.setBackground(new java.awt.Color(0, 0, 0));
        l14.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        l14.setForeground(new java.awt.Color(255, 255, 255));
        l14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l14.setText("1");
        jPanel2.add(l14, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 73, 33, 33));

        l34.setBackground(new java.awt.Color(0, 0, 0));
        l34.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        l34.setForeground(new java.awt.Color(255, 255, 255));
        l34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l34.setText("1");
        jPanel2.add(l34, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 172, 33, 33));

        l1.setBackground(new java.awt.Color(0, 0, 0));
        l1.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        l1.setForeground(new java.awt.Color(255, 255, 255));
        l1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l1.setText("0");
        jPanel2.add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 33, 33));

        l25.setBackground(new java.awt.Color(0, 0, 0));
        l25.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        l25.setForeground(new java.awt.Color(255, 255, 255));
        l25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l25.setText("1");
        jPanel2.add(l25, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 139, 33, 33));

        l23.setBackground(new java.awt.Color(0, 0, 0));
        l23.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        l23.setForeground(new java.awt.Color(255, 255, 255));
        l23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l23.setText("1");
        jPanel2.add(l23, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 139, 33, 33));

        l26.setBackground(new java.awt.Color(0, 0, 0));
        l26.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        l26.setForeground(new java.awt.Color(255, 255, 255));
        l26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l26.setText("1");
        jPanel2.add(l26, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 139, 33, 33));

        l2.setBackground(new java.awt.Color(0, 0, 0));
        l2.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        l2.setForeground(new java.awt.Color(255, 255, 255));
        l2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l2.setText("0");
        jPanel2.add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 33, 33));

        l5.setBackground(new java.awt.Color(0, 0, 0));
        l5.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        l5.setForeground(new java.awt.Color(255, 255, 255));
        l5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l5.setText("0");
        jPanel2.add(l5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 33, 33));

        l41.setBackground(new java.awt.Color(0, 0, 0));
        l41.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        l41.setForeground(new java.awt.Color(255, 255, 255));
        l41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l41.setText("1");
        jPanel2.add(l41, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 205, 33, 33));

        l24.setBackground(new java.awt.Color(0, 0, 0));
        l24.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        l24.setForeground(new java.awt.Color(255, 255, 255));
        l24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l24.setText("1");
        jPanel2.add(l24, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 139, 33, 33));

        l42.setBackground(new java.awt.Color(0, 0, 0));
        l42.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        l42.setForeground(new java.awt.Color(255, 255, 255));
        l42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l42.setText("1");
        jPanel2.add(l42, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 205, 33, 33));

        l31.setBackground(new java.awt.Color(0, 0, 0));
        l31.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        l31.setForeground(new java.awt.Color(255, 255, 255));
        l31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l31.setText("1");
        jPanel2.add(l31, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 172, 33, 33));

        l38.setBackground(new java.awt.Color(0, 0, 0));
        l38.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        l38.setForeground(new java.awt.Color(255, 255, 255));
        l38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l38.setText("1");
        jPanel2.add(l38, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 205, 33, 33));

        l11.setBackground(new java.awt.Color(0, 0, 0));
        l11.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        l11.setForeground(new java.awt.Color(255, 255, 255));
        l11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l11.setText("1");
        jPanel2.add(l11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 73, 33, 33));

        l3.setBackground(new java.awt.Color(0, 0, 0));
        l3.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        l3.setForeground(new java.awt.Color(255, 255, 255));
        l3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l3.setText("0");
        jPanel2.add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 33, 33));

        clndrpnl.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 390, 250));

        main.getContentPane().add(clndrpnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 470, 340));

        cddpnl.setBackground(new java.awt.Color(0, 0, 0));
        cddpnl.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), javax.swing.BorderFactory.createTitledBorder(null, "Current Day", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Andalus", 0, 18), new java.awt.Color(255, 255, 255)))); // NOI18N
        cddpnl.setOpaque(false);
        cddpnl.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                cddpnlComponentMoved(evt);
            }
        });
        cddpnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setBackground(clndrpnl.getBackground());
        jLabel10.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cddpnl.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 40, 110, 30));

        jLabel8.setBackground(clndrpnl.getBackground());
        jLabel8.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cddpnl.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 110, 30));

        jLabel13.setBackground(clndrpnl.getBackground());
        jLabel13.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cddpnl.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 40, 110, 30));

        jLabel9.setBackground(clndrpnl.getBackground());
        jLabel9.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cddpnl.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 110, 30));

        main.getContentPane().add(cddpnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 470, 80));

        evntpnl.setOpaque(false);
        evntpnl.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                evntpnlMouseMoved(evt);
            }
        });
        evntpnl.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                evntpnlFocusGained(evt);
            }
        });
        evntpnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jList2.setBackground(new java.awt.Color(0, 0, 0));
        jList2.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        jList2.setForeground(new java.awt.Color(255, 255, 255));
        jList2.setModel(new DefaultListModel());
        jList2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList2.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jList2.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jList2.setVisibleRowCount(2);
        jList2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList2MouseClicked(evt);
            }
        });
        jList2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jList2KeyPressed(evt);
            }
        });
        jList2.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList2ValueChanged(evt);
            }
        });
        jScrollPane4.setViewportView(jList2);

        evntpnl.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 316, 420, 70));

        jTextField5.setBackground(new java.awt.Color(0, 0, 0));
        jTextField5.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.setText(" Enter Event Title........");
        jTextField5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        evntpnl.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 450, 30));

        jLabel20.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("End Date");
        evntpnl.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 80, 30));

        jComboBox4.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        evntpnl.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        jComboBox5.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Jan", "Feb", "March", "April", "May", "June", "July", "Aug", "Sep", "Oct", "Nov", "Dec" }));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });
        evntpnl.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, -1));

        jComboBox6.setEditable(true);
        jComboBox6.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2001", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        evntpnl.add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 100, -1));

        jLabel19.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Start Date");
        evntpnl.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 60, 80, 30));

        jComboBox3.setEditable(true);
        jComboBox3.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2001", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        evntpnl.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 100, -1));

        jComboBox2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Jan", "Feb", "March", "April", "May", "June", "July", "Aug", "Sep", "Oct", "Nov", "Dec" }));
        evntpnl.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, -1, -1));

        jComboBox1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        evntpnl.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setOpaque(true);
        evntpnl.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 450, 2));

        jLabel25.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(33, 33, 33));
        jLabel25.setText("Added Events........");
        evntpnl.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 210, 20));

        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N

        jTextArea1.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(3);
        jTextArea1.setText("Event Note..........");
        jScrollPane1.setViewportView(jTextArea1);

        evntpnl.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 430, 100));

        addbtn.setBackground(new java.awt.Color(255, 255, 255));
        addbtn.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        addbtn.setText("Add Event");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });
        evntpnl.add(addbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 140, 30));

        main.getContentPane().add(evntpnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 470, 430));

        ntspnl.setBackground(new java.awt.Color(255, 255, 255));
        ntspnl.setOpaque(false);
        ntspnl.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ntspnlMouseMoved(evt);
            }
        });
        ntspnl.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ntspnlFocusGained(evt);
            }
        });
        ntspnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Added Notes........");
        ntspnl.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 210, 20));

        aadnbtn.setBackground(new java.awt.Color(255, 255, 255));
        aadnbtn.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        aadnbtn.setText("Add Notes");
        aadnbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aadnbtnActionPerformed(evt);
            }
        });
        ntspnl.add(aadnbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 110, 30));

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Andalus", 0, 24)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(51, 0, 0));
        jTextArea2.setRows(4);
        jTextArea2.setText("\n");
        jScrollPane2.setViewportView(jTextArea2);

        ntspnl.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 430, 190));

        jList1.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        jList1.setModel(new DefaultListModel());
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jList1.setVisibleRowCount(1);
        jScrollPane3.setViewportView(jList1);

        ntspnl.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 316, 420, 50));

        jLabel24.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Add Notes........");
        ntspnl.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 210, 20));

        main.getContentPane().add(ntspnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 470, 430));

        stngspnl.setBackground(new java.awt.Color(28, 28, 28));
        stngspnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel35.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText(" Foreground of nxt or prev month dates");
        stngspnl.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 300, 30));

        jButton13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton13.setText("...");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        stngspnl.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 40, 30));

        jLabel29.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Set Background Color");
        stngspnl.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 350, -1));

        jCheckBox2.setBackground(new java.awt.Color(28, 28, 28));
        jCheckBox2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setText("Run on startup...");
        jCheckBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox2ItemStateChanged(evt);
            }
        });
        stngspnl.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 210, -1));

        jLabel30.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Foreground of Current month dates");
        stngspnl.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 280, -1));

        jButton10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton10.setText("...");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        stngspnl.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 40, 30));

        jButton12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton12.setText("...");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        stngspnl.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 40, 30));

        jPanel10.setOpaque(false);
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        o1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        o1.setForeground(new java.awt.Color(255, 255, 255));
        o1.setText("Add or edit your fastlane");
        o1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                o1MouseClicked(evt);
            }
        });
        jPanel10.add(o1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 20));

        o2.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        o2.setForeground(new java.awt.Color(255, 255, 255));
        o2.setText("Add or edit your fastlane");
        o2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                o2MouseClicked(evt);
            }
        });
        jPanel10.add(o2, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 28, -1, -1));

        o3.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        o3.setForeground(new java.awt.Color(255, 255, 255));
        o3.setText("Add or edit your fastlane");
        o3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                o3MouseClicked(evt);
            }
        });
        jPanel10.add(o3, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 6, -1, -1));

        o4.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        o4.setForeground(new java.awt.Color(255, 255, 255));
        o4.setText("Add or edit your fastlane");
        o4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                o4MouseClicked(evt);
            }
        });
        jPanel10.add(o4, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 28, -1, -1));

        o5.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        o5.setForeground(new java.awt.Color(255, 255, 255));
        o5.setText("Add or edit your fastlane");
        o5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                o5MouseClicked(evt);
            }
        });
        jPanel10.add(o5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, -1, 28));

        stngspnl.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 410, 80));

        jCheckBox3.setBackground(new java.awt.Color(28, 28, 28));
        jCheckBox3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jCheckBox3.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox3.setSelected(true);
        jCheckBox3.setText("Start Fastlane");
        jCheckBox3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox3ItemStateChanged(evt);
            }
        });
        stngspnl.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 210, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Preview", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Andalus", 0, 18), java.awt.Color.white)); // NOI18N
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel36.setBackground(new java.awt.Color(28, 28, 28));
        jLabel36.setFont(new java.awt.Font("Andalus", 0, 24)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setOpaque(true);
        jPanel3.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 110, 40));

        jLabel31.setBackground(new java.awt.Color(28, 28, 28));
        jLabel31.setFont(new java.awt.Font("Andalus", 0, 24)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("current dates");
        jLabel31.setOpaque(true);
        jPanel3.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 20, 140, 40));

        jLabel38.setBackground(new java.awt.Color(28, 28, 28));
        jLabel38.setFont(new java.awt.Font("Andalus", 0, 24)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("other dates");
        jLabel38.setOpaque(true);
        jPanel3.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 120, 40));

        stngspnl.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 430, 80));

        jButton5.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jButton5.setText("APPLY");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        stngspnl.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 80, 60));

        main.getContentPane().add(stngspnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 470, 430));

        jcchpnl.setBackground(new java.awt.Color(255, 255, 255));
        jcchpnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jColorChooser2.setBackground(new java.awt.Color(28, 28, 28));
        jColorChooser2.setMinimumSize(new java.awt.Dimension(410, 220));
        jScrollPane6.setViewportView(jColorChooser2);

        jcchpnl.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 350));

        jButton8.setText("Set Color");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jcchpnl.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, -1, -1));

        main.getContentPane().add(jcchpnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 470, 430));

        jfchpnl.setBackground(new java.awt.Color(255, 255, 255));
        jfchpnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jFileChooser1.setApproveButtonText("Select");
        jFileChooser1.setApproveButtonToolTipText("");
        jFileChooser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooser1ActionPerformed(evt);
            }
        });
        jfchpnl.add(jFileChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 400));

        main.getContentPane().add(jfchpnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, -1, 430));

        jLabel7.setBackground(new java.awt.Color(28, 28, 28));
        jLabel7.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));
        jLabel7.setOpaque(true);
        main.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 493, 597));

        main.getAccessibleContext().setAccessibleParent(this);

        jFrame4.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        jFrame4.setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        jFrame4.setMinimumSize(new java.awt.Dimension(626, 36));
        jFrame4.setUndecorated(true);
        jFrame4.setOpacity(0.9F);
        jFrame4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jFrame4MouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jFrame4MouseReleased(evt);
            }
        });
        jFrame4.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                jFrame4WindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                jFrame4WindowOpened(evt);
            }
        });
        jFrame4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jFrame4MouseDragged(evt);
            }
        });
        jFrame4.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        a7.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        a7.setForeground(new java.awt.Color(255, 0, 0));
        a7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a7.setText("X");
        a7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                a7MouseMoved(evt);
            }
        });
        a7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a7MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                a7MouseExited(evt);
            }
        });
        jFrame4.getContentPane().add(a7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, 40, 30));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jFrame4.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 38, 50, 36));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jFrame4.getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 38, 50, 36));

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 204, 204));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jFrame4.getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 38, 50, 36));

        jLabel37.setBackground(new java.awt.Color(255, 255, 255));
        jLabel37.setFont(new java.awt.Font("Century", 0, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/go-home.png"))); // NOI18N
        jLabel37.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel37MouseClicked(evt);
            }
        });
        jFrame4.getContentPane().add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 38, 30, 32));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        a1.setBackground(new java.awt.Color(29, 29, 29));
        a1.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        a1.setForeground(new java.awt.Color(153, 153, 153));
        a1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(71, 71, 71), 1, true));
        a1.setIconTextGap(5);
        a1.setOpaque(true);
        a1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                a1MouseExited(evt);
            }
        });
        a1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                a1MouseMoved(evt);
            }
        });
        jPanel1.add(a1);

        a2.setBackground(new java.awt.Color(29, 29, 29));
        a2.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        a2.setForeground(new java.awt.Color(153, 153, 153));
        a2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(71, 71, 71), 1, true));
        a2.setOpaque(true);
        a2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                a2MouseExited(evt);
            }
        });
        a2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                a2MouseMoved(evt);
            }
        });
        jPanel1.add(a2);

        a3.setBackground(new java.awt.Color(29, 29, 29));
        a3.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        a3.setForeground(new java.awt.Color(153, 153, 153));
        a3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(71, 71, 71), 1, true));
        a3.setIconTextGap(5);
        a3.setOpaque(true);
        a3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a3MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                a3MouseExited(evt);
            }
        });
        a3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                a3MouseMoved(evt);
            }
        });
        jPanel1.add(a3);

        a4.setBackground(new java.awt.Color(29, 29, 29));
        a4.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        a4.setForeground(new java.awt.Color(153, 153, 153));
        a4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(71, 71, 71), 1, true));
        a4.setIconTextGap(5);
        a4.setOpaque(true);
        a4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a4MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                a4MouseExited(evt);
            }
        });
        a4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                a4MouseMoved(evt);
            }
        });
        jPanel1.add(a4);

        a6.setBackground(new java.awt.Color(29, 29, 29));
        a6.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        a6.setForeground(new java.awt.Color(153, 153, 153));
        a6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(71, 71, 71), 1, true));
        a6.setIconTextGap(5);
        a6.setOpaque(true);
        a6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a6MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                a6MouseExited(evt);
            }
        });
        a6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                a6MouseMoved(evt);
            }
        });
        jPanel1.add(a6);

        jFrame4.getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 3, 605, 32));

        jLabel5.setBackground(new java.awt.Color(49, 49, 49));
        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        jLabel5.setOpaque(true);
        jFrame4.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 36, 460, 40));

        l129.setBackground(new java.awt.Color(45, 45, 45));
        l129.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        l129.setForeground(new java.awt.Color(255, 255, 255));
        l129.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l129.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        l129.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        l129.setOpaque(true);
        l129.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        l129.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l129MouseClicked(evt);
            }
        });
        l129.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                l129MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                l129MouseMoved(evt);
            }
        });
        jFrame4.getContentPane().add(l129, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 625, 78));

        jTextField3.setText("0");
        jFrame4.getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTextField4.setText("1");

        jTextField6.setText("36");

        jLabel34.setText("jLabel34");

        jButton7.setText("jButton7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jTextField7.setText("36");

        jFrame5.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        jFrame5.setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        jFrame5.setMinimumSize(new java.awt.Dimension(626, 36));
        jFrame5.setUndecorated(true);
        jFrame5.setOpacity(0.4F);
        jFrame5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jFrame5MouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jFrame5MouseReleased(evt);
            }
        });
        jFrame5.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                jFrame5WindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                jFrame5WindowOpened(evt);
            }
        });
        jFrame5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jFrame5MouseDragged(evt);
            }
        });
        jFrame5.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l130.setBackground(new java.awt.Color(0, 0, 0));
        l130.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        l130.setForeground(new java.awt.Color(255, 255, 255));
        l130.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l130.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        l130.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true)));
        l130.setOpaque(true);
        l130.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        l130.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l130MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                l130MouseReleased(evt);
            }
        });
        l130.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                l130MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                l130MouseMoved(evt);
            }
        });
        jFrame5.getContentPane().add(l130, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 646, 100));

        jButton4.setText("jButton4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setText("jButton6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton9.setText("jButton9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel33.setText("jLabel33");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBounds(new java.awt.Rectangle(440, 50, 0, 0));
        setMaximizedBounds(new java.awt.Rectangle(1360, 768, 0, 0));
        setMinimumSize(new java.awt.Dimension(530, 638));
        setUndecorated(true);
        setOpacity(0.4F);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                formComponentMoved(evt);
            }
        });
        addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                formComponentAdded(evt);
            }
        });
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(51, 51, 51));
        bg.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true)));
        bg.setOpaque(true);
        bg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bgMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bgMouseReleased(evt);
            }
        });
        bg.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                bgMouseDragged(evt);
            }
        });
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 638));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
int nr = jLabel31.getForeground().getRed();
int ng = jLabel31.getForeground().getGreen();
int nb = jLabel31.getForeground().getBlue();
int nr1 = jLabel36.getForeground().getRed();
int ng1 = jLabel36.getForeground().getGreen();
int nb1 = jLabel36.getForeground().getBlue();
Calendar calendar = Calendar.getInstance();
   calendar.setTimeInMillis(System.currentTimeMillis());
            int hours = calendar.get(Calendar.HOUR_OF_DAY);
            int minutes = calendar.get(Calendar.MINUTE);
            int seconds = calendar.get(Calendar.SECOND);
            int am_pm=calendar.get(Calendar.AM_PM);
            int date=calendar.get(Calendar.DATE); 
            int month=calendar.get(Calendar.MONTH)+1;
            int year=calendar.get(Calendar.YEAR);
            int dom=calendar.get(Calendar.DAY_OF_WEEK);
   int i= (date)%7;
   int k =0 ;
            if(i-1>=dom) {
            k = 7+dom-(i-1);
    }
    if(i-1<dom){
        k = dom-(i-1);
    }
    String day;
    switch(k){
   case 1:day ="SUNDAY";  l(1,""+1);set("1"); setforeground(1,nr,ng,nb); break;
   case 2:day="MONDAY";   l(2,""+1);set("2");setforeground(2,nr,ng,nb);break;
   case 3:day="TUESDAY";  l(3,""+1);set("3");setforeground(3,nr,ng,nb);break;
   case 4:day="WEDNESDAY";l(4,""+1);set("4");setforeground(4,nr,ng,nb);break;
   case 5:day="THURSDAY"; l(5,""+1);set("5");setforeground(5,nr,ng,nb);break; 
   case 6:day="FRIDAY";   l(6,""+1);set("6");setforeground(6,nr,ng,nb);break;
   case 7:day="SATURDAY"; l(7,""+1);set("7");setforeground(7,nr,ng,nb);break;
    }
  String  t;
            if(am_pm==1){ t="PM";}
            else{ t="AM";}
           if(hours>12){hours=hours-12;
            }
 
int o=31; int r = 0;
    String d_ate=" ";
    switch(month){ // o current month's day number and r is previous
        case 1:d_ate="January"; o=31; r =31; break;
    case 2:d_ate="February"; r=31; {if(year%4==0) { o=29;} else  {o = 28;}}  break;
    case 3:d_ate="March";  o =31;{if(year%4==0) { r=29;} else  {r = 28;}} break;
    case 4:d_ate="April";o =30; r =31;break;
    case 5:d_ate="May";o =31;r =30;break;
    case 6:d_ate="June";o =30;r =31;break;
    case 7:d_ate="July";o =31;r =30; break;
    case 8:d_ate="August";o =31; r =31;break;
    case 9:d_ate="September";o =30; r =31;break;
    case 10:d_ate="October";o =31;r =30;break;
    case 11:d_ate="November";o =30; r =31;break;
    case 12:d_ate="December";o =31; r =30;break;}
    
      jLabel40.setText(""+d_ate);
      jTextField8.setText(""+year);
int a = Integer.parseInt(l.getText())+1;
int c = Integer.parseInt(l.getText())-1;
   for(int b =2,n=a;a<=42;a++,b++,n++) {
       if(b>o) {
           l(a,""+(b-o));
           foreground1(a,nr1,ng1,nb1);
       }
       else{ l(a,""+b); 
       setforeground(a,nr,ng,nb);
       jL.setText(""+(n+1));
       if(b==date) { border(a);}
       }
   }
   for(;c>=0;c--,r--) {
       l(c,""+r);
       foreground1(c,nr1,ng1,nb1);
       
       
   }
   jLabel40.setText(d_ate);
   
         // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void nextbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextbtnActionPerformed
int nr = jLabel31.getForeground().getRed();
int ng = jLabel31.getForeground().getGreen();
int nb = jLabel31.getForeground().getBlue();
int nr1 = jLabel36.getForeground().getRed();
int ng1 = jLabel36.getForeground().getGreen();
int nb1 = jLabel36.getForeground().getBlue();

        int i = Integer.parseInt(jL.getText())%7; 
int a = i-1; 
System.out.println(a);
if(a<0) { a = a+7; System.out.print(a); }
switch(i){
    case 1 : l(1,""+1);set("1");setforeground(1,nr,ng,nb); break;
    case 2 : l(2,""+1);set("2");setforeground(2,nr,ng,nb); break;    
    case 3 : l(3,""+1);set("3");setforeground(3,nr,ng,nb); break; 
    case 4 : l(4,""+1);set("4"); setforeground(4,nr,ng,nb);break;
    case 5 : l(5,""+1);set("5"); setforeground(5,nr,ng,nb);break;    
    case 6 : l(6,""+1);set("6");setforeground(6,nr,ng,nb); break;    
    case 0 :  i = 7 ; l(7,""+1);set("7");setforeground(7,nr,ng,nb); break;    

}
Calendar calendar = Calendar.getInstance();
   calendar.setTimeInMillis(System.currentTimeMillis());
int year=Integer.parseInt(jTextField8.getText());
String d_ate=" "; int o=0; int r =0; 
// o indicate the num of days in next month while r indicates the num of day in present month
String month = jLabel40.getText();
switch(month){
    case "January" : {if(year%4==0) { o=29; } else  {o = 28;} r =31;} 
                         jLabel40.setText("February");
        break;
    case "February": o=31; {if(year%4==0) { r=29;} else  {r = 28;}}  jLabel40.setText("March");break;
    case "March":  o =30; r =31; jLabel40.setText("April");break;
    case "April":o =31; r =30;jLabel40.setText("May");break;
    case "May":o =30;r =31;jLabel40.setText("June");break;
    case "June":o =31;r =30;jLabel40.setText("July");break;
    case "July":o =31;r =31; jLabel40.setText("August");break;
    case "August":o =30; r =31;jLabel40.setText("September");break;
    case "September":o =31; r =30;jLabel40.setText("October");break;
    case "October":o =30;r =31;jLabel40.setText("November");break;
    case "November":o =31; r =30;jLabel40.setText("December");break;
    case "December":o =31; r =31;jLabel40.setText("January"); jTextField8.setText(Integer.toString(Integer.parseInt(jTextField8.getText())+1)); break;}

int n=i+1;
for(int j=1;i<=42;i++,j++,n++){
    if(j>o) {
        l(i,""+(j-o));
           foreground1(i,nr1,ng1,nb1);
    }
    else {
        
    
        l(i,""+(j));
    jL.setText(""+(n+7)); setforeground(i,nr,ng,nb);

}}
for(;a>0;a--,r--){
    
    l(a,""+r);
       foreground1(a,nr1,ng1,nb1);
}

        // TODO add your handling code here:
    }//GEN-LAST:event_nextbtnActionPerformed

    private void prevbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevbtnActionPerformed
int nr = jLabel31.getForeground().getRed();
int ng = jLabel31.getForeground().getGreen();
int nb = jLabel31.getForeground().getBlue();
int nr1 = jLabel36.getForeground().getRed();
int ng1 = jLabel36.getForeground().getGreen();
int nb1 = jLabel36.getForeground().getBlue();

        Calendar calendar = Calendar.getInstance();
   calendar.setTimeInMillis(System.currentTimeMillis());
int year=Integer.parseInt(jTextField8.getText());
String d_ate=" "; int o=0; int r =0; int day = Integer.parseInt(l.getText()),dom = 0;
// o indicate the num of days in past month while r indicates the num of day in paster month
String month = jLabel40.getText();
switch(month){
    case "January" :  { o=31;r =30;} 
                jLabel40.setText("December");jTextField8.setText(Integer.toString(Integer.parseInt(jTextField8.getText())-1));
                year = year -1;
        break;
    case "February": o=31; r = 31;   jLabel40.setText("January");break;
    case "March":  {if(year%4==0) { o=29;} else  {o = 28;}} r =31; jLabel40.setText("February");break;
    case "April":o =31;{if(year%4==0) { r=29;} else  {r = 28;}}jLabel40.setText("March");break;
    case "May":o =30;r =31;jLabel40.setText("April");break;
    case "June":o =31;r =30;jLabel40.setText("May");break;
    case "July":o =30;r =31; jLabel40.setText("June");break;
    case "August":o =31; r =30;jLabel40.setText("July");break;
    case "September":o =31; r =31;jLabel40.setText("August");break;
    case "October":o =30;r =31;jLabel40.setText("September");break;
    case "November":o =31; r =30;jLabel40.setText("October");break;
    case "December":o =30; r =31;jLabel40.setText("November");  break;}
switch(day){
    case 1 : dom = 7 ;  break;
    case 2 : dom = 1 ;  break;
    case 3 : dom = 2 ;  break;
    case 4 : dom = 3 ;  break;    
    case 5 : dom = 4 ;  break;    
    case 6 : dom = 5 ;  break;    
    case 7 : dom = 6 ;  break;    
}
 int i= o%7;
    int j = i -(i-1);
    int k =0 ;
    if(i-1>=dom) {
        k = 7+dom-(i-1);
    }
    if(i-1<dom){
        k = dom-(i-1);
    }
   String day1;
    switch(k){
   case 1:day1 ="SUNDAY";  l(1,""+1);set("1"); setforeground(1,nr,ng,nb); break;
   case 2:day1="MONDAY";   l(2,""+1);set("2"); setforeground(2,nr,ng,nb);break;
   case 3:day1="TUESDAY";  l(3,""+1);set("3"); setforeground(3,nr,ng,nb);break;
   case 4:day1="WEDNESDAY";l(4,""+1);set("4"); setforeground(4,nr,ng,nb);break;
   case 5:day1="THURSDAY"; l(5,""+1);set("5"); setforeground(5,nr,ng,nb);break; 
   case 6:day1="FRIDAY";   l(6,""+1);set("6"); setforeground(6,nr,ng,nb);break;
   case 7:day1="SATURDAY"; l(7,""+1);set("7"); setforeground(7,nr,ng,nb);break;
    }  
    int a = Integer.parseInt(l.getText())+1;
int c = Integer.parseInt(l.getText())-1;
   for(int b =2,n=a;a<=42;a++,b++,n++) {
       if(b>o) {
           l(a,""+(b-o));
            foreground1(a,nr1,ng1,nb1);
       } 
       else{ l(a,""+b);  
       jL.setText(""+(n+8));
      setforeground(a,nr,ng,nb);
       }
   }
   for(;c>=0;c--,r--) {
       l(c,""+r); 
        foreground1(c,nr1,ng1,nb1);
   }
  jTextField8.setText(""+year);
       // TODO add your handling code here:
    }//GEN-LAST:event_prevbtnActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
main.setVisible(true);
 PointerInfo bh=  MouseInfo.getPointerInfo();
int filx= (int) this.getLocation().getX();
int fily = (int) this.getLocation().getY();

main.setBounds(filx+18, fily+18,0,0);
int mix= (int) bh.getLocation().getX();
int miy = (int)bh.getLocation().getY();
jTextField1.setText(""+mix);
jTextField2.setText(""+miy);

// TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void formComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentMoved

    private void formComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentAdded

    private void jFrame4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jFrame4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jFrame4MouseExited

    private void jFrame4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jFrame4MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jFrame4MouseReleased

    private void jFrame4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jFrame4MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jFrame4MouseDragged

    private void v1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_v1MouseMoved
 v1.setForeground(v1.getForeground());         // TODO add your handling code here:
    }//GEN-LAST:event_v1MouseMoved

    private void v2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_v2MouseMoved
 v2.setForeground(v1.getForeground());       // TODO add your handling code here:
    }//GEN-LAST:event_v2MouseMoved

    private void v3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_v3MouseMoved
 v3.setForeground(v1.getForeground());         // TODO add your handling code here:
    }//GEN-LAST:event_v3MouseMoved

    private void v4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_v4MouseMoved
 v4.setForeground(v1.getForeground());         // TODO add your handling code here:
    }//GEN-LAST:event_v4MouseMoved

    private void v1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_v1MouseClicked
jTextField3.setText(""+1);
jLabel21.setText("Calender");
v1.setForeground(new java.awt.Color(240,240,240));
v3.setForeground(new java.awt.Color(71,71,71));
v4.setForeground(new java.awt.Color(71,71,71));
v2.setForeground(new java.awt.Color(71,71,71));
v2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0,0,0)));
v3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0,0,0)));
v4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0,0,0)));
v1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(255,255,255)));
clndrpnl.setVisible(true);ntspnl.setVisible(false);  jcchpnl.setVisible(false);stngspnl.setVisible(false);
cddpnl.setVisible(true);evntpnl.setVisible(false);stngspnl.setVisible(false);jfchpnl.setVisible(false);
       // TODO add your handling code here:
    }//GEN-LAST:event_v1MouseClicked

    private void v2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_v2MouseClicked
jLabel21.setText("Events");jTextField3.setText(""+2);
v2.setForeground(new java.awt.Color(240,240,240));
v3.setForeground(new java.awt.Color(71,71,71));
v4.setForeground(new java.awt.Color(71,71,71));
v1.setForeground(new java.awt.Color(71,71,71));
v1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0,0,0)));
v3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0,0,0)));
v4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0,0,0)));
v2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(255,255,255)));   
evntpnl.setVisible(true);ntspnl.setVisible(false);stngspnl.setVisible(false);jfchpnl.setVisible(false);
clndrpnl.setVisible(false);cddpnl.setVisible(false);  jcchpnl.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_v2MouseClicked

    private void v3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_v3MouseClicked
jTextField3.setText(""+3);jLabel21.setText("Notes");
v3.setForeground(new java.awt.Color(240,240,240));
v1.setForeground(new java.awt.Color(71,71,71));
v4.setForeground(new java.awt.Color(71,71,71));
v2.setForeground(new java.awt.Color(71,71,71));
v2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0,0,0)));
v1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0,0,0)));
v4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0,0,0)));
v3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(255,255,255))); 
evntpnl.setVisible(false);ntspnl.setVisible(true);  jcchpnl.setVisible(false);jfchpnl.setVisible(false);
clndrpnl.setVisible(false);cddpnl.setVisible(false);stngspnl.setVisible(false);

// TODO add your handling code here:
    }//GEN-LAST:event_v3MouseClicked

    private void v4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_v4MouseClicked
jTextField3.setText(""+4);jLabel21.setText("Settings");
v4.setForeground(new java.awt.Color(240,240,240));
v3.setForeground(new java.awt.Color(71,71,71));
v1.setForeground(new java.awt.Color(71,71,71));
v2.setForeground(new java.awt.Color(71,71,71));
v2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0,0,0)));
v3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0,0,0)));
v1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0,0,0)));
v4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(255,255,255)));  
evntpnl.setVisible(false);
stngspnl.setVisible(true);jcchpnl.setVisible(false);
clndrpnl.setVisible(false);cddpnl.setVisible(false);ntspnl.setVisible(false);jfchpnl.setVisible(false);

// TODO add your handling code here:
    }//GEN-LAST:event_v4MouseClicked

    private void v1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_v1MouseExited
 if(Integer.parseInt(jTextField3.getText())!=1){ v1.setForeground(new java.awt.Color(153, 153,153));}         // TODO add your handling code here:
    }//GEN-LAST:event_v1MouseExited

    private void v2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_v2MouseExited
 if(Integer.parseInt(jTextField3.getText())!=2){ v2.setForeground(new java.awt.Color(153, 153,153));}         // TODO add your handling code here:
    }//GEN-LAST:event_v2MouseExited

    private void v3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_v3MouseExited
 if(Integer.parseInt(jTextField3.getText())!=3){ v3.setForeground(new java.awt.Color(153, 153,153));}         // TODO add your handling code here:
    }//GEN-LAST:event_v3MouseExited

    private void v4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_v4MouseExited
  if(Integer.parseInt(jTextField3.getText())!=4){ v4.setForeground(new java.awt.Color(153, 153,153));}        // TODO add your handling code here:
    }//GEN-LAST:event_v4MouseExited

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void a1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a1MouseMoved
border1(1);        // TODO add your handling code here:
    }//GEN-LAST:event_a1MouseMoved

    private void a1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a1MouseExited
border2(1);        // TODO add your handling code here:
    }//GEN-LAST:event_a1MouseExited

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
jFrame4.setVisible(true);

// TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jCheckBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox2ItemStateChanged
String o = System.getProperty("user.name");

        File a = new File("OA.jar");
        File b = new File("C:\\Users\\"+o+"\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Startup\\OA.jar");
        
        if(jCheckBox2.isSelected()){
       Path n =  a.toPath();
        Path n1 = b.toPath();
        
        try {
            Files.copy(n, n1,java.nio.file.StandardCopyOption.REPLACE_EXISTING);
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(null,ex);
             }  }
        
else
    b.delete();
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ItemStateChanged

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
int i = Integer.parseInt(jLabel33.getText());
Color color =  jColorChooser2.getColor();
switch(i){
    case 1 : jLabel31.setForeground(color);break; 
    case 2 : jLabel38.setForeground(color);break;
    case 3 : jLabel31.setBackground(color);jLabel36.setBackground(color);
             jLabel38.setBackground(color);break;
}
jcchpnl.setVisible(false); stngspnl.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jCheckBox3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox3ItemStateChanged
if(jCheckBox3.isSelected()) {
    jPanel10.setVisible(true); }
else jPanel10.setVisible(false);
// TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox3ItemStateChanged

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
stngspnl.setVisible(false);  jLabel33.setText("1");jfchpnl.setVisible(false);
        jcchpnl.setVisible(true);  
        
// TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
   stngspnl.setVisible(false);  jcchpnl.setVisible(true); jLabel33.setText("2"); jfchpnl.setVisible(false);prevbtn.doClick();
nextbtn.doClick();
   // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void a1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a1MouseClicked
value(1);       // TODO add your handling code here:
    }//GEN-LAST:event_a1MouseClicked

    private void jFileChooser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooser1ActionPerformed
File f = jFileChooser1.getSelectedFile();
String q = f.toString().replace('\\','#');
String s = f.getName();
Icon i = jFileChooser1.getIcon(f);
int n = Integer.parseInt(jLabel34.getText());
switch (n) {
    case 1 : label(1,s,i); update1(1,"Insert into fastlane values(1,'"+q+"');");  break;
    case 2 : label(2,s,i); update1(2,"Insert into fastlane values(2,'"+q+"');");break;
    case 3 : label(3,s,i); update1(3,"Insert into fastlane values(3,'"+q+"');");break;
    case 4 : label(4,s,i); update1(4,"Insert into fastlane values(4,'"+q+"');");break;  
    case 5 : label(5,s,i); update1(5,"Insert into fastlane values(5,'"+q+"');");break;  
}
jfchpnl.setVisible(false);
stngspnl.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_jFileChooser1ActionPerformed

    private void o1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_o1MouseClicked
 jfchpnl.setVisible(true); jLabel34.setText("1"); stngspnl.setVisible(false);       // TODO add your handling code here:
    }//GEN-LAST:event_o1MouseClicked

    private void o3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_o3MouseClicked
     jfchpnl.setVisible(true); jLabel34.setText("3"); stngspnl.setVisible(false);   // TODO add your handling code here:
    }//GEN-LAST:event_o3MouseClicked

    private void o2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_o2MouseClicked
      jfchpnl.setVisible(true); jLabel34.setText("2"); stngspnl.setVisible(false);  // TODO add your handling code here:
    }//GEN-LAST:event_o2MouseClicked

    private void o4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_o4MouseClicked
      jfchpnl.setVisible(true); jLabel34.setText("4"); stngspnl.setVisible(false);  // TODO add your handling code here:
    }//GEN-LAST:event_o4MouseClicked

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
String s1 = addbtn.getText();
if(s1.equals("Add Event")){
       String title = jTextField5.getText();
String d = (String) jComboBox1.getSelectedItem();
String m = ""+ (jComboBox2.getSelectedIndex()+1);
String y = ""+ jComboBox3.getSelectedItem();
String d1 = (String) jComboBox4.getSelectedItem();
String m1 = ""+(jComboBox5.getSelectedIndex()+1);
String y1 = (String) jComboBox6.getSelectedItem();
String desc = jTextArea1.getText();

String insert = "Insert into event values ('"+title+"','"+y+"-"+m+"-"+d+"','"+y1+"-"+m1+"-"+d1+"','"+desc+"');";
System.out.println(insert);
update(insert);
}
else { 
    jTextField5.setText("");
    jTextArea1.setText(" "); }
// TODO add your handling code here:
    }//GEN-LAST:event_addbtnActionPerformed

    private void aadnbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aadnbtnActionPerformed
String desc = jTextArea2.getText();
String date = jLabel10.getText();
System.out.println(date+desc);
String insert = "Insert into notes values ('"+date+"','"+desc+"');";
update(insert);        // TODO add your handling code here:
    }//GEN-LAST:event_aadnbtnActionPerformed

    private void jFrame4WindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jFrame4WindowActivated

connect(1); connect(2); connect(3); connect(4);connect(5);

// TODO add your handling code here:
    }//GEN-LAST:event_jFrame4WindowActivated

    private void ntspnlFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ntspnlFocusGained
DefaultListModel dlm  = (DefaultListModel) jList1.getModel();
System.out.println("iouhxcgvbjknb");
 try {

            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/calendar", "root", "asvm");
            Statement stmt = con.createStatement();
            String query = "Select * from notes";
         ResultSet rs =  stmt.executeQuery(query);
         while(rs.next()){
             String S1 = rs.getString("date");
             String S2 = rs.getString("note");
             System.out.println(""+S1+S2);
             dlm.addElement(" "+S1+" "+S2);
         }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_ntspnlFocusGained

    private void evntpnlFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_evntpnlFocusGained
DefaultListModel dlm  = (DefaultListModel) jList2.getModel();
 try {

            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/calendar", "root", "asvm");
            Statement stmt = con.createStatement();
            String query = "Select * from event";
         ResultSet rs =  stmt.executeQuery(query);
         while(rs.next()){
             String S1 = rs.getString("sdate");
             String S2 = rs.getString("title");
             dlm.addElement(" "+S1+" "+S2);
         }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_evntpnlFocusGained

    private void jFrame4WindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jFrame4WindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_jFrame4WindowOpened

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
stngspnl.setVisible(false);  jLabel33.setText("3");jfchpnl.setVisible(false);
        jcchpnl.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jList2ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList2ValueChanged
String S1 = ""+jList2.getSelectedValue();
try {

            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/calendar", "root", "asvm");
            Statement stmt = con.createStatement();
            String query = "Select title,year(sdate),month(sdate),day(sdate),year(edate),month(edate),day(edate),event"
                    + " from event where Concat(sdate,Concat(' ',title)) = '"+S1+"' ;";
           System.out.println(query);
            ResultSet rs = stmt.executeQuery(query);
          while(rs.next())  {
         jTextField5.setText(rs.getString("title"));
         jComboBox1.setSelectedItem(rs.getObject("day(sdate)"));
         jComboBox2.setSelectedItem(rs.getObject("month(sdate)"));
         jComboBox3.setSelectedItem(rs.getObject("year(sdate)"));
         jComboBox4.setSelectedItem(rs.getObject("day(edate)"));
         jComboBox5.setSelectedItem(rs.getObject("month(edate)"));
         jComboBox6.setSelectedItem(rs.getObject("year(edate)"));
         jTextArea1.setText(rs.getString("event"));
          }
               }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
// TODO add your handling code here:
    }//GEN-LAST:event_jList2ValueChanged

    private void mainWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_mainWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_mainWindowActivated

    private void evntpnlMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_evntpnlMouseMoved
        DefaultListModel dlm  = (DefaultListModel) jList2.getModel();
        dlm.removeAllElements();
        try {

            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/calendar", "root", "asvm");
            Statement stmt = con.createStatement();
            String query = "Select * from event";
            ResultSet rs =  stmt.executeQuery(query);
            while(rs.next()){
                String S1 = rs.getString("sdate");
                String S2 = rs.getString("title");
                dlm.addElement(" "+S1+" "+S2);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }         // TODO add your handling code here:
    }//GEN-LAST:event_evntpnlMouseMoved

    private void jList2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList2MouseClicked
        String S1 = ""+jList2.getSelectedValue();
        try {

            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/calendar", "root", "asvm");
            Statement stmt = con.createStatement();
            String query = "Select title,year(sdate),month(sdate),day(sdate),year(edate),month(edate),day(edate),event"
            + " from event where Concat(sdate,Concat(' ',title)) = '"+S1+"' ;";

            ResultSet rs = stmt.executeQuery(query);
            while(rs.next())  {
                jTextField5.setText(rs.getString("title"));
                jComboBox1.setSelectedItem(rs.getObject("day(sdate)"));
                jComboBox2.setSelectedItem(rs.getObject("month(sdate)"));
                jComboBox3.setSelectedItem(rs.getObject("year(sdate)"));
                jComboBox4.setSelectedItem(rs.getObject("day(edate)"));
                jComboBox5.setSelectedItem(rs.getObject("month(edate)"));
                jComboBox6.setSelectedItem(rs.getObject("year(edate)"));
                jTextArea1.setText(rs.getString("event"));
            }
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jList2MouseClicked

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_formFocusGained

    private void a5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a5MouseClicked
System.exit(0);
// TODO add your handling code here:
    }//GEN-LAST:event_a5MouseClicked

    private void a5MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a5MouseMoved
border1(5);        // TODO add your handling code here:
    }//GEN-LAST:event_a5MouseMoved

    private void a5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a5MouseExited
border2(5);        // TODO add your handling code here:
    }//GEN-LAST:event_a5MouseExited

    private void a3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a3MouseClicked
value(3);        // TODO add your handling code here:
    }//GEN-LAST:event_a3MouseClicked

    private void a3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a3MouseExited
border2(3);          // TODO add your handling code here:
    }//GEN-LAST:event_a3MouseExited

    private void a3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a3MouseMoved
border1(3);        // TODO add your handling code here:
    }//GEN-LAST:event_a3MouseMoved

    private void a4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a4MouseClicked
value(4);        // TODO add your handling code here:
    }//GEN-LAST:event_a4MouseClicked

    private void a4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a4MouseExited
border2(4);          // TODO add your handling code here:
    }//GEN-LAST:event_a4MouseExited

    private void a4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a4MouseMoved
border1(4);        // TODO add your handling code here:
    }//GEN-LAST:event_a4MouseMoved

    private void a6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a6MouseClicked
value(5);        // TODO add your handling code here:
    }//GEN-LAST:event_a6MouseClicked

    private void a6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a6MouseExited
border2(6);          // TODO add your handling code here:
    }//GEN-LAST:event_a6MouseExited

    private void a6MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a6MouseMoved
border1(6);        // TODO add your handling code here:
    }//GEN-LAST:event_a6MouseMoved

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
Color c=bg.getBackground().darker();
        
       System.out.print(c.getRGB());
jFrame5.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void l129MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l129MouseMoved
 
    }//GEN-LAST:event_l129MouseMoved

    private void l129MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l129MouseClicked
       // TODO add your handling code here:
    }//GEN-LAST:event_l129MouseClicked

    private void l129MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l129MouseDragged
 // TODO add your handling code here:
    }//GEN-LAST:event_l129MouseDragged

    private void l130MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l130MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_l130MouseClicked

    private void l130MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l130MouseDragged
      PointerInfo bh=  MouseInfo.getPointerInfo();
int mpx = (int)  bh.getLocation().getX(); 
int mpy = (int)  bh.getLocation().getY();
int fclx = (int) jFrame5.getLocation().getX();
int fcly = (int) jFrame5.getLocation().getY();

  int a= Integer.parseInt(jTextField6.getText());
  int b =Integer.parseInt(jTextField7.getText());
  int d=a+(mpx-a);
  int e =b+(mpy-b);
   System.out.println(d);
jTextField7.setText(""+e);
jTextField6.setText(""+d);

int n1 = fclx+(mpx-a);
 
int n2 = fcly+(mpy-b);  

jFrame5.setBounds(n1,n2,646,100);
jFrame4.setBounds(n1+10,n2+10,625,78);// TODO add your handling code here:

    }//GEN-LAST:event_l130MouseDragged

    private void l130MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l130MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_l130MouseMoved

    private void jFrame5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jFrame5MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jFrame5MouseExited

    private void jFrame5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jFrame5MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jFrame5MouseReleased

    private void jFrame5WindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jFrame5WindowActivated
  jFrame4.setVisible(true);
  int fl=(int)jFrame5.getLocation().getX();
  int fly=(int)jFrame5.getLocation().getY();
  jFrame4.setLocation(fl+10,fly+10);
        PointerInfo bh=  MouseInfo.getPointerInfo();
int mix= (int) bh.getLocation().getX();
int miy = (int)bh.getLocation().getY();
jTextField6.setText(""+mix);
jTextField7.setText(""+miy);

      // TODO add your handling code here:
    }//GEN-LAST:event_jFrame5WindowActivated

    private void jFrame5WindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jFrame5WindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_jFrame5WindowOpened

    private void jFrame5MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jFrame5MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jFrame5MouseDragged

    private void l130MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l130MouseReleased
jTextField6.setText(""+jFrame5.getLocation().x);
jTextField7.setText(""+jFrame5.getLocation().y);        // TODO add your handling code here:
    }//GEN-LAST:event_l130MouseReleased

    private void jLabel37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel37MouseClicked
if(this.isVisible()==false){this.setVisible(true);}        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel37MouseClicked

    private void o5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_o5MouseClicked
 jfchpnl.setVisible(true); jLabel34.setText("5"); stngspnl.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_o5MouseClicked

    private void a2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a2MouseMoved
        border1(2);        // TODO add your handling code here:
    }//GEN-LAST:event_a2MouseMoved

    private void a2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a2MouseExited
        border2(2);       // TODO add your handling code here:
    }//GEN-LAST:event_a2MouseExited

    private void a2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a2MouseClicked
        value(2);         // TODO add your handling code here:
    }//GEN-LAST:event_a2MouseClicked

    private void bgMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgMouseDragged
        PointerInfo bh=  MouseInfo.getPointerInfo();
        int mpx = (int)  bh.getLocation().getX();
        int mpy = (int)  bh.getLocation().getY();
        int fclx = (int) this.getLocation().getX();
        int fcly = (int) this.getLocation().getY();

        int a= Integer.parseInt(jTextField1.getText());
        int b =Integer.parseInt(jTextField2.getText());
        int d=a+(mpx-a);
        int e =b+(mpy-b);

        jTextField2.setText(""+e);
        jTextField1.setText(""+d);

        int n1 = fclx+(mpx-a);

        int n2 = fcly+(mpy-b);
        this.setLocation(n1,n2);

        main.setBounds(n1+18,n2+20,0,0);
        // TODO add your handling code here:
    }//GEN-LAST:event_bgMouseDragged

    private void bgMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgMouseReleased
        jTextField1.setText(""+this.getLocation().x);
        jTextField2.setText(""+this.getLocation().y);
        // TODO add your handling code here:
    }//GEN-LAST:event_bgMouseReleased

    private void bgMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_bgMousePressed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
int r=jLabel36.getBackground().getRed();
int g=jLabel36.getBackground().getGreen();
int b=jLabel36.getBackground().getBlue();
update1(3,"Insert into color values (3,"+r+","+g+","+b+");");

int r2=jLabel31.getForeground().getGreen();
int r1=jLabel31.getForeground().getRed();
int r3=jLabel31.getForeground().getBlue();
update1(1,"Insert into color values (1,"+r1+","+r2+","+r3+");");
int g2=jLabel38.getForeground().getGreen();
int g1=jLabel38.getForeground().getRed();
int g3=jLabel38.getForeground().getBlue();
update1(2,"Insert into color values (2,"+g1+","+g2+","+g3+");");
try {

            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/calendar", "root", "asvm");
            Statement stmt = con.createStatement();
            String query =  "Select * from color where id = 1";
            String query1 = "Select * from color where id = 2";
            String query2 = "Select * from color where id = 3";
         ResultSet rs =  stmt.executeQuery(query);
         while(rs.next()){
             jLabel31.setForeground(new java.awt.Color(rs.getInt("nr"), rs.getInt("ng"), rs.getInt("nb")));
              }
        ResultSet rs1 =  stmt.executeQuery(query1);         
        while(rs1.next()){
             jLabel36.setForeground(new java.awt.Color(rs1.getInt("nr"), rs1.getInt("ng"), rs1.getInt("nb")));
           
         } ResultSet rs2 =  stmt.executeQuery(query2);
         while(rs2.next()){
             Color color = new java.awt.Color(rs2.getInt("nr"), rs2.getInt("ng"), rs2.getInt("nb"));
             jLabel31.setBackground(color); jLabel36.setBackground(color);
             jLabel7.setBackground(color); cddpnl.setBackground(color);
             jPanel2.setBackground(color); jLabel31.setBackground(color);
             
             
         }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            System.out.println(""+e);
        } 

setThemecolor(r,g,b,g1,g2,g3,r1,r2,r3);
jButton6.doClick();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void mainWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_mainWindowOpened
try {

            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/calendar", "root", "asvm");
            Statement stmt = con.createStatement();
            String query =  "Select * from color where id = 1";
            String query1 = "Select * from color where id = 2";
            String query2 = "Select * from color where id = 3";
         ResultSet rs =  stmt.executeQuery(query);
         while(rs.next()){
             jLabel31.setForeground(new java.awt.Color(rs.getInt("nr"), rs.getInt("ng"), rs.getInt("nb")));
              }
        ResultSet rs1 =  stmt.executeQuery(query1);         
        while(rs1.next()){
             jLabel36.setForeground(new java.awt.Color(rs1.getInt("nr"), rs1.getInt("ng"), rs1.getInt("nb")));
             
         } ResultSet rs2 =  stmt.executeQuery(query2);
         while(rs2.next()){
             Color color = new java.awt.Color(rs2.getInt("nr"), rs2.getInt("ng"), rs2.getInt("nb"));
             jLabel31.setBackground(color); jLabel36.setBackground(color);
             jLabel7.setBackground(color); cddpnl.setBackground(color);
             jPanel2.setBackground(color); jLabel31.setBackground(color);
             
             
         }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } 
        // TODO add your handling code here:
    }//GEN-LAST:event_mainWindowOpened

    private void v1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_v1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_v1MouseEntered

    private void a7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a7MouseClicked
  value(7);      // TODO add your handling code here:
    }//GEN-LAST:event_a7MouseClicked

    private void a7MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a7MouseMoved
border1(7);        // TODO add your handling code here:
    }//GEN-LAST:event_a7MouseMoved

    private void a7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a7MouseExited
border2(7) ;       // TODO add your handling code here:
    }//GEN-LAST:event_a7MouseExited

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
clndrpnl.setVisible(false);ntspnl.setVisible(false);  jcchpnl.setVisible(false);stngspnl.setVisible(false);
cddpnl.setVisible(true);  evntpnl.setVisible(false);stngspnl.setVisible(false);jfchpnl.setVisible(false);clndrpnl.setVisible(true);
jTextField3.setText(""+1);jLabel21.setText("Calendar");
v1.setForeground(new java.awt.Color(240,240,240));
v4.setForeground(new java.awt.Color(71,71,71));
v3.setForeground(new java.awt.Color(71,71,71));
v2.setForeground(new java.awt.Color(71,71,71));
v2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0,0,0)));
v3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0,0,0)));
v4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0,0,0)));
v1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(255,255,255)));  // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
jTextField3.setText(""+4);jLabel21.setText("Settings");
v4.setForeground(new java.awt.Color(240,240,240));
v3.setForeground(new java.awt.Color(71,71,71));
v1.setForeground(new java.awt.Color(71,71,71));
v2.setForeground(new java.awt.Color(71,71,71));
v2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0,0,0)));
v3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0,0,0)));
v1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0,0,0)));
v4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(255,255,255)));  
evntpnl.setVisible(false);
stngspnl.setVisible(true);jcchpnl.setVisible(false);
clndrpnl.setVisible(false);cddpnl.setVisible(false);ntspnl.setVisible(false);jfchpnl.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void v5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_v5MouseClicked
v5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
jFrame4.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_v5MouseClicked

    private void v5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_v5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_v5MouseEntered

    private void v5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_v5MouseExited
 v5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));       // TODO add your handling code here:
    }//GEN-LAST:event_v5MouseExited

    private void v5MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_v5MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_v5MouseMoved

    private void cddpnlComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_cddpnlComponentMoved
jButton6.doClick();        // TODO add your handling code here:
    }//GEN-LAST:event_cddpnlComponentMoved

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
int nr = jLabel31.getForeground().getRed();
int ng = jLabel31.getForeground().getGreen();
int nb = jLabel31.getForeground().getBlue();
int nr1 = jLabel36.getForeground().getRed();
int ng1 = jLabel36.getForeground().getGreen();
int nb1 = jLabel36.getForeground().getBlue();

        Calendar calender = Calendar.getInstance();
int year = calender.get(Calendar.YEAR);
int year1 = Integer.parseInt(jTextField8.getText()); 
if(year1>year){
int doy = calender.get(Calendar.DAY_OF_YEAR)%7;
int dom = calender.get(Calendar.DAY_OF_WEEK); int k=0;
if(doy-1>=dom) {
        k = 7+dom-(doy-1);}
    if(doy-1<dom){
        k = dom-(doy-1);}
int count =0 ;
for(int i = year+1 ; i<=year1;i++) {
  if((i-1)%4==0) {
      count = count + 2 ;}
    else { count++;}
  }
int  d = k+count%7;
  
   if(d>7) {
        d = d%7;
    }
    
    String day = "";
    switch(d){
   case 1:day ="SUNDAY";  l(1,""+1);set("1"); setforeground(1,nr,ng,nb); break;
   case 2:day="MONDAY";   l(2,""+1);set("2");setforeground(2,nr,ng,nb);break;
   case 3:day="TUESDAY";  l(3,""+1);set("3");setforeground(3,nr,ng,nb);break;
   case 4:day="WEDNESDAY";l(4,""+1);set("4");setforeground(4,nr,ng,nb);break;
   case 5:day="THURSDAY"; l(5,""+1);set("5");setforeground(5,nr,ng,nb);break; 
   case 6:day="FRIDAY";   l(6,""+1);set("6");setforeground(6,nr,ng,nb);break;
   case 7:day="SATURDAY"; l(7,""+1);set("7");setforeground(7,nr,ng,nb);break;
    }
  
  }
else if(year1<year){
int doy = calender.get(Calendar.DAY_OF_YEAR)%7;
int dom = calender.get(Calendar.DAY_OF_WEEK); int k=0;
if(doy-1>=dom) {
        k = 7+dom-(doy-1);}
    if(doy-1<dom){
        k = dom-(doy-1);}
int count =0 ;
for(int i = year-1 ; i>=year1;i--) {
  if((i-1)%4==0) {
      count = count + 2 ;}
    else { count++;}
  }
int  d = k-count%7;
  System.out.print(d);
   if(d<=0) {
        d = 7+d;
    }
    
    String day = "";
    switch(d){
   case 1:day ="SUNDAY";  l(1,""+1);set("1"); setforeground(1,nr,ng,nb); break;
   case 2:day="MONDAY";   l(2,""+1);set("2");setforeground(2,nr,ng,nb);break;
   case 3:day="TUESDAY";  l(3,""+1);set("3");setforeground(3,nr,ng,nb);break;
   case 4:day="WEDNESDAY";l(4,""+1);set("4");setforeground(4,nr,ng,nb);break;
   case 5:day="THURSDAY"; l(5,""+1);set("5");setforeground(5,nr,ng,nb);break; 
   case 6:day="FRIDAY";   l(6,""+1);set("6");setforeground(6,nr,ng,nb);break;
   case 7:day="SATURDAY"; l(7,""+1);set("7");setforeground(7,nr,ng,nb);break;
    }
}
  int o=31; int r = 31;
   jLabel40.setText("January");
      jTextField8.setText(""+year1);
int a = Integer.parseInt(l.getText())+1;
int c = Integer.parseInt(l.getText())-1;
   for(int b =2,n=a;a<=42;a++,b++,n++) {
       if(b>o) {
           l(a,""+(b-o));
           foreground1(a,nr1,ng1,nb1);}
       else{ l(a,""+b); 
       setforeground(a,nr,ng,nb);
       jL.setText(""+(n+1));}
   }
   for(;c>=0;c--,r--) {
       l(c,""+r);
       foreground1(c,nr1,ng1,nb1);}

        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jList2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jList2KeyPressed
String S1 = ""+jList2.getSelectedValue();
try {

            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/calendar", "root", "asvm");
            Statement stmt = con.createStatement();
            String query = "Select title,year(sdate),month(sdate),day(sdate),year(edate),month(edate),day(edate),event"
                    + " from event where Concat(sdate,Concat(' ',title)) = '"+S1+"' ;";
            
            ResultSet rs = stmt.executeQuery(query);
          while(rs.next())  {
         jTextField5.setText(rs.getString("title"));
         jComboBox1.setSelectedItem(rs.getObject("day(sdate)"));
         jComboBox2.setSelectedItem(rs.getObject("month(sdate)"));
         jComboBox3.setSelectedItem(rs.getObject("year(sdate)"));
         jComboBox4.setSelectedItem(rs.getObject("day(edate)"));
         jComboBox5.setSelectedItem(rs.getObject("month(edate)"));
         jComboBox6.setSelectedItem(rs.getObject("year(edate)"));
         jTextArea1.setText(rs.getString("event"));
          }
               }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jList2KeyPressed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void ntspnlMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ntspnlMouseMoved
DefaultListModel dlm  = (DefaultListModel) jList1.getModel();
System.out.println("iouhxcgvbjknb");
 try {

            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/calendar", "root", "asvm");
            Statement stmt = con.createStatement();
            String query = "Select * from notes";
         ResultSet rs =  stmt.executeQuery(query);
         while(rs.next()){
             String S1 = rs.getString("date");
             String S2 = rs.getString("note");
             System.out.println(""+S1+S2);
             dlm.addElement(" "+S1+" "+S2);
         }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_ntspnlMouseMoved
public void value(int a) {
    String S1 = "",S3 = " ";
if(a==1){ S1 = a1.getText();}
if(a==2){ S1 = a2.getText();}
if(a==3){ S1 = a3.getText();}
if(a==4){ S1 = a4.getText();}
if(a==5){ S1 = a6.getText();}
if(a==7){ jFrame4.setVisible(false);}

if(S1!=null){ try {

            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/calendar", "root", "asvm");
            Statement stmt = con.createStatement();
            String query = "Select * from fastlane where path like '%"+S1+"';";
            ResultSet rs = stmt.executeQuery(query);
            rs.first();
            String S2 = rs.getString("path");
          
            S3 = S2.replace('#','\\');
        }catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            
        }}

File f = new File(S3);

        try {
            Desktop.getDesktop().open(f);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,"File not found");
        }
}
    public void connect(int a) {
        try {

            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/calendar", "root", "asvm");
            Statement stmt = con.createStatement();
            String query = "Select * from fastlane where num = "+a+" ;";
            ResultSet rs = stmt.executeQuery(query);
           while(rs.next()){
            String s1 = rs.getString("path");
            String s2=  s1.replace('#','\\');
            File f = new File(s2);
            Icon i = jFileChooser1.getIcon(f);
            String s = f.getName();
            
if(a==1){a1.setText(s); a1.setIcon(i);}
if(a==2){a2.setText(s); a2.setIcon(i);}
if(a==3){a3.setText(s); a3.setIcon(i);}
if(a==4){a4.setText(s); a4.setIcon(i);}
if(a==5){a6.setText(s); a6.setIcon(i);}

           }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
} 
     
    public static String update2(int i ,String a) {
        try {

            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/calendar", "root", "asvm");
            Statement stmt = con.createStatement();
            String query = a;
            String query1 = "delete from color where id = " +i +";" ;
            stmt.executeUpdate(query1);
            stmt.executeUpdate(query);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
                        System.out.println(""+e);

        }
        return null;
    } 
    
    public static String update1(int i ,String a) {
        try {

            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/calendar", "root", "asvm");
            Statement stmt = con.createStatement();
            String query = a;
            String query1 = "delete from fastlane where num = " +i+";" ;
            stmt.executeUpdate(query1);
            stmt.executeUpdate(query);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    } 
    public static String update(String a) {
        try {

            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/calendar", "root", "asvm");
            Statement stmt = con.createStatement();
            String query = a;
            stmt.executeUpdate(query);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    } 
    public void label(int a,String s,Icon i) {
if(a==1){o1.setText(s); o1.setIcon(i);}
if(a==2){o2.setText(s); o2.setIcon(i);}
if(a==3){o3.setText(s); o3.setIcon(i);}
if(a==4){o4.setText(s); o4.setIcon(i);}
if(a==5){o5.setText(s); o5.setIcon(i);}
}
    
    public void border2(int a) {
if(a==1){a1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102,102,102), 1, true));     a1.setBackground(new java.awt.Color(51,51,51));                   }
if(a==2){a2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102,102,102), 1, true));     a2.setBackground(new java.awt.Color(51,51,51));                   }
if(a==3){a3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102,102,102), 1, true));     a3.setBackground(new java.awt.Color(51,51,51));                   }
if(a==4){a4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102,102,102), 1, true));     a4.setBackground(new java.awt.Color(51,51,51));                  }
if(a==5){a5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102,102,102), 1, true));     a5.setBackground(new java.awt.Color(51,51,51));                  }
if(a==6){a6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102,102,102), 1, true));     a6.setBackground(new java.awt.Color(51,51,51));                  }
if(a==7){a7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102,102,102), 1, true));     a7.setBackground(new java.awt.Color(51,51,51));                  }
}
    public void border1(int a) {
if(a==1){a1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255,255,255), 1, true)); a1.setBackground(new java.awt.Color(12,12,12));                }
if(a==2){a2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255,255,255), 1, true)); a2.setBackground(new java.awt.Color(12,12,12));               }
if(a==3){a3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255,255,255), 1, true)); a3.setBackground(new java.awt.Color(12,12,12));               }
if(a==4){a4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255,255,255), 1, true)); a4.setBackground(new java.awt.Color(12,12,12));               }      
if(a==5){a5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255,255,255), 1, true));     a5.setBackground(new java.awt.Color(12,12,12));                  }
if(a==6){a6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255,255,255), 1, true));     a6.setBackground(new java.awt.Color(12,12,12));                  }
if(a==7){a7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255,255,255), 1, true));     a7.setBackground(new java.awt.Color(12,12,12));                  }
    }
public void border(int a) {
if(a==1){l1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));}
if(a==2){l2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));}
if(a==3){l3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));}
if(a==4){l4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));}
if(a==5){l5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));}
if(a==6){l6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));}
if(a==7){l7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));}
if(a==8){l8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));}
if(a==9){l9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));}
if(a==10){l10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));}
if(a==11){l11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));}
if(a==12){l12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));}
if(a==13){l13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));}
if(a==14){l14.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));}
if(a==15){l15.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));}
if(a==16){l16.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));}
if(a==17){l17.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));}
if(a==18){l18.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));}
if(a==19){l19.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));}
if(a==20){l20.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));}
if(a==21){l21.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));}
if(a==22){l22.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));}
if(a==23){l23.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));}
if(a==24){l24.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));}
if(a==25){l25.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));}
if(a==26){l26.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));}
if(a==27){l27.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));}
if(a==28){l28.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));}
if(a==29){l29.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));}
if(a==30){l30.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));}
if(a==31){l31.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));}
if(a==32){l32.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));}
if(a==33){l33.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));}
if(a==34){l34.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));}
if(a==35){l35.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));}
if(a==36){l36.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));}
if(a==37){l37.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));}
if(a==38){l38.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));}
if(a==39){l39.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));}
if(a==40){l40.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));}
if(a==41){l41.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));}
if(a==42){l42.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));}

 //To change body of generated methods, choose Tools | Templates.
        }
       public void setforeground(int a,int nr,int ng,int nb){
   if(a==1){l1.setForeground(new java.awt.Color(nr,ng,nb));}
if(a==2){l2.setForeground(new java.awt.Color(nr,ng,nb));}
if(a==3){l3.setForeground(new java.awt.Color(nr,ng,nb));}
if(a==4){l4.setForeground(new java.awt.Color(nr,ng,nb));}
if(a==5){l5.setForeground(new java.awt.Color(nr,ng,nb));}
if(a==6){l6.setForeground(new java.awt.Color(nr,ng,nb));}
if(a==7){l7.setForeground(new java.awt.Color(nr,ng,nb));}
if(a==8){l8.setForeground(new java.awt.Color(nr,ng,nb));}
if(a==9){l9.setForeground(new java.awt.Color(nr,ng,nb));}
if(a==10){l10.setForeground(new java.awt.Color(nr,ng,nb));}
if(a==11){l11.setForeground(new java.awt.Color(nr,ng,nb));}
if(a==12){l12.setForeground(new java.awt.Color(nr,ng,nb));}
if(a==13){l13.setForeground(new java.awt.Color(nr,ng,nb));}
if(a==14){l14.setForeground(new java.awt.Color(nr,ng,nb));}
if(a==15){l15.setForeground(new java.awt.Color(nr,ng,nb));}
if(a==16){l16.setForeground(new java.awt.Color(nr,ng,nb));}
if(a==17){l17.setForeground(new java.awt.Color(nr,ng,nb));}
if(a==18){l18.setForeground(new java.awt.Color(nr,ng,nb));}
if(a==19){l19.setForeground(new java.awt.Color(nr,ng,nb));}
if(a==20){l20.setForeground(new java.awt.Color(nr,ng,nb));}
if(a==21){l21.setForeground(new java.awt.Color(nr,ng,nb));}
if(a==22){l22.setForeground(new java.awt.Color(nr,ng,nb));}
if(a==23){l23.setForeground(new java.awt.Color(nr,ng,nb));}
if(a==24){l24.setForeground(new java.awt.Color(nr,ng,nb));}
if(a==25){l25.setForeground(new java.awt.Color(nr,ng,nb));}
if(a==26){l26.setForeground(new java.awt.Color(nr,ng,nb));}
if(a==27){l27.setForeground(new java.awt.Color(nr,ng,nb));}
if(a==28){l28.setForeground(new java.awt.Color(nr,ng,nb));}
if(a==29){l29.setForeground(new java.awt.Color(nr,ng,nb));}
if(a==30){l30.setForeground(new java.awt.Color(nr,ng,nb));}
if(a==31){l31.setForeground(new java.awt.Color(nr,ng,nb));}
if(a==32){l32.setForeground(new java.awt.Color(nr,ng,nb));}
if(a==33){l33.setForeground(new java.awt.Color(nr,ng,nb));}
if(a==34){l34.setForeground(new java.awt.Color(nr,ng,nb));}
if(a==35){l35.setForeground(new java.awt.Color(nr,ng,nb));}
if(a==36){l36.setForeground(new java.awt.Color(nr,ng,nb));}
if(a==37){l37.setForeground(new java.awt.Color(nr,ng,nb));}
if(a==38){l38.setForeground(new java.awt.Color(nr,ng,nb));}
if(a==39){l39.setForeground(new java.awt.Color(nr,ng,nb));}
if(a==40){l40.setForeground(new java.awt.Color(nr,ng,nb));}
if(a==41){l41.setForeground(new java.awt.Color(nr,ng,nb));}
if(a==42){l42.setForeground(new java.awt.Color(nr,ng,nb));}

       } private void foreground1(int a,int nr1,int ng1,int nb1) {
        if(a==1){l1.setForeground(new java.awt.Color(nr1,ng1,nb1));}
if(a==2){l2.setForeground(new java.awt.Color(nr1,ng1,nb1));}
if(a==3){l3.setForeground(new java.awt.Color(nr1,ng1,nb1));}
if(a==4){l4.setForeground(new java.awt.Color(nr1,ng1,nb1));}
if(a==5){l5.setForeground(new java.awt.Color(nr1,ng1,nb1));}
if(a==6){l6.setForeground(new java.awt.Color(nr1,ng1,nb1));}
if(a==7){l7.setForeground(new java.awt.Color(nr1,ng1,nb1));}
if(a==8){l8.setForeground(new java.awt.Color(nr1,ng1,nb1));}
if(a==9){l9.setForeground(new java.awt.Color(nr1,ng1,nb1));}
if(a==10){l10.setForeground(new java.awt.Color(nr1,ng1,nb1));}
if(a==11){l11.setForeground(new java.awt.Color(nr1,ng1,nb1));}
if(a==12){l12.setForeground(new java.awt.Color(nr1,ng1,nb1));}
if(a==13){l13.setForeground(new java.awt.Color(nr1,ng1,nb1));}
if(a==14){l14.setForeground(new java.awt.Color(nr1,ng1,nb1));}
if(a==15){l15.setForeground(new java.awt.Color(nr1,ng1,nb1));}
if(a==16){l16.setForeground(new java.awt.Color(nr1,ng1,nb1));}
if(a==17){l17.setForeground(new java.awt.Color(nr1,ng1,nb1));}
if(a==18){l18.setForeground(new java.awt.Color(nr1,ng1,nb1));}
if(a==19){l19.setForeground(new java.awt.Color(nr1,ng1,nb1));}
if(a==20){l20.setForeground(new java.awt.Color(nr1,ng1,nb1));}
if(a==21){l21.setForeground(new java.awt.Color(nr1,ng1,nb1));}
if(a==22){l22.setForeground(new java.awt.Color(nr1,ng1,nb1));}
if(a==23){l23.setForeground(new java.awt.Color(nr1,ng1,nb1));}
if(a==24){l24.setForeground(new java.awt.Color(nr1,ng1,nb1));}
if(a==25){l25.setForeground(new java.awt.Color(nr1,ng1,nb1));}
if(a==26){l26.setForeground(new java.awt.Color(nr1,ng1,nb1));}
if(a==27){l27.setForeground(new java.awt.Color(nr1,ng1,nb1));}
if(a==28){l28.setForeground(new java.awt.Color(nr1,ng1,nb1));}
if(a==29){l29.setForeground(new java.awt.Color(nr1,ng1,nb1));}
if(a==30){l30.setForeground(new java.awt.Color(nr1,ng1,nb1));}
if(a==31){l31.setForeground(new java.awt.Color(nr1,ng1,nb1));}
if(a==32){l32.setForeground(new java.awt.Color(nr1,ng1,nb1));}
if(a==33){l33.setForeground(new java.awt.Color(nr1,ng1,nb1));}
if(a==34){l34.setForeground(new java.awt.Color(nr1,ng1,nb1));}
if(a==35){l35.setForeground(new java.awt.Color(nr1,ng1,nb1));}
if(a==36){l36.setForeground(new java.awt.Color(nr1,ng1,nb1));}
if(a==37){l37.setForeground(new java.awt.Color(nr1,ng1,nb1));}
if(a==38){l38.setForeground(new java.awt.Color(nr1,ng1,nb1));}
if(a==39){l39.setForeground(new java.awt.Color(nr1,ng1,nb1));}
if(a==40){l40.setForeground(new java.awt.Color(nr1,ng1,nb1));}
if(a==41){l41.setForeground(new java.awt.Color(nr1,ng1,nb1));}
if(a==42){l42.setForeground(new java.awt.Color(nr1,ng1,nb1));} //To change body of generated methods, choose Tools | Templates.
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
             
                new NewJFrame().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a1;
    private javax.swing.JLabel a2;
    private javax.swing.JLabel a3;
    private javax.swing.JLabel a4;
    private javax.swing.JLabel a5;
    private javax.swing.JLabel a6;
    private javax.swing.JLabel a7;
    private javax.swing.JButton aadnbtn;
    private javax.swing.JButton addbtn;
    private javax.swing.JLabel bg;
    private javax.swing.JPanel cddpnl;
    private javax.swing.JPanel clndrpnl;
    private javax.swing.JPanel evntpnl;
    private javax.swing.JPanel hood;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JColorChooser jColorChooser2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JFrame jFrame4;
    private javax.swing.JFrame jFrame5;
    private javax.swing.JLabel jL;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JList jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JPanel jcchpnl;
    private javax.swing.JPanel jfchpnl;
    private javax.swing.JLabel l;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l10;
    private javax.swing.JLabel l11;
    private javax.swing.JLabel l12;
    private javax.swing.JLabel l129;
    private javax.swing.JLabel l13;
    private javax.swing.JLabel l130;
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
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;
    private javax.swing.JLabel l8;
    private javax.swing.JLabel l9;
    private javax.swing.JFrame main;
    private javax.swing.JButton nextbtn;
    private javax.swing.JPanel ntspnl;
    private javax.swing.JLabel o1;
    private javax.swing.JLabel o2;
    private javax.swing.JLabel o3;
    private javax.swing.JLabel o4;
    private javax.swing.JLabel o5;
    private javax.swing.JButton prevbtn;
    private javax.swing.JPanel stngspnl;
    private javax.swing.JLabel v1;
    private javax.swing.JLabel v2;
    private javax.swing.JLabel v3;
    private javax.swing.JLabel v4;
    private javax.swing.JLabel v5;
    // End of variables declaration//GEN-END:variables
    public javax.swing.Timer t2;
    public int R,G,B;
    public int R1,G1,B1;
    public int R2,G2,B3;
    public int brgb,frgb,brrgb;
}

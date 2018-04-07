import java.awt.event.KeyEvent;
import java.util.Timer;
import java.util.TimerTask;
//Project by Ishaan Shrivastava, Nimish Mangal and Jagruta Advani 
public class White_Devil extends javax.swing.JFrame {
static int score = 0;
int dy = 1;
int speed=6;
Timer lane = new Timer();
TimerTask traffic = new TimerTask()
             {
             @Override
             public void run()
             {
        score++;
       
        if(MC.getX()==203&(MC.getY()==c1l3.getY()||MC.getY()==c2l3.getY()||MC.getY()==c3l3.getY()))
             {
             System.out.println(""+MC.getX());
             System.out.println(""+MC.getY());
             traffic.cancel();
             
             
             }
        else if(MC.getX()==160&(MC.getY()==c1l2.getY()||MC.getY()==c2l2.getY()||MC.getY()==c3l2.getY()))
             {
             System.out.println(""+MC.getX());
             System.out.println(""+MC.getY());
             traffic.cancel();
             
             }
        else if(MC.getX()==117&(MC.getY()==c1l1.getY()||MC.getY()==c2l1.getY()||MC.getY()==c3l1.getY()))
             {
             System.out.println(""+MC.getX());
             System.out.println(""+MC.getY());
             traffic.cancel();
             
             }
        else if(MC.getX()==74&(MC.getY()==c1l0.getY()||MC.getY()==c2l0.getY()||MC.getY()==c3l0.getY()))
             {
             System.out.println(""+MC.getX());
             System.out.println(""+MC.getY());
             traffic.cancel();
             
             }
        else
             {
              if(c1l3.getY()<520)
                 c1l3.setLocation(c1l3.getLocation().x, c1l3.getLocation().y+dy);
            else
                 c1l3.setLocation(c1l3.getX(), -20);
            if(c2l3.getY()<520)
                 c2l3.setLocation(c2l3.getLocation().x, c2l3.getLocation().y+dy);
            else
                 c2l3.setLocation(c2l3.getX(), -20);   
            if(c3l3.getY()<520)
                 c3l3.setLocation(c3l3.getLocation().x, c3l3.getLocation().y+dy);
            else
                 c3l3.setLocation(c3l3.getX(), -20);
            if(c1l2.getY()<520)
                 c1l2.setLocation(c1l2.getLocation().x, c1l2.getLocation().y+dy);
            else
                 c1l2.setLocation(c1l2.getX(), -20);
            if(c2l2.getY()<520)
                 c2l2.setLocation(c2l2.getLocation().x, c2l2.getLocation().y+dy);
            else
                 c2l2.setLocation(c2l2.getX(), -20);   
             if(c3l2.getY()<520)
                 c3l2.setLocation(c3l2.getLocation().x, c3l2.getLocation().y+dy);
            else
                 c3l2.setLocation(c3l2.getX(), -20);
            if(c1l1.getY()<520)
                 c1l1.setLocation(c1l1.getLocation().x, c1l1.getLocation().y+dy);
            else
                 c1l1.setLocation(c1l1.getX(), -20);
            if(c2l1.getY()<520)
                 c2l1.setLocation(c2l1.getLocation().x, c2l1.getLocation().y+dy);
            else
                 c2l1.setLocation(c2l1.getX(), -20);
            if(c3l1.getY()<520)
                 c3l1.setLocation(c3l1.getLocation().x, c3l1.getLocation().y+dy);
            else 
                 c3l1.setLocation(c3l1.getLocation().x, -20);
            if(c1l0.getY()<520)
                 c1l0.setLocation(c1l0.getLocation().x, c1l0.getLocation().y+dy);
            else
                 c1l0.setLocation(c1l0.getX(), -20);
            if(c2l0.getY()<520)
                 c2l0.setLocation(c2l0.getLocation().x, c2l0.getLocation().y+dy);
            else
                 c2l0.setLocation(c2l0.getX(), -20);   
            if(c3l0.getY()<520)
                 c3l0.setLocation(c3l0.getLocation().x, c3l0.getLocation().y+dy);
            else
                 c3l0.setLocation(c3l0.getX(), -20);
            txtsc.setText(""+score);
             }
             }
             };  
    public White_Devil() {
        initComponents();       
        lane.scheduleAtFixedRate(traffic,2000,Level.lvl);                       }
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        c1l3 = new javax.swing.JLabel();
        c2l3 = new javax.swing.JLabel();
        c3l3 = new javax.swing.JLabel();
        c1l2 = new javax.swing.JLabel();
        c2l2 = new javax.swing.JLabel();
        c3l2 = new javax.swing.JLabel();
        c2l1 = new javax.swing.JLabel();
        c3l1 = new javax.swing.JLabel();
        c1l1 = new javax.swing.JLabel();
        c1l0 = new javax.swing.JLabel();
        c2l0 = new javax.swing.JLabel();
        c3l0 = new javax.swing.JLabel();
        MC = new javax.swing.JLabel();
        sc = new javax.swing.JLabel();
        txtsc = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        c1l3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/download.png"))); // NOI18N
        c1l3.setText("CAR1");
        c1l3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c1l3MouseClicked(evt);
            }
        });
        getContentPane().add(c1l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 1, 37, 30));

        c2l3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/62e3-vector-cartoon-illustration-front-view-of-cool-sports-car-150327890.jpg"))); // NOI18N
        c2l3.setText("CAR2");
        getContentPane().add(c2l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 149, 37, 31));

        c3l3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/U.png"))); // NOI18N
        c3l3.setText("CAR3");
        getContentPane().add(c3l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 278, 37, 34));

        c1l2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/62e3-vector-cartoon-illustration-front-view-of-cool-sports-car-150327890.jpg"))); // NOI18N
        c1l2.setText("CAR1");
        c1l2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c1l2MouseClicked(evt);
            }
        });
        getContentPane().add(c1l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 37, 30));

        c2l2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/download.png"))); // NOI18N
        c2l2.setText("CAR2");
        c2l2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c2l2MouseClicked(evt);
            }
        });
        getContentPane().add(c2l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 362, 37, 28));

        c3l2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/U.png"))); // NOI18N
        c3l2.setText("CAR3");
        c3l2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c3l2MouseClicked(evt);
            }
        });
        getContentPane().add(c3l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 482, 37, 31));

        c2l1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/62e3-vector-cartoon-illustration-front-view-of-cool-sports-car-150327890.jpg"))); // NOI18N
        c2l1.setText("CAR2");
        c2l1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c2l1MouseClicked(evt);
            }
        });
        getContentPane().add(c2l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 149, 37, 30));

        c3l1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/download.png"))); // NOI18N
        c3l1.setText("CAR3");
        c3l1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c3l1MouseClicked(evt);
            }
        });
        getContentPane().add(c3l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 280, 37, 30));

        c1l1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/U.png"))); // NOI18N
        c1l1.setText("CAR1");
        c1l1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c1l1MouseClicked(evt);
            }
        });
        getContentPane().add(c1l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 0, 37, 32));

        c1l0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/download.png"))); // NOI18N
        c1l0.setText("CAR1");
        c1l0.setMaximumSize(new java.awt.Dimension(28, 16));
        c1l0.setMinimumSize(new java.awt.Dimension(28, 16));
        c1l0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c1l0MouseClicked(evt);
            }
        });
        getContentPane().add(c1l0, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 70, 37, 30));

        c2l0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/62e3-vector-cartoon-illustration-front-view-of-cool-sports-car-150327890.jpg"))); // NOI18N
        c2l0.setText("CAR2");
        c2l0.setMaximumSize(new java.awt.Dimension(28, 16));
        c2l0.setMinimumSize(new java.awt.Dimension(28, 16));
        c2l0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c2l0MouseClicked(evt);
            }
        });
        getContentPane().add(c2l0, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 349, 37, 28));

        c3l0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/U.png"))); // NOI18N
        c3l0.setText("CAR3");
        c3l0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c3l0MouseClicked(evt);
            }
        });
        getContentPane().add(c3l0, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 218, 37, 28));

        MC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/2006-koenigsegg-ccx-rear-view-588x4411.jpg"))); // NOI18N
        MC.setText("MY");
        getContentPane().add(MC, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 434, 37, 30));
        getContentPane().add(sc, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 125, 38, 28));

        txtsc.setEditable(false);
        txtsc.setEnabled(false);
        getContentPane().add(txtsc, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 134, 53, 32));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/final.jpg"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
    }//GEN-LAST:event_formMouseClicked
    private void c1l3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c1l3MouseClicked
    }//GEN-LAST:event_c1l3MouseClicked
    private void c3l4MouseClicked(java.awt.event.MouseEvent evt) {                                  
    }                                 
    private void c1l2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c1l2MouseClicked
    }//GEN-LAST:event_c1l2MouseClicked
    private void c2l2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c2l2MouseClicked
    }//GEN-LAST:event_c2l2MouseClicked
    private void c3l2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c3l2MouseClicked
    }//GEN-LAST:event_c3l2MouseClicked
    private void c2l1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c2l1MouseClicked
    }//GEN-LAST:event_c2l1MouseClicked
    private void c3l1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c3l1MouseClicked
    }//GEN-LAST:event_c3l1MouseClicked
    private void c1l1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c1l1MouseClicked
    }//GEN-LAST:event_c1l1MouseClicked
    private void c1l0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c1l0MouseClicked
    }//GEN-LAST:event_c1l0MouseClicked
    private void c2l0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c2l0MouseClicked
    }//GEN-LAST:event_c2l0MouseClicked
    private void c3l0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c3l0MouseClicked
    }//GEN-LAST:event_c3l0MouseClicked
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
if(evt.getKeyCode()==KeyEvent.VK_UP)
    MC.setLocation(MC.getX(),MC.getY()-20);
if(evt.getKeyCode()==KeyEvent.VK_DOWN)
    MC.setLocation(MC.getX(),MC.getY()+20);
if(evt.getKeyCode()==KeyEvent.VK_LEFT)
    MC.setLocation(MC.getX()-43,MC.getY());
if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
    MC.setLocation(MC.getX()+43,MC.getY());
if(MC.getX()<=31||MC.getX()>=246)
   {
    lane.cancel();
    this.dispose();
    new Result().setVisible(true);
   }
    }//GEN-LAST:event_formKeyPressed
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(White_Devil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(White_Devil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(White_Devil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(White_Devil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Welcome_Scr().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MC;
    private javax.swing.JLabel c1l0;
    private javax.swing.JLabel c1l1;
    private javax.swing.JLabel c1l2;
    private javax.swing.JLabel c1l3;
    private javax.swing.JLabel c2l0;
    private javax.swing.JLabel c2l1;
    private javax.swing.JLabel c2l2;
    private javax.swing.JLabel c2l3;
    private javax.swing.JLabel c3l0;
    private javax.swing.JLabel c3l1;
    private javax.swing.JLabel c3l2;
    private javax.swing.JLabel c3l3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel sc;
    private javax.swing.JTextField txtsc;
    // End of variables declaration//GEN-END:variables
}

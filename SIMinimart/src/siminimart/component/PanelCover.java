package siminimart.component;

import siminimart.swing.ButtonOutLine;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import net.miginfocom.swing.MigLayout;

public class PanelCover extends javax.swing.JPanel {

    private final DecimalFormat df = new DecimalFormat("##0.###");
    private ActionListener event;
    private MigLayout layout;
    private JLabel title;
    private JLabel description;
    private JLabel description1;
    private ButtonOutLine button;
    private boolean isLogin;

    public PanelCover() {
        initComponents();
        setOpaque(false);
        layout = new MigLayout("wrap, fill", "[center]", "push[]25[]push");
        setLayout(layout);
        init();

    }

    private void init() {
       
        description = new JLabel("");
        description.setIcon(new ImageIcon(getClass().getResource("/siminimart/image/Logo_1.png")));
        description.setForeground(new Color(245, 245, 245));
        add(description);
        button = new ButtonOutLine();
        button.setBackground(new Color(255, 255, 255));
        button.setForeground(new Color(255, 255, 255));
        button.setText("SIGN IN");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                event.actionPerformed(ae);
            }
        });
        add(button, "w 60%, h 40");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 327, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        GradientPaint gra = new GradientPaint(0, 0, Color.decode("#1CB5E0"), 0, getHeight(), Color.decode("#000046"));
        g2.setPaint(gra);
        g2.fillRect(0, 0, getWidth(), getHeight());
        super.paintComponent(grphcs);
    }

    public void addEvent(ActionListener event) {
        this.event = event;
    }

    public void registerLeft(double v){
        v = Double.valueOf(df.format(v));
        login(false);
       
        layout.setComponentConstraints(description, "pad 0 -" + v + "% 0 0");
     
        
    }
    
    public void registerRight(double v){
        v = Double.valueOf(df.format(v));
        login(false);
       
        layout.setComponentConstraints(description, "pad 0 -" + v + "% 0 0");

    }
    
    public void loginLeft(double v){
        v = Double.valueOf(df.format(v));
        login(true);
      
        layout.setComponentConstraints(description, "pad 0 " + v + "% 0 " + v + "%");
        
    }
    
    public void loginRight(double v){
        v = Double.valueOf(df.format(v));
        login(true);
        
        layout.setComponentConstraints(description, "pad 0 " + v + "% 0 " + v + "%");
      
    }

    private void login(boolean login) {
        if (this.isLogin != login) {
            if (login) {
                
                description.setText("");
               
                button.setText("SIGN UP");
            } else {
                
                description.setText("");
             
                button.setText("SIGN IN");
            }
            this.isLogin = login;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

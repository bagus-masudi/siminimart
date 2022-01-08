package admin.siminimart.component;

import admin.siminimart.main.MainDashboard;
import admin.siminimart.main.MainLogin;
import admin.siminimart.swing.Button;
import admin.siminimart.swing.MyPasswordField;
import admin.siminimart.swing.MyTextField;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.miginfocom.swing.MigLayout;
import admin.siminimart.swing.connectionmysql;

public class PanelLoginAndRegister extends javax.swing.JLayeredPane {

    public static String Name;
    
    public PanelLoginAndRegister() {
        initComponents();
        initRegister();
        initLogin();
        TampilkanUser();
        login.setVisible(false);
        register.setVisible(true);
    }
    
    public void TampilkanUser(){
        DefaultTableModel table = new DefaultTableModel();

        table.addColumn("UserName");
        table.addColumn("Password");

        try {
            Connection con = connectionmysql.koneksiDB();
            String sql = "select UserName, Password from admin ";
            Statement S = con.createStatement();
            ResultSet R = S.executeQuery(sql);

            while (R.next()) {
                table.addRow(new Object[]{
                    R.getString(1), R.getString(2)
                });
            }
            tabelUser.setModel(table);

        } catch (Exception e) {
            e.getMessage();
        }
    }

    private void initRegister() {
        register.setLayout(new MigLayout("wrap", "push[center]push", "push[]25[]10[]25[]push"));
        JLabel label = new JLabel("Create Account");
        label.setFont(new Font("sansserif", 1, 30));
        label.setForeground(Color.decode("#1CB5E0"));
        register.add(label);
        MyTextField txtUser = new MyTextField();
        txtUser.setPrefixIcon(new ImageIcon(getClass().getResource("/admin/siminimart/image/user.png")));
        txtUser.setHint("Name");
        register.add(txtUser, "w 60%");
        MyPasswordField txtPass = new MyPasswordField();
        txtPass.setPrefixIcon(new ImageIcon(getClass().getResource("/admin/siminimart/image/pass.png")));
        txtPass.setHint("Password");
        register.add(txtPass, "w 60%");
        Button cmd = new Button();
        cmd.setBackground(Color.decode("#1CB5E0"));
        cmd.setForeground(new Color(250, 250, 250));
        cmd.setText("SIGN UP");
        register.add(cmd, "w 40%, h 40");
        cmd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
              
                if (txtUser.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "UserName Tidak Boleh Kosong");
                } else if (txtPass.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Password Tidak Boleh Kosong");
                } else {
                    try {
                        Connection con = connectionmysql.koneksiDB();
                        String sql = "INSERT INTO admin(UserName, Password) VALUES ('" + txtUser.getText() + "','" + txtPass.getText() + "')";
                        Statement S = con.createStatement();
                        S.execute(sql);
                        JOptionPane.showMessageDialog(null, "Registrasi Berhasil");
                        txtUser.setText("");
                        txtPass.setText("");
                    } catch (Exception e) {
                         JOptionPane.showMessageDialog(null, "Username Sudah Ada");
                    }
                }

            }
        });
    }

    private void initLogin() {
        login.setLayout(new MigLayout("wrap", "push[center]push", "push[]25[]10[]25[]push"));
        JLabel label = new JLabel("Sign In");
        label.setFont(new Font("sansserif", 1, 30));
        label.setForeground(Color.decode("#1CB5E0"));
        login.add(label);
        MyTextField txtUser = new MyTextField();
        txtUser.setPrefixIcon(new ImageIcon(getClass().getResource("/admin/siminimart/image/user.png")));
        txtUser.setHint("Name");
        login.add(txtUser, "w 60%");
        MyPasswordField txtPass = new MyPasswordField();
        txtPass.setPrefixIcon(new ImageIcon(getClass().getResource("/admin/siminimart/image/pass.png")));
        txtPass.setHint("Password");
        login.add(txtPass, "w 60%");
        Button cmd = new Button();
        cmd.setBackground(Color.decode("#1CB5E0"));
        cmd.setForeground(new Color(250, 250, 250));
        cmd.setText("SIGN IN");
        login.add(cmd, "w 40%, h 40");
        cmd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                TampilkanUser();
                String cekName = "";
                String cekPass = "";
                int row = tabelUser.getRowCount();
                int baris = 0;
                while (baris < row){
                    cekName = tabelUser.getValueAt(baris, 0).toString();
                    cekPass = tabelUser.getValueAt(baris, 1).toString();
                    if (cekName.equals(txtUser.getText().trim()) && cekPass.equals(txtPass.getText().trim())){
                        baris = row;
                    } 
                    baris = baris + 1;
                }
                if (cekName.equals(txtUser.getText().trim()) && cekPass.equals(txtPass.getText().trim())){
                    new MainDashboard().setVisible(true);
                    new MainLogin().setVisible(false);
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Username or Password is invalid");
                }
                
                
                
            }
        });
    }

    public void showRegister(boolean show) {
        if (show) {
            register.setVisible(true);
            login.setVisible(false);
        } else {
            register.setVisible(false);
            login.setVisible(true);
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabelUser = new javax.swing.JTable();
        login = new javax.swing.JPanel();
        register = new javax.swing.JPanel();

        tabelUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));

        setLayout(new java.awt.CardLayout());

        login.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 327, Short.MAX_VALUE)
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        add(login, "card3");

        register.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout registerLayout = new javax.swing.GroupLayout(register);
        register.setLayout(registerLayout);
        registerLayout.setHorizontalGroup(
            registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 327, Short.MAX_VALUE)
        );
        registerLayout.setVerticalGroup(
            registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        add(register, "card2");
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel login;
    private javax.swing.JPanel register;
    private javax.swing.JTable tabelUser;
    // End of variables declaration//GEN-END:variables
}

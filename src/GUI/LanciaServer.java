/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import cittadini.EchoMultiServer;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author moseb
 */
public class LanciaServer extends javax.swing.JFrame {

    private boolean passo1=false;
    //variabili per la connessione al db
    static final String DB_URL= "jdbc:postgresql://localhost/";

    /**
     * Creates new form LanciaServer
     */
    public LanciaServer() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        title_bar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        contenitore = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pgAdmin_path = new javax.swing.JTextField();
        avvia_pgAdmin_btn = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        crea_db_btn = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        psw = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        avvia_server_btn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        title_bar.setBackground(new java.awt.Color(102, 0, 102));

        jLabel3.setText("Chiudi");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout title_barLayout = new javax.swing.GroupLayout(title_bar);
        title_bar.setLayout(title_barLayout);
        title_barLayout.setHorizontalGroup(
                title_barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, title_barLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(59, 59, 59))
        );
        title_barLayout.setVerticalGroup(
                title_barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(title_barLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)
                                .addContainerGap(18, Short.MAX_VALUE))
        );

        contenitore.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Benvenuto");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("1-Inserisci il path di pgAdmin4.exe");

        avvia_pgAdmin_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        avvia_pgAdmin_btn.setText("Conferma");
        avvia_pgAdmin_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                avvia_pgAdmin_btnMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("2- Se è la prima volta che avvii il programma crea il DataBase");

        crea_db_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        crea_db_btn.setText("Crea Database");
        crea_db_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crea_db_btnMouseClicked(evt);
            }
        });

        jLabel5.setText("Username");

        jLabel6.setText("Paasword");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("3- Una volta fatto ciò siete pronti per fare partire effettivamenti il server");

        avvia_server_btn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        avvia_server_btn.setText("Avvia il server");
        avvia_server_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
                    avvia_server_btnMouseClicked(evt);
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        javax.swing.GroupLayout contenitoreLayout = new javax.swing.GroupLayout(contenitore);
        contenitore.setLayout(contenitoreLayout);
        contenitoreLayout.setHorizontalGroup(
                contenitoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(contenitoreLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(contenitoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel1)
                                        .addGroup(contenitoreLayout.createSequentialGroup()
                                                .addGroup(contenitoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(contenitoreLayout.createSequentialGroup()
                                                                .addComponent(jLabel2)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(pgAdmin_path, javax.swing.GroupLayout.PREFERRED_SIZE, 864, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(contenitoreLayout.createSequentialGroup()
                                                                .addComponent(jLabel4)
                                                                .addGap(47, 47, 47)
                                                                .addGroup(contenitoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel5))
                                                                .addGap(27, 27, 27)
                                                                .addGroup(contenitoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel6)
                                                                        .addComponent(psw, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(avvia_server_btn))))
                                                .addGap(18, 18, 18)
                                                .addGroup(contenitoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(crea_db_btn)
                                                        .addComponent(avvia_pgAdmin_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(39, Short.MAX_VALUE))
        );
        contenitoreLayout.setVerticalGroup(
                contenitoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(contenitoreLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(contenitoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(avvia_pgAdmin_btn)
                                        .addComponent(pgAdmin_path, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(contenitoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(contenitoreLayout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(2, 2, 2)
                                                .addGroup(contenitoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel4)
                                                        .addComponent(crea_db_btn)
                                                        .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(psw, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jLabel6))
                                .addGap(58, 58, 58)
                                .addGroup(contenitoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(avvia_server_btn))
                                .addContainerGap(456, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(title_bar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(contenitore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(title_bar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(contenitore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void avvia_pgAdmin_btnMouseClicked(java.awt.event.MouseEvent evt) {
        String path=pgAdmin_path.getText();
        if(!path.isBlank()) try {
            Desktop.getDesktop().open(new File(path));
            passo1=true;
        } catch (Exception ex) {
            this.dispose();
        }
    }

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {
        this.dispose();
    }

    private void crea_db_btnMouseClicked(java.awt.event.MouseEvent evt) {
        String USER=user.getText();
        String PASSWORD=psw.getText();

        try(Connection conn = DriverManager.getConnection(DB_URL,USER,PASSWORD);
            Statement st= conn.createStatement();){
            String sql= "CREATE DATABASE Ma_funzionaaaa";
            st.executeUpdate(sql);
            System.out.println("db creato");

        }catch (SQLException e){
            //avviso dell'errore in generale
            System.out.println(e.getMessage());

        }
    }

    private void avvia_server_btnMouseClicked(java.awt.event.MouseEvent evt) throws IOException, InterruptedException {
        if(passo1){this.dispose();
            EchoMultiServer.main(new String[0]);
        }
        else {
            //messaggio di errore perchè prima deve inserire percorso pgAdmin e avviare il server
        }

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
            java.util.logging.Logger.getLogger(LanciaServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LanciaServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LanciaServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LanciaServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LanciaServer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel avvia_pgAdmin_btn;
    private javax.swing.JLabel avvia_server_btn;
    private javax.swing.JPanel contenitore;
    private javax.swing.JLabel crea_db_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField pgAdmin_path;
    private javax.swing.JTextField psw;
    private javax.swing.JPanel title_bar;
    private javax.swing.JTextField user;
    // End of variables declaration
}

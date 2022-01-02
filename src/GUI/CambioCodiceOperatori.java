//Davide Franco "741453" CO
//Sebastian Colombo "742779" CO
package GUI;

import utils.Message;
import utils.SqlString;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CambioCodiceOperatori extends javax.swing.JFrame {

    private int x,y;
    private String user, pss, ip;
    private String DB_URL="jdbc:postgresql://";
    private String nome_db="/piattaformacv";

    public CambioCodiceOperatori() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        title_bar = new javax.swing.JPanel();
        chiudi_btn = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        contenitore = new javax.swing.JPanel();
        login = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        password = new javax.swing.JTextField();
        accedi_btn = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ip_db = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cambio_codice = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        vecchio_codice = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        nuovo_codice = new javax.swing.JTextField();
        cambia_codice_btn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setIconImage(new ImageIcon("./res/icona-codice.png").getImage());

        title_bar.setBackground(new java.awt.Color(104, 28, 121));
        title_bar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                title_barMouseDragged(evt);
            }
        });
        title_bar.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mousePressed(java.awt.event.MouseEvent evt) {
                title_barMousePressed(evt);
            }
        });

        chiudi_btn.setIcon(new javax.swing.ImageIcon("./res/close.png")); // NOI18N
        chiudi_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chiudi_btnMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cambio codice operatore");

        javax.swing.GroupLayout title_barLayout = new javax.swing.GroupLayout(title_bar);
        title_bar.setLayout(title_barLayout);
        title_barLayout.setHorizontalGroup(
                title_barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, title_barLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 243, Short.MAX_VALUE)
                                .addComponent(chiudi_btn)
                                .addContainerGap())
        );
        title_barLayout.setVerticalGroup(
                title_barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(title_barLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(title_barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(chiudi_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        contenitore.setLayout(new java.awt.CardLayout());

        login.setBackground(new java.awt.Color(33, 32, 36));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");

        accedi_btn.setIcon(new javax.swing.ImageIcon("./res/bottone_login_operatore.png")); // NOI18N
        accedi_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accedi_btnMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("IP del database ");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Help");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
                loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(loginLayout.createSequentialGroup()
                                .addGap(181, 181, 181)
                                .addComponent(accedi_btn)
                                .addContainerGap(193, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addGroup(loginLayout.createSequentialGroup()
                                                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(loginLayout.createSequentialGroup()
                                                .addComponent(ip_db, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel7)))
                                .addGap(12, 12, 12))
        );
        loginLayout.setVerticalGroup(
                loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(loginLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(ip_db, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                .addGap(7, 7, 7)
                                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addComponent(accedi_btn)
                                .addGap(48, 48, 48))
        );

        contenitore.add(login, "card2");

        cambio_codice.setBackground(new java.awt.Color(33, 32, 36));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Vecchio codice");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nuovo codice (max.20)");

        cambia_codice_btn.setIcon(new javax.swing.ImageIcon("./res/cambia codice btn.png")); // NOI18N
        cambia_codice_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cambia_codice_btnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout cambio_codiceLayout = new javax.swing.GroupLayout(cambio_codice);
        cambio_codice.setLayout(cambio_codiceLayout);
        cambio_codiceLayout.setHorizontalGroup(
                cambio_codiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(cambio_codiceLayout.createSequentialGroup()
                                .addGroup(cambio_codiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(cambio_codiceLayout.createSequentialGroup()
                                                .addGap(192, 192, 192)
                                                .addComponent(jLabel4))
                                        .addGroup(cambio_codiceLayout.createSequentialGroup()
                                                .addGap(196, 196, 196)
                                                .addComponent(jLabel5))
                                        .addGroup(cambio_codiceLayout.createSequentialGroup()
                                                .addGap(137, 137, 137)
                                                .addGroup(cambio_codiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(vecchio_codice)
                                                        .addComponent(nuovo_codice, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)))
                                        .addGroup(cambio_codiceLayout.createSequentialGroup()
                                                .addGap(145, 145, 145)
                                                .addComponent(cambia_codice_btn)))
                                .addContainerGap(146, Short.MAX_VALUE))
        );
        cambio_codiceLayout.setVerticalGroup(
                cambio_codiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(cambio_codiceLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(vecchio_codice, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nuovo_codice, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                                .addComponent(cambia_codice_btn)
                                .addGap(48, 48, 48))
        );

        contenitore.add(cambio_codice, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(title_bar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(contenitore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(title_bar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(contenitore, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>

    private void chiudi_btnMouseClicked(java.awt.event.MouseEvent evt) {
        this.dispose();
    }

    private void title_barMousePressed(java.awt.event.MouseEvent evt) {
        x=evt.getX();
        y=evt.getY();
    }

    private void title_barMouseDragged(java.awt.event.MouseEvent evt) {
        this.setLocation(this.getX()+evt.getX()-x, this.getY()+evt.getY()-y);
    }

    private void accedi_btnMouseClicked(java.awt.event.MouseEvent evt) {
        user=username.getText();
        pss=password.getText();
        //controllo sull'ip
        if(ip_db.getText().equals("localhost") || ip_db.getText().matches("^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])(\\.(?!$)|$)){4}$")){
        ip=ip_db.getText();
        contenitore.removeAll();
        contenitore.add(cambio_codice);
        contenitore.repaint();
        contenitore.revalidate();
        }else {
            Message.errorMessage(this, "La stringa inserita non è un indirizzo ip", "IP errato");
        }
    }

    private void cambia_codice_btnMouseClicked(java.awt.event.MouseEvent evt) {
        String vecchio=(vecchio_codice.getText()).strip();
        String nuovo=(nuovo_codice.getText()).strip();
        DB_URL=DB_URL+ip+nome_db;
        try(Connection conn = DriverManager.getConnection(DB_URL,user,pss);
            Statement st= conn.createStatement();){
            String sql=SqlString.updateCodiceOperatore(vecchio, nuovo);
            //execute update ritorna il numero di righe modificate se 0 non ha modificato
            if(st.executeUpdate(sql)==1){
                if(!(vecchio.isBlank() || nuovo.isBlank())) {
                    if (nuovo.length() <= 20) {
                        Message.informationMessage(this, "Il codice operatore è stato cambiato", "Successo");
                        dispose();
                    } else {
                        Message.warningMessage(this," codice troppo lungo, prego rienserisca ","Errore");DB_URL="jdbc:postgresql://";

                    }
                }else{
                    Message.warningMessage(this," codice vuoto,prego  rienserisca","Errore");DB_URL="jdbc:postgresql://";
                }
            }
            else {Message.errorMessage(this,"Vecchio codice errato, il codice non è stato cambiato","Errore");DB_URL="jdbc:postgresql://";}
        }catch(SQLException e){
            e.printStackTrace();
            if(e.getMessage().contains("Il tentativo di connessione")){Message.errorMessage(this, "L'indirizzo IP del DB è irraggiungibile", "DB irraggiungibile");}
            else {Message.warningMessage(this,"Le credenziali per accedere al DB sono errate", "Credenziali errate");}
            DB_URL="jdbc:postgresql://";
            contenitore.removeAll();
            contenitore.add(login);
            contenitore.repaint();
            contenitore.revalidate();
        }
        }

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {
        //mostro messaggio di aiuto
        Message.informationMessage(this, "Inserire l'ip del database o localhost se locale", "Aiuto");
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
            java.util.logging.Logger.getLogger(CambioCodiceOperatori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CambioCodiceOperatori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CambioCodiceOperatori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CambioCodiceOperatori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CambioCodiceOperatori().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel accedi_btn;
    private javax.swing.JLabel cambia_codice_btn;
    private javax.swing.JPanel cambio_codice;
    private javax.swing.JLabel chiudi_btn;
    private javax.swing.JPanel contenitore;
    private javax.swing.JTextField ip_db;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel login;
    private javax.swing.JTextField nuovo_codice;
    private javax.swing.JTextField password;
    private javax.swing.JPanel title_bar;
    private javax.swing.JTextField username;
    private javax.swing.JTextField vecchio_codice;

    // End of variables declaration
}

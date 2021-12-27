//Davide Franco "741453" CO
//Sebastian Colombo "742779" CO
package GUI;

import utils.Message;
import utils.SqlString;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CambioCodiceOperatori extends javax.swing.JFrame {

    private int x,y;
    private String user, pss;
    static final String DB_URL="jdbc:postgresql://localhost/piattaformacv";

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
        cambio_codice = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        vecchio_codice = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        nuovo_codice = new javax.swing.JTextField();
        cambia_codice_btn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

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

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
                loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(loginLayout.createSequentialGroup()
                                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(loginLayout.createSequentialGroup()
                                                .addGap(215, 215, 215)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(loginLayout.createSequentialGroup()
                                                .addGap(215, 215, 215)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(loginLayout.createSequentialGroup()
                                                .addGap(135, 135, 135)
                                                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(username, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                                                        .addComponent(password)))
                                        .addGroup(loginLayout.createSequentialGroup()
                                                .addGap(181, 181, 181)
                                                .addComponent(accedi_btn)))
                                .addGap(130, 130, 130))
        );
        loginLayout.setVerticalGroup(
                loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(loginLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel2)
                                .addGap(6, 6, 6)
                                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel3)
                                .addGap(7, 7, 7)
                                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
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
        jLabel5.setText("Nuovo codice");

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
        contenitore.removeAll();
        contenitore.add(cambio_codice);
        contenitore.repaint();
        contenitore.revalidate();
    }

    private void cambia_codice_btnMouseClicked(java.awt.event.MouseEvent evt) {
        String vecchio=vecchio_codice.getText();
        String nuovo=nuovo_codice.getText();
        try(Connection conn = DriverManager.getConnection(DB_URL,user,pss);
            Statement st= conn.createStatement();){
            String sql=SqlString.updateCodiceOperatore(vecchio, nuovo);
            //execute update ritorna il numero di righe modificate se 0 non ha modificato
            if(st.executeUpdate(sql)==1){Message.informationMessage(this,"Il codice operatore è stato cambiato","Successo");}
            else {Message.errorMessage(this,"Vecchio codice errato, il codice non è stato cambiato","Errore");}
        }catch(SQLException e){
            Message.warningMessage(this,"Le credenziali per accedere al DB sono errate", "Credenziali errate");
            contenitore.removeAll();
            contenitore.add(login);
            contenitore.repaint();
            contenitore.revalidate();
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel login;
    private javax.swing.JTextField nuovo_codice;
    private javax.swing.JTextField password;
    private javax.swing.JPanel title_bar;
    private javax.swing.JTextField username;
    private javax.swing.JTextField vecchio_codice;
    // End of variables declaration
}

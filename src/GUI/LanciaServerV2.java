//Davide Franco "741453" CO
//Sebastian Colombo "742779" CO
package GUI;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import cittadini.MultiServer;
import utils.Message;
import utils.SqlString;

public class LanciaServerV2 extends javax.swing.JFrame {

    private int x,y;
    private String path_pg;
    private boolean primo_avvio=false;
    private boolean primo_avvio2=false;
    private boolean errore=false;
    private String jdbc="jdbc:postgresql://";
    private String URL="";
    private String nomedb="/piattaformacv";
    private String DB_URL="";
    /**
     * Creates new form LanciaServerV2
     */
    public LanciaServerV2() {
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
        chiudi_finestra_btn = new javax.swing.JLabel();
        contenitore = new javax.swing.JPanel();
        scelta_locale_o_ip = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        localhost_btn = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        ip_pnl = new javax.swing.JPanel();
        campo_ip = new javax.swing.JTextField();
        conferma_ip_btn = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        primo_avvio_scelta_ip = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();

        avvia_pgAdmin_pnl = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        path = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        avvia_pg_btn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        login_db_btn = new javax.swing.JButton();
        check_primo_avvio = new javax.swing.JCheckBox();
        aiuto_btn = new javax.swing.JLabel();
        login_db_pnl = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

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

        chiudi_finestra_btn.setIcon(new javax.swing.ImageIcon("./res/close.png")); // NOI18N
        chiudi_finestra_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chiudi_finestra_btnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout title_barLayout = new javax.swing.GroupLayout(title_bar);
        title_bar.setLayout(title_barLayout);
        title_barLayout.setHorizontalGroup(
                title_barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, title_barLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chiudi_finestra_btn)
                                .addContainerGap())
        );
        title_barLayout.setVerticalGroup(
                title_barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, title_barLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chiudi_finestra_btn)
                                .addContainerGap())
        );

        contenitore.setBackground(new java.awt.Color(33, 32, 36));
        contenitore.setLayout(new java.awt.CardLayout());

        scelta_locale_o_ip.setBackground(new java.awt.Color(33, 32, 36));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Dove si trova il Database?");

        localhost_btn.setBackground(new java.awt.Color(104, 28, 121));
        localhost_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                localhost_btnMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("LOCALHOST");

        javax.swing.GroupLayout localhost_btnLayout = new javax.swing.GroupLayout(localhost_btn);
        localhost_btn.setLayout(localhost_btnLayout);
        localhost_btnLayout.setHorizontalGroup(
                localhost_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(localhost_btnLayout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jLabel9)
                                .addContainerGap(55, Short.MAX_VALUE))
        );
        localhost_btnLayout.setVerticalGroup(
                localhost_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(localhost_btnLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                                .addContainerGap())
        );

        ip_pnl.setBackground(new java.awt.Color(33, 32, 36));

        conferma_ip_btn.setIcon(new javax.swing.ImageIcon("C:\\Users\\moseb\\IdeaProjects\\PiattaformCV\\res\\conferma.png")); // NOI18N
        conferma_ip_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                conferma_ip_btnMouseClicked(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Primo avvio?");

        javax.swing.GroupLayout ip_pnlLayout = new javax.swing.GroupLayout(ip_pnl);
        ip_pnl.setLayout(ip_pnlLayout);
        ip_pnlLayout.setHorizontalGroup(
                ip_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ip_pnlLayout.createSequentialGroup()
                                .addComponent(campo_ip, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(conferma_ip_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                                .addGap(12, 12, 12))
                        .addGroup(ip_pnlLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(primo_avvio_scelta_ip)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ip_pnlLayout.setVerticalGroup(
                ip_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ip_pnlLayout.createSequentialGroup()
                                .addGroup(ip_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(conferma_ip_btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                                        .addComponent(campo_ip, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ip_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel11)
                                        .addComponent(primo_avvio_scelta_ip))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Inserire IP");

        javax.swing.GroupLayout scelta_locale_o_ipLayout = new javax.swing.GroupLayout(scelta_locale_o_ip);
        scelta_locale_o_ip.setLayout(scelta_locale_o_ipLayout);
        scelta_locale_o_ipLayout.setHorizontalGroup(
                scelta_locale_o_ipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(scelta_locale_o_ipLayout.createSequentialGroup()
                                .addGroup(scelta_locale_o_ipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(scelta_locale_o_ipLayout.createSequentialGroup()
                                                .addGap(226, 226, 226)
                                                .addComponent(jLabel8))
                                        .addGroup(scelta_locale_o_ipLayout.createSequentialGroup()
                                                .addGap(54, 54, 54)
                                                .addComponent(localhost_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(38, 38, 38)
                                                .addGroup(scelta_locale_o_ipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel10)
                                                        .addComponent(ip_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(95, Short.MAX_VALUE))
        );
        scelta_locale_o_ipLayout.setVerticalGroup(
                scelta_locale_o_ipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(scelta_locale_o_ipLayout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jLabel8)
                                .addGap(106, 106, 106)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(scelta_locale_o_ipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(localhost_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ip_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(124, Short.MAX_VALUE))
        );

        contenitore.add(scelta_locale_o_ip, "card4");


        avvia_pgAdmin_pnl.setBackground(new java.awt.Color(33, 32, 36));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sleziona il file pgAdmin4.exe :");

        jButton1.setText("Cerca file");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonCercaExe(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Path: ");

        path.setEnabled(false);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Aiuto");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aiutoPath(evt);
            }
        });

        avvia_pg_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        avvia_pg_btn.setText("Avvia pgAdmi4");
        avvia_pg_btn.setEnabled(false);
        avvia_pg_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                avvia_pg_btnMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Attendi che pgAdmin si avvii. Una volta avviato acceda e connetta il server");

        login_db_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        login_db_btn.setText("Login DataBase");
        login_db_btn.setEnabled(false);
        login_db_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_db_btnActionPerformed(evt);
            }
        });

        check_primo_avvio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        check_primo_avvio.setForeground(new java.awt.Color(255, 255, 255));
        check_primo_avvio.setText("Primo avvio");
        check_primo_avvio.setToolTipText("Spuntando la casella verrà creato il database");

        aiuto_btn.setForeground(new java.awt.Color(255, 255, 255));
        aiuto_btn.setText("Aiuto");
        aiuto_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aiuto_btnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout avvia_pgAdmin_pnlLayout = new javax.swing.GroupLayout(avvia_pgAdmin_pnl);
        avvia_pgAdmin_pnl.setLayout(avvia_pgAdmin_pnlLayout);
        avvia_pgAdmin_pnlLayout.setHorizontalGroup(
                avvia_pgAdmin_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(avvia_pgAdmin_pnlLayout.createSequentialGroup()
                                .addGroup(avvia_pgAdmin_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(avvia_pgAdmin_pnlLayout.createSequentialGroup()
                                                .addGap(44, 44, 44)
                                                .addGroup(avvia_pgAdmin_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(avvia_pgAdmin_pnlLayout.createSequentialGroup()
                                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton1)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel3))
                                                        .addGroup(avvia_pgAdmin_pnlLayout.createSequentialGroup()
                                                                .addComponent(jLabel2)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(path, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jLabel4)))
                                        .addGroup(avvia_pgAdmin_pnlLayout.createSequentialGroup()
                                                .addGap(291, 291, 291)
                                                .addComponent(login_db_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(check_primo_avvio)
                                                .addGap(18, 18, 18)
                                                .addComponent(aiuto_btn)))
                                .addContainerGap(44, Short.MAX_VALUE))
                        .addGroup(avvia_pgAdmin_pnlLayout.createSequentialGroup()
                                .addGap(284, 284, 284)
                                .addComponent(avvia_pg_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        avvia_pgAdmin_pnlLayout.setVerticalGroup(
                avvia_pgAdmin_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(avvia_pgAdmin_pnlLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(avvia_pgAdmin_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jButton1)
                                        .addComponent(jLabel3))
                                .addGap(38, 38, 38)
                                .addGroup(avvia_pgAdmin_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(path, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(54, 54, 54)
                                .addComponent(avvia_pg_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addGroup(avvia_pgAdmin_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(login_db_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(check_primo_avvio)
                                        .addComponent(aiuto_btn))
                                .addContainerGap(51, Short.MAX_VALUE))
        );

        contenitore.add(avvia_pgAdmin_pnl, "card2");

        login_db_pnl.setBackground(new java.awt.Color(33, 32, 36));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Accedi al DataBase");

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setText("Accedi");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonAvviaServer(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Username");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Password");

        javax.swing.GroupLayout login_db_pnlLayout = new javax.swing.GroupLayout(login_db_pnl);
        login_db_pnl.setLayout(login_db_pnlLayout);
        login_db_pnlLayout.setHorizontalGroup(
                login_db_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(login_db_pnlLayout.createSequentialGroup()
                                .addGroup(login_db_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(login_db_pnlLayout.createSequentialGroup()
                                                .addGap(315, 315, 315)
                                                .addComponent(jButton2))
                                        .addGroup(login_db_pnlLayout.createSequentialGroup()
                                                .addGap(253, 253, 253)
                                                .addGroup(login_db_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel6)
                                                        .addGroup(login_db_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(username)
                                                                .addComponent(password))
                                                        .addComponent(jLabel7))))
                                .addContainerGap(257, Short.MAX_VALUE))
        );
        login_db_pnlLayout.setVerticalGroup(
                login_db_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(login_db_pnlLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addComponent(jButton2)
                                .addContainerGap(103, Short.MAX_VALUE))
        );

        contenitore.add(login_db_pnl, "card4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(title_bar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(contenitore, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(title_bar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(contenitore, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>

    private void title_barMousePressed(java.awt.event.MouseEvent evt) {
        x=evt.getX();
        y=evt.getY();
    }

    private void title_barMouseDragged(java.awt.event.MouseEvent evt) {
        this.setLocation(this.getX()+evt.getX()-x, this.getY()+evt.getY()-y);
    }

    private void chiudi_finestra_btnMouseClicked(java.awt.event.MouseEvent evt) {
        this.dispose();
    }

    private void buttonCercaExe(java.awt.event.MouseEvent evt) {
        //lancio fileChooser per far selezionare pgAdmin.exe
        JFileChooser filechooser = new JFileChooser();
        FileFilter filter = new FileNameExtensionFilter("EXE File","exe");
        filechooser.setFileFilter(filter);
        filechooser.showOpenDialog(this);
        File file = filechooser.getSelectedFile();
        try{
            path_pg=file.getAbsolutePath();
            path.setText(path_pg);
            avvia_pg_btn.setEnabled(true);
        }catch (Exception e){}
    }

    private void aiutoPath(java.awt.event.MouseEvent evt) {
        Message.informationMessage(this, "pgAdmi4.exe di solito si trova sotto:"
                + "\nC\\Programs_files\\PostgreSQL\\versione\\pgAdmin4\\bin\\pgAdmin4.exe", "Aiuto");
    }

    private void avvia_pg_btnMouseClicked(java.awt.event.MouseEvent evt) {
        try {
            if(avvia_pg_btn.isEnabled()) Desktop.getDesktop().open(new File(path_pg));
            login_db_btn.setEnabled(true);
        } catch (IOException ex) {}
    }

    private void login_db_btnActionPerformed(java.awt.event.ActionEvent evt) {
        if(login_db_btn.isEnabled()){
            if(check_primo_avvio.isSelected())
            {primo_avvio=true;
             primo_avvio2=true;
            }
            //cambio layout
            contenitore.removeAll();
            contenitore.add(login_db_pnl);
            contenitore.repaint();
            contenitore.revalidate();
        } contenitore.removeAll();
        contenitore.add(login_db_pnl);
        contenitore.repaint();
        contenitore.revalidate();
    }

    private void buttonAvviaServer(java.awt.event.MouseEvent evt) {
        String USER=username.getText();
        String PASSWORD=new String(password.getPassword());
        String [] user_psw=new String []{URL,USER,PASSWORD};
        if(primo_avvio){
            //creo DB
            DB_URL=jdbc+URL;
            try(Connection conn = DriverManager.getConnection(DB_URL,USER,PASSWORD);
                Statement st= conn.createStatement();){
                String sql= SqlString.creaDB();
                st.executeUpdate(sql);
                primo_avvio=false;
                errore=false;
            }catch (SQLException e){
                e.printStackTrace();
                if(e.getMessage().contains("ERROR")){
                    Message.errorMessage(this, "Il database esiste già","DB già esistente");
                }else if(e.getMessage().contains("FATAL")){
                    Message.errorMessage(this, "1-Credenziali errate, prego reinserire","Errore");
                    errore=true;
                }
                else Message.errorMessage(this, "Errore generico","Errore");
            }
        }

        try{
            DB_URL=jdbc+URL+nomedb;
            Connection con = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            Statement s= con.createStatement();
            String tabella=SqlString.creaTabellaCodiciOperatore();
            s.executeUpdate(tabella);
            errore=false;}
            catch (SQLException e){
            System.out.println(e.getMessage());
            if(e.getMessage().contains("Il tentativo di connessione")){
                Message.errorMessage(this, "L'indirizzo IP del DB è irraggiungibile", "DB irraggiungibile");
                contenitore.removeAll();
                contenitore.add(scelta_locale_o_ip);
                contenitore.repaint();
                contenitore.revalidate();
                errore=true;
            }
            if(!errore && !(e.getMessage().contains("Il tentativo di connessione"))){Message.errorMessage(this, "2-Credenziali errate, prego reinserire","Errore");errore=true;}
            }
        if (primo_avvio2){
            try {
                DB_URL=jdbc+URL+nomedb;
                Connection con = DriverManager.getConnection(DB_URL, USER, PASSWORD);
                Statement s = con.createStatement();
                String insert_codice = SqlString.insertCodiceOperatore();
                s.executeUpdate(insert_codice);
                errore=false;
            }catch (Exception e){
                e.printStackTrace();
            }
            }
        if(!errore){
            System.out.println(DB_URL);
            Message.warningMessage(this,"Ricordati che una volta chiusa questa finestra il server girerà in background. " +
                                                "\nPer chiuderlo andare nella gestione attività di windows","Attenzione, server in background");
            this.dispose();
            try {
                //avvio multiserver e gli passo le credenziali come parametro del main
                MultiServer.main(user_psw);
            } catch (IOException ex) {}
        }
    }

    private void aiuto_btnMouseClicked(java.awt.event.MouseEvent evt) {
        Message.informationMessage(this, "Spuntando questa casella verrà creato il \ndatabase. Se è già stato creato non spuntare la casella", "Avviso");
    }

    private void localhost_btnMouseClicked(java.awt.event.MouseEvent evt) {
        URL="localhost";
        System.out.println(URL+" "+DB_URL);
        //cambio layout panel
        contenitore.removeAll();
        contenitore.add(avvia_pgAdmin_pnl);
        contenitore.repaint();
        contenitore.revalidate();
    }

    private void conferma_ip_btnMouseClicked(java.awt.event.MouseEvent evt) {
        URL=campo_ip.getText();
        if(URL.matches("^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])(\\.(?!$)|$)){4}$")) {
            System.out.println(URL + " " + DB_URL);
            if (primo_avvio_scelta_ip.isSelected()) {
                primo_avvio2 = true;
                primo_avvio = true;
            }
            //cambio layout panel
            contenitore.removeAll();
            contenitore.add(login_db_pnl);
            contenitore.repaint();
            contenitore.revalidate();
        }else{
            Message.errorMessage(this, "Non è un ip , rienserisca", "IP non conforme");
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
            java.util.logging.Logger.getLogger(LanciaServerV2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LanciaServerV2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LanciaServerV2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LanciaServerV2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LanciaServerV2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel aiuto_btn;
    private javax.swing.JPanel avvia_pgAdmin_pnl;
    private javax.swing.JButton avvia_pg_btn;
    private javax.swing.JTextField campo_ip;
    private javax.swing.JCheckBox check_primo_avvio;
    private javax.swing.JLabel chiudi_finestra_btn;
    private javax.swing.JLabel conferma_ip_btn;
    private javax.swing.JPanel contenitore;
    private javax.swing.JPanel ip_pnl;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel localhost_btn;
    private javax.swing.JButton login_db_btn;
    private javax.swing.JPanel login_db_pnl;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField path;
    private javax.swing.JCheckBox primo_avvio_scelta_ip;
    private javax.swing.JPanel scelta_locale_o_ip;
    private javax.swing.JPanel title_bar;
    private javax.swing.JTextField username;
    // End of variables declaration
}

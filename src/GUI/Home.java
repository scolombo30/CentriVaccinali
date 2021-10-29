//Davide Franco "741453" CO
// Sebastian Colombo "742779" CO
package GUI;

import centrivaccinali.CentroVaccinale;
import centrivaccinali.Indirizzo;
import cittadini.Cittadino;
import cittadini.DataLab;
import cittadini.Vaccinato;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Home extends javax.swing.JFrame {

    //punti per coordinate per il listener  quando trascini la finestra dalla barra del titolo
    int x,y;

    //variabili per lettura e scrittura su socket
    public static final int PORTA = 2812;
    Socket socket=null;
    ObjectOutputStream out=null;
    ObjectInputStream in=null;

    public Home() {

        try {
            // creazione socket
            socket = new Socket("localhost", Home.PORTA);
            //stampe di controllo
            System.out.println("EchoClient: started");
            System.out.println("Client Socket: "+ socket);
            // creazione stream di input da socket

            out = new ObjectOutputStream((socket.getOutputStream()));
            in = new ObjectInputStream(socket.getInputStream());
            }
        catch (UnknownHostException e) {
            System.err.println("Non conosco l'Host ");
            System.exit(1);
        } catch (IOException e) {
            System.err.println("Impossibile collegarsi");
            System.exit(1);
        }
        initComponents();
        //scelgo l'immagine dell'icona che apparirà nella task bar
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("./res/icona.png"));
    }
    //metodo auto-generato che inizializza tutti i componenti della GUI
    private void initComponents() {

        title_bar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        menu_scelta = new javax.swing.JPanel();
        btn_home = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btn_cittadino = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_operatore = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        container = new javax.swing.JPanel();
        Home_pnl = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Cittadino_pnl_noLogin = new javax.swing.JPanel();
        banner_login_signup = new javax.swing.JPanel();
        btn_signin = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btn_login = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        search_pnl = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        campo_ricerca = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        Operatore_pnl_login = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        codice_accesso_operatore = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        login_btn_operatore = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        Cittadino_pnl_Login = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        login_btn_pnlLogin = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        indietro_btn = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        Cittadino_pnl_Signup = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        nome_signup = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        cognome_signup = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        cod_fisc_signup = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        mail_signup = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        password_signup = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        conferma_password_signup = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        IDVax_signup = new javax.swing.JTextField();
        registrati_btn = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        Operatore_pnl_scelta = new javax.swing.JPanel();
        banner_pulsanti_scelta = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        registra_centro_btn = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        registra_vaccinato_btn = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        container_scelta_operatore = new javax.swing.JPanel();
        registra_centro_pnl = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        nome_centro = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        qualificatore_indirizzo = new javax.swing.JComboBox<>();
        nome_via_indirizzo = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        numero_civico_indirizzo = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        comune_indirizzo = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        provincia_indirizzo = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        cap_indirizzo = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        tipologia_centro = new javax.swing.JComboBox<>();
        Registra_centro_btn = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        registra_vaccinato_pnl = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        nome_centro_registra_vaccinato = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        nome_vaccinato_registra_vaccinato = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        cognome_vaccinato_registra_vaccinato = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        codice_fiscale_registra_vaccinato = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        mese_registra_vaccinato = new javax.swing.JComboBox<>();
        anno_registra_vaccinato = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        tipo_vaccino_registra_vaccinato = new javax.swing.JComboBox<>();
        jLabel60 = new javax.swing.JLabel();
        giorno_registra_vaccinato = new javax.swing.JTextField();
        Id_vaccinazione_registra_vaccinato = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        registra_vaccinato_registra_vaccinato_pnl = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        title_bar.setBackground(new java.awt.Color(54, 33, 89));
        title_bar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                title_barMouseDragged(evt);
            }
        });
        title_bar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                title_barMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                title_barMouseReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("./res/close.png")); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(242, 242, 242));
        jLabel12.setIcon(new javax.swing.ImageIcon("./res/minimize.png")); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout title_barLayout = new javax.swing.GroupLayout(title_bar);
        title_bar.setLayout(title_barLayout);
        title_barLayout.setHorizontalGroup(
                title_barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, title_barLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel1)
                                .addContainerGap())
        );
        title_barLayout.setVerticalGroup(
                title_barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(title_barLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(title_barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel1))
                                .addGap(7, 7, 7))
        );

        menu_scelta.setBackground(new java.awt.Color(64, 43, 100));

        btn_home.setBackground(new java.awt.Color(85, 65, 118));
        btn_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_homeMouseClicked(evt);
            }
        });

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon("./res/home.png")); // NOI18N
        jLabel8.setToolTipText("");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Home");

        javax.swing.GroupLayout btn_homeLayout = new javax.swing.GroupLayout(btn_home);
        btn_home.setLayout(btn_homeLayout);
        btn_homeLayout.setHorizontalGroup(
                btn_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(btn_homeLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel9)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_homeLayout.setVerticalGroup(
                btn_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(btn_homeLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(btn_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(7, 7, 7))
        );

        btn_cittadino.setBackground(new java.awt.Color(64, 43, 100));
        btn_cittadino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cittadinoMouseClicked(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon("./res/user.png")); // NOI18N
        jLabel2.setToolTipText("");
        jLabel2.setIconTextGap(0);
        jLabel2.setRequestFocusEnabled(false);
        jLabel2.setVerifyInputWhenFocusTarget(false);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cittadino");

        javax.swing.GroupLayout btn_cittadinoLayout = new javax.swing.GroupLayout(btn_cittadino);
        btn_cittadino.setLayout(btn_cittadinoLayout);
        btn_cittadinoLayout.setHorizontalGroup(
                btn_cittadinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(btn_cittadinoLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel3)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_cittadinoLayout.setVerticalGroup(
                btn_cittadinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(btn_cittadinoLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(btn_cittadinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(7, 7, 7))
        );

        btn_operatore.setBackground(new java.awt.Color(64, 43, 100));
        btn_operatore.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_operatoreMouseClicked(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon("./res/dottore.png")); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Operatore");

        javax.swing.GroupLayout btn_operatoreLayout = new javax.swing.GroupLayout(btn_operatore);
        btn_operatore.setLayout(btn_operatoreLayout);
        btn_operatoreLayout.setHorizontalGroup(
                btn_operatoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(btn_operatoreLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel5)
                                .addContainerGap(54, Short.MAX_VALUE))
        );
        btn_operatoreLayout.setVerticalGroup(
                btn_operatoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(btn_operatoreLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(btn_operatoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(7, 7, 7))
        );

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Piattaforma CV");

        javax.swing.GroupLayout menu_sceltaLayout = new javax.swing.GroupLayout(menu_scelta);
        menu_scelta.setLayout(menu_sceltaLayout);
        menu_sceltaLayout.setHorizontalGroup(
                menu_sceltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn_cittadino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_operatore, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_sceltaLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10)
                                .addGap(24, 24, 24))
        );
        menu_sceltaLayout.setVerticalGroup(
                menu_sceltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(menu_sceltaLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(150, 150, 150)
                                .addComponent(btn_home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn_cittadino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn_operatore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        container.setBackground(new java.awt.Color(238, 245, 219));
        container.setLayout(new java.awt.CardLayout());

        Home_pnl.setBackground(new java.awt.Color(33, 32, 36));

        jLabel13.setIcon(new javax.swing.ImageIcon("./res/immagine_homee.png")); // NOI18N

        jLabel14.setBackground(new java.awt.Color(255, 204, 204));
        jLabel14.setIcon(new javax.swing.ImageIcon("./res/benvenuti (1).png")); // NOI18N

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Per procedere con l'utilizzo, scegliere \"Cittadino\" o \"Operatore\"");

        javax.swing.GroupLayout Home_pnlLayout = new javax.swing.GroupLayout(Home_pnl);
        Home_pnl.setLayout(Home_pnlLayout);
        Home_pnlLayout.setHorizontalGroup(
                Home_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Home_pnlLayout.createSequentialGroup()
                                .addGroup(Home_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(Home_pnlLayout.createSequentialGroup()
                                                .addGap(39, 39, 39)
                                                .addComponent(jLabel15)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Home_pnlLayout.createSequentialGroup()
                                                .addGap(50, 50, 50)
                                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(3, 3, 3)))
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))
        );
        Home_pnlLayout.setVerticalGroup(
                Home_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Home_pnlLayout.createSequentialGroup()
                                .addGroup(Home_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(Home_pnlLayout.createSequentialGroup()
                                                .addGap(97, 97, 97)
                                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(Home_pnlLayout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel15)))
                                .addGap(82, 82, 82))
        );

        container.add(Home_pnl, "card4");

        Cittadino_pnl_noLogin.setBackground(new java.awt.Color(33, 32, 36));

        banner_login_signup.setBackground(new java.awt.Color(121, 93, 166));

        btn_signin.setBackground(new java.awt.Color(64, 43, 100));
        btn_signin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_signinMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("   Sign up");

        javax.swing.GroupLayout btn_signinLayout = new javax.swing.GroupLayout(btn_signin);
        btn_signin.setLayout(btn_signinLayout);
        btn_signinLayout.setHorizontalGroup(
                btn_signinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        btn_signinLayout.setVerticalGroup(
                btn_signinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
        );

        btn_login.setBackground(new java.awt.Color(30, 20, 47));
        btn_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_loginMouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("   Login");

        javax.swing.GroupLayout btn_loginLayout = new javax.swing.GroupLayout(btn_login);
        btn_login.setLayout(btn_loginLayout);
        btn_loginLayout.setHorizontalGroup(
                btn_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        btn_loginLayout.setVerticalGroup(
                btn_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout banner_login_signupLayout = new javax.swing.GroupLayout(banner_login_signup);
        banner_login_signup.setLayout(banner_login_signupLayout);
        banner_login_signupLayout.setHorizontalGroup(
                banner_login_signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, banner_login_signupLayout.createSequentialGroup()
                                .addContainerGap(704, Short.MAX_VALUE)
                                .addComponent(btn_signin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30))
        );
        banner_login_signupLayout.setVerticalGroup(
                banner_login_signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, banner_login_signupLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(banner_login_signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btn_signin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(3, 3, 3))
        );

        search_pnl.setBackground(new java.awt.Color(33, 32, 36));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Cerca centro:");

        campo_ricerca.setToolTipText("Nome centro vaccinale");
        campo_ricerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_ricercaActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Nome centro");

        jPanel1.setBackground(new java.awt.Color(33, 32, 36));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 87, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 34, Short.MAX_VALUE)
        );

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon("./res/search.png")); // NOI18N
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Risultati ricerca");

        javax.swing.GroupLayout search_pnlLayout = new javax.swing.GroupLayout(search_pnl);
        search_pnl.setLayout(search_pnlLayout);
        search_pnlLayout.setHorizontalGroup(
                search_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(search_pnlLayout.createSequentialGroup()
                                .addGroup(search_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(search_pnlLayout.createSequentialGroup()
                                                .addGap(97, 97, 97)
                                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(search_pnlLayout.createSequentialGroup()
                                                .addGap(42, 42, 42)
                                                .addComponent(jLabel16)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(search_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(campo_ricerca, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(12, 12, 12)
                                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        search_pnlLayout.setVerticalGroup(
                search_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(search_pnlLayout.createSequentialGroup()
                                .addGroup(search_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(search_pnlLayout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(jLabel17)
                                                .addGap(0, 0, 0)
                                                .addGroup(search_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(search_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel16)
                                                                .addComponent(campo_ricerca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(search_pnlLayout.createSequentialGroup()
                                                .addGap(29, 29, 29)
                                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(192, 192, 192)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(287, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Cittadino_pnl_noLoginLayout = new javax.swing.GroupLayout(Cittadino_pnl_noLogin);
        Cittadino_pnl_noLogin.setLayout(Cittadino_pnl_noLoginLayout);
        Cittadino_pnl_noLoginLayout.setHorizontalGroup(
                Cittadino_pnl_noLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(banner_login_signup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(search_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Cittadino_pnl_noLoginLayout.setVerticalGroup(
                Cittadino_pnl_noLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Cittadino_pnl_noLoginLayout.createSequentialGroup()
                                .addComponent(banner_login_signup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(search_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        container.add(Cittadino_pnl_noLogin, "card2");

        Operatore_pnl_login.setBackground(new java.awt.Color(33, 32, 36));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Login Operatore");

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText(" Codice Accesso");

        login_btn_operatore.setBackground(new java.awt.Color(85, 65, 118));
        login_btn_operatore.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                login_btn_operatoreMouseClicked(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Login");

        javax.swing.GroupLayout login_btn_operatoreLayout = new javax.swing.GroupLayout(login_btn_operatore);
        login_btn_operatore.setLayout(login_btn_operatoreLayout);
        login_btn_operatoreLayout.setHorizontalGroup(
                login_btn_operatoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(login_btn_operatoreLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel37)
                                .addContainerGap(26, Short.MAX_VALUE))
        );
        login_btn_operatoreLayout.setVerticalGroup(
                login_btn_operatoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(login_btn_operatoreLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel37)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel38.setIcon(new javax.swing.ImageIcon("./res/immagine_login_operatore.png")); // NOI18N

        javax.swing.GroupLayout Operatore_pnl_loginLayout = new javax.swing.GroupLayout(Operatore_pnl_login);
        Operatore_pnl_login.setLayout(Operatore_pnl_loginLayout);
        Operatore_pnl_loginLayout.setHorizontalGroup(
                Operatore_pnl_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Operatore_pnl_loginLayout.createSequentialGroup()
                                .addGap(300, 300, 300)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(Operatore_pnl_loginLayout.createSequentialGroup()
                                .addGap(300, 300, 300)
                                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(Operatore_pnl_loginLayout.createSequentialGroup()
                                .addGap(303, 303, 303)
                                .addComponent(codice_accesso_operatore, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(Operatore_pnl_loginLayout.createSequentialGroup()
                                .addGap(380, 380, 380)
                                .addComponent(login_btn_operatore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(Operatore_pnl_loginLayout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Operatore_pnl_loginLayout.setVerticalGroup(
                Operatore_pnl_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Operatore_pnl_loginLayout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jLabel7)
                                .addGap(52, 52, 52)
                                .addComponent(jLabel35)
                                .addGap(0, 0, 0)
                                .addComponent(codice_accesso_operatore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(login_btn_operatore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        container.add(Operatore_pnl_login, "card3");

        Cittadino_pnl_Login.setBackground(new java.awt.Color(33, 32, 36));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Login");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Username");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Password");

        login_btn_pnlLogin.setBackground(new java.awt.Color(85, 65, 118));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Login");

        javax.swing.GroupLayout login_btn_pnlLoginLayout = new javax.swing.GroupLayout(login_btn_pnlLogin);
        login_btn_pnlLogin.setLayout(login_btn_pnlLoginLayout);
        login_btn_pnlLoginLayout.setHorizontalGroup(
                login_btn_pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(login_btn_pnlLoginLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel23)
                                .addContainerGap(41, Short.MAX_VALUE))
        );
        login_btn_pnlLoginLayout.setVerticalGroup(
                login_btn_pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel23)
        );

        indietro_btn.setIcon(new javax.swing.ImageIcon("./res/indietro.png")); // NOI18N
        indietro_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                indietro_btnMouseClicked(evt);
            }
        });

        jLabel36.setIcon(new javax.swing.ImageIcon("./res/immagine_login.png")); // NOI18N

        javax.swing.GroupLayout Cittadino_pnl_LoginLayout = new javax.swing.GroupLayout(Cittadino_pnl_Login);
        Cittadino_pnl_Login.setLayout(Cittadino_pnl_LoginLayout);
        Cittadino_pnl_LoginLayout.setHorizontalGroup(
                Cittadino_pnl_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Cittadino_pnl_LoginLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(indietro_btn)
                                .addGap(330, 330, 330)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(Cittadino_pnl_LoginLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(110, 110, 110)
                                .addGroup(Cittadino_pnl_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel21)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel22)
                                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(Cittadino_pnl_LoginLayout.createSequentialGroup()
                                                .addGap(60, 60, 60)
                                                .addComponent(login_btn_pnlLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        Cittadino_pnl_LoginLayout.setVerticalGroup(
                Cittadino_pnl_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Cittadino_pnl_LoginLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(Cittadino_pnl_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(indietro_btn)
                                        .addGroup(Cittadino_pnl_LoginLayout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel20)))
                                .addGap(52, 52, 52)
                                .addGroup(Cittadino_pnl_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(Cittadino_pnl_LoginLayout.createSequentialGroup()
                                                .addGap(110, 110, 110)
                                                .addComponent(jLabel21)
                                                .addGap(0, 0, 0)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(20, 20, 20)
                                                .addComponent(jLabel22)
                                                .addGap(0, 0, 0)
                                                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(30, 30, 30)
                                                .addComponent(login_btn_pnlLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        container.add(Cittadino_pnl_Login, "card5");

        Cittadino_pnl_Signup.setBackground(new java.awt.Color(33, 32, 36));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Sign up");

        jLabel25.setIcon(new javax.swing.ImageIcon("./res/immagine_signup.png")); // NOI18N

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Nome");

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Cognome");

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Codice Fiscale (UserID)");

        mail_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mail_signupActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Indirizzo mail");

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Password");

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Conferma password");

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("ID Vaccinazione");

        registrati_btn.setBackground(new java.awt.Color(85, 65, 118));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Registrati");

        javax.swing.GroupLayout registrati_btnLayout = new javax.swing.GroupLayout(registrati_btn);
        registrati_btn.setLayout(registrati_btnLayout);
        registrati_btnLayout.setHorizontalGroup(
                registrati_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(registrati_btnLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel33)
                                .addContainerGap(39, Short.MAX_VALUE))
        );
        registrati_btnLayout.setVerticalGroup(
                registrati_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jLabel34.setIcon(new javax.swing.ImageIcon("./res/indietro.png")); // NOI18N
        jLabel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel34MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Cittadino_pnl_SignupLayout = new javax.swing.GroupLayout(Cittadino_pnl_Signup);
        Cittadino_pnl_Signup.setLayout(Cittadino_pnl_SignupLayout);
        Cittadino_pnl_SignupLayout.setHorizontalGroup(
                Cittadino_pnl_SignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Cittadino_pnl_SignupLayout.createSequentialGroup()
                                .addGroup(Cittadino_pnl_SignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(Cittadino_pnl_SignupLayout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel34)
                                                .addGap(343, 343, 343)
                                                .addComponent(jLabel24))
                                        .addGroup(Cittadino_pnl_SignupLayout.createSequentialGroup()
                                                .addGap(60, 60, 60)
                                                .addGroup(Cittadino_pnl_SignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(Cittadino_pnl_SignupLayout.createSequentialGroup()
                                                                .addComponent(jLabel26)
                                                                .addGap(149, 149, 149)
                                                                .addComponent(jLabel27))
                                                        .addGroup(Cittadino_pnl_SignupLayout.createSequentialGroup()
                                                                .addComponent(nome_signup, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(10, 10, 10)
                                                                .addComponent(cognome_signup, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jLabel28)
                                                        .addComponent(cod_fisc_signup, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel29)
                                                        .addComponent(mail_signup, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel30)
                                                        .addComponent(password_signup, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel31)
                                                        .addComponent(conferma_password_signup, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel32)
                                                        .addComponent(IDVax_signup, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(Cittadino_pnl_SignupLayout.createSequentialGroup()
                                                                .addGap(100, 100, 100)
                                                                .addComponent(registrati_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(130, 130, 130)
                                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(34, 34, 34))
        );
        Cittadino_pnl_SignupLayout.setVerticalGroup(
                Cittadino_pnl_SignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Cittadino_pnl_SignupLayout.createSequentialGroup()
                                .addGroup(Cittadino_pnl_SignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(Cittadino_pnl_SignupLayout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel34))
                                        .addGroup(Cittadino_pnl_SignupLayout.createSequentialGroup()
                                                .addGap(45, 45, 45)
                                                .addComponent(jLabel24)))
                                .addGap(57, 57, 57)
                                .addGroup(Cittadino_pnl_SignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(Cittadino_pnl_SignupLayout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addGroup(Cittadino_pnl_SignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel26)
                                                        .addComponent(jLabel27))
                                                .addGroup(Cittadino_pnl_SignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(nome_signup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(cognome_signup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel28)
                                                .addGap(0, 0, 0)
                                                .addComponent(cod_fisc_signup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel29)
                                                .addGap(0, 0, 0)
                                                .addComponent(mail_signup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel30)
                                                .addGap(0, 0, 0)
                                                .addComponent(password_signup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel31)
                                                .addGap(0, 0, 0)
                                                .addComponent(conferma_password_signup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel32)
                                                .addGap(0, 0, 0)
                                                .addComponent(IDVax_signup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(registrati_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        container.add(Cittadino_pnl_Signup, "card6");

        Operatore_pnl_scelta.setBackground(new java.awt.Color(33, 32, 36));

        banner_pulsanti_scelta.setBackground(new java.awt.Color(121, 93, 166));

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Selezionare cosa registrare:");

        registra_centro_btn.setBackground(new java.awt.Color(30, 20, 47));
        registra_centro_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registra_centro_btnMouseClicked(evt);

            }
        });

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Centro Vaccinale");

        javax.swing.GroupLayout registra_centro_btnLayout = new javax.swing.GroupLayout(registra_centro_btn);
        registra_centro_btn.setLayout(registra_centro_btnLayout);
        registra_centro_btnLayout.setHorizontalGroup(
                registra_centro_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registra_centro_btnLayout.createSequentialGroup()
                                .addContainerGap(23, Short.MAX_VALUE)
                                .addComponent(jLabel39)
                                .addGap(17, 17, 17))
        );
        registra_centro_btnLayout.setVerticalGroup(
                registra_centro_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        registra_vaccinato_btn.setBackground(new java.awt.Color(30, 20, 47));
        registra_vaccinato_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registra_vaccinato_btnMouseClicked(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Vaccinato");

        javax.swing.GroupLayout registra_vaccinato_btnLayout = new javax.swing.GroupLayout(registra_vaccinato_btn);
        registra_vaccinato_btn.setLayout(registra_vaccinato_btnLayout);
        registra_vaccinato_btnLayout.setHorizontalGroup(
                registra_vaccinato_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(registra_vaccinato_btnLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel40)
                                .addContainerGap(51, Short.MAX_VALUE))
        );
        registra_vaccinato_btnLayout.setVerticalGroup(
                registra_vaccinato_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(registra_vaccinato_btnLayout.createSequentialGroup()
                                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout banner_pulsanti_sceltaLayout = new javax.swing.GroupLayout(banner_pulsanti_scelta);
        banner_pulsanti_scelta.setLayout(banner_pulsanti_sceltaLayout);
        banner_pulsanti_sceltaLayout.setHorizontalGroup(
                banner_pulsanti_sceltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(banner_pulsanti_sceltaLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel43)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(registra_centro_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)
                                .addComponent(registra_vaccinato_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75))
        );
        banner_pulsanti_sceltaLayout.setVerticalGroup(
                banner_pulsanti_sceltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(banner_pulsanti_sceltaLayout.createSequentialGroup()
                                .addGroup(banner_pulsanti_sceltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(banner_pulsanti_sceltaLayout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addComponent(jLabel43))
                                        .addGroup(banner_pulsanti_sceltaLayout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addGroup(banner_pulsanti_sceltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(registra_vaccinato_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(registra_centro_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 11, Short.MAX_VALUE))
        );

        container_scelta_operatore.setLayout(new java.awt.CardLayout());

        registra_centro_pnl.setBackground(new java.awt.Color(33, 32, 36));

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("Registra Centro");

        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Nome centro");

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Indirizzo centro:");

        qualificatore_indirizzo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "------", "Via", "Viale", "Piazza" }));

        jLabel46.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("Nome via");

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("N. Civ");

        comune_indirizzo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comune_indirizzoActionPerformed(evt);
            }
        });

        jLabel48.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("Comune");

        jLabel49.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("Sigla");

        jLabel50.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("prov");

        jLabel51.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(242, 242, 242));
        jLabel51.setText("CAP");

        jLabel52.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(242, 242, 242));
        jLabel52.setText("Tipologia");

        tipologia_centro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--------------", "Ospedaliero", "Aziendale", "Hub" }));

        Registra_centro_btn.setBackground(new java.awt.Color(64, 43, 100));
       //listener aggiunto al btn registra centro nel panel degli operatori
        Registra_centro_btn.addMouseListener(new java.awt.event.MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                Registra_centro_btnMouseClicked(e);
            }
        });
        //listener aggiunto al btn registra vaccinato nel panel degli operatori
        registra_vaccinato_registra_vaccinato_pnl.addMouseListener(new java.awt.event.MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent a) {
                Registra_vaccinato_btnMouseClicked(a);
            }
        });
        //listener aggiunto al btn registra cittadino nel panel dei cittadini
        registrati_btn.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(MouseEvent p) {
                Registra_cittadino_btnMouseClicked(p);
            }
        });

        //listener aggiunto al btn login cittadino nel panel dei cittadini
        login_btn_pnlLogin.addMouseListener(new java.awt.event.MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent i) {
                Login_cittadino_btnMouseClicked(i);
            }
        });

        jLabel53.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(242, 242, 242));
        jLabel53.setText("Registra Centro");

        javax.swing.GroupLayout Registra_centro_btnLayout = new javax.swing.GroupLayout(Registra_centro_btn);
        Registra_centro_btn.setLayout(Registra_centro_btnLayout);
        Registra_centro_btnLayout.setHorizontalGroup(
                Registra_centro_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Registra_centro_btnLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel53)
                                .addContainerGap(36, Short.MAX_VALUE))
        );
        Registra_centro_btnLayout.setVerticalGroup(
                Registra_centro_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Registra_centro_btnLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel53)
                                .addGap(9, 9, 9))
        );

        jLabel66.setIcon(new javax.swing.ImageIcon("./res/immagine_registra_centro.png")); // NOI18N

        javax.swing.GroupLayout registra_centro_pnlLayout = new javax.swing.GroupLayout(registra_centro_pnl);
        registra_centro_pnl.setLayout(registra_centro_pnlLayout);
        registra_centro_pnlLayout.setHorizontalGroup(
                registra_centro_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(registra_centro_pnlLayout.createSequentialGroup()
                                .addGroup(registra_centro_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(registra_centro_pnlLayout.createSequentialGroup()
                                                .addGap(80, 80, 80)
                                                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(registra_centro_pnlLayout.createSequentialGroup()
                                                .addGap(80, 80, 80)
                                                .addComponent(jLabel44)
                                                .addGap(301, 301, 301)
                                                .addComponent(jLabel52))
                                        .addGroup(registra_centro_pnlLayout.createSequentialGroup()
                                                .addGap(80, 80, 80)
                                                .addComponent(nome_centro, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(60, 60, 60)
                                                .addComponent(tipologia_centro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(registra_centro_pnlLayout.createSequentialGroup()
                                                .addGap(80, 80, 80)
                                                .addComponent(jLabel45)
                                                .addGap(360, 360, 360)
                                                .addComponent(jLabel49))
                                        .addGroup(registra_centro_pnlLayout.createSequentialGroup()
                                                .addGap(330, 330, 330)
                                                .addComponent(Registra_centro_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(registra_centro_pnlLayout.createSequentialGroup()
                                                .addGap(80, 80, 80)
                                                .addGroup(registra_centro_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(registra_centro_pnlLayout.createSequentialGroup()
                                                                .addComponent(jLabel46)
                                                                .addGap(166, 166, 166)
                                                                .addComponent(jLabel47)
                                                                .addGap(27, 27, 27)
                                                                .addComponent(jLabel48)
                                                                .addGap(94, 94, 94)
                                                                .addComponent(jLabel50)
                                                                .addGap(39, 39, 39))
                                                        .addGroup(registra_centro_pnlLayout.createSequentialGroup()
                                                                .addComponent(qualificatore_indirizzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(8, 8, 8)
                                                                .addComponent(nome_via_indirizzo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(10, 10, 10)
                                                                .addComponent(numero_civico_indirizzo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(10, 10, 10)
                                                                .addComponent(comune_indirizzo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(10, 10, 10)
                                                                .addComponent(provincia_indirizzo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                                .addGroup(registra_centro_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel51)
                                                        .addComponent(cap_indirizzo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(185, Short.MAX_VALUE))
        );
        registra_centro_pnlLayout.setVerticalGroup(
                registra_centro_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(registra_centro_pnlLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addGroup(registra_centro_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel44)
                                        .addComponent(jLabel52))
                                .addGroup(registra_centro_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nome_centro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tipologia_centro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(registra_centro_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel45)
                                        .addGroup(registra_centro_pnlLayout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addComponent(jLabel49)))
                                .addGap(4, 4, 4)
                                .addGroup(registra_centro_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel46)
                                        .addComponent(jLabel47)
                                        .addComponent(jLabel48)
                                        .addComponent(jLabel50)
                                        .addComponent(jLabel51))
                                .addGap(4, 4, 4)
                                .addGroup(registra_centro_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(qualificatore_indirizzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nome_via_indirizzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(numero_civico_indirizzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(comune_indirizzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(provincia_indirizzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cap_indirizzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(Registra_centro_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        container_scelta_operatore.add(registra_centro_pnl, "card2");

        registra_vaccinato_pnl.setBackground(new java.awt.Color(33, 32, 36));
        registra_vaccinato_pnl.setForeground(new java.awt.Color(255, 255, 255));

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Registra vaccinato");

        jLabel54.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("Nome centro vaccinale");

        jLabel55.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setText("Nome");

        jLabel56.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setText("Cognome");

        cognome_vaccinato_registra_vaccinato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cognome_vaccinato_registra_vaccinatoActionPerformed(evt);
            }
        });

        jLabel57.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setText("Codice fiscale");

        jLabel58.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(242, 242, 242));
        jLabel58.setText("Data somministrazione:");

        mese_registra_vaccinato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "------------", "Gennaio", "Febbraio", "Marzo", "Aprile", "Maggio", "Giugno", "Luglio", "Agosto", "Settembre", "Ottobre", "Novembre", "Dicembre" }));

        jLabel59.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setText("Tipo vaccino");

        tipo_vaccino_registra_vaccinato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--------", "Pfizer", "Moderna", "AstraZeneca", "J&J" }));

        jLabel60.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setText("ID univoco vaccinazione");

        jLabel61.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(242, 242, 242));
        jLabel61.setText("Giorno");

        jLabel62.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(242, 242, 242));
        jLabel62.setText("Mese");

        jLabel63.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(242, 242, 242));
        jLabel63.setText("Anno");

        registra_vaccinato_registra_vaccinato_pnl.setBackground(new java.awt.Color(64, 43, 100));

        jLabel64.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(242, 242, 242));
        jLabel64.setText("Registra vaccinato");

        javax.swing.GroupLayout registra_vaccinato_registra_vaccinato_pnlLayout = new javax.swing.GroupLayout(registra_vaccinato_registra_vaccinato_pnl);
        registra_vaccinato_registra_vaccinato_pnl.setLayout(registra_vaccinato_registra_vaccinato_pnlLayout);
        registra_vaccinato_registra_vaccinato_pnlLayout.setHorizontalGroup(
                registra_vaccinato_registra_vaccinato_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registra_vaccinato_registra_vaccinato_pnlLayout.createSequentialGroup()
                                .addContainerGap(27, Short.MAX_VALUE)
                                .addComponent(jLabel64)
                                .addGap(16, 16, 16))
        );
        registra_vaccinato_registra_vaccinato_pnlLayout.setVerticalGroup(
                registra_vaccinato_registra_vaccinato_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(registra_vaccinato_registra_vaccinato_pnlLayout.createSequentialGroup()
                                .addComponent(jLabel64)
                                .addGap(0, 5, Short.MAX_VALUE))
        );

        jLabel65.setIcon(new javax.swing.ImageIcon("./res/immagine_registra_vaccinato.png")); // NOI18N

        javax.swing.GroupLayout registra_vaccinato_pnlLayout = new javax.swing.GroupLayout(registra_vaccinato_pnl);
        registra_vaccinato_pnl.setLayout(registra_vaccinato_pnlLayout);
        registra_vaccinato_pnlLayout.setHorizontalGroup(
                registra_vaccinato_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(registra_vaccinato_pnlLayout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addGroup(registra_vaccinato_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel54)
                                        .addComponent(nome_centro_registra_vaccinato, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(registra_vaccinato_pnlLayout.createSequentialGroup()
                                                .addComponent(jLabel55)
                                                .addGap(169, 169, 169)
                                                .addComponent(jLabel56)
                                                .addGap(185, 185, 185)
                                                .addComponent(jLabel57))
                                        .addGroup(registra_vaccinato_pnlLayout.createSequentialGroup()
                                                .addComponent(nome_vaccinato_registra_vaccinato, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(30, 30, 30)
                                                .addComponent(cognome_vaccinato_registra_vaccinato, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(30, 30, 30)
                                                .addComponent(codice_fiscale_registra_vaccinato, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(registra_vaccinato_pnlLayout.createSequentialGroup()
                                                .addGroup(registra_vaccinato_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(registra_vaccinato_pnlLayout.createSequentialGroup()
                                                                .addComponent(jLabel61)
                                                                .addGap(44, 44, 44)
                                                                .addComponent(jLabel62)
                                                                .addGap(74, 74, 74)
                                                                .addComponent(jLabel63))
                                                        .addGroup(registra_vaccinato_pnlLayout.createSequentialGroup()
                                                                .addComponent(giorno_registra_vaccinato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(26, 26, 26)
                                                                .addComponent(mese_registra_vaccinato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(16, 16, 16)
                                                                .addComponent(anno_registra_vaccinato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jLabel59)
                                                        .addComponent(tipo_vaccino_registra_vaccinato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel60)
                                                        .addComponent(Id_vaccinazione_registra_vaccinato, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(registra_vaccinato_pnlLayout.createSequentialGroup()
                                                                .addGap(30, 30, 30)
                                                                .addComponent(registra_vaccinato_registra_vaccinato_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(266, 266, 266)
                                                .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        registra_vaccinato_pnlLayout.setVerticalGroup(
                registra_vaccinato_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(registra_vaccinato_pnlLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel42)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel54)
                                .addGap(0, 0, 0)
                                .addComponent(nome_centro_registra_vaccinato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(registra_vaccinato_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel55)
                                        .addComponent(jLabel56)
                                        .addComponent(jLabel57))
                                .addGroup(registra_vaccinato_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nome_vaccinato_registra_vaccinato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cognome_vaccinato_registra_vaccinato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(codice_fiscale_registra_vaccinato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(registra_vaccinato_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(registra_vaccinato_pnlLayout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel58)
                                                .addGap(5, 5, 5)
                                                .addGroup(registra_vaccinato_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel61)
                                                        .addComponent(jLabel62)
                                                        .addComponent(jLabel63))
                                                .addGroup(registra_vaccinato_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(giorno_registra_vaccinato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(mese_registra_vaccinato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(anno_registra_vaccinato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel59)
                                                .addGap(0, 0, 0)
                                                .addComponent(tipo_vaccino_registra_vaccinato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel60)
                                                .addGap(0, 0, 0)
                                                .addComponent(Id_vaccinazione_registra_vaccinato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(registra_vaccinato_registra_vaccinato_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        container_scelta_operatore.add(registra_vaccinato_pnl, "card3");

        javax.swing.GroupLayout Operatore_pnl_sceltaLayout = new javax.swing.GroupLayout(Operatore_pnl_scelta);
        Operatore_pnl_scelta.setLayout(Operatore_pnl_sceltaLayout);
        Operatore_pnl_sceltaLayout.setHorizontalGroup(
                Operatore_pnl_sceltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(banner_pulsanti_scelta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(container_scelta_operatore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Operatore_pnl_sceltaLayout.setVerticalGroup(
                Operatore_pnl_sceltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Operatore_pnl_sceltaLayout.createSequentialGroup()
                                .addComponent(banner_pulsanti_scelta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(container_scelta_operatore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        container.add(Operatore_pnl_scelta, "card7");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(title_bar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(menu_scelta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(container, javax.swing.GroupLayout.PREFERRED_SIZE, 924, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(title_bar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(menu_scelta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void title_barMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_title_barMousePressed
        x=evt.getX();
        y=evt.getY();
    }//GEN-LAST:event_title_barMousePressed

    private void title_barMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_title_barMouseReleased
        // non DA TOGLIERE
    }//GEN-LAST:event_title_barMouseReleased

    private void title_barMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_title_barMouseDragged
        int xx=evt.getXOnScreen();
        int yy=evt.getYOnScreen();
        this.setLocation(xx-x, yy-y);
    }//GEN-LAST:event_title_barMouseDragged

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btn_cittadinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cittadinoMouseClicked
        //cambio layout
        container.removeAll();
        container.add(Cittadino_pnl_noLogin);
        container.repaint();
        container.revalidate();
        //cambio colore al bottone
        setColor(btn_cittadino);
        resetColor(btn_operatore);
        resetColor(btn_home);
    }//GEN-LAST:event_btn_cittadinoMouseClicked

    private void btn_operatoreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_operatoreMouseClicked
        //cambio layout
        container.removeAll();
        container.add(Operatore_pnl_login);
        container.repaint();
        container.revalidate();
        //cambio colore al bottone
        setColor(btn_operatore);
        resetColor(btn_cittadino);
        resetColor(btn_home);
    }//GEN-LAST:event_btn_operatoreMouseClicked

    private void btn_homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_homeMouseClicked
        //cambio layout
        container.removeAll();
        container.add(Home_pnl);
        container.repaint();
        container.revalidate();
        //cambio colore al bottone
        setColor(btn_home);
        resetColor(btn_operatore);
        resetColor(btn_cittadino);
    }//GEN-LAST:event_btn_homeMouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        //minimizza la finestra
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void campo_ricercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_ricercaActionPerformed

    }//GEN-LAST:event_campo_ricercaActionPerformed

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        String ricerca=campo_ricerca.getText();
        if(ricerca.isEmpty()|ricerca.isBlank()){
            //se il campo di ricerca è vuoto o bianco messaggio di errore
            JOptionPane.showMessageDialog(this,"Il campo di ricerca non può essere vuoto o pieno di spazi","Errore",JOptionPane.ERROR_MESSAGE);
        }
        else{
            //ricerca nel db
        }
    }//GEN-LAST:event_jLabel18MouseClicked

    private void btn_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loginMouseClicked
        //apro panel del login
        //cambio layout
        container.removeAll();
        container.add(Cittadino_pnl_Login);
        container.repaint();
        container.revalidate();
    }//GEN-LAST:event_btn_loginMouseClicked

    private void indietro_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_indietro_btnMouseClicked
        //cambio layout
        container.removeAll();
        container.add(Cittadino_pnl_noLogin);
        container.repaint();
        container.revalidate();
    }//GEN-LAST:event_indietro_btnMouseClicked

    private void btn_signinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_signinMouseClicked
        //cambio layout
        container.removeAll();
        container.add(Cittadino_pnl_Signup);
        container.repaint();
        container.revalidate();
    }//GEN-LAST:event_btn_signinMouseClicked

    private void mail_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mail_signupActionPerformed
    }//GEN-LAST:event_mail_signupActionPerformed

    private void jLabel34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MouseClicked
        //cambio layout
        container.removeAll();
        container.add(Cittadino_pnl_noLogin);
        container.repaint();
        container.revalidate();
    }//GEN-LAST:event_jLabel34MouseClicked

    private void registra_centro_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registra_centro_btnMouseClicked
        container_scelta_operatore.removeAll();
        container_scelta_operatore.add(registra_centro_pnl);
        container_scelta_operatore.repaint();
        container_scelta_operatore.revalidate();
    }//GEN-LAST:event_registra_centro_btnMouseClicked

    private void registra_vaccinato_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registra_vaccinato_btnMouseClicked
        container_scelta_operatore.removeAll();
        container_scelta_operatore.add(registra_vaccinato_pnl);
        container_scelta_operatore.repaint();
        container_scelta_operatore.revalidate();
    }//GEN-LAST:event_registra_vaccinato_btnMouseClicked

    private void comune_indirizzoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comune_indirizzoActionPerformed

    }//GEN-LAST:event_comune_indirizzoActionPerformed

    private void cognome_vaccinato_registra_vaccinatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cognome_vaccinato_registra_vaccinatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cognome_vaccinato_registra_vaccinatoActionPerformed

    private void login_btn_operatoreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_btn_operatoreMouseClicked
        //controllo se il codice è giusto, in quel caso apro il panel giusto, altrimenti messagio di errore
        String codice_accesso=codice_accesso_operatore.getText();
        if (codice_accesso.equals("12345")){
            container.removeAll();
            container.add(Operatore_pnl_scelta);
            container.repaint();
            container.revalidate();
        }
        else {
            JOptionPane.showMessageDialog(this,"Codice Accesso invalido. Riprovi","Codice Errato",JOptionPane.ERROR_MESSAGE);
        }
        codice_accesso_operatore.setText("");
    }//GEN-LAST:event_login_btn_operatoreMouseClicked

    //metodo per registrare informazioni di un centro vaccinale
    private void Registra_centro_btnMouseClicked(java.awt.event.MouseEvent evt) {
        //controllare che i campi non siano vuoti, siano conformi e formattare il testo (es. sigla prov in maiuscolo, nome comune solo 1 lettera in maiuscolo)
        Indirizzo indirizzo= new Indirizzo(qualificatore_indirizzo.getSelectedItem().toString(),nome_via_indirizzo.getText(),
                numero_civico_indirizzo.getText(),comune_indirizzo.getText(),provincia_indirizzo.getText(),
                cap_indirizzo.getText());
        CentroVaccinale centro=new CentroVaccinale(nome_centro.getText(),indirizzo,tipologia_centro.getSelectedItem().toString());
        System.err.println("CLICK");
        try{out.writeObject(centro);}
        catch (IOException e){};
        //aprire finestra di dialogo che avvisa della corretta registrazione e svuotare i campi
    }

    //metodo per registrare informazioni del vaccinato presso il centro
    private void Registra_vaccinato_btnMouseClicked(java.awt.event.MouseEvent evt){
        //controllare che i campi non siano vuoti, siano conformi e formattare il testo (es. sigla prov in maiuscolo, nome comune solo 1 lettera in maiuscolo)
        DataLab data=new DataLab(giorno_registra_vaccinato.getText(),mese_registra_vaccinato.getSelectedItem().toString(),anno_registra_vaccinato.getText());
        Vaccinato vaccinatp_da_registrare=new Vaccinato(nome_vaccinato_registra_vaccinato.getText(),cognome_vaccinato_registra_vaccinato.getText(),
                codice_fiscale_registra_vaccinato.getText(),nome_centro_registra_vaccinato.getText(),data,tipo_vaccino_registra_vaccinato.getSelectedItem().toString(),
                Integer.parseInt(Id_vaccinazione_registra_vaccinato.getText()));
        System.err.println("CLICK");
        try{
            out.writeObject(vaccinatp_da_registrare);}
        catch (IOException e){};
    }

    //metodo per fare login del cittadino
    private void Login_cittadino_btnMouseClicked(java.awt.event.MouseEvent evt){
        //controllare che i campi non siano vuoti, siano conformi e formattare il testo (es. sigla prov in maiuscolo, nome comune solo 1 lettera in maiuscolo)
        String user=jTextField1.getText();
        String password=jPasswordField1.getText();
    }

    //metodo per registrare cittadino
    private void Registra_cittadino_btnMouseClicked(java.awt.event.MouseEvent evt){
        //controllare che i campi non siano vuoti, siano conformi e formattare il testo (es. sigla prov in maiuscolo, nome comune solo 1 lettera in maiuscolo)
        if(password_signup.equals(conferma_password_signup)){Cittadino cittadino=new Cittadino(nome_signup.getText(),cognome_signup.getText(),cod_fisc_signup.getText(),Integer.parseInt(IDVax_signup.getText()),
                mail_signup.getText(),mail_signup.getText(),password_signup.getText());
            //scrivo sul socket
            System.err.println("CLICK");
            try{
                out.writeObject(cittadino);}
            catch (IOException e){};
        }
        else {
            //mostro panel di dialogo e cancello i campi delle password
            password_signup.setText("");
            conferma_password_signup.setText("");
            JOptionPane.showMessageDialog(this,
                    "Le password non corrispondono. Prego reinserisca.",
                    "Errore password",
                    JOptionPane.ERROR_MESSAGE);
        }

    }

    void setColor(JPanel panel){
        panel.setBackground(new Color(85,65,118));
    }
    void resetColor(JPanel panel){
        panel.setBackground(new Color(64,43,100));
    }

    //da spostare il main nella classe CentriVaccinali
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Home a=new Home();

                a.setVisible(true);
            }
        });
    }

    //GEN-BEGIN:variables
    private javax.swing.JPanel Cittadino_pnl_Login;
    private javax.swing.JPanel Cittadino_pnl_Signup;
    private javax.swing.JPanel Cittadino_pnl_noLogin;
    private javax.swing.JPanel Home_pnl;
    private javax.swing.JTextField IDVax_signup;
    private javax.swing.JTextField Id_vaccinazione_registra_vaccinato;
    private javax.swing.JPanel Operatore_pnl_login;
    private javax.swing.JPanel Operatore_pnl_scelta;
    private javax.swing.JPanel Registra_centro_btn;
    private javax.swing.JTextField anno_registra_vaccinato;
    private javax.swing.JPanel banner_login_signup;
    private javax.swing.JPanel banner_pulsanti_scelta;
    private javax.swing.JPanel btn_cittadino;
    private javax.swing.JPanel btn_home;
    private javax.swing.JPanel btn_login;
    private javax.swing.JPanel btn_operatore;
    private javax.swing.JPanel btn_signin;
    private javax.swing.JTextField campo_ricerca;
    private javax.swing.JTextField cap_indirizzo;
    private javax.swing.JTextField cod_fisc_signup;
    private javax.swing.JTextField codice_accesso_operatore;
    private javax.swing.JTextField codice_fiscale_registra_vaccinato;
    private javax.swing.JTextField cognome_signup;
    private javax.swing.JTextField cognome_vaccinato_registra_vaccinato;
    private javax.swing.JTextField comune_indirizzo;
    private javax.swing.JTextField conferma_password_signup;
    private javax.swing.JPanel container;
    private javax.swing.JPanel container_scelta_operatore;
    private javax.swing.JTextField giorno_registra_vaccinato;
    private javax.swing.JLabel indietro_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel login_btn_operatore;
    private javax.swing.JPanel login_btn_pnlLogin;
    private javax.swing.JTextField mail_signup;
    private javax.swing.JPanel menu_scelta;
    private javax.swing.JComboBox<String> mese_registra_vaccinato;
    private javax.swing.JTextField nome_centro;
    private javax.swing.JTextField nome_centro_registra_vaccinato;
    private javax.swing.JTextField nome_signup;
    private javax.swing.JTextField nome_vaccinato_registra_vaccinato;
    private javax.swing.JTextField nome_via_indirizzo;
    private javax.swing.JTextField numero_civico_indirizzo;
    private javax.swing.JTextField password_signup;
    private javax.swing.JTextField provincia_indirizzo;
    private javax.swing.JComboBox<String> qualificatore_indirizzo;
    private javax.swing.JPanel registra_centro_btn;
    private javax.swing.JPanel registra_centro_pnl;
    private javax.swing.JPanel registra_vaccinato_btn;
    private javax.swing.JPanel registra_vaccinato_pnl;
    private javax.swing.JPanel registra_vaccinato_registra_vaccinato_pnl;
    private javax.swing.JPanel registrati_btn;
    private javax.swing.JPanel search_pnl;
    private javax.swing.JComboBox<String> tipo_vaccino_registra_vaccinato;
    private javax.swing.JComboBox<String> tipologia_centro;
    private javax.swing.JPanel title_bar;

}


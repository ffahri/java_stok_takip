import javax.swing.JOptionPane;
public class UrunEkle extends javax.swing.JFrame {
    public UrunEkle() {
        initComponents();
        
    }
    public UrunEkle(int barkodAl)
    {
        Urun tmp = new Urun(barkodAl);
        String bilgi[]=tmp.bilgileriAl();
     if(bilgi!=null)
        {
        initComponents();
//select urunadi,kategori,stokmiktari,skt,mense,alisfiyat,satisfiyat,alistarihi,satistarihi
        
        urunIsmi.setText(bilgi[1]);
        barkod.setText(bilgi[0]);
        barkod.setEditable(false);
        alisFiyat.setText(bilgi[6]);
        satisFiyat.setText(bilgi[7]);
        String alisTarihi = bilgi[8];
        String temp[] = alisTarihi.split("-");
        alisGun.setSelectedItem(temp[0]);
        alisAy.setSelectedItem(temp[1]);
        alisYil.setSelectedItem(temp[2]);
        temp=null;
        String skt = bilgi[4];
        String temp2[] = skt.split("-");
        if(temp2.length==3)
        {
        jCheckBox1.setSelected(true);
        sktGun.setEnabled(true);
        sktAy.setEnabled(true);
        sktYil.setEnabled(true);
        sktGun.setSelectedItem(temp2[0]);
        sktAy.setSelectedItem(temp2[1]);
        sktYil.setSelectedItem(temp2[2]);
        }
        temp2=null;
        mense.setSelectedItem(bilgi[5]);
        stok.setText(bilgi[3]);
        kategori.setSelectedItem(bilgi[2]);
        jButton1.setText("Değiştir");
        alarmAdedi.setText(bilgi[9]);
        jLabel7.setEnabled(true);
        jLabel7.setText("Düzenleme kapatıldı");
      }
        else{
            JOptionPane.showMessageDialog(this,"VERİTABANI BAĞLANTI HATASI");
            
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        urunIsmi = new javax.swing.JFormattedTextField();
        stok = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        mense = new javax.swing.JComboBox<>();
        kategori = new javax.swing.JComboBox<>();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        barkod = new javax.swing.JFormattedTextField();
        alisFiyat = new javax.swing.JTextField();
        satisFiyat = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        alarmAdedi = new javax.swing.JFormattedTextField();
        alisGun = new javax.swing.JComboBox<>();
        alisAy = new javax.swing.JComboBox<>();
        alisYil = new javax.swing.JComboBox<>();
        sktGun = new javax.swing.JComboBox<>();
        sktAy = new javax.swing.JComboBox<>();
        sktYil = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setTitle("Ürün Ekle/Değiştir");
        setBackground(java.awt.Color.lightGray);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(jLabel1.getFont().deriveFont(jLabel1.getFont().getStyle() | java.awt.Font.BOLD, 19));
        jLabel1.setText("Alış Tarihi");

        jLabel2.setFont(jLabel2.getFont().deriveFont(jLabel2.getFont().getStyle() | java.awt.Font.BOLD, 19));
        jLabel2.setForeground(javax.swing.UIManager.getDefaults().getColor("Label.foreground"));
        jLabel2.setText("Ürün İsmi");

        jLabel3.setFont(jLabel3.getFont().deriveFont(jLabel3.getFont().getStyle() | java.awt.Font.BOLD, 19));
        jLabel3.setText("Alış Fiyatı (TL)");

        jLabel4.setFont(jLabel4.getFont().deriveFont(jLabel4.getFont().getStyle() | java.awt.Font.BOLD, 24));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ÜRÜN EKLE/DEĞİŞTİR");

        jButton1.setFont(jButton1.getFont().deriveFont(jButton1.getFont().getStyle() | java.awt.Font.BOLD, 19));
        jButton1.setText("Ürün Ekle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(jLabel5.getFont().deriveFont(jLabel5.getFont().getStyle() | java.awt.Font.BOLD, 19));
        jLabel5.setText("Stok Miktarı");

        jLabel6.setFont(jLabel6.getFont().deriveFont(jLabel6.getFont().getStyle() | java.awt.Font.BOLD, 19));
        jLabel6.setForeground(javax.swing.UIManager.getDefaults().getColor("Label.foreground"));
        jLabel6.setText("Son Kullanma Tarihi");

        jLabel8.setFont(jLabel8.getFont().deriveFont(jLabel8.getFont().getStyle() | java.awt.Font.BOLD, 19));
        jLabel8.setText("Ürün Kategorisi");

        jLabel9.setFont(jLabel9.getFont().deriveFont(jLabel9.getFont().getStyle() | java.awt.Font.BOLD, 19));
        jLabel9.setText("Satış Fiyatı (TL)");

        urunIsmi.setText("Ürün ismi");
        urunIsmi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                urunIsmiMouseClicked(evt);
            }
        });

        stok.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        stok.setMaximumSize(new java.awt.Dimension(166, 34));
        stok.setMinimumSize(new java.awt.Dimension(166, 34));

        jLabel10.setFont(jLabel10.getFont().deriveFont(jLabel10.getFont().getStyle() | java.awt.Font.BOLD, 19));
        jLabel10.setText("Menşesi");

        mense.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Afganistan", "Almanya", "Amerikan Samoa", "Amerika Birleşik Devletleri", "Andorra", "Angola", "Anguilla, İngiltere", "Antigua ve Barbuda", "Arjantin", "Arnavutluk", "Aruba, Hollanda", "Avustralya", "Avusturya", "Azerbaycan", "Bahama Adaları", "Bahreyn", "Bangladeş", "Barbados", "Belçika", "Belize", "Benin", "Bermuda, İngiltere", "Beyaz Rusya", "Bhutan", "Birleşik Arap Emirlikleri", "Birmanya (Myanmar)", "Bolivya", "Bosna Hersek", "Botswana", "Brezilya", "Brunei", "Bulgaristan", "Burkina Faso", "Burundi", "Cape Verde", "Cayman Adaları, İngiltere", "Cebelitarık, İngiltere", "Cezayir", "Christmas Adası , Avusturalya", "Cibuti", "Çad", "Çek Cumhuriyeti", "Çin", "Danimarka", "Dominika", "Dominik Cumhuriyeti", "Ekvator", "Ekvator Ginesi", "El Salvador", "Endonezya", "Eritre", "Ermenistan", "Estonya", "Etiyopya", "Fas", "Fiji", "Fildişi Sahili", "Filipinler", "Filistin", "Finlandiya", "Folkland Adaları, İngiltere", "Fransa", "Fransız Guyanası", "Fransız Güney Eyaletleri (Kerguelen Adaları)", "Fransız Polinezyası", "Gabon", "Galler", "Gambiya", "Gana", "Gine", "Gine-Bissau", "Grenada", "Grönland", "Guadalup, Fransa", "Guam, Amerika", "Guatemala", "Guyana", "Güney Afrika", "Güney Georgia ve Güney Sandviç Adaları, İngiltere", "Güney Kıbrıs Rum Yönetimi", "Güney Kore", "Gürcistan", "Haiti", "Hırvatistan", "Hindistan", "Hollanda", "Hollanda Antilleri", "Honduras", "Irak", "Ingiltere", "Iran", "Irlanda", "Ispanya", "Israil", "Isveç", "Isviçre", "Italya", "İzlanda", "Jamaika", "Japonya", "Johnston Atoll, Amerika", "Kamboçya", "Kamerun", "Kanada", "Kanarya Adaları", "Karadağ", "Katar", "Kazakistan", "Kenya", "Kırgızistan", "Kiribati", "Kolombiya", "Komorlar", "Kongo", "Kongo Demokratik Cumhuriyeti", "Kosova", "Kosta Rika", "Kuveyt", "Kuzey İrlanda", "Kuzey Kore", "Kuzey Maryana Adaları", "Küba", "K.K.T.C.", "Laos", "Lesotho", "Letonya", "Liberya", "Libya", "Liechtenstein", "Litvanya", "Lübnan", "Lüksemburg", "Macaristan", "Madagaskar", "Makau (Makao)", "Makedonya", "Malavi", "Maldiv Adaları", "Malezya", "Mali", "Malta", "Marşal Adaları", "Martinik, Fransa", "Mauritius", "Mayotte, Fransa", "Meksika", "Mısır", "Midway Adaları, Amerika", "Mikronezya", "Moğolistan", "Moldavya", "Monako", "Montserrat", "Moritanya", "Mozambik", "Namibia", "Nauru", "Nepal", "Nijer", "Nijerya", "Nikaragua", "Niue, Yeni Zelanda", "Norveç", "Orta Afrika Cumhuriyeti", "Özbekistan", "Pakistan", "Palau Adaları", "Palmyra Atoll, Amerika", "Panama", "Papua Yeni Gine", "Paraguay", "Peru", "Polonya", "Portekiz", "Porto Riko, Amerika", "Reunion, Fransa", "Romanya", "Ruanda", "Rusya Federasyonu", "Saint Helena, İngiltere", "Saint Martin, Fransa", "Saint Pierre ve Miquelon, Fransa", "Samoa", "San Marino", "Santa Kitts ve Nevis", "Santa Lucia", "Santa Vincent ve Grenadinler", "Sao Tome ve Principe", "Senegal", "Seyşeller", "Sırbistan", "Sierra Leone", "Singapur", "Slovakya", "Slovenya", "Solomon Adaları", "Somali", "Sri Lanka", "Sudan", "Surinam", "Suriye", "Suudi Arabistan", "Svalbard, Norveç", "Svaziland", "Şili", "Tacikistan", "Tanzanya", "Tayland", "Tayvan", "Togo", "Tonga", "Trinidad ve Tobago", "Tunus", "Turks ve Caicos Adaları, İngiltere", "Tuvalu", "Türkiye", "Türkmenistan", "Uganda", "Ukrayna", "Umman", "Uruguay", "Ürdün", "Vallis ve Futuna, Fransa", "Vanuatu", "Venezuela", "Vietnam", "Virgin Adaları, Amerika", "Virgin Adaları, İngiltere", "Wake Adaları, Amerika", "Yemen", "Yeni Kaledonya, Fransa", "Yeni Zelanda", "Yunanistan", "Zambiya", "Zimbabve" }));

        kategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kuru Gida", "El Aletleri", "Hayvansal Gıda", "Meyve & Sebze", "İçecek", "Alkollü İçecek", "Kozmetik & Kişisel Bakim", "Sağlık Ürünleri(Medikal)", "Temizlik Ürünleri", "Elektronik ve Elektrikli Ev Gereçleri", "Enerji & Aydinlatma", "Ofis & Kirtasiye" }));

        jCheckBox1.setText("SKT VAR");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jLabel11.setFont(jLabel11.getFont().deriveFont(jLabel11.getFont().getStyle() | java.awt.Font.BOLD, 19));
        jLabel11.setText("Barkod");

        barkod.setText("Barkod");
        barkod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                barkodMouseClicked(evt);
            }
        });

        alisFiyat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alisFiyatActionPerformed(evt);
            }
        });

        jLabel7.setFont(jLabel7.getFont().deriveFont(jLabel7.getFont().getStyle() | java.awt.Font.BOLD, 14));
        jLabel7.setText("");
        jLabel7.setEnabled(false);

        jLabel12.setFont(jLabel12.getFont().deriveFont(jLabel12.getFont().getStyle() | java.awt.Font.BOLD, 19));
        jLabel12.setText("Alarm adedi");

        alisGun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gün", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        alisAy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ay", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        alisYil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yıl", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023" }));

        sktGun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gün", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        sktGun.setEnabled(false);

        sktAy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ay", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        sktAy.setEnabled(false);

        sktYil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yıl", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023" }));
        sktYil.setEnabled(false);

        jLabel13.setText("v0.4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(urunIsmi, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(alisGun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(alisAy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(alisYil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(279, 279, 279)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(172, 172, 172))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(stok, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5))
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(278, 278, 278)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(alisFiyat, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mense, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(barkod, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sktGun, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sktAy, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sktYil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox1)))
                        .addGap(214, 214, 214)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(satisFiyat, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kategori, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(alarmAdedi, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(303, 303, 303)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(325, 325, 325)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel13)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(urunIsmi, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(stok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(alisGun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(alisAy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(alisYil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(alisFiyat, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(sktGun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sktAy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sktYil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCheckBox1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mense, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(barkod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(satisFiyat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(alarmAdedi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(jLabel13)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private boolean uygunMu(String a)
    {
        try{
            Double tmp = Double.parseDouble(a);
            return true;
        }
        catch(NumberFormatException e)
        {
            return false;
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String urunAdi = urunIsmi.getText();
        int barkodNo;
        try{
        barkodNo=Integer.parseInt(barkod.getText());
        String alisfiyat = alisFiyat.getText();
        if(uygunMu(alisfiyat))
        {
        String satisfiyat = satisFiyat.getText();
        if(alisGun.getSelectedIndex() != 0 && alisAy.getSelectedIndex() != 0 && alisYil.getSelectedIndex() != 0)
        {
            System.out.println(alisYil.getSelectedIndex());
        String alistarihi = alisGun.getSelectedItem() +"-"+alisAy.getSelectedItem()+"-"+alisYil.getSelectedItem();
        if(uygunMu(satisfiyat))
        {
        int alarmadedi;
            try {
        alarmadedi = Integer.parseInt(alarmAdedi.getText());
        String sonkullanma;
        if(jCheckBox1.isSelected())
        {
            if(sktGun.getSelectedIndex() != 0 && sktAy.getSelectedIndex() != 0 && sktYil.getSelectedIndex() != 0)
                sonkullanma=sktGun.getSelectedItem() +"-"+sktAy.getSelectedItem()+"-"+sktYil.getSelectedItem();
            else
                sonkullanma="A";
        }
        else
        sonkullanma ="YOK";
        String mensesi = (String) mense.getSelectedItem();
        int stokM;
        try{
        stokM = Integer.parseInt(stok.getText());
        String Kategori = (String)kategori.getSelectedItem();
        if(!sonkullanma.equals("A"))
        {
        Urun yeni = new Urun(urunAdi,stokM,alisfiyat,alistarihi,sonkullanma,mensesi,Kategori,satisfiyat,barkodNo,alarmadedi);
        if(jButton1.getText().equals("Değiştir"))
        {
            yeni.mysqlDegistir();
            yeni= null;
            setVisible(false);
            JOptionPane.showMessageDialog(this,"BAŞARIYLA DEĞİŞTİRİLDİ");
        }
        else{
            if(yeni.mysqlYaz())
            {
            yeni= null;
            setVisible(false);
            JOptionPane.showMessageDialog(this,"BAŞARIYLA EKLENDİ");
            }
            else
                JOptionPane.showMessageDialog(this,"HATA AYNI BARKODA SAHİP ÜRÜN MEVCUT");
        }
        }
        else
            JOptionPane.showMessageDialog(this,"SKT TARİHİ SEÇİLMEDİ");
        }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this,"MİNUMUM ALARM ADEDİNİ SAYI GİRİN");
            }
        }
            catch(NumberFormatException e)
            {
                
            }
        }
        else
            JOptionPane.showMessageDialog(this,"SATIŞ FİYATINI SAYI VE (.) GİREBİLİRSİNİZ !");
        
        }
        else
            JOptionPane.showMessageDialog(this,"ALIŞ TARİHİ SEÇİLMEDİ");
        }
        else
            JOptionPane.showMessageDialog(this,"ALIŞ FİYATINI SAYI VE (.) GİREBİLİRSİNİZ !");
        }
        catch(NumberFormatException a)
        {
            JOptionPane.showMessageDialog(this,"BARKODU SADECE SAYI GİREBİLİRSİNİZ !");
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
          if (jCheckBox1.isSelected())
        {
            sktGun.setEnabled(true);
            sktAy.setEnabled(true);
            sktYil.setEnabled(true);
           
           
        }
          else
          {
            sktGun.setEnabled(false);
            sktAy.setEnabled(false);
            sktYil.setEnabled(false);
          }
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void alisFiyatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alisFiyatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alisFiyatActionPerformed

    private void urunIsmiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_urunIsmiMouseClicked
    urunIsmi.setText("") ;
    }//GEN-LAST:event_urunIsmiMouseClicked

    private void barkodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barkodMouseClicked
    barkod.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_barkodMouseClicked

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
            java.util.logging.Logger.getLogger(UrunEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UrunEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UrunEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UrunEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UrunEkle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField alarmAdedi;
    private javax.swing.JComboBox<String> alisAy;
    private javax.swing.JTextField alisFiyat;
    private javax.swing.JComboBox<String> alisGun;
    private javax.swing.JComboBox<String> alisYil;
    private javax.swing.JFormattedTextField barkod;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> kategori;
    private javax.swing.JComboBox<String> mense;
    private javax.swing.JTextField satisFiyat;
    private javax.swing.JComboBox<String> sktAy;
    private javax.swing.JComboBox<String> sktGun;
    private javax.swing.JComboBox<String> sktYil;
    private javax.swing.JFormattedTextField stok;
    private javax.swing.JFormattedTextField urunIsmi;
    // End of variables declaration//GEN-END:variables
}

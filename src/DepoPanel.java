


import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;


public class DepoPanel extends javax.swing.JFrame {
        Urun yeni;

    public DepoPanel() throws ClassNotFoundException {
        yeni = new Urun();
        initComponents();
        yeni.guncelle();
                
          yeni=null;
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabloAna = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        aramaKutusu = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Depo Paneli");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1280, 500));
        setPreferredSize(new java.awt.Dimension(800, 600));

        jButton2.setFont(jButton2.getFont().deriveFont(jButton2.getFont().getStyle() | java.awt.Font.BOLD, 19));
        jButton2.setText("Seçili ürünü sat");
        jButton2.setMaximumSize(new java.awt.Dimension(146, 39));
        jButton2.setMinimumSize(new java.awt.Dimension(146, 39));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(jButton1.getFont().deriveFont(jButton1.getFont().getStyle() | java.awt.Font.BOLD, 19));
        jButton1.setText("Yeni ürün ekle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(jLabel2.getFont().deriveFont(jLabel2.getFont().getStyle() | java.awt.Font.BOLD, 24));
        jLabel2.setText("Stoktaki Ürünler");

        jLabel1.setFont(jLabel1.getFont().deriveFont(jLabel1.getFont().getStyle() | java.awt.Font.BOLD, 36));
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Depo Paneli");

        jButton3.setFont(jButton3.getFont().deriveFont(jButton3.getFont().getStyle() | java.awt.Font.BOLD, 19));
        jButton3.setText("Seçili ürünü sil");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(jButton4.getFont().deriveFont(jButton4.getFont().getStyle() | java.awt.Font.BOLD, 19));
        jButton4.setText("Barkod ara");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        tabloAna.setAutoCreateRowSorter(true);
        tabloAna.setFont(tabloAna.getFont().deriveFont((float)17));
        tabloAna.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Barkod", "Ürün Adı", "Kategori", "Stok Miktarı", "SKT", "Menşesi", "Alış Fiyatı (TL)", "Satış Fiyatı (TL)", "KDV Oranı", "Alış Tarihi", "Satış Tarihi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabloAna.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabloAna.getTableHeader().setResizingAllowed(false);
        tabloAna.getTableHeader().setReorderingAllowed(false);
        tabloAna.setVerifyInputWhenFocusTarget(false);
        jScrollPane2.setViewportView(tabloAna);

        jButton6.setFont(jButton6.getFont().deriveFont(jButton6.getFont().getStyle() | java.awt.Font.BOLD, 19));
        jButton6.setText("Seçili ürünü değiştir");
        jButton6.setMaximumSize(new java.awt.Dimension(146, 39));
        jButton6.setMinimumSize(new java.awt.Dimension(146, 39));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton5.setFont(jButton5.getFont().deriveFont(jButton5.getFont().getStyle() | java.awt.Font.BOLD, 19));
        jButton5.setText("Excel olarak aktar");
        jButton5.setMaximumSize(new java.awt.Dimension(146, 39));
        jButton5.setMinimumSize(new java.awt.Dimension(146, 39));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        aramaKutusu.setFont(aramaKutusu.getFont().deriveFont(aramaKutusu.getFont().getStyle() | java.awt.Font.BOLD, 18));
        aramaKutusu.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                aramaKutusuİnputMethodTextChanged(evt);
            }
        });
        aramaKutusu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aramaKutusuActionPerformed(evt);
            }
        });

        jLabel3.setFont(jLabel3.getFont().deriveFont(jLabel3.getFont().getStyle() | java.awt.Font.BOLD, 18));
        jLabel3.setText("Aranacak sorguyu girin");

        jLabel13.setText("v0.4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(aramaKutusu)))
                        .addGap(39, 39, 39))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(aramaKutusu, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addComponent(jLabel13)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static void aramaYenile()
    {
        TableRowSorter<TableModel> rowSorter //tablonun içindeki tablerowsorterın nesnesini oluşturuyorm
            = new TableRowSorter<>(tabloAna.getModel()); //bu nesneye tablomun modelini aktarıyorum bu modeli Super.java da belirledim
          tabloAna.setRowSorter(rowSorter);
        aramaKutusu.getDocument().addDocumentListener(new DocumentListener(){

            @Override
            public void insertUpdate(DocumentEvent e) {//interfaceden aldım metodu override ediyorm textfielde ekleme YAPILINCA
                String text = aramaKutusu.getText();

                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {//textfielddan silme yapılınca
                String text = aramaKutusu.getText();

                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

        });        // TODO add your handling code here:
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        UrunEkle yeni = new UrunEkle();
        yeni.setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       int satir = tabloAna.getSelectedRow();
                try
                {
                   // String showInputDialog = JOptionPane.showInputDialog(this, "Silinecek ürünün barkodunu girin", "Ürün Ara", WIDTH);
                  //  int barkodOku = Integer.parseInt(showInputDialog);
                    if(satir!=-1)
                    {
                    int barkod = (int)tabloAna.getValueAt(satir,0);
                    int KONTROL = JOptionPane.showConfirmDialog (null, "ÜRÜNÜ GERÇEKTEN SİLMEK İSTİYOR MUSUNUZ ?","DİKKAT",JOptionPane.YES_NO_OPTION);
                    if(KONTROL == JOptionPane.YES_OPTION){
                    yeni = new Urun(barkod);
                    if(yeni.Sil())
                         JOptionPane.showMessageDialog(this,"BAŞARIYLA SİLİNDİ");
                    yeni=null;
                    }
                    }
                    else
                        JOptionPane.showMessageDialog(this,"ÜRÜN SEÇİLMEDİ");
                }
                catch(Exception a)
                {
                    JOptionPane.showMessageDialog(this, "BARKODU HATALI GİRDİNİZ");
                }
        // TODO add your handling code here:
     
    }//GEN-LAST:event_jButton3ActionPerformed
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String showInputDialog2 = JOptionPane.showInputDialog(this, "Aranacak ürünün barkodunu girin", "Ürün Ara", WIDTH);
        Super k = new Super();
                try
                {
                    int barkod = Integer.parseInt(showInputDialog2);
                     if(k.kontrol(barkod)){
                    String[] buttons = { "Hızlı Stok Ekle","Satış Fiyatını Değiştir","Ürünü Göster" };
                        int rc = JOptionPane.showOptionDialog(null, "BARKOD : "+barkod, "SEÇİM YAPIN",
                        JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,  null, buttons, buttons[2]);
                        if(rc == JOptionPane.YES_OPTION)
                        {
                            String showInputDialog = JOptionPane.showInputDialog(this, "Eklenecek stok adedini girin.", "Stok Ekle", WIDTH);
                            try
                            {
                            int ekAdet = Integer.parseInt(showInputDialog);
                            yeni = new Urun(barkod);
                            if(yeni.stokEkle(ekAdet))
                            {
                                JOptionPane.showMessageDialog(this,"BAŞARIYLA EKLENDİ");
                            }
                            else
                                JOptionPane.showMessageDialog(this,"EN FAZLA 10 HANELİ BİR SAYI GİRİN");
                            }
                            catch(NumberFormatException a)
                            {
                                JOptionPane.showMessageDialog(this,"EN FAZLA 10 HANELİ BİR SAYI GİRİŞİ YAPIN");
                            }
                        }
                        else if(rc == JOptionPane.NO_OPTION)
                        {
                            String showInputDialog = JOptionPane.showInputDialog(this,
                                    "YENİ FİYATI GİRİN ","FİYAT DEĞİŞTİR", WIDTH);
                            try
                            {
                            Double fiyat = Double.parseDouble(showInputDialog);
                            yeni = new Urun(barkod);
                            if(yeni.fiyatDegistir(fiyat))
                            {
                                JOptionPane.showMessageDialog(this,"BAŞARIYLA DEĞİŞTİRİLDİ");
                            }
                            else
                                JOptionPane.showMessageDialog(this,"YANLIŞ GİRİŞ YAPILDI. EN FAZLA 10 HANELİ BİR SAYI GİRİN");
                            }
                            catch(NumberFormatException a)
                            {
                                JOptionPane.showMessageDialog(this,"SADECE SAYI GİRİŞİ YAPIN");
                            }
                        }
                        else if(rc == JOptionPane.CANCEL_OPTION)
                        {
                            UrunEkle tmp = new UrunEkle(barkod);
                            tmp.setVisible(true);
                        }
                    }
                     else
                         JOptionPane.showMessageDialog(this, "ÜRÜN BULUNAMADI");

                }
                catch(NumberFormatException a)
                {
                    JOptionPane.showMessageDialog(this,"BARKODU SADECE SAYI GİREBİLİRSİNİZ");
                                    }
                // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        int satir = tabloAna.getSelectedRow();       
                try
                {
                    if(satir!=-1)
                    {
                    int barkod = (int) tabloAna.getValueAt(satir,0);
                    String satisAdet = JOptionPane.showInputDialog(this, "Satış adetini girin", "Ürün Sat", WIDTH);
                    int adet;
                    try {
                    adet = Integer.parseInt(satisAdet);
                    if(adet>0)
                     {              
                    yeni=new Urun(barkod,adet);

                    if(yeni.satis()!=false)
                    {
                        JOptionPane.showMessageDialog(this,"SATIŞ BAŞARILI");
    
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this,"YETERSİZ STOK SATIŞ BAŞARISIZ !");
                    yeni=null;
     
                    }
                    }
                    else
                    JOptionPane.showMessageDialog(this,"NEGATIF SAYI GIRDINIZ !");
                    }
                    catch (NumberFormatException e)
                    {
                        JOptionPane.showMessageDialog(this,"11 HANELİ SAYI GİRİŞİ YAPIN");
                    }
                    }
                    else
                        JOptionPane.showMessageDialog(this,"SEÇİM YAPMADINIZ");
                }
                catch(Exception a)
                {
                    JOptionPane.showMessageDialog(this, "BARKOD HATASI");
                }

        
        
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
      
        int satir = tabloAna.getSelectedRow();
                {
                    if(satir!=-1)
                    {
                        int barkod = (int) tabloAna.getValueAt(satir,0);
                        String[] buttons = { "Hızlı Stok Ekle","Satış Fiyatını Değiştir","Ürünü Göster" };
                        int rc = JOptionPane.showOptionDialog(null, "ÜRÜN DEĞİŞTİR", "SEÇİM YAPIN",
                        JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,  null, buttons, buttons[2]);
                        if(rc == JOptionPane.YES_OPTION)
                        {
                            String showInputDialog = JOptionPane.showInputDialog(this, "Eklenecek stok adedini girin.", "Stok Ekle", WIDTH);
                            try
                            {
                            int ekAdet = Integer.parseInt(showInputDialog);
                            yeni = new Urun(barkod);
                            if(yeni.stokEkle(ekAdet))
                            {
                                JOptionPane.showMessageDialog(this,"BAŞARIYLA EKLENDİ");
                            }
                            else
                                JOptionPane.showMessageDialog(this,"EN FAZLA 10 HANELİ BİR SAYI GİRİŞİ YAPIN");
                            }
                            catch(NumberFormatException a)
                            {
                                JOptionPane.showMessageDialog(this,"SADECE SAYI GİRİŞİ YAPIN");
                            }
                        }
                        else if(rc == JOptionPane.NO_OPTION)
                        {
                            String showInputDialog = JOptionPane.showInputDialog(this,
                                    "YENİ FİYATI GİRİN \nESKİ FİYAT = "+tabloAna.getValueAt(satir,7),"FİYAT DEĞİŞTİR", WIDTH);
                            try
                            {
                            Double fiyat = Double.parseDouble(showInputDialog);
                            yeni = new Urun(barkod);
                            if(yeni.fiyatDegistir(fiyat))
                            {
                                JOptionPane.showMessageDialog(this,"BAŞARIYLA DEĞİŞTİRİLDİ");
                            }
                            else
                                JOptionPane.showMessageDialog(this,"DEĞİŞTİRİLEMEDİ İÇ HATA GERÇEKLEŞTİ");
                            }
                            catch(NumberFormatException a)
                            {
                                JOptionPane.showMessageDialog(this,"SADECE SAYI GİRİŞİ YAPIN");
                            }
                        }
                        else if(rc == JOptionPane.CANCEL_OPTION)
                        {
                            UrunEkle tmp = new UrunEkle(barkod);
                            tmp.setVisible(true);
                        }
                    }
                    else
                        JOptionPane.showMessageDialog(this,"SEÇİM YAPMADINIZ");
                }

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        FileOutputStream fos = null;
       try {
           // create a workbook
           Workbook wb = new HSSFWorkbook();  // xls file
           // create a new sheet
           org.apache.poi.ss.usermodel.Sheet sheet = wb.createSheet("Stok Tablosu");
           // declare a row object reference
           Row r = null;
           HSSFCellStyle style = (HSSFCellStyle) wb.createCellStyle();
           HSSFCellStyle style2 = (HSSFCellStyle) wb.createCellStyle();
           // declare a cell object reference
           Cell c = null;
           Font font = (Font) wb.createFont();
           font.setBold(true);
           fos = new FileOutputStream("tablo.xls");
           int rowNum;
           int colNum;
           int tempRows;
           int rowCount = tabloAna.getRowCount();
           int columnCount = tabloAna.getColumnCount();
           // create the headers
           for (colNum = 0; colNum < columnCount; colNum++) {
               if (colNum == 0) {
                   r = sheet.createRow(0);
               }
               c = r.createCell(colNum);
               c.setCellValue(tabloAna.getColumnName(colNum));
           }      for (rowNum = 0; rowNum < rowCount; rowNum++) {
               // create rows + 1 (to account for the headers)
               tempRows = rowNum + 1;
               r = sheet.createRow(tempRows);
              
               for (short cellnum = 0; cellnum < columnCount; cellnum ++) {
                   // create cells
                   c = r.createCell(cellnum);
                   // add values from table
                   int status = (int) tabloAna.getValueAt(rowNum, 3);
                   int alarmAdedi = (int) tabloAna.getValueAt(rowNum, 9);
                    if(status<=alarmAdedi)
               {
               style.setFillForegroundColor(IndexedColors.RED.getIndex());
               style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
               style.setFont(font);
               c.setCellStyle(style);
               }
                    else
                    {
                        style2.setFillForegroundColor(IndexedColors.AQUA.getIndex());
                        style2.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
                        style2.setFont(font);
                        c.setCellStyle(style2);
                    }    
               
                   c.setCellValue(tabloAna.getValueAt(rowNum, cellnum).toString());
                   
               }
               
               
           }
         
           for(int a = 0 ; a<columnCount ; a++)
                  sheet.autoSizeColumn(a);
           wb.write(fos);
           JOptionPane.showMessageDialog(this,"tablo.xls BAŞARIYLA AKTARILDI");
       } catch (FileNotFoundException ex) {
           Logger.getLogger(DepoPanel.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IOException ex) {
           Logger.getLogger(DepoPanel.class.getName()).log(Level.SEVERE, null, ex);
       } finally {
           try {
               fos.close();
           } catch (IOException ex) {
               Logger.getLogger(DepoPanel.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
    
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void aramaKutusuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aramaKutusuActionPerformed

    }//GEN-LAST:event_aramaKutusuActionPerformed

    private void aramaKutusuİnputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_aramaKutusuİnputMethodTextChanged
 
    }//GEN-LAST:event_aramaKutusuİnputMethodTextChanged

    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DepoPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DepoPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DepoPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DepoPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new DepoPanel().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(DepoPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField aramaKutusu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable tabloAna;
    // End of variables declaration//GEN-END:variables
}

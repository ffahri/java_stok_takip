
import java.awt.Color;
import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;

public class Super {
        
        private int barkod;
        private String kullaniciAdi;
        private String sifre;
        private static Connection con; // connection pool ile zaman kazandık 
        static{
            try {
                final String url = "jdbc:mysql://localhost:3306/javaStokTakip?autoReconnect=true&useSSL=false&useUnicode=yes&characterEncoding=UTF-8";
                final String user = "j";
                final String password = "1";
                con = DriverManager.getConnection(url, user, password);
            } catch (SQLException ex) {
                Logger.getLogger(Super.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        public Super(int barkod) 
        {

          this.barkod=barkod;
        }
        public Super(String kul,String sif)
        {
            kullaniciAdi=kul;
            sifre=sif;
        }
        public Super()
        {
        
            
        }
        public String [] bilgileriAl(int barkod)
        {
            String[] data =new String[10];
            
            try
            {
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select urunadi,kategori,stokmiktari,skt,mense,alisfiyat,satisfiyat,alistarihi,minadet from stokTablo WHERE barkod = "+barkod);
                rs.next();
                data[0]=String.valueOf(barkod);
                data[1]=rs.getString(1);
                data[2]=rs.getString(2);
                data[3]=rs.getString(3);
                data[4]=rs.getString(4);
                data[5]=rs.getString(5);
                data[6]=rs.getString(6);
                data[7]=rs.getString(7);
                data[8]=rs.getString(8);
                data[9]=rs.getString(9);
                return data;
            }
            catch(SQLException a)
            {
                return null;
            }
            
        }
        public boolean kontrol(int barkod)
        {
            String query ="SELECT count(*) from stokTablo WHERE barkod = "+barkod;
            try
            {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            rs.next();
            if(rs.getInt(1)==1)
            {
                return true;
            }
            else
                return false;
            }
            catch(SQLException a)
            {
                System.out.println(a);
            }
            return false;
        }
      public boolean satisYap(int adet,int barkod)
	{
            try{
 
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select barkod,stokmiktari from stokTablo where barkod = "+barkod);
                rs.next();
                int stokAdedi=rs.getInt(2);   
		if(stokAdedi>=adet)
		{
			stokAdedi-=adet;
                        String query ="UPDATE stokTablo SET stokmiktari = "+stokAdedi+" WHERE barkod = "+barkod;
                        if(mysqlYaz(query))
			return true;
                        else 
                            return false;
		}
		else
                {
                    return false;
                }
                }
                
             
             catch(SQLException a)
             {
               System.out.println(a);
               
             }
       
         return false;
	}
  public boolean stokEkle(int adet,int barkod)
	{
            try{
 
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select stokmiktari from stokTablo WHERE barkod ="+barkod);
            rs.next();
                int stokAdedi=rs.getInt(1);   
		stokAdedi+=adet;
                 String query ="UPDATE stokTablo SET stokmiktari = "+stokAdedi+" WHERE barkod = "+barkod;
                 if(mysqlYaz(query))
                    return true;
                else 
                     return false;
                }
                
             catch(SQLException a)
             {
               System.out.println(a);
               return false;
             }

	}
  public boolean sil(int barkod)
  {
      String query = "DELETE FROM stokTablo WHERE barkod= "+barkod;
      if(mysqlYaz(query))
      {
          return true;
      }
      else
          return false;
  }
  public boolean silUye(int id)
  {
      String query = "DELETE FROM uyelik WHERE id= "+id;
      try {

             Statement st = con.createStatement();
             st.executeUpdate(query);
             adminOku();
             return true;
             }
             catch(SQLException ex) {
                 
             }

            return false;
  }
  public boolean kontrolUye()
  {
      try{
      String query = "SELECT id FROM uyelik WHERE kullaniciAdi ='"+kullaniciAdi+"' and sifre ='"+sifre+"'";
      Statement st = con.createStatement();
      ResultSet rs = st.executeQuery(query);
      rs.next();
      if(rs.getString(1)!=null)
          return true;
      else
          return false;
     }
     catch(SQLException a)
     {
         return false;
     }
  }
  public boolean kontrolAdmin()
  {
      try{
      String query = "SELECT id FROM admin WHERE kullaniciAdi ='"+kullaniciAdi+"'and sifre ='"+sifre+"'";
      Statement st = con.createStatement();
      ResultSet rs = st.executeQuery(query);
      rs.next();
      if(rs.getString(1)!=null)
          return true;
      else
          return false;
     }
     catch(SQLException a)
     {
         return false;
     }
  }
  public void uyeEkle(String a , String b)
  {
      String query = "INSERT INTO uyelik (kullaniciAdi,sifre) VALUES ('"+a+"','"+b+"')";
        try {

             Statement st = con.createStatement();
             st.executeUpdate(query);  
             adminOku();
            }
        catch(SQLException e)
        {
            
        }
  }
  public void adminEkle(String a , String b)
  {
      String query = "INSERT INTO admin (kullaniciAdi,sifre) VALUES ('"+kullaniciAdi+"','"+sifre+"')";
        try {

             Statement st = con.createStatement();
             st.executeUpdate(query);
             adminOku();

            }
        catch(SQLException e)
        {
            
        }
  }
  private int satirOgren()
    {

        try {
            
           
            Statement st = con.createStatement();
           
            ResultSet rs = st.executeQuery("SELECT COUNT(*) AS barkod FROM stokTablo");
        while (rs.next()) {
        return rs.getInt(1);
                         }
        } catch (Exception e) {
        }
      return 0;
    }
   public void adminOku()
   {
       int satir = satirOgren();

         try {
            
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select id,kullaniciAdi,sifre from uyelik");
            Object[][] data = new Object[satir][3];
             int i = 0;
   		while(rs.next())
   	        {
            	data[i][0]=rs.getInt(1);
                data[i][1]=rs.getString(2);
                data[i][2]=rs.getString(3);
                i++;
            }         
            i = 0;
            String [] ust ={"ID", "Kullanıcı Adı","Şifre"};
            AdminPanel.tabloAdmin.setModel(new javax.swing.table.DefaultTableModel(data,ust));
   }
         catch(SQLException e)
         {
             
         }
   }
   public void mysqlOku()
   {
       int satir = satirOgren();

         try {
            
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select barkod,urunadi,kategori,stokmiktari,skt,mense,alisfiyat,satisfiyat,minadet,alistarihi from stokTablo");
            Object[][] data = new Object[satir][11];
             int i = 0;
   		while(rs.next())
   	        {
            	data[i][0]=rs.getInt(1);
                data[i][1]=rs.getString(2);
                data[i][8]=rs.getString(3);
                data[i][3] = rs.getInt(4);
                data[i][4]=rs.getString(5);
                data[i][5]=rs.getString(6);
                data[i][6]=rs.getString(7)+" TL";
                data[i][7]=rs.getString(8)+" TL";
                data[i][9]=rs.getInt(9);
                data[i][2]=rs.getString(10);
                i++;
            }         
            i = 0;
            String [] ust ={"Barkod", "Ürün Adı","Alış Tarihi","Stok Adedi","SKT","Mensesi","Alış Fiyatı","Satış Fiyatı","Kategori","Alarm Adedi"};
            DepoPanel.tabloAna.setModel(new javax.swing.table.DefaultTableModel(data,ust));
            //DepoPanel.tabloAna.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
            DepoPanel.tabloAna.setModel(new javax.swing.table.DefaultTableModel(data,ust) {
    Class[] types = new Class [] {
        java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
    };
    boolean[] canEdit = new boolean [] {
        false, false, false, false, false, false, false, false, false,false
    };

    public Class getColumnClass(int columnIndex) {
        return types [columnIndex];
    }

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
    }
});
            DepoPanel.tabloAna.getRowSorter().toggleSortOrder(0);
            TableColumn a =DepoPanel.tabloAna.getColumnModel().getColumn(0);
            a.setPreferredWidth(5);
            a = DepoPanel.tabloAna.getColumnModel().getColumn(3);
            a.setPreferredWidth(40);
            a = DepoPanel.tabloAna.getColumnModel().getColumn(8);
            a.setPreferredWidth(200);
            a = DepoPanel.tabloAna.getColumnModel().getColumn(9);//sütun modelinin ayarları
            a.setPreferredWidth(40);
            DepoPanel.tabloAna.setDefaultRenderer(Object.class, new DefaultTableCellRenderer(){
    @Override
    public Component getTableCellRendererComponent(JTable table,
            Object value, boolean isSelected, boolean hasFocus, int row, int col) {

        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);

        int status = (int) table.getModel().getValueAt(row, 3);
        int alarmAdedi = (int) table.getModel().getValueAt(row, 9);
        
        if (status<=alarmAdedi) {
            setBackground(Color.RED);
            setForeground(Color.WHITE);
            if(DepoPanel.tabloAna.isRowSelected(row))
            {
                setBackground(Color.BLUE);
                setForeground(Color.RED);
            }
        } 
        else if (DepoPanel.tabloAna.isRowSelected(row))
        {
            setBackground(Color.GRAY);
            setForeground(Color.WHITE);
        }
        else {
            setBackground(table.getBackground());
           // setBackground(Color.CYAN);
            setForeground(table.getForeground());
        }       
        return this;
    }   
});
            DepoPanel.aramaYenile();
            
            }
        catch (SQLException ex) {
        
            System.out.println(ex);
                            }      
 
   }
   public boolean mysqlYaz(String query)
   {

             try {

             Statement st = con.createStatement();
             st.executeUpdate(query);
             mysqlOku();
             return true;
             }
             catch(SQLException ex) {
                 
             }

            return false;
   }
   public void mysqlSat(String stok,int barkod)
   {
             try {
             
             Statement st = con.createStatement();
             st.executeUpdate("UPDATE stokTablo SET stokmiktar='"+stok+"' WHERE barkod="+barkod);

             }
             catch(SQLException ex) {
                 
             }
           
            mysqlOku();
   }
}
     



public class Urun extends Super
{		

	private String urunAdi;
	private int stokAdedi;
	private double fiyat;
        private String alisFiyat;
        private String alisTarihi;
        private String skt;
        private String mensesi;
        private String kategori;
        private String satisfiyat;
        private int barkod;
        private int alarmAdedi;
        private int adet;
	public Urun(String urunAdi,int stokAdedi,String alisFiyati,String alisTarihi,String skt,String mensesi,String kategori,String satisfiyat,int barkod,int alarmAdedi)
	{//urun ekle consturctor
            
            this.alisFiyat=alisFiyati;
            this.alisTarihi=alisTarihi;
            this.skt=skt;
            this.mensesi=mensesi;
            this.kategori=kategori;
            this.satisfiyat=satisfiyat;
            this.barkod=barkod;
            this.urunAdi = urunAdi;
            this.stokAdedi = stokAdedi;
            this.alarmAdedi = alarmAdedi;
            this.fiyat = fiyat;
	}
        public Urun(int barkod,int adet)
        {//satış consturctor
            this.barkod=barkod;
            this.adet=adet;
        }
        public Urun(int barkod)
        { //urun değiştir consturctor
            this.barkod=barkod;
        }
        public Urun()
        {
        //yaz oku ilk çalışma
               System.out.println("");
        }
        public boolean mysqlYaz()
        {
            String genel ="INSERT INTO stokTablo (barkod,urunadi,kategori,stokmiktari,skt,mense,alisfiyat,satisfiyat,minadet,alistarihi) VALUES (";
            String query=genel+toString();
            if(!super.kontrol(barkod))
            {
            super.mysqlYaz(query);
            return true;
            }
            else
            return false;
        }
        public void guncelle()
        {
            super.mysqlOku();
        }
         public String[] bilgileriAl()
        {
            String tmp[];
            tmp=super.bilgileriAl(barkod);
            if(tmp!=null)
            {
            return tmp;
            }
            else
            return null;
        }
         public void mysqlDegistir()
         {
             String genel ="UPDATE stokTablo SET barkod="+barkod+",urunadi ='"+urunAdi+"',kategori='"+kategori+"',stokmiktari="+stokAdedi+",skt='"+skt+"',mense='"+mensesi+"',alisfiyat='"+alisFiyat+"',satisfiyat='"+satisfiyat+"',minadet="+alarmAdedi+",alistarihi ='"+alisTarihi+"' ";
            String query=genel+"WHERE barkod = "+barkod;
            super.mysqlYaz(query);
         }
        public String toString()
	{
        return String.format(barkod+",'"+urunAdi+"','"+kategori+"',"+stokAdedi+",'"+skt+"','"+mensesi+"','"+alisFiyat+"','"+satisfiyat+"',"+alarmAdedi+",'"+alisTarihi+"');");
	}
	public boolean stokEkle(int ek)
	{
		
                if(super.stokEkle(ek,barkod))
                {
                    return true;
                }
                else
                    return false;
	}
        public boolean fiyatDegistir(Double fiyat)
        {
            String query = "UPDATE stokTablo SET satisfiyat = '"+fiyat+"' WHERE barkod = "+barkod;
            if(super.mysqlYaz(query))
            {
                return true;
            }
            else
                return false;
        }
        public boolean satis()
        {
            if(super.kontrol(barkod))
            {//barkod mevcut
                if(super.satisYap(adet,barkod))
                {//satış yapıldı
                   return true; 
                }
                else
                    return false;//stok yok
            }
            else
                return false;//barkod mevcut değil

        }
        public boolean Sil()
        {
            if(super.sil(barkod))
                return true;//silindi
            else
                return false;//silinemedi
        }
}
package tutorial;
import java.util.Scanner;

public class novel {
     String judul,penulis,deskripsi;
     int tahun,harga;
     double jual;

     Scanner scan = new Scanner(System.in);

    novel(String j,String p,String d,int t,int h,double s)
    {
      this.judul=j;
      this.penulis=p;
      this.deskripsi=d;
      this.tahun=t;
      this.harga=h;
      this.jual=s;
    }

  

    void showData()
    {
        System.out.println("Judul: " + this.judul);
        System.out.println("Penulis: " + this.penulis);
        System.out.println("Deskripsi: " + this.deskripsi);
        System.out.println("Tahun: " + this.tahun);
        System.out.println("Harga: " + this.harga);
        System.out.println("Harga Jual : " + this.jual);
    }
}

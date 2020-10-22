package tutorial;
import java.util.Scanner;
public class ANGKA
{
    int angka,beda,batas;
    Scanner scan = new Scanner(System.in);



    ANGKA()
    {
        System.out.print("Masukkan Angka Pertama : ");
        angka=scan.nextInt();
       

        System.out.print("Masukkan Angka Beda : ");
        beda=scan.nextInt();
    

        System.out.print("Masukkan Angka Jumlah Deret : ");
        batas=scan.nextInt();
      
    }    
    void Angka()
    {
        int hasil;
        int jum;
        jum=angka;
        hasil=angka;
        double rata;
        for(int a=1;a<=batas;a++)
        {
            if(a==batas)
            {
                System.out.print(hasil +" \n");
            }
            else
            {
                System.out.print(hasil +" ");
                hasil=hasil+beda;
                jum = jum+hasil;
            }
        }
        rata=jum/batas;
        System.out.println("Hasil Penjumlahan Deret : "+ jum);
        System.out.println("Hasil Rata-Rata Penjumlahan Deret : "+ rata);
    }
   
}
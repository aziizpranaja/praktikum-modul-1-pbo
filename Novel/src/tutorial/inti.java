package tutorial;

import java.util.Scanner;

public class inti
{
    public static void main(String[] args) {
        int n=0, i, t, h;
        String j, p, d;
        double jual;
        Scanner scan = new Scanner(System.in);
        novel[] obj = new novel[3];

        System.out.println("Input Data Novel");
        while(n<3)
        {
            i=n+1;
            System.out.println("Data ke-" + i);

            System.out.print("Judul: ");
            j = scan.nextLine();
            
            System.out.print("Penulis: ");
            p = scan.nextLine();
            
            System.out.print("Deskripsi: ");
            d = scan.nextLine();
            
            System.out.print("Tahun: ");
            t = scan.nextInt();
            
            System.out.print("Harga: ");
            h = scan.nextInt();
            
            jual=h-(0.2*h);

            obj[n] = new novel(j,p,d,t,h,jual);
            n++;
        }

        System.lineSeparator();
		System.out.println("DATA YANG DI INPUT");
		for(int z = 0; z < 3; z++) {
			obj[z].showData();
		}
    }
}
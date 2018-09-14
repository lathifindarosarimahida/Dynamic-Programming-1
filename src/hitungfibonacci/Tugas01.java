package hitungfibonacci;
import java.util.Scanner;
public class Tugas01 {
    public static void main(String[] args)
    {
        System.out.println("Nama    : Lathifinda Rosari Mahida");
        System.out.println("Kelas   : X RPL 2 ");
        System.out.println("Absen   : 19");
        
        int [] nominal = {5000, 2000, 1000, 500, 100};
        Scanner scan = new Scanner (System.in);
        System.out.print("Masukkan Jumlah Uang: ");
        int uang = scan.nextInt();
        
        for(int i = 0; i < 5; i++)
        {
            int jumlah = uang/ nominal[i];
            uang = uang - (nominal[i] * jumlah);
            
            System.out.println("lembar" + nominal[i]+ "=" + jumlah);
        }
    }
     
}



package hitungfibonacci;
import java.util.Scanner;
public class Tugas02 {
    public static void main(String[] args)
    {
        System.out.println("Nama    : Lathifinda Rosari Mahida");
        System.out.println("Kelas   : X RPL 2 ");
        System.out.println("Absen   : 19");
        
        int [] Berat = new int []{4, 5, 2, 3, 7};
        int [] Bayaran = new int []{5000, 7000, 2000, 3000, 10000};
        
        int berat = Input();
        Proses(berat, Berat, Bayaran);
    }
    private static int Input(){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Berat Barang: ");
        int berat = scan.nextInt();
        
        return berat;
    }
    
    private static void Proses(int berat, int[] Berat, int[] Bayaran)
    {
        int jumlah = 0;
        for (int i = 0; i < Berat.length; i++)
        {
            
        }
    }
}
    


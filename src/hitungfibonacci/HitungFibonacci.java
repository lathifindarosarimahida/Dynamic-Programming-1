package hitungfibonacci;
import java.math.BigInteger;
import java.util.Scanner;
public class HitungFibonacci {
private static void tampilJudul(String identitas) {
    System.out.println("Identitas : " + identitas);
    
    System.out.println("\nHitung Fibonacci");
    System.out.println("1, 1, 2, 3, 5, 8, 13, 21, ... dst.\n");
}
    public static void main(String[] args){
        String identitas = "Lathifinda Rosari Mahida / X RPL 2 / 19";
    
    tampilJudul(identitas);
    int n = tampilInput();
    }
    private static int tampilInput()
    {
        Scanner sacnner = new Scanner (System.in);
       System.out.print("Bilangan ke-: ");
       int n = sacnner.nextInt();
       
       return n;
    }
    int n = tampilInput();
}
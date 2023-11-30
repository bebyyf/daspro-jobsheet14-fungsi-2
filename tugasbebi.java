import java.util.Scanner;
public class tugasbebi {
    static int penjumlahanRekursif(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + penjumlahanRekursif(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int nilaiN = sc.nextInt();

        int hasilPenjumlahan = penjumlahanRekursif(nilaiN);
        System.out.print("Penjumlahan dari 1");
        for(int i=2; i<=nilaiN; i++){
            System.out.print("+" + i);
        }
        System.out.println(" = " + hasilPenjumlahan);

    }
}

import java.util.Scanner;
public class Percobaan2 {
    static int hitungPangkat(int x, int y){
        if (y == 0){
            return (1);
        }else {
            return (x * hitungPangkat(x, y -1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int bilangan,pangkat;
        System.out.println("Bilangan yang dihitung :");
        bilangan = sc.nextInt();
        System.out.println("pangkat :");
        pangkat = sc.nextInt();
        System.out.println(hitungPangkat(bilangan, pangkat));
        int hasilPangkat = hitungPangkat(bilangan, pangkat);
    System.out.print("Hasil pangkat " + bilangan + " ^ " + pangkat + " adalah: ");

    for (int i = 1; i <= pangkat; i++) {
        System.out.print(bilangan);
        if (i < pangkat) {
            System.out.print("x");
        }
    }
    System.out.print(" = " + hasilPangkat);
    }
    
}

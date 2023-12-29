import java.util.Scanner;

public class Belanja {
    public static void main(String[] args) {
        // Data member atau variabel
        int tot_Belanja;

        //membuat objek Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Total Belanja");
        tot_Belanja = input.nextInt();

        //membuat percobaan
        if (tot_Belanja >=50000){
            System.out.println("Selamat Dapat mouse");
        } else {
            System.out.println("Tidak Dapat Mouse");
        }        

    }
}

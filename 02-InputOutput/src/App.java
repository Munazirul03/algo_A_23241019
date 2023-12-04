import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //membuat sebuah variabel dan tipe data//
        String nama;
        int nim;
        String prodi;
        double Tinggi_Badan;

        //panggil scanner//

        Scanner input = new Scanner (System.in);

        System.out.println("DATA MAHASISWA");
        System.out.println("================");
        //agar bisa diketik kita buat baru
        System.out.print("Masukan Nama Mahasiswa:");
        nama = input.nextLine();

    
        System.out.print("Masukan Prodi:");
        prodi = input.nextLine();
    
           System.out.print("Masukan Nim:");
        nim = input.nextInt();


        System.out.print("Tinggi Badan:");
        Tinggi_Badan = input.nextDouble();

        //PRINT
        System.out.println("DATA MAHASISWA");
        System.out.println("=============");
        System.out.println("Nama Mahasiswa :" + nama);
,;        System.out.println("NIM :"+ nim);
        System.out.println("Prodi Mahasiswa :"+ prodi);
        System.out.println("Tinggi Badan :"+ Tinggi_Badan);

     }
}

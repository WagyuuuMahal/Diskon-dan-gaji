
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class diskon {
    public static void main (String[] args) throws InterruptedException{

        // start

        System.out.println("Kalkulator Diskon");
        System.out.println("====================================================");

        // input harga
      
        System.out.println("Masukkan harga awal barang. (Angka saja)");
        double harga = new Scanner(System.in).nextDouble();
        System.out.println("=====================================================");

        // input diskon

        System.out.println("Masukkan diskon barang. (Angka saja)");
        double diskon = new Scanner(System.in).nextDouble();
        diskon /= 100;
        System.out.println("=======================================================");

        // input jumlah

        System.out.println("Masukkan jumlah barang yang dibeli. (Angka saja)");
        int jumlah = new Scanner(System.in).nextInt();
        System.out.println("==========================================================");

        // equation

        double totalHarga = (harga - (harga * diskon)) * jumlah;

        // output

        System.out.println("Mohon tunggu hasil dari nilai yang anda masukkan.");
        TimeUnit.SECONDS.sleep(5);
        System.out.println("Total harga dari belanjaan anda adalah Rp" + totalHarga + ".");
        System.out.println("================================================================");
        System.out.println("Finish.");
        System.out.println("Code written by wagyuSukaTidur.");

    }

}